package com.andersonalmeida.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andersonalmeida.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{

}
