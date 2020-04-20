(defproject pisano/lein-kibit "0.1.1"
  :description "kibit lein plugin"
  :url "https://github.com/jonase/kibit"
  ;:resource-paths ["../kibit-common/resources"]
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.namespace "0.2.11"]
                 ;; Also there is dep inside leiningen.kibit, you need to update that ns as well!
                 [pisano/kibit "0.1.0"]]
  :deploy-repositories [["clojars" {:sign-releases false :url "https://clojars.org/repo"}]
                        ["releases" {:sign-releases false :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]]
  :eval-in-leiningen true)
