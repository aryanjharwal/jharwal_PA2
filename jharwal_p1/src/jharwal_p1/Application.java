package jharwal_p1;
import java.util.Scanner;

//Create a class Application
public class Application {
 //Main method
 public static void main(String[] args) {
     System.out.print("Enter four digit integer : ");
     Scanner scan = new Scanner(System.in);
     String number = scan.nextLine();
     //Check if the number is 4 digit or not
     if(number.length() != 4) {
         // if number is not a 4 digit then Display the message and return
         System.out.println("Invalid input. Number is not 4 digit \n please enter 4 digit number");
         return;
        
     }
     //Create a Encrypter object
     Encrypter encryption = new Encrypter();
     // Call encrypt method to encrypt the number
     String encrypt = encryption.encrypt(number);
     //display Encrypted value
     System.out.println( "Encrypted value : "+encrypt);
     //Create a Decrypter object
     Decrypter decrypt = new Decrypter();
     // // Call decrypt method to decrypt the number
     String decrpt = decrypt.decrypt(encrypt);
     //display Decrypted value
     System.out.println("Decrypted value : "+decrpt);
 }}
