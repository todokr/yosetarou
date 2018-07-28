(ns yosetarou.routes)

(def main
  ["/"
   {"" :home/index
    "board" {:get  :board/index
             :post :board/create}
    ["board/" :board-id] {:get :board/preview}
    "message" {:get  :message/index
               :post :message/create}
    ["message/" :message-id] {:get :message/edit}
    "api/" {"status" :api.status/index}}])
