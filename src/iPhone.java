import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import comportamentos.AparelhoTelefonico;
import comportamentos.NavegarNaInternet;
import comportamentos.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegarNaInternet {

    private boolean isPlaying;
    private String songName;
    private ArrayList<String> playlist = new ArrayList<>(
        List.of("The Beatles | A Day In The Life",
        "Michael Jackson | Billie Jean",
        "Elvis Presley | Suspicious Minds",
        "Queen | Bohemian Rhapsody",
        "Madonna | Papa Don\'t Preach",
        "The Rolling Stones | Paint It, Black",    
        "Pink Floyd | Money",
        "Led Zeppelin | Stairway to Heaven",
        "Elton John | Bennie and the Jets",
        "U2 | With or Without You")
    );
    private List<String> pages = new ArrayList<String>();

    public iPhone() {
        super();
    }

    // Reprodutor Musical

    @Override
    public void play() {
        // Starts a random song
        isPlaying = true;
        chooseRandomSong();
        presentSong();
    }

    @Override
    public void pause() {
        // Pause the song
        isPlaying = false;
        System.out.println("Song paused.");
    }

    @Override
    public void selectSong(String song) {
        // Change the song
        songName = song;
        presentSong();
    }

    private void chooseRandomSong(){
        Random random = new Random();
        int index = random.nextInt(playlist.size()-1);
        songName = playlist.get(index);
    }

    private void presentSong() {
        // Present the song playing
        System.out.println("Now playing " + songName);
    }


    // Phone

    @Override
    public void call(int phone) {
        // Call a phone number
        System.out.println("Calling " + phone);
    }

    @Override
    public void answer() {
        // Answer a call
        System.out.println("*Ring ring*\nAnswering call...");
    }

    @Override
    public void voiceMail() {
        // Record new voice mail
        System.out.println("Hey, leave your message after the beep.");
    }

    // Internet 

    @Override
    public void displayPage(String pageName) {
        // Display web page
        System.out.println("Displaying " + pageName);
    }

    @Override
    public void addNewTab(String pageName) {
        // Add new page
        pages.add(pageName);
        System.out.println("Opening " + pageName);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing...");
    }

    @Override
    public void seeOpenedTabs() {
        // See all pages opened
        System.out.println("Opened tabs: ");
        for(String page : pages){
            System.out.println(page);
        }
    }

    @Override
    public void closeTab(String pageName) {
        // Close tab
        int index = pages.indexOf(pageName); 
        if( index != -1){
            pages.remove(index);
            System.out.println(pageName + " closed.");
        } else {
            System.out.println("This tab is not opened");
        }
    }


}


