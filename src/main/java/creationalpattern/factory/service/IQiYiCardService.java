package creationalpattern.factory.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟爱奇艺会员卡服务
 */
public class IQiYiCardService {
    private Logger logger = LoggerFactory.getLogger(IQiYiCardService.class);

    public void grantToken(String userName, String awardContent) {
        logger.info("模拟发放爱奇艺会员卡一张,获奖人:{},会员卡为:{}",userName,awardContent);
    }
}
