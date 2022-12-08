package tidw.domains;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Class Entity for Usuario
 * Using Lombok to construct, and generate getters
 * and setters
 */
@SuppressWarnings("serial")
@Document(collection = "mensajes")
@JsonPropertyOrder({"nombre", "username","clave","direccion","telefono"})
public class Usuario implements Serializable {

	@Id
    private String id;
    
    private String nombre;
    
    private String username;

    private String clave;
    
    private String direccion;
    
    private String telefono;
    
    @PersistenceConstructor
    public Usuario(String id, String nombre, String username, String clave, String direccion, String telefono) {
		this.nombre = nombre;
		this.username = username;
		this.clave = clave;
		this.direccion = direccion;
		this.telefono = telefono;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}

