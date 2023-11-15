package com.elazizi.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elazizi.entities.Service1;




@Repository
public interface ServiceRepository extends JpaRepository<Service1, Long> {

}
