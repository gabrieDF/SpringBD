package br.com.SpringBD.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.SpringBD.beans.Pessoas;

public interface PessoasDAO extends CrudRepository<Pessoas, Integer> {

}
