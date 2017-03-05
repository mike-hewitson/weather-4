(ns weather-4.routes.history
  (:require [weather-4.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [weather-4.db.core :as db]
            [clj-time.core :as t]
            [clj-time.coerce :as c]
            [clj-time.periodic :as p]))

(defn create-history-seq
  "create a sequence of 50 dates between a date and today"
  [days-back end-point]
  (let [interval (int (/ (* days-back 24  3600) 49))
        from-date (t/minus end-point (t/days days-back))]
   (map c/to-date (take 50 (p/periodic-seq from-date (t/seconds interval))))))

(defn create-readings-list
  "create a list of readings, on for each date "
  [dates]
  (map #(first (db/get-reading-at-time %))
       dates))

(defn create-display-list
  "format the a reeading list for the html template "
  [readings-list]
  (map (fn [x]
         (let [reading (first (:readings x))]
           {:date (:date x)
            :location (:location reading)}))
       readings-list))

(defn history-page []
   (layout/render
    "history.html"
    {:readings (->
                (create-history-seq 1 (t/now))
                create-readings-list
                create-display-list
                dedupe)}))

(defroutes history-routes
  (GET "/history" [] (history-page)))

;TODO adjust readings resolution when graphs are visual
;TODO add a few other data items here
