package CRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRM.entity.Appuntamenti;
import CRM.repository.AppuntamentiRepository;

@Service
public class AppuntamentiService implements GestioneService{
	
	@Autowired
	private AppuntamentiRepository appuntamentiRepository;

	@Override
	public List<Appuntamenti> trovaTutti() {
		return (List<Appuntamenti>) appuntamentiRepository.findAll();
	}

	@Override
	public Appuntamenti trovaPerId(Long id) {
		return appuntamentiRepository.findById(id).get();
	}

	@Override
	public void cancella(Long id) {
		appuntamentiRepository.deleteById(id);
		
	}

	@Override
	public void crea(Appuntamenti appuntamenti) {
		appuntamentiRepository.save(appuntamenti);
		
	}

	@Override
	public void modifica(Appuntamenti appuntamenti) {
		appuntamentiRepository.save(appuntamenti);
				
	}

}
