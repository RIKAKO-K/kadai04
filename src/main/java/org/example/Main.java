package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //歌手をリストにセット
        List<Singer> singerList = new ArrayList<>();
        singerList.add(new Singer("Taylor Swift", "woman",33));
        singerList.add(new Singer("Bruno Mars", "man",38));
        singerList.add(new Singer("Justin Bieber", "man",29));
        singerList.add(new Singer("Ariana Grande", "woman",30));
        singerList.add(new Singer("Billie Eilish", "woman",21));
        singerList.add(new Singer("Mariah Carey", "woman",54));
        singerList.add(new Singer("Ed Sheeran", "man",32));

        //Filter
        List<Singer> resultFilter = singerList.stream()
                .filter(singer -> singer.getGender().equals("Woman"))
                .toList();

        //Sorted
        List<Singer> resultSorted = singerList.stream()
                .sorted(Comparator.comparingInt(Singer::getAge))
                .toList();

        //Filter&Sorted
        List<Singer> resultFilterSorted = singerList.stream()
                .filter(singer -> singer.getAge() >= 30)
                .sorted(Comparator.comparingInt(Singer::getAge))
                .toList();
    }
}