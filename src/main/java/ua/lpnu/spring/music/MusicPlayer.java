package ua.lpnu.spring.music;

public class MusicPlayer
{
    private Music music;
    private String name;
    private int volume;

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

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){}

    public String getMusic() {
        return music.playMusic();
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}