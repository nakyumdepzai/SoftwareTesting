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
public class Simple {

    private String iAmPrivate() {
        return "Private Method";
    }

    public String publicCallsPrivate() {
        return iAmPrivate();
    }

}
