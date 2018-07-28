(ns user
  (:require [clojure.repl :refer :all]
            [clojure.tools.namespace.repl :refer [clear refresh refresh-all]]
            [yosetarou.server :as server]))

(defn restart []
  (server/stop)
  (refresh :after 'server/start))
