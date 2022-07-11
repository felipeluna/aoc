(ns aoc2015.day01.core-spec
  (:require [speclj.core :refer :all]
            [clojure.java.io :as io]
            [aoc2015.day02.core :refer :all]))


(describe "calculates square feet of paper"
          (it "should give the right result"
              (should= 58 (calculate-paper-size "2x3x4"))))
