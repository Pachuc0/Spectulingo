// Java Program for taking user
// input using BufferedReader Class
import java.io.*;
import java.util.*;
import java.util.Scanner;  // Import the Scanner class

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


class Main {
    // Main Method
    public static void main(String[] args)
        throws IOException
    {
        Scanner myObj = new Scanner(System.in);
/*
        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
 */

        int rounds = 5;
        int attempts = 3;
        
        //array to keep track which "maps" has previously been used

        // Declaring the ArrayList with
        // initial size n
        int n = 5;
        ArrayList<String> language = new ArrayList<String>(n);
        language.add("Spanish");
        language.add("Tagalog");
        language.add("French");
        language.add("Dutch");
        language.add("Hacker");

        ArrayList<picture> wriMap = new ArrayList<picture>(n);
        wriMap.add(10);//Spanish text
        wriMap.add(80);//Tagalog text
        wriMap.add(30);//French text
        wriMap.add(70);//Dutch text
        wriMap.add(5);//Hacker text
  
          // Declaring the ArrayList 
        ArrayList<audio> audioMap = new ArrayList<audio>();
        audioMap.add(10);//Spanish audio
        audioMap.add(80);//Tagalog audio
        audioMap.add(30);//French audio
        audioMap.add(70);//Dutch audio
        audioMap.add(5);//Hacker audio
        Clip clip = AudioSystem.getClip();

        // Map where the languages is spoken
        ArrayList<pic> mapPicture = new ArrayList<pic>();
        audioMap.add(10);//Spanish pic
        audioMap.add(80);//Tagalog pic
        audioMap.add(30);//French pic
        audioMap.add(70);//Dutch pic
        audioMap.add(5);//Hacker pic

        // Fact about the language
        ArrayList<String> languageFact = new ArrayList<String>();
        languageFact.add(0,"");//Spanish pic
        languageFact.add(1,"");//Tagalog pic
        languageFact.add(2,"");//French pic
        languageFact.add(3,"");//Dutch pic
        languageFact.add(4,"");//Hacker pic


        for (int i = 0; i < 5; i++){
            int totalpoints = 0;
            //randomize between choosing the written or audio language "map"
            int[] myNum = {0, 1};
            if (myNum[0] == 1){
                int[] temp = {0, 1, 2, 3, 4};
                //randomize the index array
                
                //
                for(int j = 0; j < 5; j++){
                    //pull the map, display it!

                    System.out.println("What is the language?");

                    //get the user's input
                    String userinput = myObj.nextLine();
                    
                    //compare user's answer to the correct answer
                    if (userinput.equals(language.get(1))){
                        System.out.println("Correct!");
                        totalpoints += 100;
                    }
                    else {
                        //incorrect answer
                        //display the map of where the language is spoken
                        
                        //print the fact about the language

                        //enter anything to continue (user input)
                    }
                }
            }
            else {
                //randomize the arraylist
                int[] temp = {0, 1, 2, 3, 4};
                //randomize the index array
                
                //
                for(int j = 0; j < 5; j++){
                    //pull the map, display it!

                    System.out.println("What is the language?");

                    //get the user's input
                    String userinput = myObj.nextLine();
                    
                    //compare user's answer to the correct answer
                    if (userinput.equals(language.get(1))){
                        System.out.println("Correct!");
                        totalpoints += 100;
                    }
                    else {
                        //incorrect answer
                        //display the map of where the language is spoken
                        
                        //print the fact about the language

                        //enter anything to continue (user input)
                    }
                }

            }

        }

        boolean tr = true;
        while (tr){
            System.out.println("Do you want to continue: ");
            // String input
            String userinput = myObj.nextLine();
            if (userinput.equals("no")){
                tr = false;
            }
        }
        System.out.println("The game is over");
    }
}