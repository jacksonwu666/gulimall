package com.yuelife.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuelife.common.utils.PageUtils;
import com.yuelife.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author wuxiang
 * @email 1937003575@qq.com
 * @date 2021-06-07 19:37:11
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

