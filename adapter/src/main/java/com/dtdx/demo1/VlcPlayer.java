package com.dtdx.demo1;

/**
 * @ClassName VlcPlayer
 * @Description 播放vlc格式
 * @Date 2019/5/11 18:36
 * @Version 1.0
 **/
public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //什么也不做
    }
}
