package creationalpattern.factory.simplefactory;

/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description: 既可以通过继承抽象类实现，也可以通过实现接口
 * @create: 2023/07/26 18:56
 **/
public abstract class IAbstractCommodity {
    public abstract void sendCommodity(String userName, String awardContent);
}