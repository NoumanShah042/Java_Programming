package JAVA_Audio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
/**
 *  youtube audio library
 *  wav file convertor
 * 
 * @author Syed Nouman Rehman
 */
public class Java_Audio {
    

 public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

    Scanner scanner = new Scanner(System.in);

    File file = new File("Level_Up.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);


     clip.start();  // play  in background so we need to stop program to terminate
                    // we can use scanner or GUI or thread or anything


    String response   = scanner.next();


   }
}
