/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ppgs.admin.main;

import java.util.Map;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * name : adminMainController
 * description : 관리자 화면 메인화면 컨트롤러
 * */
@Controller
public class AdminController  {

	//@Resource(name = "adminService")
	//private AdminService adminService;
	
	/**
	 * name : mainView
     * description : 메인화면을 보여준다.
	 */
	@RequestMapping("/admin.do")
	public String loginView(Model model) throws Exception {
		System.out.println("admin.do");
		System.out.println("관리자페이지 로그인화면");
		//model.addAttribute(selectSample(sampleVO, searchVO));
		return "admin/login";
	}

	/**
	 * name : mainView
     * description : 메인화면을 보여준다.
	 */
	@RequestMapping("/login.do")
	public @ResponseBody String loginProcessing(@RequestParam Map<String, Object> param, HttpServletRequest request) throws Exception {
		System.out.println("login.do");
		System.out.println("userID: " + param.get("userID").toString());
		System.out.println("userPW: " + param.get("userPW").toString());
		
		//String result = adminService.loginChk(param);

		//System.out.println("result: " + result);
		//model.addAttribute(selectSample(sampleVO, searchVO));
		return "";
	}
	
}
