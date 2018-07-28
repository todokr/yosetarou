(ns yosetarou.handler.home
  (:require [ring.util.response :as ring.res]
            [yosetarou.response :as app.res]
            [yosetarou.layout :as layout]))

(defn index [request]
  (-> (layout/main-template)
      ring.res/response
      app.res/html))
