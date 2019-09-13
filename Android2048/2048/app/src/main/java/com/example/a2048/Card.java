package com.example.a2048;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

    private TextView lable;

    public Card(Context context) {
        super(context);

        lable = new TextView(getContext());
        lable.setTextSize(32);
        lable.setBackgroundColor(0x33ffffff);
        lable.setGravity(Gravity.CENTER);

        //布局参数，两个-1填满整个父级容器
        LayoutParams layoutParams =new LayoutParams(-1,-1);
        layoutParams.setMargins(10,10,0,0);
        addView(lable,layoutParams);

        setNum(0);
    }

    private int num = 0;

    public int getNum() {
        return num;
    }

    @SuppressLint("SetTextI18n")
    public void setNum(int num) {
        this.num = num;
        if (num <= 0) {
            lable.setText("");
        } else {
            lable.setText(num + "");
        }

    }


    public boolean equals(Card c) {
        return getNum() == c.getNum();
    }
}
