(ns yosetarou.server
  (:require [immutant.web :as web]))

(defonce server (atom nil))

(def response-body "Hello, world!!!")
(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body response-body})

(defn start []
  (when-not @server
    (reset! server (web/run handler {:port 3000}))))

(defn stop []
  (when @server
    (web/stop @server)
    (reset! server nil)))

(defn restart []
  (do (stop)
      (start)))
