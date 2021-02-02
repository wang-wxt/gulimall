package xintao.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xintao.gulimall.pms.entity.SkuInfoEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * sku信息
 *
 * @author snine
 * @email 1738365614@qq.com
 * @date 2021-02-01 17:11:58
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

