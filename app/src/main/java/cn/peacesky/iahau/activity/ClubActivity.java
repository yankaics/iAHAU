package cn.peacesky.iahau.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cn.peacesky.iahau.R;
import cn.peacesky.iahau.adapter.ClubAdapter;
import cn.peacesky.iahau.model.Club;

/**
 * Created by hc on 16-4-27.
 */
public class ClubActivity extends Activity {
    private List<Club> clubList = new ArrayList<Club>();
    private List<Club> qbclubList = new ArrayList<Club>();

    //我自定义的两个切换按钮
    private Button wdclub;
    private Button qbclub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);


        initClubs();
        initqbClubs();

        ClubAdapter qbadapter = new ClubAdapter(ClubActivity.this, R.layout.club_item, clubList);
        ListView qblistView = (ListView) findViewById(R.id.list_view);
        qblistView.setAdapter(qbadapter);
        qblistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Club qbclub = qbclubList.get(position);
                //下面是点击时间。初始为显示设定的名字，可修改（建议修改成获取点击的名称匹配文件信息然后打开固定网页活动界面或者是直接打开文件库文件活动来显示）
                Toast.makeText(ClubActivity.this, qbclub.getName(), Toast.LENGTH_SHORT).show();

            }
        });

        //点击我的社团，加载clubList
        wdclub = (Button) findViewById(R.id.wd_club);
        wdclub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ClubAdapter qbadapter = new ClubAdapter(ClubActivity.this, R.layout.club_item, clubList);
                ListView qblistView = (ListView) findViewById(R.id.list_view);
                qblistView.setAdapter(qbadapter);
                qblistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Club qbclub = qbclubList.get(position);
                        //下面是点击时间。初始为显示设定的名字，可修改（建议修改成获取点击的名称匹配文件信息然后打开固定网页活动界面或者是直接打开文件库文件活动来显示）
                        Toast.makeText(ClubActivity.this, qbclub.getName(), Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });

        //点击全部社团，加载qbclubList
        qbclub = (Button) findViewById(R.id.qb_club);
        qbclub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClubAdapter qbadapter = new ClubAdapter(ClubActivity.this, R.layout.club_item, qbclubList);
                ListView listView = (ListView) findViewById(R.id.list_view);
                listView.setAdapter(qbadapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Club club = clubList.get(position);
                        //下面是点击时间。初始为显示设定的名字，可修改（建议修改成获取点击的名称匹配文件信息然后打开固定网页活动界面或者是直接打开文件库文件活动来显示）
                        Toast.makeText(ClubActivity.this, club.getName(), Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });

    }

    private void initqbClubs() {
        Club q = new Club("search", R.drawable.ic_search);
        qbclubList.add(q);
        Club w = new Club("group", R.drawable.ic_group);
        qbclubList.add(w);


    }

    private void initClubs() {
        Club q = new Club("search", R.drawable.ic_search);
        clubList.add(q);
        Club w = new Club("group", R.drawable.ic_group);
        clubList.add(w);
        Club e = new Club("map", R.drawable.ic_map);
        clubList.add(e);
        Club r = new Club("settings", R.drawable.ic_settings);
        clubList.add(r);
        Club a = new Club("person", R.drawable.ic_person);
        clubList.add(a);

    }
}