package com.yuelife.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuelife.common.utils.PageUtils;
import com.yuelife.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author wuxiang
 * @email 1937003575@qq.com
 * @date 2021-06-07 19:37:11
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

