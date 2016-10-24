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
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])
