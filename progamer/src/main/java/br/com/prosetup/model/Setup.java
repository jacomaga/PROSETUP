package br.com.prosetup.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PROSETUP_SETUP")
public class Setup {

	@Id
	@Column(name = "id_setup")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nm_setup", nullable = false, length = 50)
	private String name;

	@Column(name = "vl_setup", nullable = false)
	private BigDecimal price;

	@OneToOne
	@JoinColumn(name = "id_description", nullable = false)
	private Description description;

	@OneToOne(mappedBy = "setup")
	private User user;

	public Setup() {
	}

	public Setup(int id, String name, BigDecimal price, Description description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Setup(String name, BigDecimal price, Description description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

}
