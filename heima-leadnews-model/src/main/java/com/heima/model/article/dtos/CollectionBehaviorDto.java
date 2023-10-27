package com.heima.model.article.dtos;

import lombok.Data;

import java.util.Date;

/**
 * 收藏行为dto
 *
 * @author yaoh
 */
@Data
public class CollectionBehaviorDto {

    /**
     * 文章id
     */
    private Long entryId;

    /**
     * 0-收藏
     * 1-取消收藏
     */
    private Boolean operation;

    /**
     * 发布时间
     */
    private Date publishedTime;

    /**
     * 0-文章
     * 1-动态
     */
    private Short type;
}
