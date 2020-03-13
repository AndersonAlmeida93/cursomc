package com.andersonalmeida.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersonalmeida.cursomc.domain.Cliente;
import com.andersonalmeida.cursomc.repositories.ClienteRepository;
import com.andersonalmeida.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		
		if(obj == null){
			throw new ObjectNotFoundException("Ojeto não encontrado! Id:" + id +  " , Tipo: " + Cliente.class.getName());
		}
		return obj;
	}
}
