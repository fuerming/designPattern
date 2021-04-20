package designPattern.src.pattern.bridege.pattern;

import designPattern.src.pattern.bridege.pattern.domain.*;

import java.io.Serializable;

/**
 * description:     桥接模式
 *
 *
 * 桥接模式是将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(interface)模式。
 *
 * 在软件系统中，某些类型由于自身的逻辑，它具有两个或多个维度的变化，那么如何应对这种“多维度的变化”？
 * 如何利用面向对象的技术来使得该类型能够轻松的沿着多个方向进行变化，而又不引入额外的复杂度？这就要使用Bridge模式。
 *
 * 功能解释：
 * 各种图形，每种图形可能采取的绘画方式是不同的；绘画方式是变化的,可能会不断添加;图形与绘画方式本是不相干的，应解耦，我们可以将绘画方式
 * 抽象为接口，在创建图形时动态选择绘画方式，而不是将具体的绘画方式绑定在一起;否则图形n与绘画方式m两种维度两两组合，会产生n*m中对象,而且绘画方式的实现也会重复书写，
 * 变动时需要更改大量引用地方;
 * @date 2021/4/20 14:05
 */
public class BridgePattern implements Serializable {

    public static void main(String[] args) {
        Shape circleShape = new CircleShape(1, 2, 3, new DrawingAPI1());
        circleShape.draw();
        Shape lineShape = new LineShape(1, new DrawingAPI2());
        lineShape.draw();
    }
}
