package com.yuelife.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuelife.common.utils.PageUtils;
import com.yuelife.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wuxiang
 * @email 1937003575@qq.com
 * @date 2021-06-07 20:05:35
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

