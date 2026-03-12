package Constructor;

public class Student {
   private String name;
   private String address;
   private int age;
   private double mathGrade;
   private double englishGrade;
   private double scienceGrade;
   private double average;
   static int count = 0;
   
   public Student(){
       name = "";
       address = "";
       age = 0;
   }
   public Student(String n, String a, int ag){
       name = n;
       address = a;
       age = ag;
   }
   public Student(String n, String a, int ag, int math, int english, int science){
       name = n;
       address = a;
       age = ag;
       mathGrade = math;
       englishGrade = english;
       scienceGrade = science;
       count++;
   }
   public void setName(String n){
       name = n;
   }
   public void setAddress(String a){
       address = a;
   }
   public void setAge(int ag){
       age = ag;
   }
   public void setMath(int math){
       mathGrade = math;
   }
   public void setEnglish(int english){
       englishGrade = english;
   }
   public void setScience(int science){
       scienceGrade = science;
   }
   private double getAverage(){
       double result = 0;
       result = (mathGrade+scienceGrade+englishGrade)/3;
       return result;
   }
   public boolean statusAkhir(){
       return getAverage () >= 61;
   }
   
   public void displayMessage(){
       System.out.println("Siswa dengan nama "+name);
       System.out.println("beralamat di "+address);
       System.out.println("berumur "+age);
       System.out.println("mempunyai nilai rata rata"+getAverage());
       if (statusAkhir()){
           System.out.println("Status siswa adalah Lulus");
       }else{
           System.out.println("Status siswa adalah Remidi"); 
       }
   }
   public static void jumlahObject(){
       System.out.println("JUMLAH OBJECT YANG SUDAH DIBUAT SEBANYA " + count + " OBJECT");
   }
}
