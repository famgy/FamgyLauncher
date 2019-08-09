package com.famgy.famgylauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private Workspace mWorkspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
    }

    private void setupViews() {
        mWorkspace = findViewById(R.id.workspace);
        mWorkspace.insertCellLayout();
    }
}
