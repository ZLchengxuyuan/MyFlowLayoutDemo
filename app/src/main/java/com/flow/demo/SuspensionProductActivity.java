package com.flow.demo;

import android.os.Bundle;

public class SuspensionProductActivity extends ProductActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productView.addItemDecoration(new SuspensionDecoration(this, classifies));

    }
}
