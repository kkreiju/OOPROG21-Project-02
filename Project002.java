import java.io.*;
import javax.sound.sampled.*;
import java.util.*;

public class Project002 {
    static String songchoice = "";
    static int musicchoice;
    public static void PlayMusic() {
        Lyrics l = new Lyrics();
        l.musicchoice = musicchoice;
        System.out.println("Now Playing: " + songchoice);
        System.out.println("Lyrics: ");
        try {
            File musicfile = new File("songs\\" + songchoice + ".wav");
            AudioInputStream audiostream = AudioSystem.getAudioInputStream(musicfile);
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            clip.start();
            l.Decision();
            
        } catch (Exception e) {
            System.out.println("Music Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        
        while(!exit){
            System.out.print("Choose a song:\n1. Come Inside of My Heart - IV Of Spades\n2. Alive - Arjay Saguisa\n3. Someone To Spend Time With - Los Retros\n4. Exit\nYour choice: ");
            musicchoice = sc.nextInt();
            if(musicchoice == 1){
                songchoice = "Come Inside Of My Heart - IV Of Spades";
            }
            else if(musicchoice == 2){
                songchoice = "Alive - Arjay Saguisa";
            }
            else if(musicchoice == 3){
                songchoice = "Someone To Spend Time With - Los Retros";
            }
            else if(musicchoice == 4){
                exit = true;
                System.exit(0);
            }
            PlayMusic();
        }
        sc.close();
    }
}