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

    }

    @Override
    public void connect() {

    }

    @Override
    public void meet() {

    }

    @Override
    public void starVoicemail() {

    }

    @Override
    public void touch() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void selectSongs() {

    }

    @Override
    public void turnOnDevice() {

    }

    @Override
    public void turnOffDevice() {

    }
}