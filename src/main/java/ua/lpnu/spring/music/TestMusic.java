package ua.lpnu.spring.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic
{
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer1.getMusicList();
        System.out.println(musicPlayer1 == musicPlayer2);

        context.close();
    }
}