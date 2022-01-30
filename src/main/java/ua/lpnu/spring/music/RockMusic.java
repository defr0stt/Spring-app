package ua.lpnu.spring.music;

public class RockMusic implements Music
{
    @Override
    public String playMusic() {
        return "rock music is playing...";
    }
}