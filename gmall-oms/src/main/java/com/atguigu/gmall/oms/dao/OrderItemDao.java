package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author andy
 * @email andy972019@aliyun.com
 * @date 2019-09-22 23:08:20
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
