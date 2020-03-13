package com.andersonalmeida.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersonalmeida.cursomc.domain.Categoria;
import com.andersonalmeida.cursomc.domain.Pedido;
import com.andersonalmeida.cursomc.repositories.PedidoRepository;
import com.andersonalmeida.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
	
		Optional<Pedido> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
				+ " , Tipo : " + Pedido.class.getName()));
	}
}
