package com.kh.chapter2.set.vo;

import java.util.Objects;

public class Music implements Comparable<Music> {		//221206 6교시,	7교시
	
	private String title;
	
	private String artist;
	
	private int ranking;
	
	
	public Music() {					//기본생성자 단축키 ctrl space
	}
	
	
	public Music(String title, String artist, int ranking) {
		this.title = title;
		this.artist = artist;
		this.ranking = ranking;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + ", ranking=" + ranking + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(artist, ranking, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(artist, other.artist) && ranking == other.ranking && Objects.equals(title, other.title);
	}


	@Override
	public int compareTo(Music o) {				// 221206 7교시
		if(this.ranking == o.ranking) {
			return this.artist.compareTo(o.artist);
		} else {
			return (this.ranking > o.ranking) ? 1 : -1;
		}
	}
	
	
	
	
}
