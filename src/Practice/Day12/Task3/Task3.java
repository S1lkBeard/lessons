package Practice.Day12.Task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand01 = new MusicBand("Rammstein01", 1995);
        MusicBand musicBand02 = new MusicBand("Rammstein02", 1996);
        MusicBand musicBand03 = new MusicBand("Rammstein03", 1997);
        MusicBand musicBand04 = new MusicBand("Rammstein04", 1998);
        MusicBand musicBand05 = new MusicBand("Rammstein05", 1999);
        MusicBand musicBand06 = new MusicBand("Rammstein06", 2000);
        MusicBand musicBand07 = new MusicBand("Rammstein07", 2001);
        MusicBand musicBand08 = new MusicBand("Rammstein08", 2002);
        MusicBand musicBand09 = new MusicBand("Rammstein09", 2003);
        MusicBand musicBand10 = new MusicBand("Rammstein10", 2004);

        List<MusicBand> listOfMusicBands = new ArrayList<>(10);
        listOfMusicBands.add(musicBand01);
        listOfMusicBands.add(musicBand02);
        listOfMusicBands.add(musicBand03);
        listOfMusicBands.add(musicBand04);
        listOfMusicBands.add(musicBand05);
        listOfMusicBands.add(musicBand06);
        listOfMusicBands.add(musicBand07);
        listOfMusicBands.add(musicBand08);
        listOfMusicBands.add(musicBand09);
        listOfMusicBands.add(musicBand10);

        List<MusicBand> listOfBandsAfter2000 = groupsAfter2000(listOfMusicBands);
        System.out.println("Список групп, основанных после 2000 года: " + listOfBandsAfter2000);

//        Random r1 = new Random();
//        for (int i = listOfBandsAfter2000.size() - 1; i >= 1; i--) {
//            Collections.swap(listOfBandsAfter2000, i, r1.nextInt(i + 1));
//
//        }
        int seedValue = 10;
        Collections.shuffle(listOfBandsAfter2000, new Random(seedValue));
        System.out.println("Список групп, основанных после 2000 года: " + listOfBandsAfter2000);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> listOfBandsAfter2000 = new ArrayList<>();
        for (MusicBand list : bands) {
            if (list.getYear() > 2000) {
                listOfBandsAfter2000.add(list);
            }
        }
        return listOfBandsAfter2000;
    }
}
