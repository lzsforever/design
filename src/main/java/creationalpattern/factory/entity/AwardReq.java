package creationalpattern.factory.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * @version 1.0.0
 * @author: dolan
 * @title
 * @description:
 * @create: 2023/07/26 15:49
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AwardReq {
    private String userName;                 // 用户名
    private Integer awardType;          // 奖品类型(可以用枚举定义)；1优惠券、2实物商品、3第三方兑换卡(爱奇艺)
    private String awardContent;        //奖品内容

}