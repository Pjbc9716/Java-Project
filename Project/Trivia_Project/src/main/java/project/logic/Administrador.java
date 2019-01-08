/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.logic;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.Query.Direction;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import project.models.Question;
import project.models.User;
import java.applet.AudioClip;

/**
 *
 * @author PJ129
 */
public class Administrador {
    
    public ArrayList<Question> questionList = new ArrayList<>();
    private ArrayList <User> userBackUp = new List <>(); 
    InputStream serviceAccount;
    GoogleCredentials credentials;
    FirebaseOptions options;
    public Firestore database;
    
    public Administrador() {
        try {
            //El objeto "serviceAccount" de la clase de FileInputStream, en el string se debe modificar conforme
            //a donde se ubique el json en su computador, unicamente "\\Trivia_Project\\src\\main\\java\\project\\database\\trivia-game.json"
            // se queda igual, antes de eso debe de cambiarlo conforme a su computador
            this.serviceAccount = new FileInputStream("C:\\Users\\PJ129\\Documents\\NetBeansProjects\\Trivia_Project\\src\\main\\java\\project\\database\\trivia-game.json");
            this.credentials = GoogleCredentials.fromStream(serviceAccount);
            this.options = new FirebaseOptions.Builder()
                    .setCredentials(credentials)
                    .build();
            FirebaseApp.initializeApp(options);
            database = FirestoreClient.getFirestore();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void addUser(String name, String password, String country, long age) {
        String userID = "user_" + name + "_2018";
        ApiFuture<WriteResult> newUser = database.collection("User").document("user_" + name + "_2018").set(new User(name, password, country, age,userID));
        JOptionPane.showMessageDialog(null, "Usuari@ cread@!");
    }
    
    public void updateUserPoints(User user, long points) {
        try {
            System.out.println(user.getUserNickname());
            DocumentReference docRef = database.collection("User").document("user_" + user.getUserNickname() + "_2018");
            docRef.update("userPoints", points);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public String[] ranking() {
        String[] highestPoints = new String[100];
        try {
            CollectionReference users = database.collection("User");
            Query query = users.orderBy("userPoints", Direction.DESCENDING).limit(100);
            ApiFuture<QuerySnapshot> querySnapshot = query.get();
            User user = null;
            int position = 0;
            for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
                user = document.toObject(User.class);
                String points = Long.toString(user.getUserPoints());
                String information = (position + 1) + " " + user.getUserNickname() + "...." + user.getUserCountry() + "...." + points;
                highestPoints[position] = information;
                position++;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return highestPoints;
    }
    
    public boolean newNickname(String nickname) {
        boolean newNickname = true;
        try {
            DocumentReference documentRef = database.collection("User").document("user_" + nickname + "_2018");
            ApiFuture<DocumentSnapshot> future = documentRef.get();
            DocumentSnapshot document = future.get();
            User user = null;
            if (document.exists()) {
                newNickname = false;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
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
    
    public boolean verifyPasswordMatches(String password, String verifyPassword) {
        return password.equals(verifyPassword);
    }
    
    public boolean correctInfo(String nickname, String password) {
        boolean correctInfo = false;
        try {
            boolean nicknameRegistered = false;
            boolean correctPassword = false;
            DocumentReference documentRef = database.collection("User").document("user_" + nickname + "_2018");
            ApiFuture<DocumentSnapshot> future = documentRef.get();
            DocumentSnapshot document = future.get();
            User user = null;
            nicknameRegistered = document.exists();
            if (nicknameRegistered) {
                user = document.toObject(User.class);
                correctPassword = user.getUserPassword().equals(password);
            }
            correctInfo = nicknameRegistered && correctPassword;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return correctInfo;
    }    
    
    public int getQuestion() {
        int questionSelected = -1;
        
        try {
            FileReader address = new FileReader("src\\main\\java\\project\\database\\QuestionList.csv");
            BufferedReader file = new BufferedReader(address);
            boolean emptyList = false;
            while (!emptyList) {
                String info = file.readLine();
                if (info != null) {
                    String questionInfo[] = info.split(";");
                    String question = questionInfo[0];
                    String correctOption = questionInfo[1];
                    String option1 = questionInfo[2];
                    String fullOption = questionInfo[3];
                    String splitOption[] = fullOption.split(",");
                    String option2 = splitOption[0];
                    
                    this.questionList.add(new Question(question, correctOption, option1, option2));
                } else {
                    emptyList = true;
                }
            }
            
            questionSelected = (int) (Math.random() * 66);
            while (questionList.get(questionSelected).getAlreadyAnswered().equals("YES")) {
                questionSelected = (int) (Math.random() * 66);
            }
            questionList.get(questionSelected).setAlreadyAnswered("YES");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return questionSelected;
    }
    
    public int setType() {
        int type = (int) (Math.random() * (4 - 1) + 1);
        return type;
    }
    
    public User getUserInfo(String name) {
        User user = null;
        try {
            DocumentReference documentRef = database.collection("User").document("user_" + name + "_2018");
            ApiFuture<DocumentSnapshot> future = documentRef.get();
            DocumentSnapshot document = future.get();
            user = document.toObject(User.class);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return user;
    }
    
    public AudioClip playMusic() {
        AudioClip music;
        music = java.applet.Applet.newAudioClip(getClass().getResource("/Music.wav"));
        music.loop();
        return music;
        
    }
    
    public void stopMusic(AudioClip music) {
        music.stop();
        
    }
    
    public void cleanQuestionList() {
        for (int i = 0; i < questionList.size(); i++) {
            if (questionList.get(i).getAlreadyAnswered().equals("YES")) {
                questionList.get(i).setAlreadyAnswered("NO");
            }
        }
    }
}





