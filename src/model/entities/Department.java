package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable { // Serializable e para fazer a gravação em arquivo ou trafego em rede
	
	private static final long serialVersionUID = 1L;

	
	private Integer Id;
	private String name;
	
	// Metodo construtor vazio
	public Department() {
		
	}
	
	// Metodo construtor
	public Department(Integer id, String name) {
		Id = id;
		this.name = name;
	}
	
	// Metodos Gets e Sets
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Metodo HashCode
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}
	
	// Metodo equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", name=" + name + "]";
	}
	
}
