package olq.utils;

import olq.model.Song;

import java.util.ArrayList;
import java.util.List;

public class utilsSong {
    public static List initializeSongs() {
        List<Song> songList = new ArrayList<>();

        Song s1 = new Song("Serenity - Lionheart", "Like a lion we fight\nTogether we will die\nFor the glory of our god\n" +
                "Justice on our side\nThis cross will lead the light\nFollow Richard Lionheart\n\nOpen your eyes, you will see\n" +
                "Jerusalem unites us against Saladin\n\nLike a lion we fight\nTogether we will die\nFor the glory of our god\nJustice on our side\n" +
                "This cross will lead the light\nFollow Richard Lionheart");
        Song s2 = new Song("Dragonforce - Through the Fire and Flames", "Now here we stand with their blood on our hands\n" +
                "We fought so hard, now can we understand?\n" +
                "I'll break the seal of this curse if I possibly can\n" +
                "For freedom of every man\n\n" +
                "So far away, we wait for the day\n" +
                "For the lives all so wasted and gone\n" +
                "We feel the pain of a lifetime lost in a thousand days\n" +
                "Through the fire and the flames, we carry on");
        Song s3 = new Song("Sleeping With Sirens - If You Can't Hang", "I don't wanna take your precious time\n" +
                "'Cause you're such a pretty, pretty, pretty, pretty face\n" +
                "But you turned into a pretty big waste of my time\n" +
                "I don't wanna take up all your time\n" +
                "'Cause you're such a pretty, pretty, pretty, pretty face\n" +
                "But you turned into a pretty big waste of my time\n\n" +
                "You're the lowest type\n" +
                "You're the lowest");
        Song s4 = new Song("Set It Off - Horrible Kids", "Watch your step around these words\n" +
                "'Cause they're gonna get you, they're gonna get you in the end\n" +
                "I swear it's not a disease\n" +
                "It's just a game of pretend\n" +
                "A game of pretend\n" +
                "Why is it me they're after?\n" +
                "Couldn't they pick another one?\n" +
                "Some day I'll spit their laughter\n" +
                "And bite their tongue");
        Song s5 = new Song("Rhapsody of Fire - Emerald Sword", "For the king for the land for the mountains\n" +
                "For the green valleys where dragons fly\n" +
                "For the glory the power to win the black lord\n" +
                "I will search for the emerald sword\n" +
                "Only a warrior with a clear heart\n" +
                "Could have the honour to be kissed by the sun\n" +
                "Yes, I am that warrior I followed my way\n" +
                "Led by the force of cosmic soul I can reach the sword\n" +
                "On the way to the glory I'll honour my sword\n" +
                "To serve right ideas and justice for all");

        songList.add(s1);
        songList.add(s2);
        songList.add(s3);
        songList.add(s4);
        songList.add(s5);

        return songList;
    }

}
