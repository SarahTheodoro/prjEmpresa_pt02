package com.sarah.prjEmpresa.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {
@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long funcodigo;
	private String funnome;
	private Double funsalario;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	   private LocalDate funnascimento;

@ManyToOne
private Departamento departamento;


public Departamento getDepartamento() {
	return departamento;
}

public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
}
	
	public Long getFuncodigo() {
		return funcodigo;
	}

	public void setFuncodigo(Long funcodigo) {
		this.funcodigo = funcodigo;
	}

	public String getFunnome() {
		return funnome;
	}

	public void setFunnome(String funnome) {
		this.funnome = funnome;
	
}
	
	public LocalDate getFunnascimento() {
		return funnascimento;
	}

	public void setFunnascimento(LocalDate funnascimento) {
		this.funnascimento = funnascimento;
	
}	public Double getFunsalario() {
	return funsalario;
}

public void setFunsalario(Double funsalario) {
	this.funsalario = funsalario;

}

}

