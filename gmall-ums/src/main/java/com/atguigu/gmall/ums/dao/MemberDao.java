package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author andy
 * @email andy972019@aliyun.com
 * @date 2019-09-22 23:11:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
