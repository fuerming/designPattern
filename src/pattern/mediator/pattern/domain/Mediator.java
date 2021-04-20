package designPattern.src.pattern.mediator.pattern.domain;


import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @date 2021/4/20 15:13
 */
public class Mediator {
    private static List<Plane> planeList=new ArrayList<>();

    public static void register(Plane plane){
        planeList.add(plane);
    }

    public static void sendMessage(String message){
        for (Plane plane : planeList) {
            System.out.println(plane.getName()+"收到消息："+message);
        }
    }

}
