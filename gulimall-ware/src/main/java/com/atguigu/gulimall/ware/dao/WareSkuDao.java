package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author haodong
 * @email haodong.donh@gmail.com
 * @date 2022-03-02 21:14:34
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
