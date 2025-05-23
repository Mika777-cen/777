package com.example.animal;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tvWelcome;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化视图
        tvWelcome = findViewById(R.id.tv_welcome);
        btnLogout = findViewById(R.id.btn_logout);

        // 获取用户名
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        // 显示欢迎信息
        tvWelcome.setText("欢迎回来，" + username);

        // 退出登录按钮点击事件
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "已退出登录", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}