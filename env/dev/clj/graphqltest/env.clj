(ns graphqltest.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [graphqltest.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[graphqltest started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[graphqltest has shut down successfully]=-"))
   :middleware wrap-dev})
