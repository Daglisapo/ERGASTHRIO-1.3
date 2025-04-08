import java.util.Scanner;
public class TestEmployee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Diavasma Stoixeion Ergazomenou 1
        Employee erg1 = new Employee();
        System.out.println("Dose onoma ergazomenoy 1:");
        erg1.setOnoma(sc.next());
        System.out.println("Dose epitheto ergazomenoy 1:");
        erg1.setEpitheto(sc.next());
        System.out.println("Dose arithmo mitroou ergazomenou 1:");
        erg1.setAm(sc.nextInt());
        System.out.println("Dose etoi pou o ergazomenos 1 vrisketai sthn etairia:");
        erg1.setEtoi(sc.nextInt());
        System.out.println("Dose mistho ergazomenoy 1:");
        erg1.setMisthos(sc.nextDouble());
        System.out.println("Dose bonus ergazomenoy 1:");
        erg1.setBonus(sc.nextDouble());

        //Diavasma Stoixeion Ergazomenou 2
        Employee erg2 = new Employee();
        System.out.println("Dose onoma ergazomenoy 2:");
        erg2.setOnoma(sc.next());
        System.out.println("Dose epitheto ergazomenoy 2:");
        erg2.setEpitheto(sc.next());
        System.out.println("Dose arithmo mitroou ergazomenou 2:");
        erg2.setAm(sc.nextInt());
        System.out.println("Dose etoi pou o ergazomenos 2 vrisketai sthn etairia:");
        erg2.setEtoi(sc.nextInt());
        System.out.println("Dose mistho ergazomenoy 2:");
        erg2.setMisthos(sc.nextDouble());
        System.out.println("Dose bonus ergazomenoy 2:");
        erg2.setBonus(sc.nextDouble());

        //Ejodos stoixeion ergazomenou 1
        System.out.println(erg1.toString());
        System.out.println("O telikos misthos toy ergazomenou 1 einai:" + erg1.salary());

        //Ejodos stoixeion ergazomenou 2
        System.out.println(erg2.toString());
        System.out.println("O telikos misthos toy ergazomenou 2 einai:" + erg2.salary());
    }
}
