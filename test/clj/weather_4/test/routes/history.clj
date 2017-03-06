(ns weather-4.test.routes.history
  (:require [midje.sweet :refer :all]
            [ring.mock.request :refer :all]
            [weather-4.routes.history :as r]
            [weather-4.test.fixtures :as fix]
            [clj-time.core :as t]
            [clj-time.predicates :as p]))

(facts "about 'create-history-sequence'"
  (let [date-sequence (r/create-history-seq 1 (t/now))]
    (fact "given 1 day and a test-date, it should create a list"
      (seq? date-sequence) => true
      (count date-sequence) => 50
      (instance? java.util.Date (first date-sequence)) => true)))

(facts "about 'create-readings-list'"
  (let [readings-list (r/create-readings-list (r/create-history-seq 1 (t/now)))]
    (fact "given a date list, it should create a list of reading"
      (seq? readings-list) => true
      (count readings-list) => 50
      (map? (first readings-list)) => true
      (instance? java.util.Date (:date (first readings-list))) => true
      (vector? (:readings (first readings-list))) => true
      (count (:readings (first readings-list))) => 3)))

(facts "about 'create-display-list'"
  (let [display-list (->
                       (r/create-history-seq 1 (t/now))
                       r/create-readings-list
                       r/create-display-list)]
    (fact "given a reading list, it should create a list of date/location pairs"
      (seq? display-list) => true
      (count display-list) => 50
      (map? (first display-list)) => true
      (instance? java.util.Date (:date (first display-list))) => true
      (count (first display-list)) => 2)))
