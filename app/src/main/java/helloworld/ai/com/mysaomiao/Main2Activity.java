package helloworld.ai.com.mysaomiao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        findViewById(R.id.open_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAc(0);
            }
        });
        findViewById(R.id.open_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAc(1);
            }
        });
    }


    public void startAc(int type){
        Intent intent = new Intent(this,CaptureActivity.class);
        intent.putExtra(CaptureActivity.CAMERAKEY, type);
        startActivity(intent);
    }
}
