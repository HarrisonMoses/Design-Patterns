package javaCode.StatePattern;

public class Main {
    public static void main(String[] args) {

        var toolManager = new ToolManager(new BrushTool());
        toolManager.mouseDown(); // Simulate mouse down event
        toolManager.mouseUp();   // Simulate mouse up event
    }
    
}
