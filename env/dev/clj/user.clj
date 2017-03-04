(ns user
  (:require [mount.core :as mount]
            weather-4.core))

(defn start []
  (mount/start-without #'weather-4.core/http-server
                       #'weather-4.core/repl-server))

(defn stop []
  (mount/stop-except #'weather-4.core/http-server
                     #'weather-4.core/repl-server))

(defn restart []
  (stop)
  (start))


