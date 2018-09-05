(defproject re-interval "0.1.0"

  :description "A re-frame/ClojureScript library for creating intervals controlled by events."

  :url "https://github.com/caioaao/re-interval"

  :license {:name "MIT"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.10.339"]
                 [org.clojure/core.async "0.4.474"]
                 [re-frame "0.8.1"]]

  :jvm-opts ^:replace ["-Xmx1g" "-server"]

  :plugins [[lein-npm "0.6.1"]]

  :npm {:dependencies [[source-map-support "0.4.0"]]}

  :source-paths ["src" "target/classes"]

  :clean-targets ["out" "release"]

  :target-path "target"

  :profiles {:dev {:plugins [[com.cemerick/austin "0.1.6"]]}})
