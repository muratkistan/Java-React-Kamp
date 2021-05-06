package eTicaretSystem.business.abstracts;

import eTicaretSystem.entities.concretes.User;

public interface UserValidService {
	
	public boolean userIsValid(User user);
	public boolean passwordIsValid(String password);
	public boolean emailIsValid(String email);
	public boolean nameAndSurnameIsValid(String firstName,String lastName);
	public boolean isNull(User user);

}
