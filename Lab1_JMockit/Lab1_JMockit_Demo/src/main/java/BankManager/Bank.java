/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManager;

/**
 *
 * @author nakyumdepzaii
 */
public class Bank {

    DBManager dbManager = new DBManager();

    public String processAccount(int accountID) {
        String toLowerCaseLastName = "";
        String lastName = dbManager.retrieveLastName(accountID);
        if(lastName.contains("oo")){
            toLowerCaseLastName = lastName.toLowerCase();
        }
        return toLowerCaseLastName;
    }
}
