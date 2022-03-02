package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author haodong
 * @email haodong.donh@gmail.com
 * @date 2022-03-02 20:59:38
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
