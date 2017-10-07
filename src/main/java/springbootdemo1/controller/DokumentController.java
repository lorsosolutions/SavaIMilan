package springbootdemo1.controller;

import java.util.Date;
import java.util.Map;


import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springbootdemo1.service.DokumentService;


@Controller
public class DokumentController {

	@Autowired
	private DokumentService dokumentServi;
	
	
	@GetMapping("/alldocuments")
	public String demo(HttpServletRequest request) {
		request.setAttribute("demo", dokumentServi.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "tabeledokumenata";
	}
	
	
}
