package java.StatePattern;

public class FillTool implements State {
    @Override
    public void mousePressed() {
        System.out.println("Fill Tool: Mouse Pressed - Filling area with color.");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Fill Tool: Mouse Released - Area filled.");
    }
    
}
