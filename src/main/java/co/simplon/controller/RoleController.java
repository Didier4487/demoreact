package co.simplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dao.RoleDao;
import co.simplon.domain.Role;

@RestController
@RequestMapping("/roles")
public class RoleController {
	
	  @Autowired
	  private RoleDao Dao;
	    
	  @RequestMapping(method=RequestMethod.GET)
	  
	  public Iterable<Role> getAll() {
		    return Dao.findAll();
	  }
}
