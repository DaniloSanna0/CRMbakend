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

import CRM.entity.Clienti;
import CRM.service.ClientiService;

@RestController
@RequestMapping("/clienti")
public class ClientiController {
	
	@Autowired
	@Qualifier("ClientiServiceV1")
	private ClientiService clientiService;
	
	@GetMapping
	public List<Clienti> trovaTutti() {
		return clientiService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Clienti trovaPerId(@PathVariable Long id) {
		return clientiService.trovaPerId(id);
	}
	
	@GetMapping("/bynome/{idNome}")
	public  List<Clienti> trovaPerNome(Long idNome) {
		return clientiService.trovaTutti();
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		clientiService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody Clienti cliente) {
		clientiService.crea(cliente);
	}
	
	@PutMapping
	public void modifica(@RequestBody Clienti cliente) {
		clientiService.modifica(cliente);
	}

}
