package javaCode.StatePattern;

public class ToolManager {
    private State currentTool;

    ToolManager(State currentTool) {
        this.currentTool = currentTool; // Default tool
    }

    public void mouseDown() {
        this.currentTool.mousePressed();
    }
    public void mouseUp() {
        this.currentTool.mouseReleased();
    }
    
}
