package services;

import java.util.List;

import entity.Client;


public interface ClientServiveI {

	public Client insertNewClient(final Client newClient);
	
	public List<Client> searchAllClients();
	
	public List<Client> searchByFullName(final String nombre, final String primerapellido, final String segundoapellido);
	
	
}
