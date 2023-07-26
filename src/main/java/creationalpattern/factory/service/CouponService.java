package creationalpattern.factory.service;

import creationalpattern.factory.old.oldPrizeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟优惠券服务
 */
public class CouponService {
    private Logger logger = LoggerFactory.getLogger(CouponService.class);

    public void sendCoupon(String userName, String awardContent) {
        logger.info("模拟发放优惠券一张,获奖人:{},优惠卷为:{}",userName,awardContent);
    }

}
