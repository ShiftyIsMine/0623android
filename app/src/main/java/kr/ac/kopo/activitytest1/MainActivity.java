package kr.ac.kopo.activitytest1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnMain = findViewById(R.id.btn_main);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setTitle("명화 선호도 투표");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (View v, WindowInsetsCompat insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final int voteCount[] = new int[9];
        for (int i=0; i < voteCount.length; i++){
            voteCount[i] = 0;
        }

        ImageView imgv[] = new ImageView[9];
        int imgvId[] = {R.id.imv0, R.id.imv1, R.id.imv2, R.id.imv3, R.id.imv4, R.id.imv5, R.id.imv6, R.id.imv7, R.id.imv8};
        final String imgName[] = {"웅남", "어바웃", "오토오", "서부전선",
                "미니언즈", "오펜하이머", "범죄도시", "피아노 앞의 소녀들", "엘리멘탈"};

        for (int i = 0; i < imgv.length; i++) {
            final int i
        }
        for (int i = 0; i < imgv.length; i++) {
            final int index;
            index = i;

            imgv[index] = findViewById(imgvId[index]);
            imgv[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    voteCount[index]++;
                    Toast.makeText(getApplicationContext(),
                            imgName[index] + ": 총 " + voteCount[index] + "표",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}