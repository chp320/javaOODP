package com.oodp.observer.ex03;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<Integer>();

    // 복수 개의 DataSheetView - 성적 3개, 성적 5개 등 n개 출력을 위함
    private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>();
    private MinMaxView minMaxView;

    // DataSheetView 추가
    public void addDataSheetView(DataSheetView dataSheetView) {
        dataSheetViews.add(dataSheetView);
    }

    // MinMaxView 설정
    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    // 성적 등록
    public void addScore(int score) {
        scores.add(score);

        // 각 DataSheetView에 통보
        for (DataSheetView dataSheetView : dataSheetViews) {
            dataSheetView.update();
        }

        minMaxView.update();
    }

    public List<Integer> getScores() {
        return scores;
    }
}
