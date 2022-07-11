(ns day01.core-spec
  (:require [speclj.core :refer :all]
            [clojure.java.io :as io]
            [day01.core :refer :all]))

(def input (slurp (io/resource "day01.txt")))

(describe "a test"
          (it "should sum 0"
              (should= 0 (calculate-floor "(())"))
              (should= 0 (calculate-floor "()()"))
              (should= 3 (calculate-floor "((("))
              (should= 3 (calculate-floor "(()(()("))))

(describe "part 1"
          (it "should be??"
              (should= 232 (calculate-floor input))))

(describe "basement-pos?"
          (it "should be??"
              (should= 1 (basement-pos? ")"))
              (should= 5 (basement-pos? "()())"))))

(describe "part 2"
          (it "should be??"
              (should=  1783 (basement-pos? input))))
