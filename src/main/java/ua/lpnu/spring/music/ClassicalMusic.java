package ua.lpnu.spring.music;

public class ClassicalMusic implements Music
{
    @Override
    public String playMusic() {
        return "classical music is playing...";
    }
}