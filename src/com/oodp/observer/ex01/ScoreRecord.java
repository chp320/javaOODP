package com.oodp.observer.ex01;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {

    private List<Integer> scores = new ArrayList<Integer>();
    private DataSheetView dataSheetView;

    public void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetView = dataSheetView;
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }

    // 새로운 점수 추가
    public void addScore(int score) {
        scores.add(score);      // scores 목록에 전달된 score 추가
        dataSheetView.update(); // scores 변경됨
    }
}
