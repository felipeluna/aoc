(ns aoc2015.day02.core-spec
  (:require [speclj.core :refer :all]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [aoc2015.day02.core :refer :all]))

(def input (->
            (slurp (io/resource "day02.txt"))
            (str/split #"\n")))

(describe "calculates square feet of paper"
          (it "should give the right result"
              (should= 43 (calculate-paper-size "1x1x10"))
              (should= 58 (calculate-paper-size "2x3x4"))))

(describe "part 1"
          (it "should work"
              (should= 1598415 (apply + (map calculate-paper-size input)))))

(describe "ribbon calculation"
          (it "should calculate"
              (should= 14 (calculate-ribbon-size "1x1x10"))))

(describe "part 2"
          (it "should work"
              (should= 3812909 (apply + (map calculate-ribbon-size input)))))
