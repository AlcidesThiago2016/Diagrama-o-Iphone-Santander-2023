import dio.santander.com.BrowserTheInternet;
import dio.santander.com.Call;
import dio.santander.com.MusicPlayer;
import dio.santander.com.Start;

public class Iphone implements Start, MusicPlayer, Call, BrowserTheInternet {

    @Override
    public void openBrowser() {
        System.out.println("Open Browser!");
    }

    @Override
    public void displayPage() {
        System.out.println("Page displayed!");
    }

    @Override
    public void updatePage() {
        System.out.println("Update Page!");
    }

    @Override
    public void connect() {
        System.out.println("Phone making a call!");
    }

    @Override
    public void meet() {
        System.out.println("Answered call!");
    }

    @Override
    public void starVoicemail() {
        System.out.println("Voicemail box started!");
    }

    @Override
    public void touch() {
        System.out.println("Playing music!");
    }

    @Override
    public void pause() {
        System.out.println("Music paused!");
    }

    @Override
    public void selectSongs() {
        System.out.println("Selected music!");
    }

    @Override
    public void turnOnDevice() {
        System.out.println("Phone Connected!");
    }

    @Override
    public void turnOffDevice() {
        System.out.println("Phone Off!");
    }
}