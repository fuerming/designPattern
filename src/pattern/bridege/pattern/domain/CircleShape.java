package designPattern.src.pattern.bridege.pattern.domain;

/**
 * description:
 *
 * @date 2021/4/20 14:02
 */
public class CircleShape implements Shape{
    private double x, y, radius;
    private DrawingAPI drawingAPI;

    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        this.x = x;  this.y = y;  this.radius = radius;        this.drawingAPI = drawingAPI;
    }

    @Override
    public void draw() {
        drawingAPI.drawTool();
    }
}
