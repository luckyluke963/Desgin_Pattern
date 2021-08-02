package Proxy_Pattern;

public class Main {
    public static void main(String[] args) {
        MediaFile mediaFile = new ProxyMediaFile("Anime.mp4");
        mediaFile.printName();
        mediaFile.printName();
        
    }
}