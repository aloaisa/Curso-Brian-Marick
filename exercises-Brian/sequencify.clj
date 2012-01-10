(def prompt-and-read
     (fn []
       (print "> ")
       (.flush *out*)
       (.readLine (new java.io.BufferedReader *in*))))

(def inputs-starting-now
     (repeatedly prompt-and-read))

(def counted-sum
     (fn [number-count numbers]
       (apply +
              (take number-count
                    numbers))))

(def number-string?
     (fn [string]
       (try
         (Integer/parseInt string)
         true
       (catch NumberFormatException ignored
           false))))

(def to-integer
     (fn [string]
       (Integer/parseInt string)))

