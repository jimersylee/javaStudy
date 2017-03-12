package InterfaceExtends;
import LOL.Hero;

/**
 * 对象转型
 * Created by Jimersy Lee on 2017/3/12.
 */
public class ObjectTransfer {
    public static void main(){
           ObjectTransfer ot=new ObjectTransfer();
           ot.childToParent();
           ot.implementsToInterface();
           ot.instanceofTest();
           ot.interfaceToImplements();
           ot.notExtendsClassTransfer();
           ot.parentToChild();
           ot.quoteAndObject();
    }

    /**
     * 引用类型与对象类型
     */
    public void quoteAndObject(){
        ADHero ad=new ADHero();
        // ad是引用,ADHero是对象,通常情况下,引用类型与对象类型是一样的
    }

    /**
     * 子类转父类
     */
    public void childToParent(){
        Hero h=new Hero();
        ADHero a=new ADHero();
        h=a;

    }

    /**
     * 父类转子类,需要强转
     */
    public void parentToChild(){
        Hero h=new Hero();
        ADHero a=new ADHero();
        //a=h;//父类转子类,有时候行,有时候不行,必须进行强制转换
        //a=(ADHero) h;


        SupportHero s=new SupportHero();
        h=a;
        a=(ADHero) h;
        h=s;
        a=(ADHero) h;


    }

    /**
     * 没有继承关系的两个类互相转换
     */
    public void notExtendsClassTransfer(){
        ADHero ad=new ADHero();
        APHero ap=new APHero();
        //ad=(ADHero) ap; 就算强转也不行
    }

    /**
     * 实现类转换为接口类
     */
    public void implementsToInterface(){
        ADHero ad=new ADHero();
        AD adi=ad;

    }

    /**
     * 接口类转换为实现类
     */
    public void interfaceToImplements(){
        ADHero ad=new ADHero();
        AD adi=ad;
        ADHero adHero=(ADHero) adi;
        ADAPHero adapHero=(ADAPHero) adi;
        adapHero.magicAttack();
    }

    /**
     *instanceof Hero 判断一个引用所指向的对象,是否是Hero类型,或者Hero的子类
     */
    public void instanceofTest(){
        ADHero ad=new ADHero();
        APHero ap=new APHero();
        Hero h1=ad;
        Hero h2=ap;
        System.out.println(h1 instanceof ADHero);
        System.out.println(h2 instanceof APHero);
        System.out.println(h1 instanceof  Hero);
    }





}







