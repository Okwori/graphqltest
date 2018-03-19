(ns graphqltest.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [graphqltest.layout :refer [error-page]]
            [graphqltest.routes.home :refer [home-routes]]
            [graphqltest.routes.services :refer [service-routes]]
            [compojure.route :as route]
            [graphqltest.env :refer [defaults]]
            [mount.core :as mount]
            [graphqltest.middleware :as middleware]))

(mount/defstate init-app
  :start ((or (:init defaults) identity))
  :stop  ((or (:stop defaults) identity)))

(mount/defstate app
  :start
  (middleware/wrap-base
    (routes
      (-> #'home-routes
          (wrap-routes middleware/wrap-csrf)
          (wrap-routes middleware/wrap-formats))
          #'service-routes
      (route/not-found
        (:body
          (error-page {:status 404
                       :title "page not found"}))))))
