package eTicaretSystem.dataAccess.abstracts;

import java.util.List;

import eTicaretSystem.entities.concretes.User;

public  interface BaseUserDao {
	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	
	User getUser(int id);
	List<User> getAll();

	
}
