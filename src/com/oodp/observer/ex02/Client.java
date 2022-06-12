package com.oodp.observer.ex02;

public class Client {
    public static void main(String[] args) {
        // 객체 생성
        ScoreRecord scoreRecord = new ScoreRecord();
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        // 연결
        scoreRecord.setMinMaxView(minMaxView);

        // 성적 등록
        for (int i = 1; i <= 5; i++) {
            int score = i*10 ;
            System.out.println("Adding " + score);

            // 값 출력
            scoreRecord.addScore(score);
        }
    }
}
