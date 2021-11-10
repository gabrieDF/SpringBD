package br.com.SpringBD.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.SpringBD.beans.Pessoas;
import br.com.SpringBD.dao.PessoasDAO;

@RestController
public class PessoasController {
	
	@Autowired
	private PessoasDAO dao;
	
	@GetMapping("/Pessoas")
	
	public ResponseEntity<List<Pessoas>> getAll() {
		
		List<Pessoas> list = (List<Pessoas>)dao.findAll();

		if(list.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(list);
		
	}

	@GetMapping("/Pessoas/{Id}")
	public ResponseEntity<Optional<Pessoas>> getAllById(@PathVariable("Id") int id){
		Optional<Pessoas> listId = dao.findById(id);
		
		if(listId.isEmpty()) { return ResponseEntity.status(404).build(); }
		
		return ResponseEntity.ok(listId);
	}
	
	@PostMapping("/Pessoas/add/")
	public Pessoas getSave(@RequestBody Pessoas pessoa) {
		return dao.save(pessoa);
	}
	
}