package Primary.Array;

/**
 * Created by jimersylee on 17-8-20.
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayListTest t = new MyArrayListTest();

        MyArrayList<String> a = new MyArrayList<>();
        /*a.add("1");
        a.add("2");
        a.add("3");
        int size = a.getSize();
        t.print(size);
        t.print(a.get(2));
        t.print(a.get(3));
        t.print(a.set(0, "2222"));*/
        for (int i = 0; i < 10; i++) {
            a.add(String.valueOf(i));
        }

        //remove
        a.remove(1);


        for (int j = 0; j < a.getSize(); j++) {
            t.print(a.get(j));
        }
        t.print(a.getSize());






    }

    public void print(Object o) {
        System.out.println(o);
    }
}
