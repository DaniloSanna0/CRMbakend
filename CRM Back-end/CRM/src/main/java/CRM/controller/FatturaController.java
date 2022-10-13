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

import CRM.entity.Fattura;
import CRM.service.FatturaService;


@RestController
@RequestMapping("/fattura")
public class FatturaController {
	
	@Autowired
	@Qualifier("ClientiServiceV1")
	private FatturaService fatturaService;
	
	@GetMapping
	public List<Fattura> trovaTutti() {
		return fatturaService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Fattura trovaPerId(@PathVariable Long id) {
		return fatturaService.trovaPerId(id);
	}
	
	@GetMapping("/bynome/{idNome}")
	public  List<Fattura> trovaPerNome(Long idNome) {
		return fatturaService.trovaTutti();
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		fatturaService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody Fattura cliente) {
		fatturaService.crea(cliente);
	}
	
	@PutMapping
	public void modifica(@RequestBody Fattura cliente) {
		fatturaService.modifica(cliente);
	}


}
