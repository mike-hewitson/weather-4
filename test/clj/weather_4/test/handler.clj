(ns weather-4.test.handler
  (:require [clojure.test :refer :all]
            [ring.mock.request :refer :all]
            [weather-4.handler :refer :all]
            [midje.sweet :refer :all]))

(facts "about routes"
  (fact "main route should return 200"
    (let [response ((app) (request :get "/"))]
      (:status response) => 200))
  (fact "history route should return 200"
    (let [response ((app) (request :get "/history"))]
      (:status response) => 200))
  (fact "summary route should return 200"
    (let [response ((app) (request :get "/summary"))]
      (:status response) => 200))
  (fact "not-found route should return 404"
    (let [response ((app) (request :get "/invalid"))]
      (:status response) => 404)))
