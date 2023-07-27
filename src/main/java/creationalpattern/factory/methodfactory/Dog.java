package creationalpattern.factory.methodfactory;


/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description: 狗
 * @create: 2023/07/27 17:26
 **/
public class Dog implements Animal {
    public void makeSound() {
        System.out.println("汪");
    }
}