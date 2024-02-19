import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CubeGold cubeGold =  new CubeGold( 31);
        FerrariEngine ferrariEngine = new FerrariEngine(34,42,24);
        RenaultEnigine renaultEnigine = new RenaultEnigine(21,12,32,44);
        Student student = new Student(30706,"30706@iitu.edu.kz","dedus","KUANYSH","OMAROV","SIS-2121",4.0);
        Teacher teacher = new Teacher(1,"hz","maybedbeix","DAUREN","SENIOR LECTURER");
        Teacher teacher2 = new Teacher(2,"hz","maybedbeix","DAUREN","SENIOR LECTURER");

        //        System.out.println(cubeGold.getVolume());
//        System.out.println("all settings: \n" +ferrariEngine.efficiency() + "\n" + ferrariEngine.throttleEnergy() + "\n" + ferrariEngine.breakEnergy());
//        System.out.println("all settings: \n" + renaultEnigine.efficiency() + " \n" + renaultEnigine.throttleEnergy() + "\n" + renaultEnigine.breakEnergy());
//        System.out.println(renaultEnigine.getMaxSpeed());
//        System.out.println(student.getUserData());
//        System.out.println(teacher.getUserData());
//        System.out.println(teacher2.getUserData());

        ERPSystem erpSystem = new ERPSystem();

        erpSystem.addUser(student);
        erpSystem.addUser(teacher);
        erpSystem.addUser(teacher2);

        erpSystem.printTeacher();
        erpSystem.printStudent();
//        erpSystem.printUser(1);
    }
}