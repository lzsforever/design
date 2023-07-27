package creationalpattern.factory.methodfactory;

/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description: 猫工厂
 * @create: 2023/07/27 17:28
 **/
public class CatFactory implements AnimalFactory{
    public Animal createAnimal() {
        return new Cat();
    }
}