package eTicaretSystem.core;

import eTicaretSystem.business.abstracts.LoginService;
import eTicaretSystem.google.GoogleManager;

public class GoogleManagerAdapter implements LoginService{
	

	@Override
	public boolean login(String password, String mail) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.loginWithGoogle(mail);
		return true;
	}
	
	

}
