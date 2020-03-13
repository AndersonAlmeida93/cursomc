package com.andersonalmeida.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersonalmeida.cursomc.domain.Pedido;
import com.andersonalmeida.cursomc.repositories.PedidoRepository;
import com.andersonalmeida.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id);
		
		if(obj == null){
			throw new ObjectNotFoundException("Ojeto não encontrado! Id:" + id +  " , Tipo: " + Pedido.class.getName());
		}
		return obj;
	}
}
