package eTicaretSystem.business.concretes;

import eTicaretSystem.business.abstracts.LoginService;

public class LoginWithMailAndPassword implements LoginService {

	@Override
	public boolean login(String password, String mail) {
		//Login kismini henuz tamamlamadim. 
		System.out.println("mail ve sifre ile giris yapiliyor ---->>Giris basarili");
		return true;
	}



}
