package creationalpattern.factory.simplefactory;

import creationalpattern.factory.simplefactory.service.CouponCommodityService;
import creationalpattern.factory.simplefactory.service.GoodsCommodityService;
import creationalpattern.factory.simplefactory.service.IQiYiCardCommodityService;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description: 简单工厂模式, 基于map方式, 避免重复创建对象
 * @create: 2023/07/26 18:52
 **/
public class SimpleMapFactory {
    private static final Map<String, IAbstractCommodity> map = new HashMap<String, IAbstractCommodity>();

    static {
        map.put("coupon", new CouponCommodityService());
        map.put("goods", new GoodsCommodityService());
        map.put("qiYiCard", new IQiYiCardCommodityService());
    }

    //发送不同类型奖品
    public IAbstractCommodity getCommodityService(String commodity) {
        if (null == commodity) {
            throw new RuntimeException("不存在的商品服务类型");
        }
        return map.get(commodity);
    }
}