package creationalpattern.factory.service;

import com.alibaba.fastjson.JSON;
import creationalpattern.factory.entity.DeliverReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟实物商品服务
 */
public class GoodsService {
    private Logger logger = LoggerFactory.getLogger(GoodsService.class);

    public void deliverGoods(String userName, String awardContent) {
        logger.info("模拟发货实物商品一个,获奖人:{},商品为:{}",userName,awardContent);
    }
}
