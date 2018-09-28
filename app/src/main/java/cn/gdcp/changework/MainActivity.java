package cn.gdcp.changework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import static java.lang.System.currentTimeMillis;

public class MainActivity extends AppCompatActivity {

    private final String Tag="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(Tag,"onCreate");
        setContentView(R.layout.activity_main);
    }
    public void click_b(View v){
        Intent intent=new Intent(getApplication(),MainActivity_b.class);
        startActivity(intent);
    }

    private long firstTime=0;

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                long secondTime= currentTimeMillis();
                if(secondTime-firstTime>2000){
                    Toast.makeText(MainActivity.this,"再按一次退出程序", Toast.LENGTH_LONG).show();
                    firstTime=secondTime;
                    return true;
                }else{
                    System.exit(0);
                }
                break;
        }
        return super.onKeyUp(keyCode, event);
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
