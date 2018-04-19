package com.flow.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//// TODO: 2018/4/19 github项目链接 https://github.com/xiangcman/LayoutManager-FlowLayout
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text_flow;
    private TextView photo_flow;
    private TextView diff_height_text_flow;
    private TextView product_btn;
    private TextView suspension_product_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        findViewById(R.id.text_flow).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, TextFlowActivity.class));
//            }
//        });
//        findViewById(R.id.photo_flow).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, PhotoFlowActivity.class));
//            }
//        });
//        findViewById(R.id.diff_height_text_flow).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, DiffHeightTextFlowActivity.class));
//            }
//        });
//        findViewById(R.id.product_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, ProductActivity.class));
//            }
//        });
//        findViewById(R.id.suspension_product_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, SuspensionProductActivity.class));
//            }
//        });


        initView();


    }

    private void initView() {
        //文字式FlowLayout
        text_flow = (TextView) findViewById(R.id.text_flow);
        //图片式FlowLayout
        photo_flow = (TextView) findViewById(R.id.photo_flow);
        //不同高度文字式FlowLayout
        diff_height_text_flow = (TextView) findViewById(R.id.diff_height_text_flow);
        //商品属性界面
        product_btn = (TextView) findViewById(R.id.product_btn);
        //悬浮商品属性界面
        suspension_product_btn = (TextView) findViewById(R.id.suspension_product_btn);
        text_flow.setOnClickListener(this);
        photo_flow.setOnClickListener(this);
        diff_height_text_flow.setOnClickListener(this);
        product_btn.setOnClickListener(this);
        suspension_product_btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.text_flow:
                startActivity(new Intent(MainActivity.this, TextFlowActivity.class));
                break;

            case R.id.photo_flow:
                startActivity(new Intent(MainActivity.this, PhotoFlowActivity.class));
                break;

            case R.id.diff_height_text_flow:
                startActivity(new Intent(MainActivity.this, DiffHeightTextFlowActivity.class));
                break;

            case R.id.product_btn:
                startActivity(new Intent(MainActivity.this, ProductActivity.class));
                break;

            case R.id.suspension_product_btn:
                startActivity(new Intent(MainActivity.this, SuspensionProductActivity.class));
                break;


        }


    }
}
