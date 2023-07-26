package creationalpattern.factory.old;

import com.alibaba.fastjson.JSON;
import creationalpattern.factory.entity.AwardReq;
import creationalpattern.factory.entity.AwardRes;
import creationalpattern.factory.service.CouponService;
import creationalpattern.factory.service.GoodsService;
import creationalpattern.factory.service.IQiYiCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description: 通过ifelse实现奖品分发
 * @create: 2023/07/26 15:59
 **/
public class oldPrizeController {
    private Logger logger = LoggerFactory.getLogger(oldPrizeController.class);

    public AwardRes awardToUser(AwardReq req) {
        AwardRes awardRes = null;
        try {
            logger.info("奖品发放开始，获奖人{} 获得奖品:{}", req.getUserName(), req.getAwardContent());
            // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
            if (req.getAwardType() == 1) {
                CouponService couponService = new CouponService();
                couponService.sendCoupon(req.getUserName(), req.getAwardContent());
            } else if (req.getAwardType() == 2) {
                GoodsService goodsService = new GoodsService();
                goodsService.deliverGoods(req.getUserName(), req.getAwardContent());
            } else if (req.getAwardType() == 3) {
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(req.getUserName(), req.getAwardContent());

            }
            logger.info("奖品发放完成");
            awardRes = new AwardRes("200", "发送成功");

        } catch (Exception e) {
            logger.error("奖品发放失败，异常: " + e);
            awardRes = new AwardRes("0001", "发送失败");
        }

        return awardRes;
    }

}