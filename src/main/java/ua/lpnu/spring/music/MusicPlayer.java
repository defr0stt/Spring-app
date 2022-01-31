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
        System.out.println();
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

    public void initialization(){
        System.out.println();
        System.out.print("Initializing process");
        for(int i=0; i<3;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
    }

    public void destroying(){
        System.out.print("Destroying process");
        for(int i=0; i<3;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println();
    }
}