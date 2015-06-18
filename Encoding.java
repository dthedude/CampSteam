import java.util.Scanner;
public class Encoding{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word or phrase you wish to the SVR Encoding System (SVRES)");
        String input = scan.nextLine();
        String output = "";
        for(char letter : input.toUpperCase().toCharArray()){ 
            if(letter == 'E'){
                output += "00000";
            }
            else if(letter == 'T'){
                output += "00001";
            }
            else if(letter == 'A'){
                output += "00010";
            }
            else if(letter == 'O'){
                output += "00011";
            }
            else if(letter == 'I'){
                output += "00100";
            }
            else if(letter == 'N'){
                output += "00101";
            }
            else if(letter == 'S'){
                output += "00110";
            }
            else if(letter == 'R'){
                output += "00111";
            }
            else if(letter == 'H'){
                output += "01000";
            }
            else if(letter == 'P'){
                output += "01001";
            }
            else if(letter == 'L'){
                output += "01010";
            }
            else if(letter == 'U'){
                output += "01011";
            }
            else if(letter == 'C'){
                output += "01100";
            }
            else if(letter == 'M'){
                output += "01101";
            }
            else if(letter == 'F'){
                output += "01110";
            }
            else if(letter == 'Y'){
                output += "01111";
            }
            else if(letter == 'W'){
                output += "10000";
            }
            else if(letter == 'G'){
                output += "10001";
            }
            else if(letter == 'D'){
                output += "10010";
            }
            else if(letter == 'B'){
                output += "10011";
            }
            else if(letter == 'V'){
                output += "10100";
            }
            else if(letter == 'K'){
                output += "10101";
            }
            else if(letter == 'X'){
                output += "10110";
            }
            else if(letter == 'Q'){
                output += "10111";
            }
            else if(letter == 'J'){
                output += "11000";
            }
            else if(letter == 'Z'){
                output += "11001";
            }
            else if(letter == ' '){
                output += "11010";
            }//if
         }//for 
         System.out.println("Output:" + output);       
    }//main    
}//Encoding

