package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {

	public void cadastra(Pessoa pessoa) {
		
		PessoaDAO canal = new PessoaDAO();
		
		canal.cadastro(pessoa);
		
		System.out.println(buscaPessoas());
		
	}
	
	public List<Pessoa> buscaPessoas() {
		
		PessoaDAO dao = new PessoaDAO();
		
		dao.buscaPessoas();
		
		return dao.buscaPessoas();
		
	}
}