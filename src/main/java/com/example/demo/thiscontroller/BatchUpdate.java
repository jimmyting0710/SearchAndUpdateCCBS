package com.example.demo.thiscontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.thisservice.ThisService;

@Controller
public class BatchUpdate {
	@Autowired
	ThisService thisService;
	@ResponseBody
	@RequestMapping(value = "/batch", method = RequestMethod.POST)
	public String name(Model model, HttpServletRequest request,
			@RequestParam(value = "ss", required = false) String SS) {
		JSONArray jsonArray = JSONArray.parseArray(SS);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject key = (JSONObject) jsonArray.get(i);
//			System.out.println(key.get("AD").toString());
			
			if (!key.get("STATUS").equals("1") && !key.get("TESTER_ID").equals("1")) {
				String status = key.get("STATUS").toString();
				String tid = key.get("TID").toString();
				String tester_id = key.get("TESTER_ID").toString();
				String rdatetime = key.get("RDATETIME").toString();
				String ad=key.get("AD").toString();
				String rid ="";
			
				thisService.savebatchresult(status,tester_id,tid,rdatetime,rid,ad);
				thisService.updatebatch(tid,tester_id,status,ad);
			}
		}
		return "showb";

	}
}
