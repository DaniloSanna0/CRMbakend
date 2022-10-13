package CRM.repository;

import org.springframework.data.repository.CrudRepository;

import CRM.entity.Clienti;


public interface ClientiRepository extends CrudRepository<Clienti, Long> {

	public Clienti findByNome(String nome);
	
	public Clienti findByNomeAndCognome(String nome, String cognome);
	

	public boolean existsByNome(String nome);
}
