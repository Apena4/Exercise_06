import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int num1 =input.promptInt("Enter a Integer. ");
        System.out.println("Twice your integer is " + num1*2);
        double num2 = input.doublePrompt("Enter a string. ");
        System.out.println("Twice your integer is "+num2*2);
        String stringOne = input.promptString("Enter a string ");
        System.out.println("String you put in is " +stringOne);

    }

}
class UserInput{
    Scanner scanner = new Scanner(System.in);
    public int promptInt(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();
        int userInteger = 0;
        boolean isInteger = false;
        while(!isInteger){
            try{
                userInteger = Integer.parseInt(userInput);
                isInteger = true;
            }catch(NumberFormatException e){
                System.out.println(userInput +" is not a valid input"+ message);
                userInput = scanner.nextLine();
            }finally {
                System.out.println("It was executed");
            }
        }
        return userInteger;
    }
    public double doublePrompt(String message2){
        System.out.println(message2);
        String userInput = scanner.nextLine();
        double userDub = 0;
        boolean isDub = false;
        while(!isDub){
            try{
                userDub = Double.parseDouble(userInput);
                isDub = true;
            }catch (NumberFormatException e){
                System.out.println(userInput + " isn't a valid input" + message2);
            }finally {
                System.out.println("it was executed");
            }
        }
        return userDub;
    }
    public String promptString(String message){
        return message;
    }
}