package com.boraji.tutorial.spring.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boraji.tutorial.spring.model.Authorities;


@Repository
public class AuthoritiesDaoImp  {

  @Autowired
  private SessionFactory sessionFactory;

  
  public List<Authorities> list() {
     Session session = sessionFactory.getCurrentSession();
     CriteriaBuilder cb = session.getCriteriaBuilder();
     CriteriaQuery<Authorities> cq = cb.createQuery(Authorities.class);
     Root<Authorities> root = cq.from(Authorities.class);
     cq.select(root);
     Query<Authorities> query = session.createQuery(cq);
     System.out.println(" Satish List size is : " + ((List<Authorities>)query.getResultList()).size() );
     return query.getResultList();
  }

}
