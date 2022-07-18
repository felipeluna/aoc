(ns aoc2015.day03.core)

(defn parse-string [s]
  (cond
    (= "<" s) :left
    (= "^" s) :up
    (= "v" s) :down
    (= ">" s) :right))

(defn move [pos initial-pos]
  (cond (= pos :up) (update initial-pos :y inc)
        (= pos :left) (update initial-pos :x dec)
        (= pos :right) (update initial-pos :x inc)
        (= pos :down) (update initial-pos :y dec)))
