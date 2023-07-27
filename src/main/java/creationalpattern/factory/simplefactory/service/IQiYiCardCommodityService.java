package creationalpattern.factory.simplefactory.service;

import creationalpattern.factory.simplefactory.IAbstractCommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟爱奇艺会员卡服务
 */
public class IQiYiCardCommodityService extends IAbstractCommodity {
    private Logger logger = LoggerFactory.getLogger(IQiYiCardCommodityService.class);

    public void sendCommodity(String userName, String awardContent) {
        logger.info("模拟发放爱奇艺会员卡一张,获奖人:{},会员卡为:{}",userName,awardContent);
    }
}
