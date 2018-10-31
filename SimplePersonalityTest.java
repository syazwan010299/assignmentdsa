
package individualassignment;

import java.util.Scanner;
import java.lang.Math;

public class SimplePersonalityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList s = new ArrayList();//first arraylist for the career
        ArrayList describe = new ArrayList();//second arraylist for the career
        ArrayList dsa = new ArrayList();//third arrayList for the personality
        ArrayList answer = new ArrayList();//fourth arrayList for the personality
        
        System.out.println("This Program is to determine the personality of ourselves");
        System.out.println("Choose one of the theme : ");
        System.out.println("1 : Career");
        System.out.println("2 : Personality");
        
        
        System.out.print("Your choice : ");
        int a = input.nextInt();
        
        if ( a == 1){
            System.out.println("\nPlease answer 10 question");
            System.out.println("Please choose only one answer for every one question");
            System.out.println("Question in objective form");
            //first question
            System.out.println("\nQuestion 1 : ");
            System.out.println("What are your hobbies?");
            System.out.println(" A : Sleep \n B : Reading Books \n C : Watch movies \n D : Playing Games");
            System.out.print("Your answer : ");
            char a1 = input.next().charAt(0);
            s.add(a1);//enter the value into List S
            switch (a1){
                case 'a':case 'A':System.out.println("Sleep");break;
                case 'b':case 'B':System.out.println("Reading Books");break;
                case 'c':case 'C':System.out.println("Watch Movies");break;
                case 'd':case 'D':System.out.println("Playing Games");break;
            }//end of the switch case
            
            
            //second question
            System.out.println("\nQuestion 2 : ");
            System.out.println("When you were a child ,what did you want to be when you grew up?");
            System.out.println(" A : Doctor \n B : Policeman \n C : Engineer \n D : Businessman");
            System.out.print("Your answer : ");
            char a2 = input.next().charAt(0);
            s.add(a2);
            switch (a2){
                case 'a':case 'A':System.out.println("Doctor");break;
                case 'b':case 'B':System.out.println("Policeman");break;
                case 'c':case 'C':System.out.println("Engineer");break;
                case 'd':case 'D':System.out.println("Businessman");break;
            }//end of the switch case
            
            //third question
            System.out.println("\nQuestion 3 : ");
            System.out.println("What is your greatest fear?");
            System.out.println(" A : Poor \n B : Dead \n C : Forever Single \n D : Loss Someone");
            System.out.print("Your answer : ");
            char a3 = input.next().charAt(0);
            s.add(a3);
            switch (a3){
                case 'a':case 'A':System.out.println("Poor");break;
                case 'b':case 'B':System.out.println("Dead");break;
                case 'c':case 'C':System.out.println("Forever Single");break;
                case 'd':case 'D':System.out.println("Loss Someone");break;
            }//end of the switch case
            
            //fourth question
            System.out.println("\nQuestion 4 : ");
            System.out.println("Who is your personal hero?");
            System.out.println(" A : Dad \n B : Black widow \n C : Boboiboy \n D : Ourselves");
            System.out.print("Your answer : ");
            char a4 = input.next().charAt(0);
            s.add(a4);
            switch (a4){
                case 'a':case 'A':System.out.println("Dad");break;
                case 'b':case 'B':System.out.println("Black widow");break;
                case 'c':case 'C':System.out.println("Boboiboy");break;
                case 'd':case 'D':System.out.println("Ourselves");break;
            }//end of the switch case
            
            //fifth question
            System.out.println("\nQuestion 5 : ");
            System.out.println("If you could change one thing about your personality at the snap of your fingers what would it be?");
            System.out.println(" A : The way I talk \n B : The way I walk \n C : The way I treat people \n D : The way I sleep");
            System.out.print("Your answer : ");
            char a5 = input.next().charAt(0);
            s.add(a5);
            switch (a5){
                case 'a':case 'A':System.out.println("The way I talk");break;
                case 'b':case 'B':System.out.println("The way I walk");break;
                case 'c':case 'C':System.out.println("The way I treat people");break;
                case 'd':case 'D':System.out.println("The way I sleep");break;
            }//end of the switch case
            
            //sixth question
            System.out.println("\nQuestion 6 : ");
            System.out.println("What are you passionate about?");
            System.out.println(" A : Arts \n B : Gardening \n C : Food \n D : Ladies");
            System.out.print("Your answer : ");
            char a6 = input.next().charAt(0);
            s.add(a6);
            switch (a6){
                case 'a':case 'A':System.out.println("Arts");break;
                case 'b':case 'B':System.out.println("Gardening");break;
                case 'c':case 'C':System.out.println("Food");break;
                case 'd':case 'D':System.out.println("Ladies");break;
            }//end of the switch case
            
            //seventh question
            System.out.println("\nQuestion 7 : ");
            System.out.println("Who has impacted you most in your career?");
            System.out.println(" A : Dad \n B : Mom \n C : Friends \n D : Outsider");
            System.out.print("Your answer : ");
            char a7 = input.next().charAt(0);
            s.add(a7);
            switch (a7){
                case 'a':case 'A':System.out.println("Dad");break;
                case 'b':case 'B':System.out.println("Mom");break;
                case 'c':case 'C':System.out.println("Friends");break;
                case 'd':case 'D':System.out.println("Outsider");break;
            }//end of the switch case
            
            //eight question
            System.out.println("\nQuestion 8 : ");
            System.out.println("What kind of car do you drive?");
            System.out.println(" A : Proton \n B : Lamborgini \n C : BMW \n D : Audi");
            System.out.print("Your answer : ");
            char a8 = input.next().charAt(0);
            s.add(a8);
            switch (a8){
                case 'a':case 'A':System.out.println("Proton");break;
                case 'b':case 'B':System.out.println("Lamborgini");break;
                case 'c':case 'C':System.out.println("BMW");break;
                case 'd':case 'D':System.out.println("Audi");break;
            }//end of the switch case
            
            //Ninth question
            System.out.println("\nQuestion 9 : ");
            System.out.println("What would you do if you won the lottery?");
            System.out.println(" A : Eat \n B : Saves for the future \n C : Buy A house \n D : Married");
            System.out.print("Your answer : ");
            char a9 = input.next().charAt(0);
            s.add(a9);
            switch (a9){
                case 'a':case 'A':System.out.println("Eat");break;
                case 'b':case 'B':System.out.println("Saves for the future");break;
                case 'c':case 'C':System.out.println("Buy A house");break;
                case 'd':case 'D':System.out.println("Married");break;
            }//end of the switch case
            
            //tenth question
            System.out.println("\nQuestion 10 : ");
            System.out.println("Why do you choose this job?");
            System.out.println(" A : Salary offer \n B : Interest \n C : Follow friends \n D : Reccomended by family");
            System.out.print("Your answer : ");
            char a10 = input.next().charAt(0);
            s.add(a10);
            switch (a10){
                case 'a':case 'A':System.out.println("Salary offer");break;
                case 'b':case 'B':System.out.println("Interest");break;
                case 'c':case 'C':System.out.println("Follow friends");break;
                case 'd':case 'D':System.out.println("Reccomended by family");break;
            }//end of the switch case
            
            int output = 0;//declaration
            for ( int i = 0; i < s.size();i++){//need bracket because method
                
                char anw = (char) s.get(i);//to calculate the total marks
                switch (anw){
                    case 'a':case 'A' : output += (Math.random()*10);break;
                    case 'b':case 'B' : output += (Math.random()*10);break;
                    case 'c':case 'C' : output += (Math.random()*10);break;
                    case 'd':case 'D' : output += (Math.random()*10);break;
                }
            }//end for loop
            
            System.out.println("\nYour Score: " + output);//show the total marks
            
            describe.add(output);//save the total mark into List ADT
            
            for ( int i = 0;i < describe.size();i++){
                
            int wan =  (int) describe.get(i);//call back the total from List ADT
            //suitable Description based on the marks
            if ( (wan >= 80) && (wan <= 100)){
                System.out.println("Good Job!!!! You are so excellent");
            }else if ( ( wan >= 60) && ( wan <= 79)){
                System.out.println("Nice!!! You are good");
            }else if ( (wan >= 40) && (wan <= 59)){
                System.out.println("It's Okay To be weak.");
            }else{
                System.out.println("You are very weak!!!!");
            }//end of the if else
            
          }//end for the for loop    
            
        }else if ( a == 2){
            System.out.println("\nPlease answer 10 question");
            System.out.println("Please choose only one answer for every one question");
            System.out.println("Question in objective form");
            //first question
            System.out.println("\nQuestion 1 : ");
            System.out.println("When you're given a briefing paper, what do you do with it?");
            System.out.println(" A : Rewrite it and send it back \n B : Skim it for the salient point \n C : Read it carefully and act on it \n D : Send it back,I issue briefing papers,I dont read them");
            System.out.print("Your answer : ");
            char b1 = input.next().charAt(0);
            dsa.add(b1);
            switch (b1){
                case 'a':case 'A':System.out.println("Rewrite it and send it back");break;
                case 'b':case 'B':System.out.println("Skim it for the salient point");break;
                case 'c':case 'C':System.out.println("Read it carefully and act on it");break;
                case 'd':case 'D':System.out.println("Send it back,I issue briefing papers,I dont read them");break;
            }//end of the switch case
            
            
            //second question
            System.out.println("\nQuestion 2 : ");
            System.out.println("Which of these activities might suit you best?");
            System.out.println(" A : Running a relay race \n B : Free running  \n C : Running Alone \n D : Running with Friends");
            System.out.print("Your answer : ");
            char b2 = input.next().charAt(0);
            dsa.add(b2);
            switch (b2){
                case 'a':case 'A':System.out.println("Running a relay race");break;
                case 'b':case 'B':System.out.println("Free running");break;
                case 'c':case 'C':System.out.println("Running Alone");break;
                case 'd':case 'D':System.out.println("Running with Friends");break;
            }//end of the switch case
            
            //third question
            System.out.println("\nQuestion 3 : ");
            System.out.println("Which of these would you be most satisfied with at the end of a project you were leading?");
            System.out.println(" A : That is surpassed expectations \n B : That the job done \n C : That I contributed well \n D : That everyone did as I said");
            System.out.print("Your answer : ");
            char b3 = input.next().charAt(0);
            dsa.add(b3);
            switch (b3){
                case 'a':case 'A':System.out.println("That is surpassed expectations");break;
                case 'b':case 'B':System.out.println("That the job done");break;
                case 'c':case 'C':System.out.println("That I contributed well");break;
                case 'd':case 'D':System.out.println("That everyone did as I said");break;
            }//end of the switch case
            
            //fourth question
            System.out.println("\nQuestion 4 : ");
            System.out.println("Imagine you had to put some furniture together, how would you go about it?");
            System.out.println(" A : I wouldn't, I'd be building my own \n B : Grab all the pieces and figure it out without instruction \n C : Follow the instruction to the letter \n D : Get somebody else to do it and supervise them");
            System.out.print("Your answer : ");
            char b4 = input.next().charAt(0);
            dsa.add(b4);
            switch (b4){
                case 'a':case 'A':System.out.println("I wouldn't, I'd be building my own");break;
                case 'b':case 'B':System.out.println("Grab all the pieces and figure it out without instruction");break;
                case 'c':case 'C':System.out.println("Follow the instruction to the letter");break;
                case 'd':case 'D':System.out.println("Get somebody else to do it and supervise them");break;
            }//end of the switch case
            
            //fifth question
            System.out.println("\nQuestion 5 : ");
            System.out.println("How do you think other people might describe you?");
            System.out.println(" A : A Good Innovator \n B : A Good Leader \n C : A Good Creative Worker \n D : A Good Honest Hard Worker");
            System.out.print("Your answer : ");
            char b5 = input.next().charAt(0);
            dsa.add(b5);
            switch (b5){
                case 'a':case 'A':System.out.println("A Good Innovator");break;
                case 'b':case 'B':System.out.println("A Good Leader");break;
                case 'c':case 'C':System.out.println("A Good Creative Worker");break;
                case 'd':case 'D':System.out.println("A Good Honest Hard Worker");break;
            }//end of the switch case
            
            //sixth question
            System.out.println("\nQuestion 6 : ");
            System.out.println("On a football team, which of these positions would suit you best?");
            System.out.println(" A : Running Back \n B : Quarterback \n C : Wide Receiver \n D : Tight End");
            System.out.print("Your answer : ");
            char b6 = input.next().charAt(0);
            dsa.add(b6);
            switch (b6){
                case 'a':case 'A':System.out.println("Running Back");break;
                case 'b':case 'B':System.out.println("Quarterback");break;
                case 'c':case 'C':System.out.println("Wide Receiver");break;
                case 'd':case 'D':System.out.println("Tight End");break;
            }//end of the switch case
            
            //seventh question
            System.out.println("\nQuestion 7 : ");
            System.out.println("Which of these things do you value most in a relationship?");
            System.out.println(" A : Interest \n B : Companionship \n C : Unpredictability \n D : Respect");
            System.out.print("Your answer : ");
            char b7 = input.next().charAt(0);
            dsa.add(b7);
            switch (b7){
                case 'a':case 'A':System.out.println("Interest");break;
                case 'b':case 'B':System.out.println("Companionship");break;
                case 'c':case 'C':System.out.println("Unpredictability");break;
                case 'd':case 'D':System.out.println("Respect");break;
            }//end of the switch case
            
            //eight question
            System.out.println("\nQuestion 8 : ");
            System.out.println("Which of these things would make you happiest?");
            System.out.println(" A : A Quiet Contented Life \n B : A Life in which other look up to me \n C : A Life in which I ploughed my own furrow \n D : A Happy exciting life");
            System.out.print("Your answer : ");
            char b8 = input.next().charAt(0);
            dsa.add(b8);
            switch (b8){
                case 'a':case 'A':System.out.println("A Quiet Contented Life");break;
                case 'b':case 'B':System.out.println("A Life in which other look up to me");break;
                case 'c':case 'C':System.out.println("A Life in which I ploughed my own furrow");break;
                case 'd':case 'D':System.out.println("A Happy exciting life");break;
            }//end of the switch case
            
            //Ninth question
            System.out.println("\nQuestion 9 : ");
            System.out.println("In a conversation, what are you aiming for?");
            System.out.println(" A : A Consensus \n B : Agreement \n C : Inspiration \n D : A Solution");
            System.out.print("Your answer : ");
            char b9 = input.next().charAt(0);
            dsa.add(b9);
            switch (b9){
                case 'a':case 'A':System.out.println("A Consensus");break;
                case 'b':case 'B':System.out.println("Agreement");break;
                case 'c':case 'C':System.out.println("Inspiration");break;
                case 'd':case 'D':System.out.println("A Solution");break;
            }//end of the switch case
            
            //tenth question
            System.out.println("\nQuestion 10 : ");
            System.out.println("Which of these would you say is your greatest fault??");
            System.out.println(" A : I sometimes miss details \n B : I'm too ready to take the orders \n C : I can bee too critical \n D : I'm inclined to daydream");
            System.out.print("Your answer : ");
            char b10 = input.next().charAt(0);
            dsa.add(b10);
            switch (b10){
                case 'a':case 'A':System.out.println("I sometimes miss details");break;
                case 'b':case 'B':System.out.println("I'm too ready to take the orders");break;
                case 'c':case 'C':System.out.println("I can bee too critical");break;
                case 'd':case 'D':System.out.println("I'm inclined to daydream");break;
            }//end of the switch case
            
            int keluar = 0;//declaration
            for ( int i = 0; i < dsa.size();i++){//need bracket because method
                
                char h = (char) dsa.get(i);//to calculate the total marks
                switch (h){
                    case 'a':case 'A' : keluar += (Math.random()*10);break;
                    case 'b':case 'B' : keluar += (Math.random()*10);break;
                    case 'c':case 'C' : keluar += (Math.random()*10);break;
                    case 'd':case 'D' : keluar += (Math.random()*10);break;
                }
            }//end for loop
            
            System.out.println("\nYour Score: " + keluar);//show the total marks
            
            answer.add(keluar);//save the total mark into List ADT
            
            for ( int i = 0;i < answer.size();i++){
                
            int syazwan =  (int) answer.get(i);//call back the total from List ADT
            //suitable Description based on the marks
            if ( (syazwan >= 80) && (syazwan <= 100)){
                System.out.println("Good Job!!!! You are so excellent");
            }else if ( ( syazwan >= 60) && ( syazwan <= 79)){
                System.out.println("Nice!!! You are good");
            }else if ( (syazwan >= 40) && (syazwan <= 59)){
                System.out.println("It's Okay You are weak.");
            }else{
                System.out.println("You are very weak!!!!");
            }//end of the if else
            
          }//end for the for loop
        }else{
            System.out.println("Error input");
        }
        
    }//end of the main
}
