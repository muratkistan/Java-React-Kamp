package eTicaretSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretSystem.dataAccess.abstracts.BaseUserDao;
import eTicaretSystem.entities.concretes.User;

public class UserDao implements BaseUserDao {
	private  List<User> users;
	//Database simule etmek icin olusturuldu.
	
	public UserDao() {
		users = new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		System.out.println("Uyelik basarili bir sekilde olusturuldu "+user.getFirstName());
		users.add(user);
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("Kullanici guncellendi "+user.getFirstName());
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("Kullanici silindi "+user.getEmail());
		
	}

	@Override
	public User getUser(int id) {
		for (User user : users) {
			if(id==user.getId()) {
				return user;
			}
			
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		for (User user : users) {
			System.out.println(user.getEmail()+" ");
		}
			
		return users;
	}

	

	
	

}
