/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hangman;

import java.util.Random;

/**
 *
 * @author Tyler Bohl
 */
public class WordList {

    static Random rand = new Random();
    private char guess;
    private char correct;
    private int correctLocation;
    private static String secretWord;

    private static String[] hard = {"tree", "golf", "truck", "cold", "fail"};
    private static String[] medium = {"expected", "relative", "pizza", "solvent", "radical"};
    private static String[] easy = {"chlorophyll", "optometrist", "bedazzled", "reminisce", "firefighter"};
    private static String[] random = { "tree", "golf", "truck", "cold", "fail", "expected", "relative", "pizza", "solvent", "radical", "chlorophyll", "optometrist", "bedazzled", "reminisce", "firefighter"};

    public static String getSecretWordEasy() {
        return easy[rand.nextInt(easy.length)];
       
    }

    public static String getSecretWordMedium() {
        return medium[rand.nextInt(medium.length)];
        
    }
    
    public static String getSecretWordHard() {
        return hard[rand.nextInt(hard.length)];
        
}
    
    public static String getSecretWordRandom()
    {
        return random[rand.nextInt(random.length)];
        
    }
}
