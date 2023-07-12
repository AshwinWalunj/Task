import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter 1 for Email notifications and 2 SMS notifications");
        int choice = sc.nextInt();
        switch (choice){
            case 1:{
                new EmailNotifications().sendNotifications("Hey "+name+", welcome to our Mailing system");
                break;
            }
            case  2:{
                new SmsNotifications().sendNotifications("Hey "+name+", welcome to our SMS system");
                break;
            }
            default:{
                System.out.print("Invalid Choice");
                break;
            }
        }
    }
}