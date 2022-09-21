import java.util.Scanner;
public class Register {
    Scanner input=new Scanner(System.in);
    Student[] obj=new Student[0];
    void addStudent(){
        int[] marks=new int[3];
        System.out.println("Enter student's registration number");
        String regNo= input.next();
        System.out.println("Enter Student's branch");
        String branch=input.next();
        System.out.println("Enter Student's name");
        String name=input.next();
        System.out.println("Enter student's marks");
        for(int i=0;i<3;i++){
            marks[i]=input.nextInt();
        }
        Student object=new Student(regNo,branch,name,marks);
        int len=this.obj.length;
        Student[] temp=new Student[len+1];
        for(int i=0;i<this.obj.length;i++){
            temp[i]=this.obj[i];
        }
        temp[len]=object;
        this.obj=temp;
        System.out.println("Student added successfully");
    }
    void getStudentDetails(String regNo){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %5s","Registration No","|");
        System.out.printf("%15s %5s","Name","|");
        System.out.printf("%15s %5s","Branch","|");
        System.out.printf("%15s %5s","Physics marks","|");
        System.out.printf("%15s %5s","Chemistry marks","|");
        System.out.printf("%15s %5s","Maths marks","|");
        System.out.printf("%15s","Percentage");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<this.obj.length;i++){
            if(regNo.equals(obj[i].getRegNo())){
                System.out.printf("%15s %5s",obj[i].getRegNo(),"|");
                System.out.printf("%15s %5s",obj[i].getName(),"|");
                System.out.printf("%15s %5s",obj[i].getBranch(),"|");
                System.out.printf("%15s %5s",obj[i].getPhyMarks(),"|");
                System.out.printf("%15s %5s",obj[i].getChemMarks(),"|");
                System.out.printf("%15s %5s",obj[i].getMathsMarks(),"|");
                System.out.printf("%15s",Math.round(obj[i].getPercentage())+"%");
                System.out.println();
            }
        }
    }
    void getFailedStudents(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %5s","Registration No","|");
        System.out.printf("%15s %5s","Name","|");
        System.out.printf("%15s %5s","Branch","|");
        System.out.printf("%15s %5s","Physics marks","|");
        System.out.printf("%15s %5s","Chemistry marks","|");
        System.out.printf("%15s %5s","Maths marks","|");
        System.out.printf("%15s","Percentage");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<this.obj.length;i++){
            if(obj[i].getPercentage()<33){
                System.out.printf("%15s %5s",obj[i].getRegNo(),"|");
                System.out.printf("%15s %5s",obj[i].getName(),"|");
                System.out.printf("%15s %5s",obj[i].getBranch(),"|");
                System.out.printf("%15s %5s",obj[i].getPhyMarks(),"|");
                System.out.printf("%15s %5s",obj[i].getChemMarks(),"|");
                System.out.printf("%15s %5s",obj[i].getMathsMarks(),"|");
                System.out.printf("%15s",Math.round(obj[i].getPercentage())+"%");
                System.out.println();
            }
        }
    }
    void getToppers(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %5s","Registration No","|");
        System.out.printf("%15s %5s","Name","|");
        System.out.printf("%15s %5s","Branch","|");
        System.out.printf("%15s %5s","Physics marks","|");
        System.out.printf("%15s %5s","Chemistry marks","|");
        System.out.printf("%15s %5s","Maths marks","|");
        System.out.printf("%15s","Percentage");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<this.obj.length;i++){
            if(obj[i].getPercentage()>90){
                System.out.printf("%15s %5s",obj[i].getRegNo(),"|");
                System.out.printf("%15s %5s",obj[i].getName(),"|");
                System.out.printf("%15s %5s",obj[i].getBranch(),"|");
                System.out.printf("%15s %5s",obj[i].getPhyMarks(),"|");
                System.out.printf("%15s %5s",obj[i].getChemMarks(),"|");
                System.out.printf("%15s %5s",obj[i].getMathsMarks(),"|");
                System.out.printf("%15s",Math.round(obj[i].getPercentage())+"%");
                System.out.println();
            }
        }
    }
    void getClassAverage(){
        double phyAvg=0,cheAvg=0,mathsAvg=0;
        for(int i=0;i<this.obj.length;i++) {
            phyAvg = phyAvg + (obj[i].getPhyMarks()/ obj.length);
            cheAvg=cheAvg+ (obj[i].getChemMarks()/ obj.length);
            mathsAvg=mathsAvg+(obj[i].getMathsMarks()/ obj.length);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %5s","Registration No","|");
        System.out.printf("%15s %5s","Name","|");
        System.out.printf("%15s %5s","Branch","|");
        System.out.printf("%15s %5s","Physics marks","|");
        System.out.printf("%15s %5s","Chemistry marks","|");
        System.out.printf("%15s %5s","Maths marks","|");
        System.out.printf("%15s","Percentage");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<this.obj.length;i++){
            System.out.printf("%15s %5s",obj[i].getRegNo(),"|");
            System.out.printf("%15s %5s",obj[i].getName(),"|");
            System.out.printf("%15s %5s",obj[i].getBranch(),"|");
            System.out.printf("%15s %5s",obj[i].getPhyMarks(),"|");
            System.out.printf("%15s %5s",obj[i].getChemMarks(),"|");
            System.out.printf("%15s %5s",obj[i].getMathsMarks(),"|");
            System.out.printf("%15s",Math.round(obj[i].getPercentage())+"%");
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %47s","Class average","|");
        System.out.printf("%15s %5s",phyAvg,"|");
        System.out.printf("%15s %5s",cheAvg,"|");
        System.out.printf("%15s",mathsAvg);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
