/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yahoofilesystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulsfds
 */
public class Directory extends Item {
    private List<Item> items;
    
    public Directory(String name) {
        super(name);
        
        this.items = new ArrayList<>();
    }
    
    public boolean addItem(Item item) {
        return this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (Item item : this.items) {
            sb.append(item.getName());
            sb.append("/");
        }
        
        return sb.toString();
    }
}
