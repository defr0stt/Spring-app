package ua.lpnu.spring.music;

public class JazzMusic implements Music
{
    @Override
    public String playMusic() {
        return "jazz music is playing...";
    }
}