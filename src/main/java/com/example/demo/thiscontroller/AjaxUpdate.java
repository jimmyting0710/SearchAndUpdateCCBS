package com.example.demo.thiscontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.thisentity.TestResults;
import com.example.demo.thisservice.ThisService;

@RestController
//@RequestMapping("/ajax")
public class AjaxUpdate {

	@Autowired
	ThisService thisService;

	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Model model,  HttpServletRequest request,
			@RequestParam(value = "ss", required = false) String SS) throws IOException {
		//轉jsonarray
//		JSONObject jsonObject=JSONObject.parseObject(SS);
		JSONArray jsonArray = JSONArray.parseArray(SS);

		for (int i = 0; i < jsonArray.size(); i++) {
//			Integer seq = thisService.getseq();
			JSONObject key = (JSONObject) jsonArray.get(i);
			if (!key.get("STATUS").equals("1") && !key.get("TESTER_ID").equals("1")) {
				
				String status = key.get("STATUS").toString();
				String tid = key.get("TID").toString();
				String tester_id = key.get("TESTER_ID").toString();
				String rdatetime = key.get("RDATETIME").toString();
				String rid ="";
				
				thisService.saveresult(status, tid, tester_id, rdatetime,rid);
				thisService.updatetestcase(tid,status,tester_id);
			}
		}

//		PrintWriter out = response.getWriter();
		//ajax回寫json格式
		String jsonStr = "{\"success\":\"OK\"}";
//		out.write(jsonStr);
		return jsonStr;

	}
}
