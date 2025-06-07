package java.StatePattern;

public class BrushTool implements State {
    
    @Override
    public void mousePressed() {
        System.out.println("Brush tool selected");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Brush tool released");
    }
    
}
