package jharwal_p1;
//Create a class Decrypter
public class Decrypter {
public String decrypt(String number) {
    String sevenString = "";
    //loop through the string
    for(int i = 0 ; i < number.length() ; i++ ) {
        // for decrypt first subtract the each digit by 7
        int n = ((Integer.parseInt(number.charAt(i)+"")) -7) ;
        // add 10 if n less than 10
        if (n < 0)
            n += 10;
        // Convert to string
        sevenString = sevenString + n;
    }
    // swap the first with third and second digit with fourth digit
    String decrypt = sevenString.charAt(2) +""+ sevenString.charAt(3)+"" + sevenString.charAt(0)+""+sevenString.charAt(1)+"";
    //return decrypted message
    return decrypt;
   
}


}