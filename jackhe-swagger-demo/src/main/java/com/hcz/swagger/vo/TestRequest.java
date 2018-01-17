package com.hcz.swagger.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 测试扫描的功能请求参数
 * @author hechangzhi 2018年1月15日
 *
 */
@ApiModel(description="test的请求参数")
public class TestRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(required=true,value="测试id")
	private String id;
	@ApiModelProperty(required=true,value="测试名字")
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
