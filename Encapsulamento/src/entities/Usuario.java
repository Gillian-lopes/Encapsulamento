package entities;

import java.util.Date;

public class Usuario {
	public String name;
	private Integer id;
	private Date data;

	public Usuario () {		
	}

	public Usuario(String name, Integer id, Date data) {		
		this.name = name;
		this.id = id;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String toString() {
		return "name = " + name + ", id = " + id + ", data = " + data;
	}
	
	
	
}
