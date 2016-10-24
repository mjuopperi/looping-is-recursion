(ns looping-is-recursion)

(defn power [base exp]
  (let [power_acc (fn [acc n]
                (if (zero? n)
                  acc
                  (recur (* acc base) (dec n))))]
    (power_acc 1 exp)))

(defn last-element [a-seq]
  (let [last-acc (fn [last remaining]
                   (if (empty? remaining)
                    last
                    (recur (first remaining) (rest remaining))))]
    (last-acc nil a-seq)))

(defn seq= [seq1 seq2]
  (cond
    (and (empty? seq1) (empty? seq2)) true
    (empty? seq1)                     false
    (empty? seq2)                     false
    (not= (first seq1) (first seq2))  false
    :else (recur (rest seq1) (rest seq2))))

(defn find-first-index [pred a-seq]
  (let [index-acc (fn [pred a-seq i]
                    (cond
                      (empty? a-seq) nil
                      (pred (first a-seq)) i
                      :else (recur pred (rest a-seq) (inc i))))]
    (index-acc pred a-seq 0)))

(defn avg [a-seq]
  (let [avg-acc (fn [a-seq sum n]
                 (cond
                   (and (empty? a-seq) (= n 0)) 0
                   (empty? a-seq) (/ sum n)
                   :else (recur (rest a-seq) (+ sum (first a-seq)) (inc n))))]
    (avg-acc a-seq 0 0)))

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])
