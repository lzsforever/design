package creationalpattern.factory;

import com.alibaba.fastjson.JSON;
import creationalpattern.factory.entity.AwardReq;
import creationalpattern.factory.entity.AwardRes;
import creationalpattern.factory.methodfactory.Animal;
import creationalpattern.factory.methodfactory.AnimalFactory;
import creationalpattern.factory.methodfactory.CatFactory;
import creationalpattern.factory.methodfactory.DogFactory;
import creationalpattern.factory.old.OldPrizeController;
import creationalpattern.factory.simplefactory.IAbstractCommodity;
import creationalpattern.factory.simplefactory.SimpleFactory;
import creationalpattern.factory.simplefactory.SimpleMapFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description: 工厂测试类
 * @create: 2023/07/26 18:38
 **/

public class factoryTest {
    private Logger logger = LoggerFactory.getLogger(factoryTest.class);
    @Test
    public void testOld(){
        OldPrizeController oldPrizeController = new OldPrizeController();
        System.out.println("\r\n模拟发放优惠券测试\r\n");
        AwardReq awardReq=new AwardReq();
        awardReq.setUserName("李四");
        awardReq.setAwardType(1);
        awardReq.setAwardContent("满10000减100");
        AwardRes awardRes = oldPrizeController.awardToUser(awardReq);
        logger.info("测试结果：{}", JSON.toJSON(awardRes));

        System.out.println("\r\n模拟发放优惠券测试\r\n");
        AwardReq awardReq01=new AwardReq();
        awardReq.setUserName("王三");
        awardReq.setAwardType(2);
        awardReq.setAwardContent("switch一台,但国行");
        AwardRes awardRes01 = oldPrizeController.awardToUser(awardReq);
        logger.info("测试结果：{}", JSON.toJSON(awardRes01));

    }
    @Test
    public void testSimpleFactory(){
        SimpleFactory simpleFactory = new SimpleFactory();
        IAbstractCommodity commodityService = simpleFactory.getCommodityService(1);
        commodityService.sendCommodity("李四","满10减1");

        IAbstractCommodity commodityService1 = simpleFactory.getCommodityService(2);
        commodityService1.sendCommodity("王六","索尼相机");

        //基于map形式的简单工厂
        SimpleMapFactory simpleMapFactory=new SimpleMapFactory();
        IAbstractCommodity coupon = simpleMapFactory.getCommodityService("coupon");
        coupon.sendCommodity("陈晋洁","三件八折");

    }

    @Test
    public void testMethodFactory(){
        // 使用猫工厂创建猫对象
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound(); // Output: Meow!

        // 使用狗工厂创建狗对象
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound(); // Output: Woof!

    }
}