package com.hcz.swagger.testone.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 返回参数
 * @author hechangzhi 2018年1月15日
 *
 */
@ApiModel(description="testOne的请求返回")
public class TestVoResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(required=true,value="测试id")
	private String id;
	@ApiModelProperty(required=true,dataType="Date",value="创建时间")
	private Date createTime;
	@ApiModelProperty(required=true,value="登入数量")
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
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
}
