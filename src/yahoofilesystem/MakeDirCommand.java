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
public class MakeDirCommand extends Command {
    private List<Directory> directories;
    
    public MakeDirCommand(String path) {
        this.directories = new ArrayList<>();
        
        String[] items = path.split("/");
        
        for (String directory : items) {
            this.directories.add(new Directory(directory));
        }
    }
    
    @Override
    public void run(Directory root) {
        Directory currentDir = root;
        
        for (Directory dir : this.directories) {
            currentDir.addItem(dir); 
            currentDir = dir;
        }
    }
}
