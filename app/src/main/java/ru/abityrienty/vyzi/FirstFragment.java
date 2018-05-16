package ru.abityrienty.vyzi;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import ru.abityrienty.vyzi.constants.TablesNames;
import ru.abityrienty.vyzi.constants.UniMainInfoConsts;
import ru.abityrienty.vyzi.utils.ListOfVyziAdapter;
import ru.abityrienty.vyzi.utils.MyDBHelper;

/**
 * Created by Роберт on 01.05.2018.
 */

public class FirstFragment extends Fragment {

    View view;


    public FirstFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.first_fragment, container, false);
        return view;
    }
}

