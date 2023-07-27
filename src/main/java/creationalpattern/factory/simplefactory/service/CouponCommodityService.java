package creationalpattern.factory.simplefactory.service;

import creationalpattern.factory.simplefactory.IAbstractCommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟优惠券服务
 */
public class CouponCommodityService extends IAbstractCommodity {
    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    public void sendCommodity(String userName, String awardContent) {
        logger.info("模拟发放优惠券一张,获奖人:{},优惠卷为:{}",userName,awardContent);
    }

}
