/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.logic.Administrador;

/**
 *
 * @author PJ129
 */
public class Project {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
        Administrador myadministrador = new Administrador();
        myadministrador.fillQuestioList();
        myadministrador.fillUserList();
;
        Menu mymenu = new Menu (myadministrador);
        mymenu.setVisible(true);
    }
}

