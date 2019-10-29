/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose;

/**
 *
 * @author benjamin
 */
public class Ticket extends GildedRoseItem{
    // Une fois la date passée, le ticket n'a plus de valeur
    @Override
    public void updateExpired(Item item) {
        item.quality = 0;
    }
    // On augmente la qualité de 1, puis de 2 pour les 10 derniers jours et de 3 pour les 5 derniers jours
    @Override
    public void updateQuality(Item item) {
        incrementQuality(item);
        
        if(item.sellIn <= 10){
            incrementQuality(item);
        }
        if(item.sellIn <= 5){
            incrementQuality(item);
        }
    }
    
    
    
}
