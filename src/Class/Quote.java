package Class;

/**
 * 类的引用
 * Created by Jimersy Lee on 2017/3/11.
 */
public class Quote {
    public static void main(String [] args){
            Quote q=new Quote();
            q.quoteAndPoint();
            q.multipleQuotesAndOneObj();
            q.oneQuoteAndMultipleObjs();
    }

    /**
     * 引用和指向
     */
    private void quoteAndPoint(){
        //创建一个对象
        new Quote();
        //使用一个引用来指向这个对象
        Quote $q=new Quote();
    }

    /**
     * 多个引用一个对象
     */
    private void multipleQuotesAndOneObj(){
        Quote q1=new Quote();
        Quote q2=q1;
        Quote q3=q1;
        Quote q4=q3;
        //q1,q2,q3,q4都指向同一个对象
    }

    /**
     * 一个引用多个对象
     */
    private void oneQuoteAndMultipleObjs(){
        Quote q=new Quote();
        q=new Quote();
        //一个引用,同一时间,只能指向一个对象,此时指向第二次new的对象
    }

}
