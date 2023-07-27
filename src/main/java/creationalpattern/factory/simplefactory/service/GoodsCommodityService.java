package creationalpattern.factory.simplefactory.service;

import creationalpattern.factory.simplefactory.IAbstractCommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟实物商品服务
 */
public class GoodsCommodityService extends IAbstractCommodity {
    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    public void sendCommodity(String userName, String awardContent) {
        logger.info("模拟发货实物商品一个,获奖人:{},商品为:{}",userName,awardContent);
    }
}
