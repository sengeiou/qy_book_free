package com.only.tech.dto.activity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * banner配置
 * @author shutong
 * @since 2019-01-31
 */
@Data
@ApiModel
public class BannerDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty("ID")
	private Long id;

	@ApiModelProperty("图片URL")
	private String img;

	@ApiModelProperty("链接地址")
	private String url;

	@ApiModelProperty("位置(recommend推荐、categoryBoy分类-男生、categoryGirl分类-女生、girl女生、boy男生、personalCenter个人中心)")
	private String position;

	@ApiModelProperty("banner对象类型（H5、App)")
	private String type;

	@ApiModelProperty("关联id,code等")
	private String associatedId;

	@ApiModelProperty("轮播图开始时间")
	private Date beginTime;

	@ApiModelProperty("轮播图结束时间")
	private Date endTime;

	@ApiModelProperty("有效状态 1：有效；0；无效")
	private Integer validStatus;

	@ApiModelProperty("渠道")
	private String channel;

	@ApiModelProperty("排序")
	private Integer orderIndex;

	@ApiModelProperty("背景色")
	private String bgColor;

	@ApiModelProperty("创建时间")
	private Date createTime;

	@ApiModelProperty("修改时间")
	private Date updateTime;

}