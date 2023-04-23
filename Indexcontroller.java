package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Indexcontroller {  //controller

		//@RequestMapping("index")//idhu index file connect pantradhukku kudukkurum
		/*@ResponseBody  //index kettu yaruna vandhangana idhula @ResponseBody potta insex()
		//method kulla irukkaradhu eduthu poi kudukkum  */
	
	
//	public ModelAndView index(@RequestParam("uname") String login ,HttpSession session) { //index kettu varumpodhu oru HttpServletRequest vararu
	@RequestMapping("index")
	public ModelAndView index(UserDetails ud)	{
		//classs
	ModelAndView mav =new ModelAndView();
	mav.addObject("Details",ud);
	mav.setViewName("index");
		//session.setAttribute("username", login);//Model object
		
		return mav;
		//return "index"; //view page
		//indha index tha service nu solluvanga or(doget,dopost nu sollalam)
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	/*	@RequestMapping("index")
		public String index(HttpServletRequest request) { //index kettu varumpodhu oru HttpServletRequest vararu
			
			HttpSession session=request.getSession(); //HttpSession -respone ahh varum
			String s=request.getParameter("name");
			session.setAttribute("username", s);
		
			return "index";
			//indha index tha service nu solluvanga or(doget,dopost nu sollalam)
			}
		
	}*/


	/*http://localhost:8080/index/name=Ramya ---@RequestMapping("index")
	 * mvnrepository.com
	 * HttpServletRequest-interface
	 * 
	 * httpSession -security(self logout),traffic(1000 website hava open that  is traffic)
	 * 
	 * 
	 *   ${username}--> indha poii tha name return pannum indha edadhula java code avoid pannanum
	 *   JSTL(expand)---jsp standard Tag Library
	 *    Tag Library---Experssion Language
	 * 
	 */
/*@RequestParam  ---localhost:8080/index/name=Ramya --idhula name ma matthi podalum work agum
	
*/
