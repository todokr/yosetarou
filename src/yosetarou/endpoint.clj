(ns yosetarou.endpoint
  (:require [bidi.bidi :as bidi]
            bidi.ring
            [ring.util.response :as ring.res]
            [yosetarou.routes :as routes]
            [yosetarou.handler.home :as h.home]
            [yosetarou.handler.board :as h.board]
            [yosetarou.handler.message :as h.message]
            [yosetarou.handler.api.status :as h.a.status]))

(defn not-found-handler [req]
  (ring.res/not-found "Not found"))

(defmulti router identity)
(defmethod router :default [_] not-found-handler)

(defn wrap-view-helper [handler routes]
  (let [href (partial bidi/path-for routes)]
    (fn [req]
      (handler (assoc req :view-helper {:href href})))))

(def endpoint*
  (-> (bidi.ring/make-handler routes/main router)
      (wrap-view-helper routes/main)))

(defn endpoint [request]
  (endpoint* request))

(defmethod router :home/index [_] h.home/index)
(defmethod router :board/index [_] h.board/index)
(defmethod router :board/create [req] h.board/create)
(defmethod router :board/preview [req] h.board/preview)
(defmethod router :message/index [_] h.message/index)
(defmethod router :message/create [req] h.message/create)
(defmethod router :message/edit [req] h.message/edit)
(defmethod router :api.status/index [req] h.a.status/index)
