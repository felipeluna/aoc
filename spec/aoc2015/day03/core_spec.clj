(ns aoc2015.day03.core-spec
  (:require [speclj.core :refer :all]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [aoc2015.day03.core :refer :all]))

(def input (slurp (io/resource "aoc2015/day03.txt")))

(describe "parse chars"
          (it "convert arrows to coordinate functions"
              (should= :right (parse-string \>))
              (should= :down (parse-string \v))
              (should= :up (parse-string \^))
              (should= :left (parse-string \<))))

(describe "change position"
          (let [initial-pos {:x 0 :y 0}]
            (it "should change position based on direction"
                (should= {:x 0 :y 1} (move :up initial-pos))
                (should= {:x -1 :y 0} (move :left initial-pos))
                (should= {:x 0 :y -1} (move :down initial-pos))
                (should= {:x 1 :y 0} (move :right initial-pos)))))

(describe "count visited vertices"
          (it "should increase the numbers of visited vertices"
              (should= {{:x 0, :y 1} 1} (visit {:x 0, :y 1} {}))
              (should= {{:x 0, :y 1} 2} (visit {:x 0, :y 1} {{:x 0 :y 1} 1}))))

(defn solution-part1 []
  (loop [command (map parse-string input)
         initial {:x 0 :y 0}
         m {{:x 0 :y 0} 1}]
    (if (not (nil? (first command)))
      (recur
       (rest command)
       (move (first command) initial)
       (visit (move (first command) initial) m))
      m)))

(describe "part1"
          (it "should work"
              ;; (let [m {}
              ;;       initial {:x 0 :y 0}]
              ;;   (for [command (map parse-string input)]
              ;;     (let [current (move command initial)]
              ;;       (visit current m)
              ;;       ))
              ;;   (should= 0 (count (keys m))))
              ;; )
              (let [res (solution-part1)]
                (should= 2081 (count (keys res))))))
