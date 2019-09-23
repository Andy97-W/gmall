package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author andy
 * @email andy972019@aliyun.com
 * @date 2019-09-22 23:10:15
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
