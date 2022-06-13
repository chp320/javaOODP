package com.oodp.observer.ex03;

public class Client {
    public static void main(String[] args) {
        // 객체 생성
        ScoreRecord scoreRecord = new ScoreRecord();
        // DataSheetView 3개, 5개..
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        // 최소/최대 값..
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attach(dataSheetView3);
        scoreRecord.attach(dataSheetView5);
        scoreRecord.attach(minMaxView);

        for (int i = 1; i <= 5; i++) {
            int score = i * 10 ;
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        }
    }
}
