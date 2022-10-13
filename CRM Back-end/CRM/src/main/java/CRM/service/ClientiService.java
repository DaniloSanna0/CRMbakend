package CRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import CRM.entity.Clienti;
import CRM.repository.ClientiRepository;

public class ClientiService {

	@Autowired
	private ClientiRepository clientiRepository;

	public List<Clienti> trovaTutti() {
		return (List<Clienti>) clientiRepository.findAll();
	}

	
	public Clienti trovaPerId(Long id) {
		return clientiRepository.findById(id).get();
	}

	
	public void cancella(Long id) {
		clientiRepository.deleteById(id);
		
	}

	
	public void crea(Clienti clienti) {
		clientiRepository.save(clienti);
		
	}

	
	public void modifica(Clienti clienti) {
		clientiRepository.save(clienti);
				
	}
	
}
