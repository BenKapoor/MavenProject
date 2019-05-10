package eu.ensup.projetwebv2.domaine;

public class Utilisateur {

	private String login;
	private String pwd;
	
	public Utilisateur(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
		
}
