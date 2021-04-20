package designPattern.src.pattern.mediator.pattern;

import designPattern.src.pattern.mediator.pattern.domain.Mediator;
import designPattern.src.pattern.mediator.pattern.domain.Plane;

import java.io.Serializable;

/**
 * description:
 *
 *
 * 在现实生活中，常常会出现好多对象之间存在复杂的交互关系，这种交互关系常常是“网状结构”，它要求每个对象都必须知道它需要交互的对象。
 * 例如，每个人必须记住他（她）所有朋友的电话；而且，朋友中如果有人的电话修改了，他（她）必须让其他所有的朋友一起修改，这叫作“牵一发而动全身”，非常复杂。
 *
 * 如果把这种“网状结构”改为“星形结构”的话，将大大降低它们之间的“耦合性”，这时只要找一个“中介者”就可以了。
 * 如前面所说的“每个人必须记住所有朋友电话”的问题，只要在网上建立一个每个朋友都可以访问的“通信录”就解决了
 *
 * 中介者模式是一种对象行为型模式，其主要优点如下。
 * 类之间各司其职，符合迪米特法则。
 * 降低了对象之间的耦合性，使得对象易于独立地被复用。
 * 将对象间的一对多关联转变为一对一的关联，提高系统的灵活性，使得系统易于维护和扩展。
 *
 * 其主要缺点是：中介者模式将原本多个对象直接的相互依赖变成了中介者和多个类的依赖关系。当类越多时，中介者就会越臃肿，变得复杂且难以维护
 *
 *
 * 功能解释：
 * 所有飞机找塔台进行调度
 * @date 2021/4/20 14:05
 */
public class MediatorPattern implements Serializable {

    public static void main(String[] args) {
        Plane plane1 = new Plane("飞机1号");
        Plane plane2 = new Plane("飞机2号");
        Plane plane3 = new Plane("飞机3号");
        Plane plane4 = new Plane("飞机4号");
        Mediator.register(plane1);
        Mediator.register(plane2);
        Mediator.register(plane3);
        Mediator.register(plane4);
        Mediator.sendMessage("飞机1号即将降落");
    }
}
