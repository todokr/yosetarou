(ns yosetarou.handler.api.status
  (:require [ring.util.response :as ring.res]
            [yosetarou.response :as app.res]))

(defn index [request]
  (-> "{\"key\": \"value\"}"
      ring.res/response
      app.res/json))
