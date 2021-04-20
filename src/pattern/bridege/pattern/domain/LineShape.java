package designPattern.src.pattern.bridege.pattern.domain;

/**
 * description:
 *
 * @date 2021/4/20 14:24
 */
public class LineShape implements Shape {

    private int length;
    private DrawingAPI drawingAPI;

    public LineShape(int length, DrawingAPI drawingAPI) {
        this.length = length;
        this.drawingAPI = drawingAPI;
    }

    @Override
    public void draw() {
        drawingAPI.drawTool();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
