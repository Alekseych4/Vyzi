package ru.abityrienty.vyzi;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    //объявляем кнопки
    ImageButton imageButtonKfu;
    ImageButton imageButtonKai;
    ImageButton imageButtonKgmu;
    ImageButton imageButtonKgeu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = (Button) findViewById(R.id.btn_introduction);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListOfVyzi(btn);
            }
        });

        //находим кнопки по id
        imageButtonKfu = (ImageButton) findViewById(R.id.btn_1);
        imageButtonKai = (ImageButton) findViewById(R.id.btn_2);
        imageButtonKgmu = (ImageButton) findViewById(R.id.btn_3);
        imageButtonKgeu = (ImageButton) findViewById(R.id.btn_5);

        //создаем обработчик копок
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_1:
                        Intent intentKfu = new Intent(MainActivity.this, UniversityMainActivity.class);
                        intentKfu.putExtra("btn_1_id", id);
                        startActivity(intentKfu);
                        break;

                    case R.id.btn_2:
                        Intent intentKai = new Intent(MainActivity.this, UniversityMainActivity.class);
                        intentKai.putExtra("btn_2_id", id);
                        startActivity(intentKai);
                        break;

                    case R.id.btn_3:
                        Intent intentKgmu = new Intent(MainActivity.this, UniversityMainActivity.class);
                        intentKgmu.putExtra("btn_3_id", id);
                        startActivity(intentKgmu);
                        break;

                    case R.id.btn_5:
                        Intent intentKgeu = new Intent(MainActivity.this, UniversityMainActivity.class);
                        intentKgeu.putExtra("btn_5_id", id);
                        startActivity(intentKgeu);
                        break;
                }
            }
        };
        //присваиваем обаботчик каждой кнопке
        imageButtonKfu.setOnClickListener(onClickListener);
        imageButtonKai.setOnClickListener(onClickListener);
        imageButtonKgmu.setOnClickListener(onClickListener);
        imageButtonKgeu.setOnClickListener(onClickListener);

    }

    public void openListOfVyzi (View view) {
        Intent intent = new Intent(this, List_of_Vyzi_activity.class);
        startActivity(intent);
    }

}
