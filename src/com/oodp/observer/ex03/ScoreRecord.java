package com.oodp.observer.ex03;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {

    private List<Integer> scores = new ArrayList<Integer>();

    /**
     * @param score
     * 파라미터로 전달받은 score를 리스트에 저장 후 변경 사항을 Subject를 통해 Observer로 전달한다.
     */
    public void addScore(int score) {
        scores.add(score);

        notifyObservers();
    }

    public List<Integer> getScores() {
        return scores;
    }
}
