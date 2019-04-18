package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.service.AdminService;

@Controller
public class HomeController {
	
	
	@Autowired
    private AdminService adminService;
	
	@RequestMapping(value = {"/","/trangchu"}, method = RequestMethod.GET)
	public String TrangChu(Model model) {
		model.addAttribute("listAdmin",adminService.LayAll());
		return "hello";
	}
}
