/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yahoofilesystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulsfds
 */
public class YahooFileSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileSystemManager fileSystemManager = new FileSystemManager(new Directory("/"));
        
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/paulsfds/NetBeansProjects/YahooFileSystem/Input/test.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                
                Command command = FileSystemParser.parse(line);
                fileSystemManager.runCommand(command);
                
                System.out.println(fileSystemManager.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(YahooFileSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(YahooFileSystem.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(YahooFileSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
