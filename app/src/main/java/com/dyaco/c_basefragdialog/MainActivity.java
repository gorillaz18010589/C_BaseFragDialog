package com.dyaco.c_basefragdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void dateDialogShow(){
        DateDialog.DateBuilder()
                .setContentView(R.layout.dialog)//设置 view
                .setCancelable(false) //对话框不可取消
                .setAlpha(1) // 透明度
                .setAutoDismiss(true) //是否禁用所有的点击事件
                .setGravity(Gravity.CENTER) //对话框的位置
                .setAnimation(R.style.BottomAnimStyle) // 添加动画
                .build()
                .setText(R.id.tv_dialog_message,"fefewfewfew")
                .show(getSupportFragmentManager(),"d1");
    }

    private void test() {
        BaseFragDialog.Builder()
                .setContentView(R.layout.dialog)
                .setCancelable(false)// 对话框不可取消
                .setAnimation(R.style.BottomAnimStyle)//动画
                .setGravity(Gravity.CENTER)//位置
                .setAutoDismiss(false) //是否禁用点击事件
                .build()
                .setText(R.id.tv_dialog_title, "我是标题")
                .setText(R.id.tv_dialog_message, "我是内容")
                .setListener(R.id.tv_dialog_cancel, new BaseFragDialog.OnListener() {
                    @Override
                    public void onClick(BaseFragDialog dialog, View view) {
                        dialog.dismiss();
                    }
                })
                .setListener(R.id.tv_dialog_confirm, new BaseFragDialog.OnListener() {
                    @Override
                    public void onClick(BaseFragDialog dialog, View view) {
                        dialog.dismiss();
                    }
                })
                .show(getSupportFragmentManager(), "");
    }

    public void show(View view) {
//        test();
        dateDialogShow();
    }
}