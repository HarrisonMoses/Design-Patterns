package javaCode.BuilderPattern;

public class pdfDocumentBuilder implements RepresentationBuilder {
     private pdfDocument document = new pdfDocument();
    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getContent());
    }

    public pdfDocument getDocument() {
        System.out.println("created a pdf document");
        return document;
    }
}
