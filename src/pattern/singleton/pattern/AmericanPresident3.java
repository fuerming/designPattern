package designPattern.src.pattern.singleton.pattern;

/**
 * description:双重锁模式：其实也是懒汉模式，相比较起来性能更优
 *
 * @date 2021/4/20 16:43
 */
public class AmericanPresident3 {

    private  static volatile AmericanPresident3 americanPresident3=null;

    private String name;

    private AmericanPresident3() {

    }

    public static  AmericanPresident3 getInstance(){
        if(americanPresident3==null){
            synchronized (AmericanPresident3.class){
                if(americanPresident3==null){
                    americanPresident3=new AmericanPresident3();
                }
            }
        }
        return americanPresident3;
    }
}
