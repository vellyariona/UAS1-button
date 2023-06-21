package com.example.uas1_button;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {

    private int firstColor;
    private int secondColor;
    private boolean isClicked = false;

    public CustomButton(@NonNull Context context) {
        super(context);
        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        firstColor = Color.CYAN;
        secondColor = Color.YELLOW;
        setBackgroundColor(firstColor);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    setBackgroundColor(firstColor);
                    isClicked = false;
                } else {
                    setBackgroundColor(secondColor);
                    isClicked = true;
                }
            }
        });
    }
}