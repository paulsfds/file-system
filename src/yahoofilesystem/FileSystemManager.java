/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yahoofilesystem;

import java.util.List;

/**
 *
 * @author paulsfds
 */
public class FileSystemManager {
    private Directory root;
    
    public FileSystemManager(Directory root) {
        this.root = root;
    }
    
    public void runCommand(Command command) {
        command.run(this.root);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Item> items = this.root.getItems();
        
        for (Item item : items) {
            sb.append(item.toString());
        }
        
        return sb.toString();
    }
}
