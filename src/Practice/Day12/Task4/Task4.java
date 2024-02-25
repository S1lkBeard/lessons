package Practice.Day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersA = new ArrayList<>();
        membersA.add("Q");
        membersA.add("W");
        membersA.add("E");

        List<String> membersB = new ArrayList<>();
        membersB.add("Z");
        membersB.add("X");

        MusicBand musicBand1 = new MusicBand("Rammstein", 1995, membersA);
        MusicBand musicBand2 = new MusicBand("New Rammstein", 2024, membersB);

        musicBand1.printMembers();
        musicBand2.printMembers();

        transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }

    public static MusicBand transferMembers(MusicBand musicBandA, MusicBand musicBandB) {
        for (String member : musicBandA.getNameOfMember()) {
            musicBandB.getNameOfMember().add(member);
        }
        musicBandA.getNameOfMember().clear();
        return musicBandB;
    }
}