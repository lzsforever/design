package creationalpattern.factory.simpleFacotory;

import creationalpattern.factory.simpleFacotory.service.CouponCommodityService;
import creationalpattern.factory.simpleFacotory.service.GoodsCommodityService;
import creationalpattern.factory.simpleFacotory.service.IQiYiCardCommodityService;

/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description: 简单工厂模式
 * @create: 2023/07/26 18:52
 **/
public class SimpleFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new IQiYiCardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}