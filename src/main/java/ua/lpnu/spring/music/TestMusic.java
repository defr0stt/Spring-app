package ua.lpnu.spring.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic
{
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("music", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        System.out.println("\n > " + musicPlayer.getMusic());

        context.close();
    }
}