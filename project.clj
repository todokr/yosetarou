(defproject yosetarou "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.6.3"]
                 [org.immutant/web "2.1.10"]
                 [bidi "2.1.3"]
                 [hiccup "2.0.0-alpha1"]
                 [funcool/struct "1.2.0"]
                 [org.clojure/java.jdbc "0.7.5"]
                 [org.postgresql/postgresql "42.2.2"]
                 [ragtime "0.7.2"]
                 [honeysql "0.9.2"]
                 [buddy/buddy-auth "2.1.0"]
                 [buddy/buddy-hashers "1.3.0"]
                 [integrant "0.6.3"]
                 [io.github.gitbucket/markedj "1.0.15"]
                 [ring/ring-defaults "0.3.1"]
                 [rkworks/baum "0.4.0"]
                 [org.clojure/tools.logging "0.4.1"]
                 [org.slf4j/slf4j-api "1.7.25"]
                 [ch.qos.logback/logback-classic "1.2.3"]
                 [hikari-cp "2.4.0"]
                 [com.taoensso/carmine "2.18.1"]]
  :main ^:skip-aot yosetarou.core
  :target-path "target/%s"
  :jvm-opts ["-Duser.timezone=UTC"]
  :profiles {:uberjar {:uberjar-name "yosetarou.jar"
                       :main yosetarou.core
                       :aot :all}
             :dev {:jvm-opts ["-Dlogback.configurationFile=logback.dev.xml"]
                   :source-paths ["env/dev/src"]
                   :env {:yosetarou-dev true}
                   :plugins [[lein-environ "1.1.0"]
                             [lein-eftest "0.5.2"]]
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [prone "1.1.4"]
                                  [alembic "0.3.2"]
                                  [ring/ring-mock "0.3.2"]
                                  [com.gearswithingears/shrubbery "0.4.1"]
                                  [fudje "0.9.7"]
                                  [kerodon "0.9.0"]]}})
