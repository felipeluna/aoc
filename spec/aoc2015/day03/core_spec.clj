(ns aoc2015.day02.core-spec
  (:require [speclj.core :refer :all]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [aoc2015.day03.core :refer :all]))

(describe "parse chars"
          (it "convert arrows to coordinate functions"
              (should= :right (parse-string ">"))
              (should= :down (parse-string "v"))
              (should= :up (parse-string "^"))
              (should= :left (parse-string "<"))))

(describe "change position"
          (let [initial-pos {:x 0 :y 0}]
            (it "should change position based on direction"
                (should= {:x 0 :y 1} (move :up initial-pos))
                (should= {:x -1 :y 0} (move :left initial-pos))
                (should= {:x 0 :y -1} (move :down initial-pos))
                (should= {:x 1 :y 0} (move :right initial-pos)))))
