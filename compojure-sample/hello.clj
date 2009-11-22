(use 'compojure)

(defroutes my-app
             (GET "/"
                      (html [:h1 "Hello World"]))
             (ANY "*"
                      (page-not-found)))

(run-server {:port 8080}
              "/*" (servlet my-app))
