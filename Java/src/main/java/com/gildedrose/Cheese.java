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
    // Pour les objets de type fromage, on augmente la qualit� � chaque tour.
    //On augmente la qualit� de 2 quand la date de pr�remption est pass�e
    @Override
    public void updateExpired(Item item) {
        incrementQuality(item);
    }

    @Override
    public void updateQuality(Item item) {
        incrementQuality(item);
    }
    
    
    
}
