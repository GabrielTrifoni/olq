package olq.model;

public class Song {
    String name;
    String lyrics;

    public Song(String name, String lyrics) {
        this.name = name;
        this.lyrics = lyrics;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", lyrics='" + lyrics + '\'' +
                '}';
    }
}
