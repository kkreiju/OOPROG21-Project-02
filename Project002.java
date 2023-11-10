import java.io.*;
import javax.sound.sampled.*;
import java.util.*;

public class Project002 {
    static Scanner sc = new Scanner(System.in);
    static String songchoice = "";
    static int musicchoice;
    static boolean withlyrics = false;

    public static void PlayMusic() {
        Lyrics l = new Lyrics();
        l.musicchoice = musicchoice;

        try {
            File musicfile = new File("songs\\" + songchoice + ".wav");
            AudioInputStream audiostream = AudioSystem.getAudioInputStream(musicfile);
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            clip.start();
            System.out.println("Now Playing: " + songchoice);
            if (withlyrics) {
                System.out.println("Lyrics: ");
                l.Decision();
            } else {
                String choice = "";
                while (!choice.equals("Q") || !l.running) {
                    System.out.print("\nP = Resume\nS = Stop\nR = Reset\nQ = Quit Options");
                    System.out.print("\nEnter your choice: ");
                    choice = sc.next();
                    choice = choice.toUpperCase();
                    if (choice.equals("P")) {
                        System.out.println("Now Playing: " + songchoice);
                        clip.start();
                    } else if (choice.equals("S")) {
                        System.out.println("Paused: " + songchoice);
                        clip.stop();
                    } else if (choice.equals("R")) {
                        System.out.println("Reset Music: " + songchoice);
                        clip.setMicrosecondPosition(0);
                    } else if (choice.equals("Q")) {
                        clip.close();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Music Not Found");
            main(null);
        }
    }

    public static void main(String[] args) {
        boolean exit = false;
        System.out.println("Welcome!!");
        while (!exit) {
            System.out.print("\n1. Play a Song with Lyrics\n2. Play a Song with Options\n3. Exit\nEnter Option: ");
            ErrorTrapping();
            if (musicchoice == 1) {
                withlyrics = true;
            } else if (musicchoice == 2) {
                // do nothing
            }
            else if(musicchoice == 3){
                System.out.println("Terminating Program.");
                System.exit(0);
            } else {
                System.out.println("Input Error, Select only 1,2 and 3");
                main(null);
            }
            musicchoice = 0;
            System.out.print(
                    "Choose a song:\n1. Come Inside of My Heart - IV Of Spades\n2. Alive - Arjay Saguisa\n3. Someone To Spend Time With - Los Retros\nYour choice: ");
            ErrorTrapping();
            if (musicchoice == 1) {
                songchoice = "Come Inside Of My Heart - IV Of Spades";
            } else if (musicchoice == 2) {
                songchoice = "Alive - Arjay Saguisa";
            } else if (musicchoice == 3) {
                songchoice = "Someone To Spend Time With - Los Retros";
            }
            PlayMusic();
        }
        sc.close();
    }

    public static void ErrorTrapping() {
        try {
            musicchoice = sc.nextInt();
        } catch (Exception e) {
            System.out.print("Input error, Try again: ");
            sc.nextLine();
            ErrorTrapping();
        }
    }
}