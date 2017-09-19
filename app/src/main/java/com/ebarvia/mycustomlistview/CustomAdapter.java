package com.ebarvia.mycustomlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dianne on 9/14/2017.
 */

public class CustomAdapter extends BaseAdapter {
    ArrayList<AndroidVersion> androidVersions;
    Context ctx;
    ImageView ivLogo;
    TextView tvCodename, tvVersion, tv_Date, tv_Api;


    public CustomAdapter(ArrayList<AndroidVersion> androidVersions, Context ctx) {
        this.androidVersions = androidVersions;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return androidVersions.size();
    }

    @Override
    public Object getItem(int i) {
        return androidVersions.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view.inflate(ctx, R.layout.row_layout, null);
        ivLogo = v.findViewById(R.id.iv_logo);
        tvCodename = v.findViewById(R.id.tv_codename);
        tvVersion = v.findViewById(R.id.tv_version);
        tv_Api = v.findViewById(R.id.tv_api);
        tv_Date = v.findViewById(R.id.tv_date);
        ivLogo.setImageResource(androidVersions.get(i).getLogo());
        tvCodename.setText(androidVersions.get(i).getCodename());
        tvVersion.setText(androidVersions.get(i).getVersion());
        tv_Api.setText(androidVersions.get(i).getApi());
        tv_Date.setText(androidVersions.get(i).getDate());
        return v;
    }
}
