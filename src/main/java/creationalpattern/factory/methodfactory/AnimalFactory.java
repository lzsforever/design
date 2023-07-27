package creationalpattern.factory.methodfactory;

public interface AnimalFactory {
    Animal createAnimal();
}

/*
对比简单工厂模式和工厂方法模式：

        简单工厂模式：


public class SimpleFactory {
    public static Animal createAnimal(String type) {
        if ("Cat".equalsIgnoreCase(type)) {
            return new Cat();
        } else if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        return null;
    }
}
工厂方法模式：


public interface AnimalFactory {
    Animal createAnimal();
}

public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
在工厂方法模式中，每个产品类型都有对应的工厂类来创建该类型的产品，从而避免了使用 if-else 或 switch，使得代码更加灵活和易于扩展。因此，工厂方法模式是一种更好的实现方式，特别是在面临多个产品类型时，更易于维护和扩展。
*/
