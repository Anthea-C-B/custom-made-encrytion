package easy;

import javax.swing.JOptionPane;

public class secretCode {
    public static void main(String[]args){
        String userInput = JOptionPane.showInputDialog("Please enter your message...");
        userInput = userInput.replaceAll(" ",".");
        StringBuffer usersMessage = new StringBuffer(userInput);
        while(!(usersMessage.length()%5 == 0)){
            usersMessage.append(".");
        }

        int counter = 0;
        System.out.println("1\t2\t3\t4\t5");
        //printing out cipher
        for(int x = 1;x>usersMessage.length();++x){
            System.out.print(usersMessage.charAt(counter) + "\t");

            if(x%5 == 0){
                System.out.println("");
            }
            ++counter;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Your encrypted message is : \n");
        //encrypting message
        int counterBack = usersMessage.length()-1;
        for(int x = usersMessage.length();x>1;--x){

            System.out.print(usersMessage.charAt(counterBack));
            counterBack = counterBack - 5;
            if(counterBack < 0){
                break;
            }
        }
        int counterback2 = usersMessage.length()-2;
        for(int x = usersMessage.length();x>1;--x){
            System.out.print(usersMessage.charAt(counterback2));
            counterback2 = counterback2 - 5;
            if(counterback2 < 0){
                break;
            }
        }

        int counterback3 = usersMessage.length()-3;
        for(int x = usersMessage.length();x>1;--x){
            System.out.print(usersMessage.charAt(counterback3));
            counterback3 = counterback3 - 5;
            if(counterback3 < 0){
                break;
            }
        }

        int counterback4 = usersMessage.length()-4;
        for(int x = usersMessage.length();x>1;--x){
            System.out.print(usersMessage.charAt(counterback4));
            counterback4 = counterback4 - 5;
            if(counterback4 < 0){
                break;
            }

        }

        int counterback5 = usersMessage.length()-5;
        for(int x = usersMessage.length();x>1;--x){
            System.out.print(usersMessage.charAt(counterback5));
            counterback5 = counterback5 - 5;
            if(counterback5 < 0){
                break;
            }
        }
    }
}
