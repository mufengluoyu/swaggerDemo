package com.hcz.swagger.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 测试扫描的功能返回参数
 * @author hechangzhi 2018年1月15日
 *
 */
@ApiModel(description="test的请求参数")
public class TestResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(required=true,value="测试id")
	private String id;
	@ApiModelProperty(required=true,dataType="yyyy-MM-dd hh:mm:ss",value="2018-1-15 11:50:31")
	private Date createTime;
	@ApiModelProperty(required=true,value="12")
	private Integer num;
	@ApiModelProperty(required=true,value="测试名字")
	private String name;
	@ApiModelProperty(required=true,value="测试列表")
	private List<String> list;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
