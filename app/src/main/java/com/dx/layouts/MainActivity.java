package com.dx.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_basic)
    Button mBtnBasic;
    @BindView(R.id.btn_bottom_navigation)
    Button mBtnBottomNavigation;
    @BindView(R.id.btn_fv)
    Button mBtnFv;
    @BindView(R.id.btn_full)
    Button mBtnFull;
    @BindView(R.id.btn_login)
    Button mBtnLogin;
    @BindView(R.id.btn_drawer)
    Button mBtnDrawer;
    @BindView(R.id.btn_scroll)
    Button mBtnScroll;
    @BindView(R.id.btn_setting)
    Button mBtnSetting;
    @BindView(R.id.btn_tabs)
    Button mBtnTabs;
    @BindView(R.id.btn_maps)
    Button mBtnMaps;
    @BindView(R.id.btn_items)
    Button mBtnItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_basic, R.id.btn_bottom_navigation, R.id.btn_fv, R.id.btn_full, R.id.btn_login, R.id.btn_drawer, R.id.btn_scroll, R.id.btn_setting, R.id.btn_tabs, R.id.btn_maps, R.id.btn_items})
    public void onViewClicked(View view) {
        Intent in = new Intent();
        switch (view.getId()) {
            case R.id.btn_basic:
                in.setClass(this, BasicActivity.class);
                break;
            case R.id.btn_bottom_navigation:
                in.setClass(this, BottomNavigationActivity.class);
                break;
            case R.id.btn_fv:
                in.setClass(this, FragmentViewModelActivity.class);
                break;
            case R.id.btn_full:
                in.setClass(this, FullscreenActivity.class);
                break;
            case R.id.btn_login:
                in.setClass(this, LoginActivity.class);
                break;
            case R.id.btn_drawer:
                in.setClass(this, DrawerActivity.class);
                break;
            case R.id.btn_scroll:
                in.setClass(this, ScrollingActivity.class);
                break;
            case R.id.btn_setting:
                in.setClass(this, SettingsActivity.class);
                break;
            case R.id.btn_tabs:
                in.setClass(this, TabsActivity.class);
                break;
            case R.id.btn_maps:
                in.setClass(this, MapsActivity.class);
                break;
            case R.id.btn_items:
                in.setClass(this, ItemDetailActivity.class);
                break;
        }
        startActivity(in);
    }
}
