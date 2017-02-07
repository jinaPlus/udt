package com.jinaplus.udt.model;

import java.util.Date;
import java.util.Map;

/**
 * Created by jinaplus on 2017. 2. 8..
 */

public class Card {
    String name;                             // 카드 이름
    Date registerDate;                       // 등록일
    Date unregisterDate;                     // 해지일
    Map<Integer, String> cardBenefit;     // 실적 등급 (필요 도달액, 혜택 내용)
    int accumulatedMoney;                    // 사용 누적액
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getUnregisterDate() {
        return unregisterDate;
    }

    public void setUnregisterDate(Date unregisterDate) {
        this.unregisterDate = unregisterDate;
    }

    public Map<Integer, String> getCardBenefit() {
        return cardBenefit;
    }

    public void setCardBenefit(Map<Integer, String> cardBenefit) {
        this.cardBenefit = cardBenefit;
    }

    public int getAccumulatedMoney() {
        return accumulatedMoney;
    }

    public void setAccumulatedMoney(int accumulatedMoney) {
        this.accumulatedMoney = accumulatedMoney;
    }

}
