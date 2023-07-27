package creationalpattern.factory.methodfactory;

/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description: 狗工厂
 * @create: 2023/07/27 17:29
 **/
public class DogFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Dog();
    }
}