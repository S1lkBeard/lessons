package Practice.Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersA = new ArrayList<>();
        membersA.add(new MusicArtist("Q", 1990));
        membersA.add(new MusicArtist("W", 1995));
        membersA.add(new MusicArtist("E", 2000));

        List<MusicArtist> membersB = new ArrayList<>();
        membersB.add(new MusicArtist("Z", 2005));
        membersB.add(new MusicArtist("X", 2001));

        MusicBand musicBand1 = new MusicBand("Rammstein", 1990, membersA);
        MusicBand musicBand2 = new MusicBand("New Rammstein", 2024, membersB);

        musicBand1.printMembers();
        musicBand2.printMembers();

        transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }

    public static MusicBand transferMembers(MusicBand musicBandA, MusicBand musicBandB) {
        for (MusicArtist member : musicBandA.getNameOfMember()) {
            musicBandB.getNameOfMember().add(member);
        }
        musicBandA.getNameOfMember().clear();
        return musicBandB;
    }
}
