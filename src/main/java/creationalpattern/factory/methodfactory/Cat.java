package creationalpattern.factory.methodfactory;

/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description: 猫
 * @create: 2023/07/27 17:25
 **/
public class Cat implements Animal {
    public void  makeSound() {
        System.out.println("喵");
    }
}