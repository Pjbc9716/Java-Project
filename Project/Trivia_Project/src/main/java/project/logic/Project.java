/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.logic;

import project.windows.Menu;
import project.windows.NewJFrame;

/**
 *
 * @author PJ129
 */
public class Project {

    public static void main(String[] args) {
        Administrador administrador = new Administrador();
        administrador.ranking();
        Menu menu = new Menu(administrador);
        menu.setVisible(true);
    }
}
