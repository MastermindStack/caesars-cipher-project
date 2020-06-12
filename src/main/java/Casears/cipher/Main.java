package Casears.cipher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "how are you doing today";
		int offset = 12;
				
		CasearsCipher caesarsCipher = new CasearsCipher();
		String cipheredMessage = caesarsCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);

	}

}
