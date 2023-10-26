package com.heima.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.dtos.ApUserAuthDto;
import com.heima.model.user.pojos.ApUserRealname;

/**
 * 用户认证业务层service
 *
 * @author yaoh
 */
public interface ApUserRealNameService extends IService<ApUserRealname> {
    /**
     * 认证列表
     *
     * @param dto
     * @return ResponseResult
     */
    ResponseResult pageQuery(ApUserAuthDto dto);

    /**
     * 审核失败
     *
     * @param dto
     * @return ResponseResult
     */
    ResponseResult authFail(ApUserAuthDto dto);

    /**
     * 审核成功
     *
     * @param dto
     * @return ResponseResult
     */
    ResponseResult authPass(ApUserAuthDto dto);
}