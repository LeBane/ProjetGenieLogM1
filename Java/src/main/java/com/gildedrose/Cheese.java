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
public class Cheese extends GildedRoseItem{
    // Pour les objets de type fromage, on augmente la qualité à chaque tour.
    //On augmente la qualité de 2 quand la date de préremption est passée
    @Override
    public void updateExpired(Item item) {
        incrementQuality(item);
    }

    @Override
    public void updateQuality(Item item) {
        incrementQuality(item);
    }
    
    
    
}
