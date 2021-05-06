package eTicaretSystem.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretSystem.business.abstracts.UserValidService;
import eTicaretSystem.entities.concretes.User;

public class UserValidManager implements UserValidService{

	@Override
	public boolean userIsValid(User user) {
		if(passwordIsValid(user.getPassword()) && emailIsValid(user.getEmail()) && 
				nameAndSurnameIsValid(user.getFirstName(), user.getLastName()) && isNull(user)) {
			
			return true;
		}
		
		return false;
	}

	@Override
	public boolean passwordIsValid(String password) {
		if(password.length() <= 6) {
			System.out.println("Sifre en az 6 karakterden olusmali");
			return false;
		}
		return true;
	}

	
	@Override
	public boolean emailIsValid(String email) { 
		Pattern p=Pattern.compile("^(.+)@(.+)$"); //Regex ile email formati olusturuldu.
		Matcher m = p.matcher(email);
		if(!m.matches()) {
			System.out.println("Mailiniz uygun formatta degil!  Ornek -> ornek@gmail.com ");
			return false;
		}
		return true;
	}

	@Override
	public boolean nameAndSurnameIsValid(String firstName, String lastName) {
		if(firstName.length() <= 2 || lastName.length() <=2) {
			System.out.println("ad soyad en az 2 karakterden olusmali");
			return false;
		}
		return true;
	}

	@Override
	public boolean isNull(User user) {
		if(user.getFirstName()==null || user.getLastName() ==null || user.getEmail() == null || user.getPassword() == null) {
			System.out.println("Girdiginiz bilgilerde eksik olan kisimlar var");
			return false;
		}
		return true;
	}

	

}
