package com.oodp.observer.ex01;

import java.util.List;

public class DataSheetView {

    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    // 점수의 변경 관리
    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();        // 점수 조회
        displayScores(record, viewCount);                           // 조회된 점수를 viewCount 만큼 출력
    }

    private void displayScores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + " entries: ");
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.println(record.get(i));
        }
        System.out.println();
    }
}
