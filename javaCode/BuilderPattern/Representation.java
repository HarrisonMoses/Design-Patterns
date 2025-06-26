package javaCode.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Representation {

    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }
    public void export(RepresentationBuilder builder) {
    
        for (Slide slide : slides) {
            builder.addSlide(slide);
        }
    }
}
