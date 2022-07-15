(ns aoc2015.day02.core
  (:require [clojure.string :as str]))

(defn convert-to-list [s]
  (map #(Integer/parseInt %) (str/split s #"x")))

(defn calculate-paper-size [s]
  (let [[l w h] (convert-to-list s)
        smallest-area (apply min [(* l w) (* w h) (* h l)])
        value (+ (* 2 l w) (* 2 w h) (* 2 h l))]
    (+ smallest-area value)))

(defn calculate-ribbon-size [s]
  (let [[l w h] (convert-to-list s)
        smallest-area (* 2 (apply min [(+ l w) (+ w h) (+ h l)]))
        ribbon (apply * [l w h])]
    (+ smallest-area ribbon)))
