package Primary.Generic;

import Primary.LOL.ADHero;
import Primary.LOL.APHero;
import Primary.LOL.Hero;
import Primary.LOL.LifePoint;

import java.util.ArrayList;

/**
 * 泛型通配符
 * 概述
 * <?extends clazz> 表示这是一个clazz泛型或者其子类泛型 不可存可取
 * <?super clazz> 表示这是一个clazz泛型或者其父类泛型 可存不可取
 * Created by Jimersy Lee on 2017/5/15.
 */
public class Wildcard {
    public static void main(String[] args){
        /*
         * ?extends通配符
         * ArrayList heroList<? extends Hero>表示这是一个Hero泛型或者子类泛型
         * 可以确认的是,从heroList取出的对象,一定是可以转型成Hero
         * 但是,不能往里面放东西,因为
         * 放APHero就不能满足<ADHero>
         * 放ADHero就不能满足<APHero>
         */
        //code
        //普通泛型
        ArrayList<APHero> apHeroArrayList=new ArrayList<>();
        apHeroArrayList.add(new APHero());
        //?extends 泛型
        ArrayList<? extends Hero> heroes=new ArrayList<>();

        //heroes可以是Hero,也可以是APHero,可以是ADHero
        //可以确凿的是,从heroes取出的对象,一定是可以转型成Hero的
        Hero hero=heroes.get(0);

        //但是,不能往里面放东西,会编译错误,因为heroes的泛型,可能是ADHero
        //heroes.add(new APHero());



        /*?super他通配符
        ArrayList heroList<?super Hero>表示这个是Hero泛型或者其父泛型
        heroList的泛型可能是Hero
        heroList的泛型可能是Object
        与?extends的区别是     可以往里面插入Hero以及Hero的子类
        但是取出来有风险,因为不确定取出来的Hero还是Object
        * */
        //code
        ArrayList<?super Hero> heroList=new ArrayList<>();

        //可以插入Hero
        heroList.add(new Hero());
        //可以插入Hero的子类
        heroList.add(new APHero());
        heroList.add(new ADHero());

        //但是不能从里面取出来,因为其泛型可能是Object,而Object强转为Hero会失败
        //Hero h=heroList.get(0);





    }
}
