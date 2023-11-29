//Java Program to illustrate Caesar Cipher Encryption Technique

import java.util.Scanner;

class CaesarCipher

{

	public static void main(String[] args)

	{
        //Creating an Array to store Plaintext 
    	char[] arrayPlainText = new char[100];
    	
    	//Creating an Array to store Ciphertext
	char[] cipherText= new char[100];

	Scanner sc = new Scanner(System.in);

        //Input the Plaintext from User
	System.out.print("Plaintext: ");
        String plainText = sc.nextLine();

	//Storing the Value of Plaintext String in an Array of Charcters
	for(int i=0;i<plainText.length();i++) {

		arrayPlainText[i] = plainText.charAt(i);

	}

        //Input the value of Key from User
	System.out.print("Key: ");
    	int key = sc.nextInt();

        //Print the Ciphertext
        System.out.print("Ciphertext: ");
        encrypt(plainText,key,arrayPlainText,cipherText);        
}

    public static void encrypt(String plainText, int key, char arrayPlainText[], char cipherText[]){

        for(int j=0;j<plainText.length();j++) 

		{
		    //If condition if Character is a Letter
			if(Character.isLetter(arrayPlainText[j])) {

                	//If condition for Uppercase Character
				if(Character.isUpperCase(arrayPlainText[j]))	{			

				cipherText[j] = (char) ((((arrayPlainText[j]-'A')+key)%26)+'A');

			    }

			    else{				

                //Else conditon for Lowercase Character
				cipherText[j] = (char) ((((arrayPlainText[j]-'a')+key)%26)+'a');

			    }
            //Print the Ciphertext
			System.out.print(cipherText[j]);
        }

			else {
            //If-else condition for a Non-Letter Character (Comma or Space)
			System.out.print(cipherText[j]+=arrayPlainText[j]);

		}

	}

}		

}	

/*
    SAMPLE OUTPUT - 1:

    Plaintext: HELLO
    Key: 1
    Ciphertext: IFMMP
    
    SAMPLE OUTPUT - 2:
    
    Plaintext: hello, world
    Key: 13
    Ciphertext: uryyb, jbeyq
    
    SAMPLE OUTPUT - 3:
    
    Plaintext: be sure to drink your Ovaltine
    Key: 13
    Ciphertext: or fher gb qevax lbhe Binygvar
*/