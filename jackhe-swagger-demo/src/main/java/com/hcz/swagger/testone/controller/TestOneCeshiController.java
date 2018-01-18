package com.hcz.swagger.testone.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcz.swagger.testone.vo.TestVoRequest;
import com.hcz.swagger.testone.vo.TestVoResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiParam;

/**
 * 测试swagger 属性介绍http://blog.csdn.net/u014231523/article/details/76522486
 * @author hechangzhi 2018年1月15日
 *
 */
@RestController
@RequestMapping(value="/swaggerDemo/testOneCeshi")
@Api(value="内部接口操作",tags={"testOneCeshi操作接口"})
public class TestOneCeshiController{
	
	@RequestMapping(value="/findName/{name}",method=RequestMethod.GET)
	public String findName(@ApiParam(value="名字",defaultValue="默认名字",required=true) @PathVariable(name="name")String name){
		return "testOne："+name;
	}
	@RequestMapping(value="/findObj",method=RequestMethod.POST)
	public TestVoResponse findObj(@RequestBody @ApiParam(name="用户对象",value="传入json格式",required=true) TestVoRequest re){
		TestVoResponse response = new TestVoResponse();
		response.setCreateTime(new Date());
		response.setId(re.getId());
		response.setName(re.getName());
		response.setNum(10);
		List<String> list = new ArrayList<String>();
		list.add("abcd");
		list.add("ccccc");
		response.setList(list);
		return response;
	}
	
//	@RequestMapping(value="/findTestObj",method=RequestMethod.GET)
//	@ApiOperation(value="对比扫描接口对象")
//	public TestResponse findTestObj(@RequestBody TestRequest re){
//		TestResponse response = new TestResponse();
//		response.setCreateTime(new Date());
//		response.setId(re.getId());
//		response.setName(re.getName());
//		response.setNum(10);
//		return response;
//	}
	
}
