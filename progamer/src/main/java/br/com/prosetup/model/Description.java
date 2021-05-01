package br.com.prosetup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PROSETUP_DESCRIPTION")
public class Description {

	@Id
	@Column(name = "id_description")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "ds_cpu", nullable = false, length = 60)
	private String cpu;

	@Column(name = "ds_gpu", nullable = false, length = 60)
	private String gpu;

	@Column(name = "ds_computercase", nullable = false, length = 60)
	private String computerCase;

	@Column(name = "ds_ram", nullable = false, length = 30)
	private String ram;

	@Column(name = "ds_motherboard", nullable = false, length = 60)
	private String motherboard;

	@OneToOne(mappedBy = "description")
	private Setup setup;

	public Description() {
	}

	public Description(String cpu, String gpu, String computerCase, String ram, String motherboard, Setup setup) {
		super();
		this.cpu = cpu;
		this.gpu = gpu;
		this.computerCase = computerCase;
		this.ram = ram;
		this.motherboard = motherboard;
		this.setup = setup;
	}

	public Description(int id, String cpu, String gpu, String computerCase, String ram, String motherboard,
			Setup setup) {
		super();
		this.id = id;
		this.cpu = cpu;
		this.gpu = gpu;
		this.computerCase = computerCase;
		this.ram = ram;
		this.motherboard = motherboard;
		this.setup = setup;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(String computerCase) {
		this.computerCase = computerCase;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

}
