(ns yosetarou.response
  (:require [ring.util.response :as ring.res]))

(defn html [response]
  (ring.res/content-type response "text/html;charset=utf8"))
