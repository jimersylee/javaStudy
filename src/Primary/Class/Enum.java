package Primary.Class;

/**
 * 枚举类,使用枚举限定
 * Created by Jimersy Lee on 2017/3/11.
 */
public class Enum {

    public static void main(String[] args) {
        //switch示例
        Season season = Season.SPRING;
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case AUTUMN:
                break;
            case SUMMER:

                break;
            case WINTER:
                break;
            default:

        }

        //遍历常量
        for (Season s :
                Season.values()) {
            System.out.println(s);
        }
    }
}

/**
 * 季节枚举类
 */
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}
