package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author andy
 * @email andy972019@aliyun.com
 * @date 2019-09-22 23:08:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
