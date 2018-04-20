package com.layout.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.Set;

//// TODO: 2018/4/20 链接：https://www.jianshu.com/p/82bed280399a
public class MainActivity extends AppCompatActivity {

    //放入流式布局标签中的内容
    private String[] mVals = new String[]
            {"有信用卡", "有微粒贷", "我有房", "我有车", "有社保", "有公积金",
                    "有人寿保险", "工资银行卡转账", "啥都没有"};
    private TagFlowLayout mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //获取布局填充器,一会将tv.xml文件填充到标签内.
        final LayoutInflater mInflater = LayoutInflater.from(this);
        setContentView(R.layout.activity_main);
        //初始化布局和适配器,直接粘就行.
        mFlowLayout = (TagFlowLayout) findViewById(R.id.id_flowlayout);
        mFlowLayout.setAdapter(new TagAdapter<String>(mVals) {

            @Override
            public View getView(com.zhy.view.flowlayout.FlowLayout parent, int position, String s) {
//                将tv.xml文件填充到标签内.
                TextView tv = (TextView) mInflater.inflate(R.layout.tv,
                        mFlowLayout, false);
//               为标签设置对应的内容
                tv.setText(s);
                return tv;
            }

            //             为标签设置预点击内容(就是一开始就处于点击状态的标签)
            @Override
            public boolean setSelected(int position, String s) {
                return s.equals("Android");
            }
        });
//          为点击标签设置点击事件.
        mFlowLayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, com.zhy.view.flowlayout.FlowLayout parent) {
                Toast.makeText(MainActivity.this, mVals[position], Toast.LENGTH_SHORT).show();
                //view.setVisibility(View.GONE);
                return true;
            }
        });

//          展示哪些标签处于选中状态,这个很重要我们设置标签可点击就是为了把用户选中状态的标签中的数据上传.
        mFlowLayout.setOnSelectListener(new TagFlowLayout.OnSelectListener() {
            @Override
            public void onSelected(Set<Integer> selectPosSet) {
                //setTitle("choose:" + selectPosSet.toString());
            }
        });
    }
}
