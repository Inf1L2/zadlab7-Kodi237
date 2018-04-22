package main.java.pl.edu.ur.oopl7.zad2;

public class Main {
    public static void main(String[] args){
        /*
        Punkt2D p1 = new Punkt2D().LosujPunkt();
        Punkt2D p2 = new Punkt2D().LosujPunkt();
        Punkt3D p3 = new Punkt3D().LosujPunkt();
        Punkt3D p4 = new Punkt3D().LosujPunkt();

        System.out.println(p1+"\n");
        System.out.println(p2+"\n");
        System.out.println(p3+"\n");
        System.out.println(p4+"\n");
        */
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];

        for(int i = 0; i<100;i++){
            array2D[i] = new Punkt2D().LosujPunkt();
            array3D[i] = new Punkt3D().LosujPunkt();
        }

        for(int i=0;i<100;i++){
            if (array2D[i].getX() == array3D[i].getX() && array2D[i].getY() == array3D[i].getY()){
                System.out.println(array2D[i].toString()+" | "+array3D[i].toString());
            }
        }
    }
}
