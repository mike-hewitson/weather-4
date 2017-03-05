(ns weather-4.routes.summary
  (:require [weather-4.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [weather-4.db.core :as db]
            [clj-time.core :as t]
            [clj-time.coerce :as c]
            [clj-time.periodic :as p]))

(defn create-history-seq
  "create a sequence of 50 dates between a date and today"
  [days-back]
  (let [interval (int (/ (* days-back 24  3600) 49))
        from-date (t/minus (t/now) (t/days days-back))]
   (map c/to-date (take 50 (p/periodic-seq from-date (t/seconds interval))))))

(defn create-readings-list
  [dates]
  (map #(first (db/get-reading-at-time %))
       dates))

(defn create-display-list
  [readings-list]
  (map (fn [x]
         (let [reading (first (:readings x))]
           {:date (:date x)
            :location (:location reading)}))
       readings-list))

(defn summary-page []
   (layout/render
    "summary.html"
    {:readings (->
                (create-history-seq 1)
                create-readings-list
                create-display-list
                dedupe)}))

(defroutes summary-routes
  (GET "/summary" [] (summary-page)))

;TODO adjust readings resolution when graphs are visual
;TODO add a few other data items here
