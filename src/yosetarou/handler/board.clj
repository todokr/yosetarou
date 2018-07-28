(ns yosetarou.handler.board
  (:require [ring.util.response :as ring.res]
            [yosetarou.response :as app.res]))

(defn index [request]
  (-> "<h2>create</h2>"
      ring.res/response
      app.res/html))

(defn create [request]
  (-> (str request)
      ring.res/response
      app.res/html))

(defn preview [request]
  (-> (str request)
      ring.res/response
      app.res/html))
