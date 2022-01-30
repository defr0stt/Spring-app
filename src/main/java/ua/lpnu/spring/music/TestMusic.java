package ua.lpnu.spring.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic
{
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.getMusicList();

        context.close();
    }
}