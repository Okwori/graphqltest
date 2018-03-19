(ns ^:figwheel-no-load graphqltest.app
  (:require [graphqltest.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
