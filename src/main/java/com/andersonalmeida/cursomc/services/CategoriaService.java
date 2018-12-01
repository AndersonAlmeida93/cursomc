package com.andersonalmeida.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersonalmeida.cursomc.domain.Categoria;
import com.andersonalmeida.cursomc.repositories.CategoriaRepository;
import com.andersonalmeida.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		
		if(obj == null){
			throw new ObjectNotFoundException("Ojeto não encontrado! Id:" + id +  " , Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
}
