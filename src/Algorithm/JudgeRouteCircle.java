package Algorithm;


/**
 * 657. Judge Route Circle
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
 * <p>
 * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
 * <p>
 * Example 1:
 * <p>
 * Input: "UD"
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: "LL"
 * Output: false
 */
public class JudgeRouteCircle {

    public static void main(String[] args) {
        JudgeRouteCircle j = new JudgeRouteCircle();
        System.out.println(j.judgeCircle("LLR"));
        System.out.println(j.judgeCircle("LRR"));
        System.out.println(j.judgeCircle("RL"));
        System.out.println(j.judgeCircle("DLUR"));
    }

    public boolean judgeCircle(String moves) {

        char[] movesArray = moves.toCharArray();

        //如果是奇数个,必然回不到原点
        if (movesArray.length % 2 == 1) {
            return false;
        }

        //判断各个方向出现的次数,然后统计对应的方向出现的次数,如果不相等,直接返回false;
        int timesL=0;
        int timesR=0;
        int timesU=0;
        int timesD=0;
        for(int i=0;i<movesArray.length;i++){
            switch (movesArray[i]){
                case 'L':
                    timesL++;
                    break;
                case 'R':
                    timesR++;
                    break;
                case 'U':
                    timesU++;
                    break;
                case 'D':
                    timesD++;
                    break;
                default:
                    return false;
            }
        }

        if(timesL!=timesR || timesD!=timesU){
            return false;
        }

        return true;
    }
}





