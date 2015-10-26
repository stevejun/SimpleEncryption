import java.util.Scanner;

public class SimpleEncryption {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("***\tInitializing Steve's Simple Encryption\t***\n\n");
		int key;
		String message,input;
		Scanner myScanner = new Scanner(System.in);
		
		//System.out.println((int)'a');
		//System.out.println(Integer.toHexString(32));
		
		System.out.println("Enter the String you want to encrypt: \n");
		message = myScanner.nextLine();
		System.out.println("Enter encryption key: \n");
		key = myScanner.nextInt();
		
		System.out.print("Processing");
		Thread.sleep(100);
		System.out.print(".");
		Thread.sleep(100);
		System.out.print(".");
		Thread.sleep(100);
		System.out.print(".\n");
	
		System.out.println("\nEncrypted Message: \n"+encrypt(key,message));
		Thread.sleep(1000);
			
		
		System.out.print("***\tProgram terminated.\t***\n");
	}
	
	public static String encrypt(int key, String message){
		String encryptedMessage=null;
		StringBuilder temp = new StringBuilder();
		for (int i=0; i<message.length(); i++){
			//System.out.println((int)'a');
			//System.out.println(Integer.toHexString(32));
			//read each character
			int currentChar = (int)message.charAt(i);
			//shift and mod
			currentChar = (currentChar+key)%128;
			//convert to a hex
			String hexChar = Integer.toHexString(currentChar);
			//append to string builder
			temp.append(hexChar);
			//System.out.print(hexChar+" ");
			temp.append("\t");
			if ((i+1)%10==0) temp.append("\n");
		}
		encryptedMessage = temp.toString();
		return encryptedMessage;
	}
}
