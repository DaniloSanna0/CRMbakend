package CRM.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import CRM.entity.Fattura;

public interface FatturaRepository extends CrudRepository<Fattura, Long> {
	
	public Fattura findByCliente(String cliente);
	
	public Optional<Fattura> findById(Long Id);
	

	public boolean existsByCliente(String cliente);

}
