package com.yhhz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yhhz.pojo.FaceLibrary;
import com.yhhz.service.FaceLibrarySv;
import com.yhhz.util.Msg;

@Controller
public class FaceLibrarControl {

	
	@Reference
	FaceLibrarySv faceLibrarySv;
	
	

	@RequestMapping("/faces")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
	
		PageHelper.startPage(pn, 5);
		
		List<FaceLibrary> emps = faceLibrarySv.getAll();

		PageInfo page = new PageInfo(emps, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	

	@RequestMapping(value="/face",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(FaceLibrary faceLibrary,BindingResult result){
		
			faceLibrarySv.saveFaceLibrary(faceLibrary);
			return Msg.success();
		
		
	}

	
	
	@ResponseBody
	@RequestMapping(value="/face/{ids}",method=RequestMethod.DELETE)
	public Msg deleteEmp(@PathVariable("ids")String ids){

		if(ids.contains("-")){
			List<Long> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
	
			for (String string : str_ids) {
				
			 Long longs=Long.parseLong(string);
			
			 del_ids.add(longs);
					
					
			}
			
			faceLibrarySv.deleteBatch(del_ids);
		}else{
			Long id = Long.parseLong(ids);
			faceLibrarySv.deleteFaceLibrary(id);
		}
		return Msg.success();
	}
	
	

	@ResponseBody
	@RequestMapping(value="/face/{faceId}",method=RequestMethod.PUT)
	public Msg saveEmp(FaceLibrary faceLibrary,HttpServletRequest request){
		System.out.println("将要更新的员工数据："+faceLibrarySv);
		faceLibrarySv.updateFaceLibrary(faceLibrary);
		return Msg.success()	;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
