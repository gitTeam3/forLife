package com.gitTeam3.forLife.pswMonitor.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import com.gitTeam3.forLife.pswMonitor.R;
import com.gitTeam3.forLife.pswMonitor.service.floatService;

import java.io.Serializable;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        startCustomService();
    }
    public class myview extends LinearLayout
    {
        public  myview(Context context)
        {
            super(context);
            Button btn = new Button(context);
        btn.setLayoutParams(new WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT));
        btn.setText("test");
            this.addView(btn);

        }
    }
    private void startCustomService()
    {
        myview view = new myview(getApplicationContext());
        //floatService.mLayout  = view;
        Intent intent = new Intent(this, floatService.class);
       // Bundle mBundle = new Bundle();

       // mBundle.putSerializable("view",view);
        startService(intent);
    }
}
