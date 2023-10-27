package com.heima.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.user.pojos.ApUserFollow;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户关注mapper
 *
 * @author yaoh
 */
@Mapper
public interface ApUserFollowMapper extends BaseMapper<ApUserFollow> {
}
