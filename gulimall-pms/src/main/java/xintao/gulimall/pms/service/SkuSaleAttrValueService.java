package xintao.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xintao.gulimall.pms.entity.SkuSaleAttrValueEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * sku销售属性&值
 *
 * @author snine
 * @email 1738365614@qq.com
 * @date 2021-02-01 17:11:58
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

