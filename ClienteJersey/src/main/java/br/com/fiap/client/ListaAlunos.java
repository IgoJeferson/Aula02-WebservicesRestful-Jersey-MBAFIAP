package br.com.fiap.client;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="alunoes")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaAlunos {
	
	@XmlElement(name="aluno")
	private List<Aluno> alunos;
	
	public ListaAlunos(){
	}

	public ListaAlunos(List<Aluno> alunos) {
		super();
		this.alunos = alunos;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
