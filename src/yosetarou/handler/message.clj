(ns yosetarou.handler.message
  (:require [ring.util.response :as ring.res]
            [yosetarou.response :as app.res]))

(defn index [request]
  (-> "<h2>message</h2>"
      ring.res/response
      app.res/html))

(defn create [request]
  (-> (str request)
      ring.res/response
      app.res/html))

(defn edit [request]
  (-> (str request)
      ring.res/response
      app.res/html))
