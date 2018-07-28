(ns yosetarou.server
  (:require [immutant.web :as web]
            [yosetarou.endpoint :as ep]))

(defonce server (atom nil))

(defn start []
  (when-not @server
    (reset! server (web/run ep/endpoint {:port 3000}))))

(defn stop []
  (when @server
    (web/stop @server)
    (reset! server nil)))

(defn restart []
  (do (stop)
      (start)))
