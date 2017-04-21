package br.com.fiap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class XmlGetListTest {

	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/ExemploJersey").path("alunos");
		
		Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
		Response response = invocationBuilder.get();
		
		ListaAlunos listaAlunos = response.readEntity(ListaAlunos.class);
		
		for (Aluno aluno : listaAlunos.getAlunos()) {
			
			System.out.println("Nome  ....: " + aluno.getNome());
			System.out.println("Media ....: " + aluno.getTurma());
			System.out.println("Turma ....: " + aluno.getMedia());
			System.out.println("-----------------------------------");
			
		}
		
	}
}
