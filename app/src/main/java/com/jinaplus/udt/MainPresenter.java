package com.jinaplus.udt;

import android.content.Context;

import com.jinaplus.udt.model.Card;

import java.util.ArrayList;

/**
 * Created by jinaplus on 2017. 2. 8..
 */

public class MainPresenter {

    private Context context;

    public MainPresenter(Context context) {
        this.context = context;
    }

    private String updateCardMoney(Card card) {
        int accumulatedMoney = card.getAccumulatedMoney();
        int cardBenefitLevel = 0;
        for (int i : card.getCardBenefit().keySet()) {
            if (accumulatedMoney <= i) {
                cardBenefitLevel = i;
                break;
            }
        }
        return String.format(context.getString(R.string.card_money), accumulatedMoney, cardBenefitLevel);
    }

    private Card showInputDialog(Card card) {
        
        return card;
    }
}
