
package project;

import project.logic.Administrador;


public class Project {

    public static void main(String[] args) {
        // TODO code application logic here
        Administrador myadministrador = new Administrador();
        myadministrador.fillQuestioList();
        myadministrador.fillUserList();
        Menu mymenu = new Menu (myadministrador);
        mymenu.setVisible(true);
    }
}

