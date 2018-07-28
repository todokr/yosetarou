(ns yosetarou.core
  (:require [yosetarou.server :as server])
  (:gen-class))

(defn -main
  [& args]
  (server/start))
