(defn modCheckerMaker [num]
  #(= 0 (mod % num)))

(defn rangeCheck [r]
  (let [mc3 (modCheckerMaker 3) mc5 (modCheckerMaker 5)]
    (reduce + 
            (filter 
             #(or (mc3 %) (mc5 %))
             (range r)))))

(rangeCheck 1000)
