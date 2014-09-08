package com.gitTeam3.forLife.pswMonitor.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.gitTeam3.forLife.pswMonitor.loger.logName;

/**
 * Function:
 * Author: MathBoy
 * Date: 14-9-6.
 */
public class floatService extends Service {

    private final String INFO_SERVICE = "info_service:";
    private WindowManager mWindowManager;
    private WindowManager.LayoutParams wmParams;

    public static  View mLayout;//浮动窗口需要显示的LinearLayout。

    @Override
    public IBinder onBind(Intent intent)
    {
        Log.i(INFO_SERVICE,"onBind()。。。");
        return null;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.i(INFO_SERVICE,"onCreate starting...");
        createFloatView();
        Log.i(INFO_SERVICE,"onCreate ended...");
    }

    private void createFloatView() {

        // *********这里得到WindowManager实例的机制不是很清楚。
        mWindowManager = (WindowManager)getApplication().getSystemService(Context.WINDOW_SERVICE);
        //**********对于LayoutParams这个类需要深入。
        wmParams = new WindowManager.LayoutParams();

        //设置window type
        wmParams.type = WindowManager.LayoutParams.TYPE_PHONE;
        //设置图片格式，效果为背景透明
        wmParams.format = PixelFormat.RGBA_8888;
        //设置浮动窗口不可聚焦（实现操作除浮动窗口外的其他可见窗口的操作）
        wmParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        //调整悬浮窗显示的停靠位置为左侧置顶
        wmParams.gravity = Gravity.LEFT | Gravity.TOP;
        // 以屏幕左上角为原点，设置x、y初始值，相对于gravity
        wmParams.x = 0;
        wmParams.y = 0;
        //设置悬浮窗口长宽数据
        wmParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        wmParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        if (null != mLayout)
        {

        mWindowManager.addView(mLayout,wmParams);
            Log.i(INFO_SERVICE,"setup view success!");
        }else
        {
            Log.i(INFO_SERVICE,"warn:view is null!!!");
        }

    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        if(mLayout != null)
        {
            //移除悬浮窗口
            mWindowManager.removeView(mLayout);
            Log.i(INFO_SERVICE,"destroy view success");
        }
    }

}
