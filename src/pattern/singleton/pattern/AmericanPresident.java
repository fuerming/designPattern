package designPattern.src.pattern.singleton.pattern;

/**
 * description:饿汉式单例
 *
 * @date 2021/4/20 16:38
 */
public class AmericanPresident {

    public static final AmericanPresident americanPresident=new AmericanPresident();
    private String name;

    private AmericanPresident() {
    }

    public String getName() {
        name="奥巴马";
        return name;
    }


    public static AmericanPresident getInstance(){
        return americanPresident;
    }

}
