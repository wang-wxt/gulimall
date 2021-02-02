package xintao.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xintao.gulimall.pms.entity.CategoryEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 商品三级分类
 *
 * @author snine
 * @email 1738365614@qq.com
 * @date 2021-02-01 17:11:58
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);
}

