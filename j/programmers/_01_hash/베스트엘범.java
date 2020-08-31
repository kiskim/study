package programmers._01_hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class 베스트엘범 {

	// 노래의 id, play 수, 장르를 담는 class
	public static class Music implements Comparable<Music>{
		int id;
		int play;
		String genres;
		// 생성자
		public Music(int id, int play, String genres)
		{
			this.id = id;
			this.play = play;
			this.genres = genres;
		}
		// 확인 용 toString
		@Override
		public String toString() {
			return "ID :"+id+" - play:"+play+" - genres:"+genres;
		}
		// 비교
		@Override
		public int compareTo(Music o) {
			if(this.id == o.id)
				return 0;
			else
				// play 수가 많으면 앞으로
				return -(this.play - o.play);
		}
	}

	ArrayList<Integer> bestAlbum = new ArrayList<>();
	ArrayList<Music> songList = new ArrayList<>();
	HashMap<String, Integer> genreMap = new HashMap<>();
	HashMap<String, Integer> albumMap = new HashMap<>();

	public int [] solution(String[] genres, int[] plays) {
		int[] answer = {};
		// songList에 music 객체를, genreMap에 genre별 play 수 합산
		for(int i = 0;  i < genres.length; i++)
		{
			songList.add(new Music(i, plays[i], genres[i]));
			genreMap.put(genres[i], genreMap.getOrDefault(genres[i],0) + plays[i]);
		}
		// songList를 Coparator를 선언해 정렬
		Collections.sort(songList, new Comparator<Music>()
		{
			@Override
			public int compare(Music o1, Music o2) {
				// 장르가 같으면 MusicClass에 선언한 compareTo를 이용한 비교
				if(o1.genres.equals(o2.genres))
					return o1.compareTo(o2);
				// 장르가 다르면 장르 총 합을 비교
				else
					return -(genreMap.get(o1.genres) - genreMap.get(o2.genres));
			}
		});
		
		for(Music m : songList)
		{
			// albumMap에 장르가 들어간 수 카운트
			if(albumMap.getOrDefault(m.genres, 0) < 2)
			{
				//bestAlbum에 곡이 들어간 경우 albumMap에 카운트
				albumMap.put(m.genres, albumMap.getOrDefault(m.genres, 0)+1);
				bestAlbum.add(m.id);
			}
		}

		answer = new int[bestAlbum.size()];
		for(int i = 0; i < answer.length; i++)
			answer[i] = bestAlbum.get(i);
        return answer;
	}
	
	public static void main(String[] args) {
		String [] g = {"classic", "pop", "classic", "classic", "pop"};
		int [] p = {500, 600, 150, 800, 2500};
		베스트엘범 b = new 베스트엘범();
		int [] r = b.solution(g, p);
		for(int a : r)
			System.out.print(a+" ");
	}
}