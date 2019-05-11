package com.dtdx.demo1;

/**
 * @ClassName Mp4Player
 * @Description 播放MP4格式
 * @Date 2019/5/11 18:37
 * @Version 1.0
 **/
public class Mp4Player implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        //什么也不做
    }

    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: "+ fileName);
    }
}
