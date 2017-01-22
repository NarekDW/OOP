package com.epam.courses.oop.t06;

import com.epam.courses.oop.t07.AnnotationForJavadoc;

/**
 * Created by Narek on 21.01.2017.
 */
@AnnotationForJavadoc(
        author = "Karapetyan N.K.",
        date = "21.01.17",
        lastModified = "21.01.17",
        lastModifiedBy = "Karapetyan N.K.",
        currentVersion = 2
)
public class NuclearSubmarine {
    private Engine engine;

    @AnnotationForJavadoc(
            author = "Karapetyan N.K.",
            date = "22.01.17",
            lastModified = "22.01.17",
            lastModifiedBy = "Karapetyan N.K.",
            currentVersion = 2
    )
    public class Engine{
        public Engine(){}
        private boolean position;
        public boolean start(){
            this.position = true;
            return position;
        }
        public boolean stop(){
            this.position = false;
            return position;
        }
    }

    public boolean launch(){
        engine = new Engine();
        return engine.start();
    }
}
