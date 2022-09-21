public class Student {
    private String regNo;
    private String branch;
    private String name;
    private int[] marks=new int[3];
    Student(String regNo,String branch,String name,int[] marks){
        this.regNo=regNo;
        this.branch=branch;
        this.name=name;
        this.marks=marks;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getBranch() {
        return branch;
    }

    public String getName() {
        return name;
    }

    public double getPhyMarks() {
        return marks[0];
    }
    public double getChemMarks() {
        return marks[1];
    }
    public double getMathsMarks() {
        return marks[2];
    }
    public double getPercentage(){
        double perC=((getPhyMarks()+getChemMarks()+getMathsMarks())/300.0)*100.0;
        return perC;
    }
}
