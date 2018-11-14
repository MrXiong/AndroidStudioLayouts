package com.dx.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dx.layouts.ui.fragmentviewmodel.FragmentViewModelFragment;

public class FragmentViewModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_view_model_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FragmentViewModelFragment.newInstance())
                    .commitNow();
        }
    }
}
