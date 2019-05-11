package com.dtdx.demo1;

/**
 * @ClassName MediaAdapter
 * @Description TODO
 * @Date 2019/5/11 18:39
 * @Version 1.0
 **/
public class MediaAdapter implements MediaPlayer{

    /**
     * 高级播放器组件
     */
    AdvancedMediaPlayer advancedMusicPlayer;

    /**
     * 有参构造
     * @param audioType
     */
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
