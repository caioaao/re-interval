(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 're-interval.core
   :output-to "out/re_interval.js"
   :output-dir "out"})
