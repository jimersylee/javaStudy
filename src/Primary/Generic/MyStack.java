package Primary.Generic;

import Primary.LOL.Hero;
import Primary.LOL.Item;

import java.util.LinkedList;

/**
 * 设计一个支持泛型的栈MyStack
 * Created by Jimersy Lee on 2017/5/15.
 */
public class MyStack<T> {
    private LinkedList<T> values=new LinkedList<>();

    /**
     * 压栈
     * @param t:泛型
     */
    public void push(T t){
        values.addLast(t);
    }

    /**
     * 出栈
     */
    public void pull(){
        values.removeLast();
    }

    /**
     * 获取栈顶值
     * @return T
     */
    public T peek(){
        return  values.getLast();
    }

    public static void main(String[] args){
        //在声明这个stack的时候,使用泛型<Hero>声明该stack只能放hero
        MyStack<Hero> heroMyStack=new MyStack<>();
        heroMyStack.push(new Hero());
        //不能放Item
        //heroMyStack.push(new Item());

        //在声明这个stack的时候,使用泛型<Item>声明该stack只能放Item;
        MyStack<Item> itemMyStack=new MyStack<>();
        itemMyStack.push(new Item());
        //不能放Hero,报语法错误
        //itemMyStack.push(new Hero());

    }



}
