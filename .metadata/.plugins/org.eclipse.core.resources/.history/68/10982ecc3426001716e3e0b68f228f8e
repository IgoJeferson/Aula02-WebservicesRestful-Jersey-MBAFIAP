package br.com.fiap.rs.exemplo;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/alunos")
public class AlunoWeb {

	private static List<Aluno> alunos = new ArrayList<>();

	static {
		Aluno aluno1 = new Aluno("Igo Jeferson", "28SCJ", 8.9);
		Aluno aluno2 = new Aluno("Zezim", "28SCJ", 9.5);
		Aluno aluno3 = new Aluno("Zica do Baile", "28SCJ", 9.7);

		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);

	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public static List<Aluno> getAlunos() {
		return alunos;
	}

	@GET
	@Path("{indice}")
	@Produces(MediaType.APPLICATION_XML)
	public Aluno getAlunoByIndice(@PathParam("indice") int indice) {
		return alunos.get(indice);
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response novo(Aluno a) {
		alunos.add(a);
		Retorno retorno = new Retorno("Aluno incluído com sucesso! ");
		return Response.status(200).entity(retorno).build();
	}

	@PUT
	@Path("{indice}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response atualizar(Aluno a, @PathParam("indice") int indice) {
		System.out.println("Atualizando indice : "+ indice);
		alunos.set(indice, a);
		Retorno retorno = new Retorno("Aluno atualizado! ");
		return Response.accepted().entity(retorno).build();
	}

	@DELETE
	@Path("{ind}")
	@Produces(MediaType.APPLICATION_XML)
	public Retorno excluir(@PathParam("ind") int indice) {
		System.out.println("Removendo indice : "+ indice);
		alunos.remove(indice);
		return new Retorno("Aluno excluído");
//		return Response.status(200).entity(retorno).build();
	}
}
