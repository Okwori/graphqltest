(ns user
  (:require 
            [mount.core :as mount]
            [graphqltest.figwheel :refer [start-fw stop-fw cljs]]
            [graphqltest.core :refer [start-app]]))

(defn start []
  (mount/start-without #'graphqltest.core/repl-server))

(defn stop []
  (mount/stop-except #'graphqltest.core/repl-server))

(defn restart []
  (stop)
  (start))


