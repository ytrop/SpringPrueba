package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long>{
	
	public List<Client> findByName(final String nombre);
	
	public List<Client> findnamesurname(final String nombre, final String primerapellido, final String segundoapellido);

}
