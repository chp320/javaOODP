package com.gof.structural.adapter.internet;

/**
 * 개요: AudioPlayer는 'mp3' 파일 형식만 지원하고 있다.
 *      'mp4', 'vlc' 파일형식도 지원해야 하는 needs가 생겼다.
 *      다만, 'mp4', 'vlc'는 기존에 구현된 다른 interface가 있어서 "adapter" 클래스를 통해 연동이 필요하다.
 * -> AudioPlayer를 호출하는 client단에서는 사용할 'mp4', 'vlc' 만 단순 추가하면 된다.
 * 방향: AudioPlayer 클래스에서는 'mp4', 'vlc' 포맷은 MediaAdapter에서 처리할 수 있도록 위임한다.
 *      MediaAdapter 클래스에서는 처리할 파일 형식에 따라 play 메서드를 실행한다.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");

    }
}
