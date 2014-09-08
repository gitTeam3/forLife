package com.gitteam3.forlife.psdMonitor.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import com.gitteam3.forlife.psdMonitor.R;
import com.gitteam3.forlife.psdMonitor.service.floatViewService;

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
        floatViewService.mView = view;
        Intent intent = new Intent(this,floatViewService.class);
        // Bundle mBundle = new Bundle();

        // mBundle.putSerializable("view",view);
        startService(intent);
    }
}
