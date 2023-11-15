package com.elazizi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.elazizi.IDao.IDao;
import com.elazizi.entities.Employe;
import com.elazizi.entities.Service1;
import com.elazizi.repository.EmployeRepository;





@Service
public class EmployeService implements IDao<Employe>   {
	@Autowired
	private EmployeRepository employeRepository;

	

	public Employe create(Employe o) {
		return employeRepository.save(o);
	}

	public boolean delete(Employe o) {
		try {
			employeRepository.delete(o);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	public Employe update(Employe o) {
		// TODO Auto-generated method stub
		return employeRepository.save(o);
	}


	public List<Employe> findAll() {
		
		return employeRepository.findAll();
	}

	public Employe findById(Long id) {
		return employeRepository.findById(id).orElse(null);
	}	
	
	
	public List<Employe> FindEmployeesByService(Service1 service){
		return employeRepository.findByService(service);
	}
}