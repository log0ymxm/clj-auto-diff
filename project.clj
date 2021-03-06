(defproject clj-auto-diff "0.1.3"
  :description "Automatic differentiation library"
  :url "http://github.com/log0ymxm/clj-auto-diff"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[net.mikera/core.matrix "0.26.0"]
                 [org.clojure/clojure "1.5.1"]
                 [org.clojure/core.match "0.2.1"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]
                                  [midje "1.6.3"]]
                   :source-paths ["dev"]}})
