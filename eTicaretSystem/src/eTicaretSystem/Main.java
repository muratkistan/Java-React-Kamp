package eTicaretSystem;

import eTicaretSystem.business.abstracts.UserService;
import eTicaretSystem.business.concretes.LoginWithMailAndPassword;
import eTicaretSystem.business.concretes.UserManager;
import eTicaretSystem.business.concretes.UserValidManager;
import eTicaretSystem.core.EmailManager;
import eTicaretSystem.core.GoogleManagerAdapter;
import eTicaretSystem.dataAccess.concretes.UserDao;
import eTicaretSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new UserDao(),new UserValidManager(),new EmailManager(),new LoginWithMailAndPassword());
		
		
		//Mail ile giris yapilmak istenirse asagidaki sekilde parametre gonderilecek. Google ya da mail ile girise bagli kalmadik
		//Cunku referanslari ayni oldugu icin bu sayede ilerde farkli bir yontemle de giris eklemek oldukca basitlesti.
		//UserService userService2 = new UserManager(new UserDao(),new UserValidManager(),new EmailManager(),new LoginWithMailAndPassword());
		
		User user1 = new User(1,"Murat","Kistan","murat@gmail.com","1234567");
		userService.addUser(user1);
		User user2 = new User(2,"Ahmet","Yesil","ahmet@gmail.com","123456789");
		userService.addUser(user2);
		User user3 = new User(3,"Zeynep","Kavas","zeynep@gmail.com","zeynep25");
		userService.addUser(user3);
		
		userService.login(user1.getPassword(), user1.getEmail());
		
		UserService userService2 = new UserManager(new UserDao(),new UserValidManager(),new EmailManager(),new LoginWithMailAndPassword());
		userService2.login(user3.getPassword(),user3.getEmail());
		userService.getAll();

	}

}
