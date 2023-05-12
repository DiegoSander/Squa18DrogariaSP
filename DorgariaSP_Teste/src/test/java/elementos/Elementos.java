package elementos;

import org.openqa.selenium.By;

public class Elementos {
	

	public By acesseSeuPerfil = By.xpath("//span[normalize-space()='Acesse aqui o seu perfil']");
	public By campoEmail = By.xpath("//input[@id='input-floating-logar-email']");
	public By campoSenha = By.id("initial-show-password");
	public By entrar = By.xpath("//button[@class='btn rnk-btn-primary']");
	public By cadastre = By.xpath("//*[@id=\"modalLoginDefault\"]/div/div/div/form/div[2]/div/a[2]");
	public By email = By.id("rnk-input-email-create-account");
	public By nome =  By.id("input-nome-form");
	public By sobrenome = By.id("input-sobrenome-form");
	public By cpf = By.id("input-cpf-form");
	public By telefone = By.id("input-telefone-form");
	public By senha = By.id("show-password-input");
	public By confSenha = By.id("show-password-confirmation");
	public By termo = By.id("termo-de-uso-loja");
	public By criarConta = By.id("//*[@id=\"modalLoginCreateAccountForm\"]/div/div/div/form/div[2]/button[2]");
	public By nomeCadastro = By.xpath("//input[@id='rnk-cadastrar-nome']");
	public By emailcadastro = By.xpath("//input[@id='rnk-cadastrar-email']");
	public By chaveDeAcesso = By.xpath("//*[@id=\"modalLoginDefault\"]/div/div/div/div/a[2]");
	public By form = By.xpath("//*[@id=\"modalLoginCreateAccountForm\"]/div/div/div");
	public By codigo = By.id("floatingInput");
	public By confirme = By.xpath("//*[@id=\"modalLoginConfirmCod\"]/div/div/div/form/div[2]/button[2]");

	
}
