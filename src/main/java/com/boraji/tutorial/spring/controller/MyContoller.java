package com.boraji.tutorial.spring.controller;

import java.security.Principal;

import com.boraji.tutorial.spring.model.Authorities;
import com.boraji.tutorial.spring.service.AuthoritiesServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;



@Controller
public class MyContoller {

	   @Autowired
	   private AuthoritiesServiceImp authoritiesServiceImp;
	   
  @GetMapping("/")
  public String index(Model model, Principal principal) {
    model.addAttribute("message", "You are logged in as " + principal.getName());
    return "index";
  }
  
  @GetMapping("/roles")
  public String list(Model model, Principal principal)  {
     List<Authorities> roles = authoritiesServiceImp.list();
     Authorities authorities = roles.get(0);
     model.addAttribute("message", "Here is the list of roles :: " + authorities.getAuthority());
     model.addAttribute("roleList", roles);

     return"roles";

  }
  
}
