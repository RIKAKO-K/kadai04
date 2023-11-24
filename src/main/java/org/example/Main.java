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
        System.out.println("******女性歌手のみ表示(Filter)*******");
        List<Singer> resultFilter = singerList.stream()
                .filter(singer -> singer.getGender().equals("woman"))
                .toList();
        resultFilter.forEach(singer -> System.out.println(singer.getName()+" 【"+singer.getGender()+"】"));
        System.out.println();

        //Sorted
        System.out.println("******年齢順に並べ替え(Sorted)*******");
        List<Singer> resultSorted = singerList.stream()
                .sorted(Comparator.comparingInt(Singer::getAge))
                .toList();
        resultSorted.forEach(singer -> System.out.println(singer.getAge()+"歳 "+singer.getName()));
        System.out.println();

        //Filter&Sorted
        System.out.println("******30歳以上の歌手をアルファベット順に並べ替え(Filter & Sorted)*******");
        List<Singer> resultFilterSorted = singerList.stream()
                .filter(singer -> singer.getAge() >= 30)         //30歳以上
                .sorted(Comparator.comparing(Singer::getName))   //アルファベット順
                .toList();
        for (Singer singer : resultFilterSorted) {
            System.out.printf("%-15s %2d歳 【%s】\n", singer.getName(), singer.getAge(), singer.getGender());
        }
    }
}
