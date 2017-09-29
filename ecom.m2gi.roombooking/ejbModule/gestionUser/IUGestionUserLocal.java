package gestionUser;

import javax.ejb.Local;

@Local
public interface IUGestionUserLocal {
	
	public void login(String login, String mdp);
	
}
