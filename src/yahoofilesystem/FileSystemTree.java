/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yahoofilesystem;

/**
 *
 * @author paulsfds
 */
public class FileSystemTree {
    private Directory root;
    
    public FileSystemTree() {
        this.root = new Directory("/");
    }
}
