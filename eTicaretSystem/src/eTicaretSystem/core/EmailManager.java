package eTicaretSystem.core;

import java.util.Random;
import java.util.Scanner;

public class EmailManager implements VerifySendService {

	@Override
	public void sendMail(String message, String senderMail) {
		System.out.println("Dogrulama maili gonderildi");
		System.out.println(senderMail+ "  adresine gonderilen 4 haneli kodu girerek mail adresinizi dogrulayiniz. ");
		
		
		
	}

	//Sadece gordugumuz teknolojileri kullanacagimiz icin mail ile dogrulamayi, kullanicidan  scanner ile 4 haneli kod isteyerek simule ettim.
	@Override
	public boolean verifyEmail() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int dogrulamaKodu = rand.nextInt(9000)+999;
		System.out.println("Uyelik icin dogrulama Kodunuz : "+dogrulamaKodu);
		System.out.print("Kodu buraya giriniz : ");
		int girilenSayi=0;
		while(girilenSayi != dogrulamaKodu) {
			girilenSayi = scan.nextInt();
			if(dogrulamaKodu== girilenSayi) {
				System.out.println("Tebrikler. Mailiniz dogrulandi");
				return true;
			}
			System.out.println("Dogrulama kodu hatali girildi.");
			System.out.print("Kodu tekrar giriniz : ");
			
			
		}
		scan.close();
		
		return false;
		
	}

}
