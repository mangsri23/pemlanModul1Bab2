package Constructor;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] data = new Student[3];
        
        for (int i =0; i<data.length; i++){
            System.out.println("Data Siswa Ke-" + (i+1));
            
            System.out.print("Masukkan nama siswa: ");
            String name = input.nextLine();
            System.out.print("Masukkan alamat siswa: ");
            String address = input.nextLine();
            System.out.print("Masukkan umur siswa: ");
            int age = input.nextInt();
            System.out.print("Nilai Matematika:  ");
            int math = input.nextInt();
            System.out.print("Nilai Bahasa Inggris: ");
            int english = input.nextInt();
            System.out.print("Nilai Science: ");
            int science = input.nextInt();
            input.nextLine();
            System.out.println();
            
            data[i]= new Student(name, address, age, math, english,science);
        }
        System.out.println("========Data Siswa========");
        for(int i=0; i<data.length; i++){
            data[i].displayMessage();
            System.out.println();
        }
        
        System.out.println();
        Student.jumlahObject();
//        
//        Student anna = new Student();
//        anna.setName("Anna");
//        anna.setAddress("Malang");
//        anna.setAge(20);
//        anna.setMath(100);
//        anna.setScience(89);
//        anna.setEnglish(80);
//        anna.displayMessage();
//
////menggunakan constructor lain
//        System.out.println("===================");
//        Student chris = new Student("Chris", "Kediri", 21);
//        chris.setMath(70);
//        chris.setScience(60);
//        chris.setEnglish(90);
//        chris.displayMessage();
////siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
//        System.out.println("===================");
//        anna = new Student("anna", "Batu", 18);
//        anna.displayMessage();
////siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
//        System.out.println("===================");
//        chris.setAddress("Surabaya");
//        chris.setAge(22);
//        chris.displayMessage();    
//// object baru dengan constructor yang berisi parameter nilai maisng-masing mata pelajaran 
//        System.out.println("====================");
//        Student komang = new Student("Komang", "Bali", 18, 89 , 90, 87);
//        komang.displayMessage();      
////Object untuk mengecek status siswa remidi
//        System.out.println("====================");
//        Student siswaremidi = new Student("Oknum Remidi", "Malang", 18, 50, 60,50);
//        siswaremidi.displayMessage();     
////Object untuk  mengecek status siswa lulus 
//        System.out.println("====================");
//        Student siswalulus = new Student("Oknum Lulus", "Malang", 18, 90, 80,86);
//        siswalulus.displayMessage();
    }
}

