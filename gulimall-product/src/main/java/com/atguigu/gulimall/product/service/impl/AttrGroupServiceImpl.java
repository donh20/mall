package com.atguigu.gulimall.product.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.AttrGroupDao;
import com.atguigu.gulimall.product.entity.AttrGroupEntity;
import com.atguigu.gulimall.product.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catalogId) {
        if (catalogId == 0) {
            /**
             * 如果catalogId为0，则查询所有的分组
             * page传IPage分页信息和QueryWrapper查询信息
             * IPage的获取通过工具类PageUtils获取:
             *   通过params参数提取各个变量的值,比如想要取多少条数据，页码，排序方式等
             *   查询条件通过QueryWrapper查询,当前没有条件，所以传入一个空的QueryWrapper
             * 整个IPage对象通过PageUtils进行解析,自动解析出当前页码,总页码,每页显示条数等,查询到的记录也会封装到指定的属性里
             */
            IPage<AttrGroupEntity> page = this.page(
                    new Query<AttrGroupEntity>().getPage(params),
                    new QueryWrapper<AttrGroupEntity>()
            );
            return new PageUtils(page);
        } else {
            //select * from pms_attr_group where catalog_id = ? and (attr_group_id = key or attr_group_name like %key%)
            String key = (String) params.get("key");
            //查询条件通过QueryWrapper构造器构造,查哪张表就写那张表的实体类
            QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<AttrGroupEntity>().eq("catelog_id", catalogId);
            if (!StringUtils.isEmpty(key)) {
                wrapper.and(obj->obj.eq("attr_group_id",key).or().like("attr_group_name",key));
            }
            IPage<AttrGroupEntity> page = this.page(
                    new Query<AttrGroupEntity>().getPage(params),
                    wrapper
            );
            return new PageUtils(page);
        }
    }

}