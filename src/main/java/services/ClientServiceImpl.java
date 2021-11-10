package services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Repository.ClientRepository;
import entity.Client;

@Service
public class ClientServiceImpl implements ClientServiveI {
	
@Autowired
	private ClientRepository repositorio;
	
	
@Override
	public Client insertNewClient(Client newClient) {

		
		if (newClient != null && newClient. getClienteId() == null) {
			newClient =  repositorio.save(newClient);
		}

		return newClient;
	}
	
@Override
	public List<Client> searchByFullName(final String name, final String primerapellido, final String segundoapellido) {
	
	final List<Client> searchClients = repositorio.findnamesurname(name, primerapellido,segundoapellido);
				return searchClients;	
	}

@Override
public List<Client> searchAllClients() {
	List<Client> resultclientList = new ArrayList<>();
	final Iterable<Client> clientList = repositorio.findAll();
	clientList.forEach(resultclientList::add);
	return resultclientList;
	
}



}
