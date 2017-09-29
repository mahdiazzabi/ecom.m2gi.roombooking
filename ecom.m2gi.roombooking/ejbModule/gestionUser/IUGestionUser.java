package gestionUser;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class IUGestionUser
 */
@Stateless
@LocalBean
public class IUGestionUser implements IUGestionUserRemote, IUGestionUserLocal {

    /**
     * Default constructor. 
     */
    public IUGestionUser() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void login(String login, String mdp) {
		// TODO Auto-generated method stub
		System.err.println("ok");
	}
     

}
