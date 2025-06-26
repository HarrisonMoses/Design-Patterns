package javaCode.BuilderPattern;

public class MovieDocumentBuilder implements RepresentationBuilder {
    private MovieDocument document = new MovieDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addScene(slide.getContent());
    }

    
}
