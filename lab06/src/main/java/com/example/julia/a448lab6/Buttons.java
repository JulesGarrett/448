package com.example.julia.a448lab6;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
public class Buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        Button button =(Button)(findViewById(R.id.button));
        Button button2 =(Button)(findViewById(R.id.button2));
        Button button3 =(Button)(findViewById(R.id.button3));
        Button button4 =(Button)(findViewById(R.id.button4));
        Button button5 =(Button)(findViewById(R.id.button5));
        final TextView textView=(TextView)(findViewById(R.id.textView));

        textView.setTextSize(16);


        button.setOnClickListener(new View.OnClickListener(){
            int colorchange=0;
            @Override
            public void onClick(View v){
                colorchange++;
                if(colorchange%7==1) {
                    textView.setTextColor(Color.RED);
                }
                else if(colorchange%7==2){
                    textView.setTextColor(Color.rgb(255,165,0));
                }
                else if(colorchange%7==3){
                    textView.setTextColor(Color.YELLOW);
                }
                else if(colorchange%7==4){
                    textView.setTextColor(Color.GREEN);
                }
                else if(colorchange%7==5){
                    textView.setTextColor(Color.BLUE);
                }
                else if(colorchange%7==6){
                    textView.setTextColor(Color.rgb(128,0,128));
                }
                else if(colorchange%7==0){
                    textView.setTextColor(Color.MAGENTA);
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setTextSize(20);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setTextSize(12);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            int textmessage=0;
            @Override
            public void onClick(View v){
                textmessage++;
                if(textmessage%3==1){
                    textView.setText("Android Studio is OK");
                }
                else if(textmessage%3==2){
                    textView.setText("Android Studio is GREAT!");
                }
                else if(textmessage%3==0){
                    textView.setText("Android Studio sucks");
                }

            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    textView.setText("Android Studio sucks");
                    textView.setTextSize(16);
                    textView.setTextColor(Color.BLACK);
            }

        });


    }
}
