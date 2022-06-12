package com.oodp.observer.ex01;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        // 3개씩 출력
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);

        // ScoreRecord 설정
        scoreRecord.setDataSheetView(dataSheetView);

        for (int index = 1; index <= 5; index++) {
            int score = index*10;
            System.out.println("Adding " + score);

            // 10~50 추가
            scoreRecord.addScore(score);

        }
    }
}
