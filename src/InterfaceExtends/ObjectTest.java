package InterfaceExtends;

import LOL.Hero;

/**
 * Object类是所有类的父类
 * Created by Jimersy Lee on 2017/3/13.
 */
public class ObjectTest {
     public static void main(String [] args) {
         ObjectTest ot = new ObjectTest();
         ot.toStringTest();
         ot.finalizeTest();
     }

     public void toStringTest(){
         Hero hero=new Hero();
         System.out.println(hero.toString()); //类似 LOL.Hero@74a14482
     }


     public void finalizeTest(){
         Hero h;
         for (int i=0;i<10000000;i++){
             h=new Hero();
         }
     }


}
