package eTicaretSystem.core;

public interface VerifySendService {
	
	public void sendMail(String message,String senderMail);
	public boolean verifyEmail();

}
