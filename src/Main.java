import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Register object=new Register();
        int ch = 1;
        do{
            System.out.println("1.Add student 2.Get student details 3.Get failed students 4.Get toppers 5.Get class average 6.Exit");
            System.out.println("Enter choice");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                    object.addStudent();
                    break;
                case 2:
                    System.out.println("Enter registration number you want to get details about");
                    String regNo= input.next();
                    object.getStudentDetails(regNo);
                    break;
                case 3:
                    object.getFailedStudents();
                    break;
                case 4:
                    object.getToppers();
                    break;
                case 5:
                    object.getClassAverage();
                    break;
                case 6:
                    ch =0;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch == 1);
    }
}