(ns looping-is-recursion)

(defn power [base exp]
  (let [power_acc (fn [acc n]
                (if (zero? n)
                  acc
                  (recur (* acc base) (dec n))))]
    (power_acc 1 exp)))

(defn last-element [a-seq]
  ":(")

(defn seq= [seq1 seq2]
  ":(")

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
