package com.elazizi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elazizi.entities.Employe;
import com.elazizi.entities.Service1;





@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
	public List<Employe> findByService(Service1 service);
}

