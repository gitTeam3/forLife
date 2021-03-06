package com.gitteam3.forlife.psdMonitor.service;

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

/**
 * Function:
 * this class can show view for floatview,but you must take notice of instance static mView.
 * example:
 * floatViewService.mView = mView;(this last mView is yourself need show View Object.
 * And you need to add <Service ></Service> node in the AndroidManifest.xml .
 * Author: MathBoy
 * Date: 14-9-8.
 */
public class floatViewService extends Service {

    private final String INFO_FLOAT_SERVICE = "info_float_service";

    private WindowManager mWindowManage = null;
    private WindowManager.LayoutParams wmParams = null;
    public static View mView = null;
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(INFO_FLOAT_SERVICE,"onBind...");
        return null;
    }
    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.i(INFO_FLOAT_SERVICE,"onCreating...");
        creatFloatView();
        Log.i(INFO_FLOAT_SERVICE,"onCreated...");
    }

    private void creatFloatView() {
        //*****不清楚这里的机制。
        mWindowManage = (WindowManager)getApplication().getSystemService(Context.WINDOW_SERVICE);
        //*****需要知道这个类的作用。
        wmParams = new WindowManager.LayoutParams();

        //初始化，LayoutParams信息。
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

        if (null != mView)
        {
            mWindowManage.addView(mView,wmParams);
            Log.i(INFO_FLOAT_SERVICE,"floatView setup success!");
        }
        else
        {
            Log.i(INFO_FLOAT_SERVICE,"floatView setup faild,floatView maybe is null");
        }
    }
    @Override
    public void onDestroy()
    {
        if (null != mView)
        {
            mWindowManage.removeView(mView);
            Log.i(INFO_FLOAT_SERVICE,"floatView remove is success");
        }
        else
        {
            Log.i(INFO_FLOAT_SERVICE,"floatView is null,don't remove");
        }
    }
}
