package CRM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CRM.entity.Utenti;
import CRM.service.UtentiService;


@RestController
@RequestMapping("/utenti")
public class UtentiController {

	@Autowired
	@Qualifier("UtentiServiceV1")
	private UtentiService utentiService;
	
	@GetMapping
	public List<Utenti> trovaTutti() {
		return utentiService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Utenti trovaPerId(@PathVariable Long id) {
		return utentiService.trovaPerId(id);
	}
	
	@GetMapping("/bynome/{idNome}")
	public  List<Utenti> trovaPerNome(Long idNome) {
		return utentiService.trovaTutti();
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		utentiService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody Utenti utente) {
		utentiService.crea(utente);
	}
	
	@PutMapping
	public void modifica(@RequestBody Utenti utente) {
		utentiService.modifica(utente);
	}
}
