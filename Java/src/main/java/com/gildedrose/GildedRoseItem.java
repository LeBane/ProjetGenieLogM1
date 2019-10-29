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
public class GildedRoseItem {
    
    
    public void incrementQuality(Item item){
        if(item.quality < 50){
            item.quality = item.quality+1;
        }
    }
    
    public void decrementQuality(Item item){
        if(item.quality > 0){
            item.quality = item.quality-1;
        }
    }
    
    //Decremente la qualité d'un item, lorsque celui ci a passé sa date de peremption (sellIn)
    public void updateExpired(Item item){
        decrementQuality(item);
    }
    //Le sellIn ne peut que diminuer, c'est pourquoi nous faisons directement cela.
    public void updateSellIn(Item item){
        item.sellIn = item.sellIn-1;
    }
    
    public void updateQuality(Item item){
        decrementQuality(item);
    }
    
    public void updateItem(Item item){
        updateQuality(item);
        updateSellIn(item);
        if(item.sellIn < 0){
            updateExpired(item);
        }
    }
}
