(defproject karras "0.8.1-SNAPSHOT"
  :description "A clojure entity framework for MongoDB"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.mongodb/mongo-java-driver "2.7.2"]
                 [inflections "0.6.3"]]
  :dev-dependencies [[midje "1.3-alpha6" :exclusions [org.clojure/clojure]]]
  :exclusions [org.clojure/contrib
               org.clojure/clojure-contrib]
  :autodoc {:web-src-dir "http://github.com/wilkes/karras/blob/"
            :web-home "http://wilkes.github.com/karras"})
