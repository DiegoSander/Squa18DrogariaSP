package runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import drivers.DriversFac;
import elementos.Elementos;
import metodos.Metodos;

public class Page_DrogariaSP extends DriversFac{
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	Executa executa = new Executa();
	
	@Before
	public void iniciarTeste() {
		executa.abrirNavegador();
	}
	
	@After
	public void fecharTeste() {
		metodos.fecharNavegador();
	}
	
	@Test
	public void cadastroCodigoIncorreto() {
		metodos.clicar(el.acesseSeuPerfil);
		metodos.clicar(el.cadastre);
		metodos.pausa(3000);
		metodos.escrever(el.email, "diegosander@gmail.com");
		metodos.pausa(3000);
		metodos.clicarPorTexto("button", "Criar conta ");
		metodos.pausa(3000);
		metodos.escrever(el.nome, "Diego");
		metodos.escrever(el.sobrenome, "Sander");
		metodos.escrever(el.cpf, "385.495.050-05");
		metodos.escrever(el.telefone, "22999135186");
		metodos.escrever(el.senha, "1234Di1223");
		metodos.escrever(el.confSenha, "1234Di1223");
		metodos.clicar(el.termo);
		metodos.descer();
		metodos.pausa(6000);
		metodos.escrever(el.codigo, "390702");
		metodos.pausa(3000);
		metodos.tab();
		metodos.evidencia("Ct07");
		
	}
	
	@Test
	public void campoEmBranco() {
		metodos.clicar(el.acesseSeuPerfil);
		metodos.clicar(el.cadastre);
		metodos.pausa(3000);
		metodos.escrever(el.email, "diegosander1@gmail.com");
		metodos.pausa(3000);
		metodos.clicarPorTexto("button", "Criar conta ");
		metodos.pausa(3000);
		metodos.escrever(el.nome, "Diego");
		metodos.escrever(el.sobrenome, "Sander");
		metodos.escrever(el.cpf, "385.495.050-05");
		metodos.escrever(el.telefone, "22999135186");
		metodos.escrever(el.senha, "1234Di1223");
		metodos.escrever(el.confSenha, "1234Di1223");
		metodos.clicar(el.termo);
		metodos.descer();
		metodos.evidencia("Ct02");
	}
	
	@Test
	public void emailDominioInvalido() {
		metodos.clicar(el.acesseSeuPerfil);
		metodos.clicar(el.cadastre);
		metodos.pausa(3000);
		metodos.escrever(el.email, "diegosander2@gml.com");
		metodos.pausa(3000);
		metodos.clicarPorTexto("button", "Criar conta ");
		metodos.pausa(3000);
		metodos.escrever(el.nome, "Diego");
		metodos.escrever(el.sobrenome, "Sander");
		metodos.escrever(el.cpf, "385.495.050-05");
		metodos.escrever(el.telefone, "22999135186");
		metodos.escrever(el.senha, "1234Di1223");
		metodos.escrever(el.confSenha, "1234Di1223");
		metodos.clicar(el.termo);
		metodos.descer();
		metodos.evidencia("Ct03");
		
	}
	@Test
	public void senhaSemRegra() {
		metodos.clicar(el.acesseSeuPerfil);
		metodos.clicar(el.cadastre);
		metodos.pausa(3000);
		metodos.escrever(el.email, "diegosander3@gmail.com");
		metodos.pausa(3000);
		metodos.clicarPorTexto("button", "Criar conta ");
		metodos.pausa(3000);
		metodos.escrever(el.nome, "Diego");
		metodos.escrever(el.sobrenome, "Sander");
		metodos.escrever(el.cpf, "385.495.050-05");
		metodos.escrever(el.telefone, "22999135186");
		metodos.escrever(el.senha, "12341223");
		metodos.escrever(el.confSenha, "1234Di1223");
		metodos.clicar(el.termo);
		metodos.descer();
		metodos.evidencia("Ct04");
		
	}
	@Test
	public void cpfInexistente() {
	metodos.clicar(el.acesseSeuPerfil);
	metodos.clicar(el.cadastre);
	metodos.pausa(3000);
	metodos.escrever(el.email, "diegosander4@gmail.com");
	metodos.pausa(3000);
	metodos.clicarPorTexto("button", "Criar conta ");
	metodos.pausa(3000);
	metodos.escrever(el.nome, "Diego");
	metodos.escrever(el.sobrenome, "Sander");
	metodos.escrever(el.cpf, "385.495.050-06");
	metodos.escrever(el.telefone, "22999135186");
	metodos.escrever(el.senha, "1234Di1223");
	metodos.escrever(el.confSenha, "1234Di1223");
	metodos.clicar(el.termo);
	metodos.descer();
	metodos.evidencia("Ct05");

	}
	@Test
	public void emailInexistente() {
		metodos.clicar(el.acesseSeuPerfil);
		metodos.clicar(el.cadastre);
		metodos.pausa(3000);
		metodos.escrever(el.email, "diegosanderQA@gmail.com");
		metodos.pausa(3000);
		metodos.clicarPorTexto("button", "Criar conta ");
		metodos.pausa(3000);
		metodos.escrever(el.nome, "Diego");
		metodos.escrever(el.sobrenome, "Sander");
		metodos.escrever(el.cpf, "385.495.050-06");
		metodos.escrever(el.telefone, "22999135186");
		metodos.escrever(el.senha, "1234Di1223");
		metodos.escrever(el.confSenha, "1234Di1223");
		metodos.clicar(el.termo);
		metodos.descer();
		metodos.evidencia("Ct06");
	}
	@Test
	public void emailJaCadastrado() {
		metodos.clicar(el.acesseSeuPerfil);
		metodos.clicar(el.cadastre);
		metodos.pausa(3000);
		metodos.escrever(el.email, "dih.sander@gmail.com");
		metodos.pausa(3000);
		metodos.clicarPorTexto("button", "Criar conta ");
		metodos.evidencia("Ct08");
	}
	@Test
	public void telefoneInvalido() {
			metodos.clicar(el.acesseSeuPerfil);
			metodos.clicar(el.cadastre);
			metodos.pausa(3000);
			metodos.escrever(el.email, "diegosander6@gmail.com");
			metodos.pausa(3000);
			metodos.clicarPorTexto("button", "Criar conta ");
			metodos.pausa(3000);
			metodos.escrever(el.nome, "Diego");
			metodos.escrever(el.sobrenome, "Sander");
			metodos.escrever(el.cpf, "385.495.050-06");
			metodos.escrever(el.telefone, "229991351");
			metodos.escrever(el.senha, "1234Di1223");
			metodos.escrever(el.confSenha, "1234Di1223");
			metodos.clicar(el.termo);
			metodos.descer();
			metodos.evidencia("Ct09");
	}
	@Test
	public void senhasDiferentes() {
			metodos.clicar(el.acesseSeuPerfil);
			metodos.clicar(el.cadastre);
			metodos.pausa(3000);
			metodos.escrever(el.email, "diegosander7@gmail.com");
			metodos.pausa(3000);
			metodos.clicarPorTexto("button", "Criar conta ");
			metodos.pausa(3000);
			metodos.escrever(el.nome, "Diego");
			metodos.escrever(el.sobrenome, "Sander");
			metodos.escrever(el.cpf, "385.495.050-06");
			metodos.escrever(el.telefone, "22999135186");
			metodos.escrever(el.senha, "1234Di1223");
			metodos.escrever(el.confSenha, "1234Di1224");
			metodos.clicar(el.termo);
			metodos.descer();
			metodos.evidencia("Ct10");
	}
}
