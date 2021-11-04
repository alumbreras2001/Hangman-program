import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char game[];
        Scanner scan = new Scanner(System.in);
        Random r = new Random(); // takes a random string user enters.
        String[] arr= {"sims", "minecraft", "roblox"} ; //Takes an array of strings
        int randomNumber=r.nextInt(arr.length); //random
      	
      	//allows string letters and a string from the array to be in the program.
        String word = arr[r.nextInt(arr.length)];
        int count = word.length();
        char[] CharArr=word.toCharArray(); 
        char[] dash = word.toCharArray();
        
    for(int i=0;i<dash.length;i++) //loop for "-" length
    {
        dash[i] = '-'; //will print "-" to cover the string selected.
        System.out.print(dash[i]);
    }

    for (int i=1; i<=3; i++) // number of guesses user will get.
    {
        System.out.println("\nGuess a Letter:"); // will ask user to guess a letter
        
		char letter= scan.next().charAt(0); //allows user to enter a letter.

        for (int j=0;j<CharArr.length; j++) 
        {
            if(letter == dash[j]) //loop if the letter is already entered
            {
                System.out.println("this letter was already entered");
            }
            else
            {
                if(letter==CharArr[j])
                {
                    dash[j]=letter;
                    i--;
                    System.out.println("CORRECT GUESS!\n");
                }
            }
        }
        
        System.out.print(dash);
        switch(i+0)
        
        {
        //will print out users strike when they enter wrong letter
                case 1: System.out.println("Strike 1\n");
                    break;
                case 2: System.out.println("Strike 2\n");
                    break;
                case 3: System.out.println("Strike 3\n");
                
                    System.out.println("You're out!");
                    break;
        }   

        System.out.println("\n");
        if((new String(word)).equals(new String(dash))) 
        {
        	//ends program
            System.out.println("You win!\n");
            break; 
        }
    }





	}

}
