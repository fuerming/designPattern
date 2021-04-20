package designPattern.src.pattern.bridege.noPattern.domain;

/**
 * description:
 *
 * @date 2021/4/20 14:35
 */
public class LineShapeWithDraw1 implements Shape {
    private int length;

    @Override
    public void draw() {
        System.out.println("用水彩笔画");
    }


}
