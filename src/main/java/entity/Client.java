package entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
	public class Client {
		
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
		private Long clienteId;
		
@Column(name = "NOMBRE", nullable = false)
		private String nombre;
		
@Column(name = "PRIMER_APELLIDO")
		private String primerapellido;
		
@Column(name = "SEGUNDO_APELLIDO")
		private String segundoapellido;
		
@Column(name = "DNI", length = 9, unique = true)
		private String dni;

@Column(name="FECHA_NACIMIENTO")
	private String fecha;


public Long getClienteId() {
	return clienteId;
}

public void setClienteId(Long clienteId) {
	this.clienteId = clienteId;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getPrimerapellido() {
	return primerapellido;
}

public void setPrimerapellido(String primerapellido) {
	this.primerapellido = primerapellido;
}

public String getSegundoapellido() {
	return segundoapellido;
}

public void setSegundoapellido(String segundoapellido) {
	this.segundoapellido = segundoapellido;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String string) {
	this.fecha = string;
}

		

	
	}


