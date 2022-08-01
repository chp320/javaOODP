package com.tuning.story02;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 시스템 환경 변수 관련 메서드 확인
 * JVM에서 사용 가능한 설정 = 속성(property)값, 환경(environment)값
 * 속성 - jvm에서 지정된 값, 환경 - 장비(서버)에 지정되어 있는 값
 */
public class GetEnv {
    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();
        Set key = envMap.keySet();
        Iterator it = key.iterator();
        while (it.hasNext()) {
            String curKey = it.next().toString();
            // 이거... 안되는디? -_-;; 왜 안될까..;;
//            System.out.format("%s = %s \n", curKey, envMap.get(envMap));
        }
    }
}
