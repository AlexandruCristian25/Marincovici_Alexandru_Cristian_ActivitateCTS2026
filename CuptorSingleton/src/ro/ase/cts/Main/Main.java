package ro.ase.cts.Main;

import ro.ase.cts.Cuptor.Cuptor;

public class Main {
    public static void main(String[] args) {
        
        Cuptor c1 = new Cuptor(120, 120.90f);
        Cuptor c2 = new Cuptor(160, 220.90f);
        
        c1.setTimpGatire(180);
        c1.setGradeGatire(180.90f);
        
        System.out.println(c1.getTimpGatire());
        System.out.println(c1.getGradeGatire());
        
    }
}