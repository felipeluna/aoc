(ns aoc2015.day02.core
  (:require [clojure.string :as str]))

(defn calculate-paper-size [s]
  (str/split s #"x"))
