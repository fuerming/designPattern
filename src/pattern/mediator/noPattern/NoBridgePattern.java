package designPattern.src.pattern.mediator.noPattern;

import designPattern.src.pattern.mediator.noPattern.domain.Plane;

import java.io.Serializable;
// 功能：飞机将要降落  要给所有在天空上的飞机发消息它要降落
public class NoBridgePattern implements Serializable {

    public static void main(String[] args) {
        Plane plane1 = new Plane("飞机1号");
        Plane plane2 = new Plane("飞机2号");
        Plane plane3 = new Plane("飞机3号");
        Plane plane4 = new Plane("飞机4号");
        plane1.sendMessage("发送消息：飞机1号 将要降落");

        plane2.reciveMessage("接受消息：飞机1号 将要降落");
        plane3.reciveMessage("接受消息：飞机1号 将要降落");
        plane4.reciveMessage("接受消息：飞机1号 将要降落");
    }
}
