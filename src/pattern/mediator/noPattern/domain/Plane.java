package designPattern.src.pattern.mediator.noPattern.domain;

import java.io.Serializable;

/**
 * description:
 *
 * @date 2021/4/20 15:02
 */
public class Plane implements Serializable {
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reciveMessage(String message){
        System.out.println(message);
    }

    public void sendMessage(String message){
        System.out.println(message);
    }
}
