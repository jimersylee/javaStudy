package Primary.WeixinRedPacket;

/**
 * 微信分配红包方法测试
 * Created by Jimersy Lee on 2017/5/25.
 */
public class RedPacketTest {

    public static void main(String[] args) {
            RedPacketTest redPacketTest=new RedPacketTest();
            redPacketTest.methodCoefficient();

    }

    /**
     * 系数法分配
     */
    public void methodCoefficient() {
        float num = 10, n = 1.9f;//系数取1.9
        int people = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println("the number" + people + " can get " + num / people * n);
            num = num - num / people * n;
            people--;
        }
        System.out.println("there remain" + num);
        //there remain-0.01302808 结果10个人结束后剩余的钱为负数，说明最后一个人达不到他的最大值，如果我们将系数改为2.3：

        num = 10;
        n = 2.3f;//系数取2.3
        people = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println("the number" + people + " can get " + num / people * n);
            num = num - num / people * n;
            people--;
        }
        System.out.println("there remain" + num);
        //我们发现 number1 成了负数，显然这也不合适，所以在使用系数的算法时，添加判断金额是否合理是很重要的。
    }





}

/**
 * 红包分配算法
 */
class RedPacketUtil{
    /**
     * 我们发现 number1 成了负数，显然这也不合适，所以在使用系数的算法时，添加判断金额是否合理是很重要的。
     */
    //设置红包上下限
    private static final float MIN_MONEY=0.01f;
    private static final float MAX_MONEY=200f;

    /**
     * 判断金额是否合法
     * 我们发现 number1 成了负数，显然这也不合适，所以在使用系数的算法时，添加判断金额是否合理是很重要的。
     * @param money:分配了红包后的剩余金额
     * @param count:红包总个数
     * @return 金额是否合法
     */
    private boolean isRight(float money,int count){
        double avg=money/count;//取剩余红包分配个n个的人平均值
        if(avg<MIN_MONEY){
            return false;
        }else if(avg>MAX_MONEY){
            return false;
        }

        return true;
    }


    private float randomRedPacket(float money,float minVal,float maxVal,int count){
        if(count==1){
            return (float)(Math.round(money*100))/100;
        }

        //如果最大值和最小值一样,就返回min
        if(minVal==maxVal){
            return minVal;
        }
        //如果最大值大于随机的金额,返回随机金额,否则返回最大值
        float max = maxVal > money?money:maxVal;


        return 0;

    }




}
