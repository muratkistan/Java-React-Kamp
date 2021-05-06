package eTicaretSystem.business.concretes;

import java.util.List;

import eTicaretSystem.business.abstracts.LoginService;
import eTicaretSystem.business.abstracts.UserService;
import eTicaretSystem.business.abstracts.UserValidService;
import eTicaretSystem.core.VerifySendService;
import eTicaretSystem.dataAccess.abstracts.BaseUserDao;
import eTicaretSystem.entities.concretes.User;

public class UserManager implements UserService {
	
	private BaseUserDao baseUserDao;
	private UserValidService userValidService;
	private VerifySendService emailService;
	private LoginService loginService ;
	

	
	
	public UserManager(BaseUserDao baseUserDao, UserValidService userValidService,
			VerifySendService emailService,LoginService loginService) {
		super();
		this.baseUserDao = baseUserDao;
		this.userValidService = userValidService;
		this.emailService = emailService;
		this.loginService = loginService;
	}



	@Override
	public void addUser(User user) {
		if(userValidService.userIsValid(user)) {
			System.out.println("Bilgileriniz dogru");
			if(emailService.verifyEmail()) {
				baseUserDao.addUser(user);
			}
			
		}
		
		
	}

	@Override
	public void updateUser(User user) {
		baseUserDao.updateUser(user);
		
	}

	@Override
	public void deleteUser(User user) {
		baseUserDao.deleteUser(user);
		
	}

	@Override
	public User getUser(int id) {
		
		return baseUserDao.getUser(id);
	}

	@Override
	public List<User> getAll() {
		return baseUserDao.getAll();
	}



	@Override
	public boolean login(String password, String mail) {
		loginService.login(password, mail);
		return false;
	}

}
