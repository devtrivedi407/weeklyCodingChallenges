import java.util.Scanner;
public class MyClass2 {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
			System.out.print("\n Enter the Text: ");
	        String text = sc.nextLine();		
						
			double letters = 0, words = 0, sentence=0;
			
			for(int i=0;i<text.length();i++){
			char c = text.charAt(i);
			
			if(Character.isLetter(c)==true){
			    letters++;
			    }
			else if(c==' ') {
				words++;
				}
			else if(c=='!' || c=='.') {
				sentence++;
				}
			}
						
			double L = (letters/(words+1))*100;
			double S = (sentence/(words+1))*100;
	    	
			
			double index = 0.0588*(L) - 0.296*S - 15.8;
			
			
			System.out.println("\n Grade "+Math.round(index));
		} 

}

/*OUTPUT:
  
  Grade 3*/
