package xintao.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xintao.gulimall.pms.entity.CommentReplayEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 商品评价回复关系
 *
 * @author snine
 * @email 1738365614@qq.com
 * @date 2021-02-01 17:11:58
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVo queryPage(QueryCondition params);
}

