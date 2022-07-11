(ns aoc2015.day01.core)

(defn map-parenthesis [c]
  (cond
    (= c \() 1
    (= c \)) -1
    :else 0))

(defn calculate-floor [s]
  (reduce + (map map-parenthesis s)))

(defn basement-pos? [s]
  (loop [idx 0 acc 0 list (vec s)]
    (if (= -1 acc)
      idx
      (recur (inc idx) (long (+ acc (map-parenthesis (first list)))) (rest list)))))
