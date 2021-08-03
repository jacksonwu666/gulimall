package com.yuelife.gulimall.order.dao;

import com.yuelife.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wuxiang
 * @email 1937003575@qq.com
 * @date 2021-06-07 20:02:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
