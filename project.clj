(defproject aoc2015 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main aoc2015.core
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[speclj "3.3.2"]]}}
  :plugins [[lein-cljfmt "0.8.2"]
            [speclj "3.3.2"]]
  :cljfmt {:paths ["src" "spec"]}
  :test-paths ["spec"])
