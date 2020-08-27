package programmers._01_hash;

import java.util.HashMap;

public class 베스트엘범 {

    public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		HashMap<Integer, String> map_genre = new HashMap<Integer, String>();
		HashMap<Integer, Integer> map_plays = new HashMap<Integer, Integer>();
		HashMap<String, Integer> map_genre_plays = new HashMap<String, Integer>();
		for(int i = 0; i < genres.length; i++)
		{
			map_genre.put(i, genres[i]);
			map_plays.put(i, plays[i]);
			map_genre_plays.put(
				map_genre.get(i), 
				map_genre_plays.getOrDefault(map_genre.get(i), 0) + map_plays.get(i));
		}
        return answer;
    }
}