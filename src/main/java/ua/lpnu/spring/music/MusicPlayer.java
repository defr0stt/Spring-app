package ua.lpnu.spring.music;

public class MusicPlayer
{
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String getMusic() {
        return music.playMusic();
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}