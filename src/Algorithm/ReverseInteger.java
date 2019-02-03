package Algorithm;

/**
 * @author jimersylee
 */ //7. Reverse Integer
//        Easy
//
//        1889
//
//        2730
//
//        Favorite
//
//        Share
//        Given a 32-bit signed integer, reverse digits of an integer.
//
//        Example 1:
//
//        Input: 123
//        Output: 321
//        Example 2:
//
//        Input: -123
//        Output: -321
//        Example 3:
//
//        Input: 120
//        Output: 21
//        Note:
//        Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.run(1122));
    }

    public int run(int x) {
        int reverse = 0;
        while (x != 0) {
            //x除以10取余,取模 x=1122%10=2
            int pop = x % 10;
            //x除以10取整,x=1122/10=112
            x = x / 10;
            //int最大值 2^32-1=2147483647
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            //int最小值 -2^32=-2147483648
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            reverse = reverse * 10 + pop;
        }

        return reverse;
    }
}




















