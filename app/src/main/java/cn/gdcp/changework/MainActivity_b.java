package cn.gdcp.changework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity_b extends AppCompatActivity {

    private final String Tag="MainActivity_b";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(Tag,"onCreate");
        setContentView(R.layout.activity_main_b);
        setTitle("MainActivity_b");
    }
    public void click_c(View v){
        Intent intent=new Intent(getApplication(),MainActivity_c.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(Tag,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(Tag,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(Tag,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(Tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(Tag,"onDestroy");
    }
}
