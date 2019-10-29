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
public class Conjured extends GildedRoseItem{
    // Pour les items maudit, on redéfinie la méthode decrementQuality
    @Override
    public void decrementQuality(Item item) {
        item.quality = item.quality - 2;
    }
    
    
}
