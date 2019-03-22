package com.agenda.dao;

import com.agenda.model.Pessoa;

public class PessoaDAO {
	
	public void cadastro(Pessoa pessoa) {
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEmail());
		System.out.println(pessoa.getEndereco());
		
	}

}
