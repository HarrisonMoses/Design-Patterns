package javaCode;

import javaCode.BuilderPattern.Slide;
import javaCode.BuilderPattern.pdfDocumentBuilder;
import javaCode.BuilderPattern.MovieDocumentBuilder;
import javaCode.BuilderPattern.Representation;

public class Main {

    public static void main(String[] args) {
        // Example usage of the Builder Pat Representation representation = new MovieDocument();
        var rep = new Representation();

        rep.addSlide(new Slide("Introduction"));
        rep.addSlide(new Slide("Chapter 1"));
        rep.addSlide(new Slide("Chapter 2"));

        rep.export(new MovieDocumentBuilder());

    }
}