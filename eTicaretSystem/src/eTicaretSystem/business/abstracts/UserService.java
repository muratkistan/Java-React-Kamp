package eTicaretSystem.business.abstracts;

import java.util.List;

import eTicaretSystem.entities.concretes.User;

public interface UserService {
	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUser(int id);
	public List<User> getAll();
	
	public boolean login(String password, String mail);
	

}
