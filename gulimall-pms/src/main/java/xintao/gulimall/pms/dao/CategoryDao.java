package xintao.gulimall.pms.dao;

import xintao.gulimall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author snine
 * @email 1738365614@qq.com
 * @date 2021-02-01 17:11:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
