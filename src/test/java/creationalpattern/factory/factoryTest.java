package creationalpattern.factory;

import com.alibaba.fastjson.JSON;
import creationalpattern.factory.entity.AwardReq;
import creationalpattern.factory.entity.AwardRes;
import creationalpattern.factory.old.OldPrizeController;
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
}