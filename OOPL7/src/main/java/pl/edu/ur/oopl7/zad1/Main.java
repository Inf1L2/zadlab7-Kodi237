package main.java.pl.edu.ur.oopl7.zad1;

public class Main {
    public static void main(String[] args){

        Osoba o1 = new Osoba("Konrad","Kubrak","01-01-1996",'m');
        Student s1 = new Student("Konrad","Kubrak","01-01-1996",'m',1111111,"inzynierskie","informatyka",1);
        Wykladowca w1 = new Wykladowca("Jan","Kowalski","01-01-1970",'m',"mgr inz", "Infromatyki","Wstep do SI");

        System.out.println(o1+"\n\n");
        System.out.println(s1+"\n\n");
        System.out.println(w1);

    }
}
