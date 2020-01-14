package data;

public class CD {
    private String title;
    private String artist;
    private int numberofTracks;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public CD(String title, String artist, int numberofTracks, int playingTime, String comment) {
        this.title = title;
        this.artist = artist;
        this.numberofTracks = numberofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public static void main(String[] args) {

    }
}
