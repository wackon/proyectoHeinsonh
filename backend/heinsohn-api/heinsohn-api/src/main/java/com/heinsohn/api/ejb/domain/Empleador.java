package com.heinsohn.api.ejb.domain;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity

@Table(name = "tbl_empleador")

public class Empleador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Long id;
	
	
	
        @Column(name = "nit", nullable = false, unique = true, length = 20)
	private String nit;
	
	private String razonSocial;
        
        @Column(name = "razonSocial", nullable = false, length = 120)
	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	

}
