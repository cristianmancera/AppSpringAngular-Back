package com.cristian.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer",  "handler"})
@Entity
@Table(name = "facturas")
public class Factura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String descripcion;

	private String observacion;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@JsonIgnoreProperties(value={"facturas", "hibernateLazyInitializer","handler"}, allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name="cliente_id")
	public Cliente cliente;

	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "factura_id")
	public List<ItemFactura> items;

	public Factura() {
		items = new ArrayList<>();
	}
	
	public Factura(Long id, String descripcion, String observacion, Date createAt, Cliente cliente,
			List<ItemFactura> items) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.observacion = observacion;
		this.createAt = createAt;
		this.cliente = cliente;
		this.items = items;
	}
 
	private Double getTotal() {
		Double total = 0.00;
		for(ItemFactura item: items) {
			total = total+item.getImporte();
		}
		return total;
	}

	@PrePersist
	public void prePersist() {
		this.createAt = new Date();
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private static final long serialVersionUID = 1L;

}
