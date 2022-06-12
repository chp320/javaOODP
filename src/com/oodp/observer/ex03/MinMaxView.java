package com.oodp.observer.ex03;

import com.oodp.observer.ex02.ScoreRecord;

import java.util.Collections;
import java.util.List;

public class MinMaxView {

    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayMinMax(record);
    }

    private void displayMinMax(List<Integer> record) {
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("Min: " + min + " max: " + max);
    }
}
