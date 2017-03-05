(ns weather-4.test.routes.home
  (:require [midje.sweet :refer :all]
            [ring.mock.request :refer :all]
            [weather-4.routes.home :as r]
            [weather-4.test.fixtures :as fix]))


(facts "about 'get-direction'"
    (fact "given some bearings, its should return their direction"
      (r/get-direction 0) => "N"
      (r/get-direction 45) => "NE"
      (r/get-direction 44.9) => "NE"
      (r/get-direction 50) => "NE"
      (r/get-direction 359) => "N"))


(facts "about 'create-map-for-template'"
       (fact "given a specific input, it should produce the expected output"
             (r/create-map-for-template fix/latest-reading) => fix/home-page-data))

; (facts "about 'get-reading-at-time'"
;   (let [data (db/get-reading-at-time #inst "2017-03-05T13:49:57.796-00:00")
;         reading (first data)
;         readings (:readings reading)]
;     (fact "it should contain one reading"
;       (count data) => 1)
;     (fact "given nothing it should return a map"
;       (map? reading) => true)
;     (fact "it should contain some correct data"
;       (:date reading) => truthy
;       (:cloud-cover (first readings)) => truthy
;       (:now-summary (first readings)) => truthy)
;     (fact "it should contain three locations data"
;       (count readings) => 3)))
;
; (facts "about 'get-summary'"
;   (let [data (db/get-summary "Sandton")
;         first-record (first data)]
;     (fact "it should contain multiple records"
;       (> (count data) 1) => true)
;     (fact "it should return a sequence"
;       (seq? data) => true)
;     (fact "it should contain some correct data"
;       (:date (:_id first-record)) => truthy
;       (:count first-record) => truthy
;       (:avg-temp first-record) => truthy)))
