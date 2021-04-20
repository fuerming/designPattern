package designPattern.src.pattern.singleton.pattern;

/**
 * description:懒汉式单例
 *
 * @date 2021/4/20 16:43
 */
public class AmericanPresident2 {

    private  static volatile AmericanPresident2 americanPresident2=null;

    private String name;

    private AmericanPresident2() {

    }
    //相比于双重锁模式 性能较差,需要都阻塞等锁
    public static synchronized AmericanPresident2 getInstance(){
        if(americanPresident2==null){
            americanPresident2=new AmericanPresident2();
        }
        return americanPresident2;
    }
}
