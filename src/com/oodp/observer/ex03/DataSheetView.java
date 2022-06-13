package com.oodp.observer.ex03;

import java.util.List;

public class DataSheetView implements Observer {

    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    @Override
    public void update() {
        // 점수 조회
        List<Integer> record = scoreRecord.getScores();

        // 조회된 점수를 viewCount 만큼 출력
        displayScores(record, viewCount);
    }

    private void displayScores(List<Integer> record, int viewCount) {
        // 전달된 viewCount만큼 출력
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.println(record.get(i) + " ");
        }
        System.out.println();
    }
}
