(ns graphqltest.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[graphqltest started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[graphqltest has shut down successfully]=-"))
   :middleware identity})
