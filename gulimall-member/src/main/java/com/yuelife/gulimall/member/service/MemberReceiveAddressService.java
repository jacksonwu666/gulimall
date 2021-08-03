package com.yuelife.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuelife.common.utils.PageUtils;
import com.yuelife.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author wuxiang
 * @email 1937003575@qq.com
 * @date 2021-06-07 19:52:48
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

