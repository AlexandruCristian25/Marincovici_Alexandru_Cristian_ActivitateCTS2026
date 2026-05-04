package ro.ase.cts.Main;

import ro.ase.cts.clase.JucatorReal;
import ro.ase.cts.clase.ProxyJucator;

public class Main {

    public static void main(String[] args) {

        JucatorReal jucator1 = new JucatorReal("Andrei");
        ProxyJucator proxy1 = new ProxyJucator(jucator1, 16);

        proxy1.joaca();

        JucatorReal jucator2 = new JucatorReal("Mihai");
        ProxyJucator proxy2 = new ProxyJucator(jucator2, 10);

        proxy2.joaca();
    }
}