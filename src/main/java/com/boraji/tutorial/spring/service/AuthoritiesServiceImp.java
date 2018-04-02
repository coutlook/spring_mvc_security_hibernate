package com.boraji.tutorial.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boraji.tutorial.spring.dao.AuthoritiesDaoImp;
import com.boraji.tutorial.spring.dao.UserDetailsDao;
import com.boraji.tutorial.spring.model.Authorities;
import com.boraji.tutorial.spring.model.User;

@Service("AuthoritiesService")
public class AuthoritiesServiceImp {

  @Autowired
  private AuthoritiesDaoImp authoritiesDaoImp;

  @Transactional(readOnly = true)


  public List<Authorities> list() {
     return authoritiesDaoImp.list();
  }

}
