package jharwal_p1;
//Create a class Encrypter
public class Encrypter {
	// create a method encrypt to encrypt the number
	   public String encrypt(String number) {
	       String sevenString = "";
	       //loop through the string
	       for(int i = 0 ; i < number.length() ; i++ ) {
	           // Add 7 to each digit and get the each digit reminder with divided by 10
	           int n = ((Integer.parseInt(number.charAt(i)+"") )+ 7) % 10;
	           // Convert the digits to Strings
	           sevenString = sevenString + n;
	       }
	       // swap the first with third and second digit with fourth digit
	       String encrypedmessage = sevenString.charAt(2)+ "" + sevenString.charAt(3)+"" + sevenString.charAt(0)+""+sevenString.charAt(1)+"";
	       //return encrypted message
	       return encrypedmessage;
	      
	   }

	}