/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.logic;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import project.models.Question;
import project.models.User;

/**
 *
 * @author PJ129
 */
public class Administrador {

    public ArrayList<User> userInfo = new ArrayList<>();
    public ArrayList<Question> questionList = new ArrayList<>();

    public void fillUserList() {
        User myUser = new User("Administrador", "TG2018JAVA", "C.R.C", 00);
        userInfo.add(myUser);

    }

    public void fillQuestioList() {
        //68 Preguntas
        questionList.add(new Question("Cual es la ciudad mas poblada\n del mundo?", "Tokio", "Moscu", "Mexico DF" ));//0
        questionList.add(new Question("Quien es considerado el Rey del Pop?", "Michael Jackson", "Justin Bieber", "Justin Timberlake"));//1
        questionList.add(new Question("Cual es el pais mas grande de America?", "Canada", "Brasil", "Estados Unidos"));//2
        questionList.add(new Question("En que año cayo el muro de Berlin?", "1989", "1990", "1991"));//3
        questionList.add(new Question("Cual es la consola mas vendida de toda la historia", "PlayStation 2", "PlayStation", "Nintendo DS"));//4
        questionList.add(new Question("Cual es la unidad fundamental de la vida?", "Celula", "Tejido", "Neuronas"));//5
        questionList.add(new Question("Quien escribio la Odisea", "Homero", "Borges", "Coelho"));//6
        questionList.add(new Question("¿Cual es el río más largo del mundo?", "Amazonas", "Volga", "Missisipi"));//7
        questionList.add(new Question("¿Donde se originaron los Juegos Olimpicos?", "Grecia", "Roma", "Egipto"));//8
        questionList.add(new Question("¿Como se le llama al resultado de una multiplicación?", "Producto", "Resultado", "Residuo"));//9
        questionList.add(new Question("¿Cuantas Copas del Mundo de la FIFA ha ganado Brasil?", "5", "4", "6"));//10
        questionList.add(new Question("¿Que país se caracteriza por tener la forma de una bota?", "Italia", "Holanda", "Francia"));//11
        questionList.add(new Question("¿En que año comenzó la Segunda Guerra Mundial?", "1939", "1935", "1937"));//12
        questionList.add(new Question("¿Cuantas patas tiene una araña?", "8", "6", "7"));//13
        questionList.add(new Question("¿¿Quien va a la carcel: el acusado, el condenado, el imputado?", "el condenado", "el acusado", "el imputado"));//14
        questionList.add(new Question("¿Cual fue el primer metal empleado por un ser humano?", "cobre", "plata", "oro"));//15
        questionList.add(new Question("¿Cual es el primer número primo?", "2", "3", "1"));//16
        questionList.add(new Question("¿Quien es el autor de Hamlet?", "Shakespeare", "Homero", "Borges"));//17
        questionList.add(new Question("¿Cuantos años tiene un lustro?", "5", "4", "6"));//18
        this.questionList.add(new Question ("En cual pais se encuentra la Universidad de Cambridge","Inglaterra","EE.UU","Alemania"));//19
        this.questionList.add(new Question ("¿Como se le llama al procedimiento de alzar una bandera?","Izar","Levantamiento de bandera","Saludo a la bandera"));//20
        this.questionList.add(new Question ("Cual es el unico animal que no puede saltar","El elefante","El ornitorrinco","La hormiga"));//21
        this.questionList.add(new Question ("¿Cuál es el animal que emite el sonido más alto?","La ballena jorobada","El leon","El elefante"));//22
        this.questionList.add(new Question ("¿Qué atrae más al mosquito cuando está en búsqueda de alimento?","El color azul","Una gota de sangre al aire libre","El sonido de las palpitaciones"));//23
        this.questionList.add(new Question ("¿Qué animal puede ver la luz infrarroja y ultravioleta?","El pez dorado","El esquimal","El pez pulmonado"));//24
        this.questionList.add(new Question ("¿Cuántos dientes tiene un mosquito?","47","102","Ninguno"));//25
        this.questionList.add(new Question ("¿Cuándo saca la lengua un gorila?","Cuando tiene hambre","Cuando esta enojado","El gorila no saca la lengua"));//26
        this.questionList.add(new Question ("¿Cuál es el animal de boca más grande, según su cuerpo?","La rana argentica","El tiburon blanco","La boa constrictora"));//27
        this.questionList.add(new Question ("¿Cuál de los siguientes animales puede vivir más de 200 años?","Las almejas gigantes","Las tortugas gigantes","Las cucarachas albinas"));//28
        this.questionList.add(new Question ("Comparativamente, ¿qué animal tiene mayor fuerza?","El escarabajo Atlas","El elefante africano","La serpiente Piton"));//29
        this.questionList.add(new Question ("¿Cuál es el país con mas oficinas postales del mundo?","India","China","Rusia"));//30
        this.questionList.add(new Question ("¿Qué país de Europa es el más poblado?","Alemania","Francia","Reino Unido"));//31
        this.questionList.add(new Question ("¿Cuál es el país con mas ríos y lagos del mundo?","Canada","Peru","Escocia"));//32
        this.questionList.add(new Question ("¿La capital de qué país es la única fundada en el siglo XX?","Brasil","Andorra","Nicaragua"));//33
        this.questionList.add(new Question ("¿Qué país nunca invadió a otro en sus tantos años de historia?","India","China","Yugoslavia"));//34
        this.questionList.add(new Question ("¿Cuál es el país con mas museos per cápita del mundo?","Israel","Chile","Canada"));//35
        this.questionList.add(new Question ("¿Qué país tiene observatorio solar de 7 mil años de antigüedad?","Alemania","Italia","Grecia"));//36
        this.questionList.add(new Question ("¿Cuáles países son los mayores productores de plata del mundo?","Mexico y Peru","Nicaragua y Panama","Sudafrica y Tanzania"));//37
        this.questionList.add(new Question ("¿En qué país está ubicado el conocido “techo de América”?","Argentina","Brasil","Peru"));//38
        this.questionList.add(new Question ("Si te invitan a bailar el “Palo de Mayo”, ¿en qué país estás?","Nicaragua","El Salvador","Bolivia"));//39
        this.questionList.add(new Question ("¿Cuánto duró la guerra más corta de la historia?","Treinta y siete minutos","Quince minutos","Dos horas y veinte minutos"));//40
        this.questionList.add(new Question ("CAMBIAR PREGUNTA POR EL TAMANO","16","22","1"));//41
        this.questionList.add(new Question ("¿Cuánto se duró construir el acorazado Bismarck?","5 años","7 meses","10 años"));//42
        this.questionList.add(new Question ("¿Cuál se piensa que fue la versión terrestre de la Guerra Fría?","Los juegos Olimpicos de Helsinki","La creacion del primero videojuego","El enfretamient de Corea"));//43
        this.questionList.add(new Question ("Laura fue un nombre famoso en la Segunda Gran Guerra. ¿Por qué?","Era el nombre del armamento aleman","Era el plan para matar a Hitler","El nombre del Tratado de Rendicion"));//44
        this.questionList.add(new Question ("¿Qué frase se hizo popular tras la conquista del Imperio Inca?","Le costo un ojo de la cara","En casa de herrero,cuchillo de palo","Vea yogur..."));//45
        this.questionList.add(new Question ("¿Qué avión arrojó la bomba sobre la ciudad de Hiroshima?","El Enola Gay","El Little Boy","El National Bomber"));//46
        this.questionList.add(new Question ("¿Cuántos equipos participaron en el mundial de Uruguay 1930?","13","16","14"));//47
        this.questionList.add(new Question ("¿Cuántas veces Argentina fue en un mundial hasta el 2010?","15","16","17"));//48
        this.questionList.add(new Question ("¿En que mundial se marco el gol nº 1000 de los mundiales","Argentina 1978","Mexico 1986","Italia 1990"));//49
        this.questionList.add(new Question ("¿Que país organizó el quinto mundial de fútbol?","Suecia","Francia","Italia"));//50
        this.questionList.add(new Question ("¿Qué descubrimiento hizo la NASA en 2006, sobre Saturno?","Encontró un nuevo anillo","Encontró bloques de hielo","Descubrió unas cavernas"));//51
        this.questionList.add(new Question ("¿A qué se denomina “el brazo de Orión”?","El sector que esta el sistema Solar","A la Vía Láctea","A la constelacion:Las Tres Marias"));//52
        this.questionList.add(new Question ("¿Qué astro fue “degradado” en 2006?","Plutón","Neptuno","Mercurio"));//53
        this.questionList.add(new Question ("Cuál es el planeta que su rotacion es diferente a los demas","Venus","Tierra","Mercurio"));//54
        this.questionList.add(new Question ("¿Cuántos años tiene la Tierra?","4500 millones","8900 millones","3700 millones"));//55
        this.questionList.add(new Question ("¿Cuántos planetas componen el Sistema Solar?","8","9","12"));//56
        this.questionList.add(new Question ("¿Cuáles son los integrantes del grupo de “planetas interiores”?","Mercurio,la Tierra,Venus y Marte","Mercurio,Marte,Venus y Jupiter","La Tierra,Mercurio,Venus y Urano"));//57
        this.questionList.add(new Question ("¿De qué bandera era el cohete Gamma Centauro?","Argentino","Uruguayo","Venezolano"));//58
        this.questionList.add(new Question ("¿Cuántos satélites tiene Neptuno?","Trece","Uno","Ninguno"));//59
        this.questionList.add(new Question ("¿A qué distancia, aproximadamente, se halla el Sol de la Tierra?","149.6x10^6 Km","75.5x10^6 Km","105x10^6 Km"));//60
        this.questionList.add(new Question ("¿Cuántos tipos de eclipses puede presentar?","Tres","Dos","Cuatro"));//61
        this.questionList.add(new Question ("¿Hace cuánto años se formó el Sol, aproximadamente?","4650 millones","2725 millones","1964 millones"));//62
        this.questionList.add(new Question ("¿Cuántas capas posee el Sol, en su constitución?","7","Son incontables","14"));//63
        this.questionList.add(new Question ("¿Qué fenómeno se explica mediante las manchas solares?","La actividad en la fotosfera","Nada, son formaciones normales","La hiperactividad del nucleo"));//64
        this.questionList.add(new Question("¿Qué es la CME?","Una emision de radiacion","El nombre cientifico del Sol","La luz solar ultravioleta"));//65
        this.questionList.add(new Question ("¿Quién reside en el Sol, según el cristianismo?"," El arcángel Miguel","Dios"," El arcángel Rafael"));//66
        this.questionList.add(new Question ("¿Cual es la capital de Brasil, país sudamericano?","Brasilia","Porto Alegre","Río de janeiro"));//67
    }

    public boolean verifyNickname(String nickname) {
        boolean newNickname = true;
        if (!nickname.equals("")) {
            for (int i = 0; i < userInfo.size(); i++) {
                while (userInfo.get(i).getUserNickname().equals(nickname)) {
                    newNickname = false;
                    break;
                }

            }

        } else {
            newNickname = false;
        }
        if (nickname.length()>13){
            JOptionPane.showMessageDialog(null, "El nickname no debe ser mayor a 13 caracteres");
            newNickname = false;
        }
        return newNickname;
    }

    public boolean verifyPasswordLength(String password) {
        return (password.length() >= 8);
    }

    public boolean verifyPasswordSign(String password) {
        return password.contains("@") || password.contains("&") || password.contains("$");
    }

    public boolean verifyPasswordNumber(String password) {
        boolean hasNumber = false;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                hasNumber = true;
                break;
            }
        }
        return hasNumber;
    }

    public boolean verifyCountry(String country) {
        return !country.equals("Seleccione su pais");
    }
    public boolean verifyPasswordMatches (String password, String verifyPassword){
        return password.equals(verifyPassword);
    }
    
    public boolean correctInfo (String nickname, String password){
        int position = -1;
        boolean correctNickname = false;
        for (int i = 0; i < userInfo.size(); i++) {
            if (userInfo.get(i).getUserNickname().equals(nickname)) {
                position = i;
                correctNickname = true;
                break;
            }
        }
        if (correctNickname) {
            JOptionPane.showMessageDialog(null, "Bienvenid@: "+userInfo.get(position).getUserNickname());
            return userInfo.get(position).getUserPassword().equals(password);

        } else {
            return false;
        }
    }
    public int getUserPosition (String nickname){
        int userPosition=-1;
        for (int i=0; i<userInfo.size();i++){
            if (userInfo.get(i).getUserNickname().equals(nickname)){
                userPosition = i;
            }
        }
        return userPosition;
    }
    public int selectQuestion (){
        int randomQuestion = (int) (Math.random()*68);
        while (questionList.get(randomQuestion).getAlreadyAnswered().equals("YES")){
            randomQuestion = (int) (Math.random()*68);
        }
            return randomQuestion;
    }
    public int setType (){
        int type = (int) (Math.random()*(4-1)+1);
        System.out.println(type);
        return type;
    }

}
