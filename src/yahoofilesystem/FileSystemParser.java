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
public class FileSystemParser {
    public static Command parse(String input) {
        String[] inputs = input.split(" ");
        String command = inputs[0];
        String path = inputs[1];
        
        if (command.equals(CommandType.MAKEDIR.getValue())) {
            return new MakeDirCommand(path);
        } else if (command.equals(CommandType.CREATE.getValue())) {
            
        } else {
            
        }
        
        return null;
    }
}
