(ns weather-4.routes.summary
  (:require [weather-4.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [weather-4.db.core :as db]))

(defn summary-page []
   (layout/render
    "summary.html"
    {:summary (db/get-summary "Paradise Beach")}))


(defroutes summary-routes
  (GET "/summary" [] (summary-page)))

;TODO adjust readings resolution when graphs are visual
