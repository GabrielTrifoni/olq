package olq.main;

import olq.model.Song;
import olq.utils.Input;
import olq.utils.utilsSong;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Song> songList = utilsSong.initializeSongs();
        String guess;
        int rounds = 5;

        Random rand = new Random();
        for (int i = 0; i < rounds; i++) {
            System.out.println("ROUND " + (i+1) + "!!\n----------------------");
            int n = rand.nextInt(songList.size());

            System.out.println("Lyrics: \n" + songList.get(n).getLyrics());
            System.out.println("\n----------------------\nList of possible songs:\n");
            for (Song s: songList) {
                System.out.println(s.getName());
            }

            System.out.println("\nGuess the song:");
            guess = Input.scString();

            if(guess.equals(songList.get(n).getName())){
                System.out.println("Congratulations, you got it right!!\n");
            }
            else {
                System.out.println("Wrong. The correct song was: " + songList.get(n).getName() + "\n");
            }
        }
    }
}