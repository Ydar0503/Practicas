package com.ufps.edu.co.web.repositorio;

import com.ufps.edu.co.web.modelo.ItemCurricular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCurricularRepositorio extends JpaRepository<ItemCurricular,Integer> {

}
