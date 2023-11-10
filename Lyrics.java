public class Lyrics {
    int musicchoice;
    boolean running = true;
    String lyrics;
    int i = 0;

    public void Decision(){
        if(musicchoice == 1){
            ComeInsideOfMyHeart();
        }
        else if(musicchoice == 2){
            Alive();
        }
        else if(musicchoice == 3){
            SomeoneToSpendTimeWith();
        }
    }

    public void TextAnimation(){
        try{
            for (char c : lyrics.toCharArray()) {
            System.out.print(c);
            Thread.sleep(50);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        i++;
    }

    public void ComeInsideOfMyHeart(){
        String[] lyricarray = {"I love you ", "but I don't really show you", 
                            "I'd call you ", "but only if you want me too",
                            "Oh, don't you let it stop", "Oh, I won't let it happen, baby",
                            "I will never stop", "But only if you listen to me",
                            "Come inside of my heart if you're looking for answers",
                            "Look at the stars, go a little bit faster", "Ooh, ", "ooh, hooh-ahh-ooh",
                            "Oh, baby ", "forgive me if I hurt you", "Come save me ",
                            "'cause you're the only one for me", "Whatever happens to me, baby", "I'm sorry",
                            "No one could ever go my way", " (Come inside of my heart, baby)", "--Instrumental--", "--End of Song--"};
        
        while(running){
            lyrics = lyricarray[i];
            try {
                Thread.sleep(500);
                TextAnimation();
                Thread.sleep(2600);
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(3200);
                System.out.println(); 
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2700);
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2500);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2650);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2600);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2700);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2800);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2000);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1900);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1600);
                lyrics = lyricarray[i];
                TextAnimation();
                i -= 4;

                Thread.sleep(4400);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2000);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1900);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1600);
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(5300);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2600);
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(3500);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2300);
                lyrics = lyricarray[i];
                TextAnimation();
                i = 4;

                Thread.sleep(2400);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2650);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2500);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2700);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2800);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1800);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1900);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1600);
                lyrics = lyricarray[i];
                TextAnimation();
                i -= 4;

                Thread.sleep(4400);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2000);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1900);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1600);
                lyrics = lyricarray[i];
                TextAnimation();
                i = 16;

                Thread.sleep(5600);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2800);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(3000);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();
                i = 0;

                Thread.sleep(6000);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2700);
                lyrics = lyricarray[i];
                TextAnimation();
                i = 8;

                Thread.sleep(3000);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(2000);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1900);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1600);
                lyrics = lyricarray[i];
                TextAnimation();
                i = 19;

                Thread.sleep(1600);
                lyrics = lyricarray[i];
                TextAnimation();
                i = 8;

                Thread.sleep(1000);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1800);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1900);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();

                Thread.sleep(1600);
                lyrics = lyricarray[i];
                TextAnimation();
                i = 20;
                
                Thread.sleep(4000);
                System.out.println();
                lyrics = lyricarray[i];
                TextAnimation();
                Thread.sleep(49000);
                
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                System.out.println();
                running = false;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void Alive(){
        String[] lyricarray = {"--Instrumental--", "If you are here", "My love the world won't make me crazy",
                                "You're what I need to make me calm again", "I'm tired enough without your care",
                                "I heard you're unhappy", "If it's my fault my love forgive me", "Things get hard when I go insane",
                                "The words released caused every single pain", "It's not a story", "My love just ponder",
                                "If we don't die you can't even tell me that", "Ending is present", "'Cause love is consistent",
                                "The reality is different", "And as long as I am alive", "We won't divide", "--End Of Song--"};
                                //end of song == 17
        while(running){
            lyrics = lyricarray[i];
            try{
                TextAnimation();
                
                Thread.sleep(29000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //ep u are her
                
                Thread.sleep(4000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //malab daworld
                
                Thread.sleep(4000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //wat i need to cal
                
                Thread.sleep(4000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //tired enough
                
                Thread.sleep(7500);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //i heard youre unhappy
                
                Thread.sleep(4000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //if its my fault
                
                Thread.sleep(4000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //things get hard
                
                Thread.sleep(4000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //the worlds released
                
                Thread.sleep(7000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //its not a story
                
                Thread.sleep(2000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //my love just ponder
                
                Thread.sleep(3000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //if we dont die 
                
                Thread.sleep(3000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //ending is present
                
                Thread.sleep(5000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //cause love is consistent
                
                Thread.sleep(5000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //the reality is different
                
                Thread.sleep(6000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //and as long as
                
                Thread.sleep(4000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation(); //we wunt
                i = 0;
                
                Thread.sleep(2000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                i = 17;
                
                Thread.sleep(65000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                System.out.println();
                running = false;
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

    public void SomeoneToSpendTimeWith(){
        String[] lyricarray = {"--Instrumental--", "Wake up alone", "In the morning, with no one at my side",
                               "Could it be", "I've waited too long", "Waiting for the lucky one", "My sweetheart, ",
                               "where are you?", "I need someone to spend time with", "To give and share all my love",
                               "Back in bed", "It's 3 AM ", "with no one at my side", "It gets real cold", "Because these blankets",
                               "Will never warm my heart", "--End of Song--"};

        while(running){
            lyrics = lyricarray[i];
            try{
                TextAnimation();
                
                Thread.sleep(16000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(5000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(9000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(4000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(4000);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(4500);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(1500);
                lyrics = lyricarray[i];
                TextAnimation();
                
                Thread.sleep(1700);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(4400);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(8300);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(4500);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(1500);
                lyrics = lyricarray[i];
                TextAnimation();
                
                Thread.sleep(5800);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(4200);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(1700);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                i = 6;
                
                Thread.sleep(7200);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(1500);
                lyrics = lyricarray[i];
                TextAnimation();
                
                Thread.sleep(1700);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(4400);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                i = 6;
                
                Thread.sleep(8300);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(1500);
                lyrics = lyricarray[i];
                TextAnimation();
                
                Thread.sleep(1700);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(4400);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                i = 6;
                
                Thread.sleep(8300);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(1500);
                lyrics = lyricarray[i];
                TextAnimation();
                
                Thread.sleep(1700);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                
                Thread.sleep(4400);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                i = 16;

                Thread.sleep(8500);
                lyrics = lyricarray[i];
                System.out.println();
                TextAnimation();
                Thread.sleep(5000);
                System.out.println();
                running = false;
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
