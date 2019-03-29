package com.agenda.dao;

import java.sql.DriverManager;

import com.agenda.model.Pessoa;
import com.mysql.jdbc.Connection;

public class PessoaDAO {
	
	public void cadastro(Pessoa pessoa) {
		String SQL = "insert into pessoas (nome, email, endereco, telefone) values (?,?,?,?)";
	}}
