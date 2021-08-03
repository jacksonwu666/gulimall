package com.yuelife.gulimall.product.dao;

import com.yuelife.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wuxiang
 * @email 1937003575@qq.com
 * @date 2021-06-07 17:19:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
