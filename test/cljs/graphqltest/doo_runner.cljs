(ns graphqltest.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [graphqltest.core-test]))

(doo-tests 'graphqltest.core-test)

