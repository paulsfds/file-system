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
public enum CommandType {
    MAKEDIR ("mkdir"), CREATE ("create");
    
    private String value;
    
    private CommandType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
