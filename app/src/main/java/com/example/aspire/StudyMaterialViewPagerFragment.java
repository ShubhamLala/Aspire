package com.example.aspire;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StudyMaterialViewPagerFragment extends androidx.fragment.app.Fragment {


    public StudyMaterialViewPagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_study_material_view_pager, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.studyRecyclerView);
        Context context = getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList<String> arrayList = getArguments().getStringArrayList("message");
        recyclerView.setAdapter(new StudyMaterialRecyclerAdapter(arrayList.get(0),arrayList.get(1),context));
        return view;
    }

}
