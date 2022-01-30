package ua.lpnu.spring.music;

import java.util.List;

public class MusicPlayer
{
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer(List musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(){}

    public void getMusicList() {
        for(Music music: musicList){
            System.out.println(music.playMusic() + "  volume : " + this.getVolume());
        }
    }

    public void setMusicList(List musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}