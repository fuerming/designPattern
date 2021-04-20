package designPattern.src.pattern.bridege.noPattern;

import designPattern.src.pattern.bridege.noPattern.domain.CircleShapeWithDraw1;
import designPattern.src.pattern.bridege.noPattern.domain.LineShapeWithDraw2;
import designPattern.src.pattern.bridege.pattern.domain.*;

import java.io.Serializable;

// 功能：不同的图形要采取不同的方式进行绘画
public class NoBridgePattern implements Serializable {

    public static void main(String[] args) {
        CircleShapeWithDraw1 circleShapeWithDraw1 = new CircleShapeWithDraw1();
        circleShapeWithDraw1.draw();
        LineShapeWithDraw2 lineShapeWithDraw2 = new LineShapeWithDraw2();
        lineShapeWithDraw2.draw();
    }
}
