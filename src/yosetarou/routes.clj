(ns yosetarou.routes)

(def main
  ["" [["/"
        ["" :home/index
         "board" {:get  :board/index
                  :post :board/create}
         ["board" :board-id] {:get :board/preview}
         ["message/" :board-id] {:post :message/index}]]]
   true :not-found])

(def main
  ["/"
   {"" :home/index
    "board" {:get  :board/index
             :post :board/create}
    ["board/" :board-id] {:get :board/preview}
    "message" {:get  :message/index
               :post :message/create}
    ["message/" :message-id] {:get :message/edit}}
   true :not-found])
