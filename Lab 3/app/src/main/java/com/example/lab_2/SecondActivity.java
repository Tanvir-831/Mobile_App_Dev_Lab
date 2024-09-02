package com.example.lab_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    public class Snacks{
        List<String>getInfo(String group){
            List<String>info= new ArrayList<>();
            if (group.equals("Soft Drinks")) {
                info.add("Recommended Drinks:");
                info.add("\nCoca Cola");
                info.add("\nSprite");
                info.add("\nMirinda");
                info.add("\n7up");
                info.add("\nMounten Due");
                info.add("\nMojo");
                info.add("\nTwing");
                info.add("\nPepsi");
                info.add("\nRC cola");
            }

            if (group.equals("Chips")) {
                info.add("Recommended Chips:");
                info.add("\nAlooz");
                info.add("\nSun Chips");
                info.add("\nPotato Crackers");
                info.add("\nMr.Twist");
                info.add("\nLays");
                info.add("\nPotato");
            }

            if (group.equals("Cake")) {
                info.add("Recommended Cakes:");
                info.add("\nVanila Flavour");
                info.add("\nChocklate Flavour");
                info.add("\nStrawberry Flavour");
            }

            return info;
        }
    }
    private Snacks expert= new Snacks();
    public static final String EXTRA_MESSAGE="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        TextView info2 =(TextView)  findViewById(R.id.infoss);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView)findViewById(R.id.text);
        List<String> infoList =expert.getInfo(messageText);
        StringBuilder infoFormatted = new StringBuilder();
        for(String inf : infoList)
        {
            infoFormatted.append(inf).append('\n');
        }
        info2.setText("Products");
        messageView .setText(infoFormatted);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}