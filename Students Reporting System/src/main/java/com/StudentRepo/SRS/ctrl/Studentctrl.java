package com.StudentRepo.SRS.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.StudentRepo.SRS.serv.Studentserv;

@Controller
public class Studentctrl {

	private Studentserv studentservice ;

	public Studentctrl(Studentserv studentservice) {
		super();
		this.studentservice = studentservice;
	}
	@GetMapping("/student")
	public String listStudents(Model model) {
		
		model.addAttribute("student",studentservice.getAllStudents());
		return "student";
		
	}
}
