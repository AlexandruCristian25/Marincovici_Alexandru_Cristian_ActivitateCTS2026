package com.example;

import ro.ase.cts.CardBancar.Card;
import ro.ase.cts.CardBancar.Decorator;
import ro.ase.cts.CardBancar.CardDecorat;

public class Main {
    public static void main(String[] args) {
        
        Card card = new Card(234, "Popescu");
        card.afiseazaDetalii();
        
        Decorator cardDecorat = new CardDecorat(card);
        cardDecorat.afiseazaDetalii();
        
    }
    
}