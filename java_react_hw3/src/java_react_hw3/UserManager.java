package java_react_hw3;

public class UserManager {
	
	public void kullaniciEkle(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" isimli kullanici eklendi \n");
	}
	
	public void kullaniciEkle(User[] users) {
		for (User user : users) {
			System.out.println(user.getFirstName()+" "+ user.getLastName()+" isimli kullanici eklendi.");
		}
		System.out.println("\n");
	}
	
	public void kullaniciSil(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" isimli kullanici Silindi");
		System.out.println("Silme islemi basarili \n");
	}

}
