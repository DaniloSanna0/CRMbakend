package CRM.repository;

import org.springframework.data.repository.CrudRepository;

import CRM.entity.Appuntamenti;

public interface AppuntamentiRepository extends CrudRepository<Appuntamenti, Long>  {

	public Appuntamenti findByTitolo(String titolo);
	
//	public Appuntamenti findByTitoloAndAutore(String titolo, String autore);
	
	public boolean existsByTitolo(String titolo);
}
