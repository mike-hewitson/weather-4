(ns weather-4.routes.home
  (:require [weather-4.layout :as layout]
            [clojure.tools.logging :as log]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            ; [clojure.java.io :as io]
            [clojure.math.numeric-tower :as m]
            [weather-4.db.core :as db]))

(def locations
  ["Sandton" "Paradise Beach"])


(def wind-directions
  ["N" "NE" "E" "SE" "S" "SW" "W" "NW"])

(defn get-direction
  "translater wind bearing to direction in text"
  [bearing]
  (wind-directions (mod (m/round (/ bearing 45)) 8)))

(defn add-direction-into-readings
  "include the direction element into the reading"
  [readings]
  (map (fn [reading]
         (assoc reading :wind-direction (get-direction (:wind-bearing reading))))
       readings))

(defn home-page []
  (let [readings (first (db/get-latest))]
   (log/debug "readings" readings)
   (log/debug "date" (:date readings))
   (layout/render
    "home.html"
    {:readings (filter (fn [x] (some #(= (:location x) %) locations))
                       (add-direction-into-readings (:readings readings)))
     :date (:date readings)})))

(defroutes home-routes
  (GET "/" [] (home-page)))
  ; (GET "/summary" [] (summary-page)))

;TODO create seperate route for summary
