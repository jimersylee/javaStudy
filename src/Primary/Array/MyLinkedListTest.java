package Primary.Array;

/**
 * LinkedList测试
 * Created by jimersylee on 17-8-20.
 */
public class MyLinkedListTest {
    public static void main(String[] args){
        MyLinkedListTest t=new MyLinkedListTest();

        MyLinkedList<String> myLinkedList=new MyLinkedList<>();
        for(int i=0;i<10;i++){
            myLinkedList.add(String.valueOf(i));
        }

        for(int i=0;i<myLinkedList.getSize();i++){
            t.print(myLinkedList.get(i));
        }

        t.print(myLinkedList.toString());

        t.print(myLinkedList.find("9"));
        t.print(myLinkedList.find("10"));

        MyLinkedList<Integer> intLinkedList=new MyLinkedList<>();
        for(int i=0;i<10;i++){
            intLinkedList.add(i);
        }

        for(int i=0;i<intLinkedList.getSize();i++){
            t.print(intLinkedList.get(i));
        }

        t.print(intLinkedList.toString());

        t.print(intLinkedList.find(9));
        t.print(intLinkedList.find(10));






    }


    public void print(Object o){
        System.out.println(o.toString());
    }
}
