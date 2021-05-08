package com.example.aspire;


import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GivingTestFragment extends androidx.fragment.app.Fragment {
    private Button previous,traverse,clearSelection,next,submit,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen,twenty,twentyone,twentytwo,twentythree,twentyfour,twentyfive,twentysix,twentyseven,twentyeight,twentynine,thirty;
   private ScrollView scrollView;
    private CardView cardView;
    private String year;
    private int position;
    private ArrayList<Integer> set13ChemQuestions = new ArrayList<>(Arrays.asList(R.drawable.c13_1,R.drawable.c13_2,R.drawable.c13_3,R.drawable.c13_4,R.drawable.c13_5,R.drawable.c13_6,R.drawable.c13_7,R.drawable.c13_8,R.drawable.c13_9,R.drawable.c13_10,R.drawable.c13_11,R.drawable.c13_12,R.drawable.c13_13,R.drawable.c13_14,R.drawable.c13_15,R.drawable.c13_16,R.drawable.c13_17,R.drawable.c13_18,R.drawable.c13_19,R.drawable.c13_20,R.drawable.c13_21,R.drawable.c13_22,R.drawable.c13_23,R.drawable.c13_24,R.drawable.c13_25,R.drawable.c13_26,R.drawable.c13_27,R.drawable.c13_28,R.drawable.c13_29,R.drawable.c13_30));
    private ArrayList<Integer> set13ChemOptions = new ArrayList<>(Arrays.asList(R.drawable.c13_1a,R.drawable.c13_1b,R.drawable.c13_1c,R.drawable.c13_1d,R.drawable.c13_2a,R.drawable.c13_2b,R.drawable.c13_2c,R.drawable.c13_2d,R.drawable.c13_3a,R.drawable.c13_3b,R.drawable.c13_3c,R.drawable.c13_3d,R.drawable.c13_4a,R.drawable.c13_4b,R.drawable.c13_4c,R.drawable.c13_4d,R.drawable.c13_5a,R.drawable.c13_5b,R.drawable.c13_5c,R.drawable.c13_5d,R.drawable.c13_6a,R.drawable.c13_6b,R.drawable.c13_6c,R.drawable.c13_6d,R.drawable.c13_7a,R.drawable.c13_7b,R.drawable.c13_7c,R.drawable.c13_7d,R.drawable.c13_8a,R.drawable.c13_8b,R.drawable.c13_8c,R.drawable.c13_8d,R.drawable.c13_9a,R.drawable.c13_9b,R.drawable.c13_9c,R.drawable.c13_9d,R.drawable.c13_10a,R.drawable.c13_10b,R.drawable.c13_10c,R.drawable.c13_10d,R.drawable.c13_11a,R.drawable.c13_11b,R.drawable.c13_11c,R.drawable.c13_11d,R.drawable.c13_12a,R.drawable.c13_12b,R.drawable.c13_12c,R.drawable.c13_12d,R.drawable.c13_13a,R.drawable.c13_13b,R.drawable.c13_13c,R.drawable.c13_13d,R.drawable.c13_14a,R.drawable.c13_14b,R.drawable.c13_14c,R.drawable.c13_14d,R.drawable.c13_15a,R.drawable.c13_15b,R.drawable.c13_15c,R.drawable.c13_15d,R.drawable.c13_16a,R.drawable.c13_16b,R.drawable.c13_16c,R.drawable.c13_16d,R.drawable.c13_17a,R.drawable.c13_17b,R.drawable.c13_17c,R.drawable.c13_17d,R.drawable.c13_18a,R.drawable.c13_18b,R.drawable.c13_18c,R.drawable.c13_18d,R.drawable.c13_19a,R.drawable.c13_19b,R.drawable.c13_19c,R.drawable.c13_19d,R.drawable.c13_20a,R.drawable.c13_20b,R.drawable.c13_20c,R.drawable.c13_20d,R.drawable.c13_21a,R.drawable.c13_21b,R.drawable.c13_21c,R.drawable.c13_21d,R.drawable.c13_22a,R.drawable.c13_22b,R.drawable.c13_22c,R.drawable.c13_22d,R.drawable.c13_23a,R.drawable.c13_23b,R.drawable.c13_23c,R.drawable.c13_23d,R.drawable.c13_24a,R.drawable.c13_24b,R.drawable.c13_24c,R.drawable.c13_24d,R.drawable.c13_25a,R.drawable.c13_25b,R.drawable.c13_25c,R.drawable.c13_25d,R.drawable.c13_26a,R.drawable.c13_26b,R.drawable.c13_26c,R.drawable.c13_26d,R.drawable.c13_27a,R.drawable.c13_27b,R.drawable.c13_27c,R.drawable.c13_27d,R.drawable.c13_28a,R.drawable.c13_28b,R.drawable.c13_28c,R.drawable.c13_28d,R.drawable.c13_29a,R.drawable.c13_29b,R.drawable.c13_29c,R.drawable.c13_29d,R.drawable.c13_30a,R.drawable.c13_30b,R.drawable.c13_30c,R.drawable.c13_30d));
    private ArrayList<Integer> set14ChemQuestions = new ArrayList<>(Arrays.asList(R.drawable.c14_1,R.drawable.c14_2,R.drawable.c14_3,R.drawable.c14_4,R.drawable.c14_5,R.drawable.c14_6,R.drawable.c14_7,R.drawable.c14_8,R.drawable.c14_9,R.drawable.c14_10,R.drawable.c14_11,R.drawable.c14_12,R.drawable.c14_13,R.drawable.c14_14,R.drawable.c14_15,R.drawable.c14_16,R.drawable.c14_17,R.drawable.c14_18,R.drawable.c14_19,R.drawable.c14_20,R.drawable.c14_21,R.drawable.c14_22,R.drawable.c14_23,R.drawable.c14_24,R.drawable.c14_25,R.drawable.c14_26,R.drawable.c14_27,R.drawable.c14_28,R.drawable.c14_29,R.drawable.c14_30));
    private ArrayList<Integer> set14ChemOptions = new ArrayList<>(Arrays.asList(R.drawable.c14_1a,R.drawable.c14_1b,R.drawable.c14_1c,R.drawable.c14_1d,R.drawable.c14_2a,R.drawable.c14_2b,R.drawable.c14_2c,R.drawable.c14_2d,R.drawable.c14_3a,R.drawable.c14_3b,R.drawable.c14_3c,R.drawable.c14_3d,R.drawable.c14_4a,R.drawable.c14_4b,R.drawable.c14_4c,R.drawable.c14_4d,R.drawable.c14_5a,R.drawable.c14_5b,R.drawable.c14_5c,R.drawable.c14_5d,R.drawable.c14_6a,R.drawable.c14_6b,R.drawable.c14_6c,R.drawable.c14_6d,R.drawable.c14_7a,R.drawable.c14_7b,R.drawable.c14_7c,R.drawable.c14_7d,R.drawable.c14_8a,R.drawable.c14_8b,R.drawable.c14_8c,R.drawable.c14_8d,R.drawable.c14_9a,R.drawable.c14_9b,R.drawable.c14_9c,R.drawable.c14_9d,R.drawable.c14_10a,R.drawable.c14_10b,R.drawable.c14_10c,R.drawable.c14_10d,R.drawable.c14_11a,R.drawable.c14_11b,R.drawable.c14_11c,R.drawable.c14_11d,R.drawable.c14_12a,R.drawable.c14_12b,R.drawable.c14_12c,R.drawable.c14_12d,R.drawable.c14_13a,R.drawable.c14_13b,R.drawable.c14_13c,R.drawable.c14_13d,R.drawable.c14_14a,R.drawable.c14_14b,R.drawable.c14_14c,R.drawable.c14_14d,R.drawable.c14_15a,R.drawable.c14_15b,R.drawable.c14_15c,R.drawable.c14_15d,R.drawable.c14_16a,R.drawable.c14_16b,R.drawable.c14_16c,R.drawable.c14_16d,R.drawable.c14_17a,R.drawable.c14_17b,R.drawable.c14_17c,R.drawable.c14_17d,R.drawable.c14_18a,R.drawable.c14_18b,R.drawable.c14_18c,R.drawable.c14_18d,R.drawable.c14_19a,R.drawable.c14_19b,R.drawable.c14_19c,R.drawable.c14_19d,R.drawable.c14_20a,R.drawable.c14_20b,R.drawable.c14_20c,R.drawable.c14_20d,R.drawable.c14_21a,R.drawable.c14_21b,R.drawable.c14_21c,R.drawable.c14_21d,R.drawable.c14_22a,R.drawable.c14_22b,R.drawable.c14_22c,R.drawable.c14_22d,R.drawable.c14_23a,R.drawable.c14_23b,R.drawable.c14_23c,R.drawable.c14_23d,R.drawable.c14_24a,R.drawable.c14_24b,R.drawable.c14_24c,R.drawable.c14_24d,R.drawable.c14_25a,R.drawable.c14_25b,R.drawable.c14_25c,R.drawable.c14_25d,R.drawable.c14_26a,R.drawable.c14_26b,R.drawable.c14_26c,R.drawable.c14_26d,R.drawable.c14_27a,R.drawable.c14_27b,R.drawable.c14_27c,R.drawable.c14_27d,R.drawable.c14_28a,R.drawable.c14_28b,R.drawable.c14_28c,R.drawable.c14_28d,R.drawable.c14_29a,R.drawable.c14_29b,R.drawable.c14_29c,R.drawable.c14_29d,R.drawable.c14_30a,R.drawable.c14_30b,R.drawable.c14_30c,R.drawable.c14_30d));
    private ArrayList<Integer> set15ChemQuestions = new ArrayList<>(Arrays.asList(R.drawable.c15_1,R.drawable.c15_2,R.drawable.c15_3,R.drawable.c15_4,R.drawable.c15_5,R.drawable.c15_6,R.drawable.c15_7,R.drawable.c15_8,R.drawable.c15_9,R.drawable.c15_10,R.drawable.c15_11,R.drawable.c15_12,R.drawable.c15_13,R.drawable.c15_14,R.drawable.c15_15,R.drawable.c15_16,R.drawable.c15_17,R.drawable.c15_18,R.drawable.c15_19,R.drawable.c15_20,R.drawable.c15_21,R.drawable.c15_22,R.drawable.c15_23,R.drawable.c15_24,R.drawable.c15_25,R.drawable.c15_26,R.drawable.c15_27,R.drawable.c15_28,R.drawable.c15_29,R.drawable.c15_30));
    private ArrayList<Integer> set15ChemOptions = new ArrayList<>(Arrays.asList(R.drawable.c15_1a,R.drawable.c15_1b,R.drawable.c15_1c,R.drawable.c15_1d,R.drawable.c15_2a,R.drawable.c15_2b,R.drawable.c15_2c,R.drawable.c15_2d,R.drawable.c15_3a,R.drawable.c15_3b,R.drawable.c15_3c,R.drawable.c15_3d,R.drawable.c15_4a,R.drawable.c15_4b,R.drawable.c15_4c,R.drawable.c15_4d,R.drawable.c15_5a,R.drawable.c15_5b,R.drawable.c15_5c,R.drawable.c15_5d,R.drawable.c15_6a,R.drawable.c15_6b,R.drawable.c15_6c,R.drawable.c15_6d,R.drawable.c15_7a,R.drawable.c15_7b,R.drawable.c15_7c,R.drawable.c15_7d,R.drawable.c15_8a,R.drawable.c15_8b,R.drawable.c15_8c,R.drawable.c15_8d,R.drawable.c15_9a,R.drawable.c15_9b,R.drawable.c15_9c,R.drawable.c15_9d,R.drawable.c15_10a,R.drawable.c15_10b,R.drawable.c15_10c,R.drawable.c15_10d,R.drawable.c15_11a,R.drawable.c15_11b,R.drawable.c15_11c,R.drawable.c15_11d,R.drawable.c15_12a,R.drawable.c15_12b,R.drawable.c15_12c,R.drawable.c15_12d,R.drawable.c15_13a,R.drawable.c15_13b,R.drawable.c15_13c,R.drawable.c15_13d,R.drawable.c15_14a,R.drawable.c15_14b,R.drawable.c15_14c,R.drawable.c15_14d,R.drawable.c15_15a,R.drawable.c15_15b,R.drawable.c15_15c,R.drawable.c15_15d,R.drawable.c15_16a,R.drawable.c15_16b,R.drawable.c15_16c,R.drawable.c15_16d,R.drawable.c15_17a,R.drawable.c15_17b,R.drawable.c15_17c,R.drawable.c15_17d,R.drawable.c15_18a,R.drawable.c15_18b,R.drawable.c15_18c,R.drawable.c15_18d,R.drawable.c15_19a,R.drawable.c15_19b,R.drawable.c15_19c,R.drawable.c15_19d,R.drawable.c15_20a,R.drawable.c15_20b,R.drawable.c15_20c,R.drawable.c15_20d,R.drawable.c15_21a,R.drawable.c15_21b,R.drawable.c15_21c,R.drawable.c15_21d,R.drawable.c15_22a,R.drawable.c15_22b,R.drawable.c15_22c,R.drawable.c15_22d,R.drawable.c15_23a,R.drawable.c15_23b,R.drawable.c15_23c,R.drawable.c15_23d,R.drawable.c15_24a,R.drawable.c15_24b,R.drawable.c15_24c,R.drawable.c15_24d,R.drawable.c15_25a,R.drawable.c15_25b,R.drawable.c15_25c,R.drawable.c15_25d,R.drawable.c15_26a,R.drawable.c15_26b,R.drawable.c15_26c,R.drawable.c15_26d,R.drawable.c15_27a,R.drawable.c15_27b,R.drawable.c15_27c,R.drawable.c15_27d,R.drawable.c15_28a,R.drawable.c15_28b,R.drawable.c15_28c,R.drawable.c15_28d,R.drawable.c15_29a,R.drawable.c15_29b,R.drawable.c15_29c,R.drawable.c15_29d,R.drawable.c15_30a,R.drawable.c15_30b,R.drawable.c15_30c,R.drawable.c15_30d));

    private ArrayList<Integer> set13MathOptions = new ArrayList<>(Arrays.asList(R.drawable.m13_1a,R.drawable.m13_1b,R.drawable.m13_1c,R.drawable.m13_1d,R.drawable.m13_2a,R.drawable.m13_2b,R.drawable.m13_2c,R.drawable.m13_2d,R.drawable.m13_3a,R.drawable.m13_3b,R.drawable.m13_3c,R.drawable.m13_3d,R.drawable.m13_4a,R.drawable.m13_4b,R.drawable.m13_4c,R.drawable.m13_4d,R.drawable.m13_5a,R.drawable.m13_5b,R.drawable.m13_5c,R.drawable.m13_5d,R.drawable.m13_6a,R.drawable.m13_6b,R.drawable.m13_6c,R.drawable.m13_6d,R.drawable.m13_7a,R.drawable.m13_7b,R.drawable.m13_7c,R.drawable.m13_7d,R.drawable.m13_8a,R.drawable.m13_8b,R.drawable.m13_8c,R.drawable.m13_8d,R.drawable.m13_9a,R.drawable.m13_9b,R.drawable.m13_9c,R.drawable.m13_9d,R.drawable.m13_10a,R.drawable.m13_10b,R.drawable.m13_10c,R.drawable.m13_10d,R.drawable.m13_11a,R.drawable.m13_11b,R.drawable.m13_11c,R.drawable.m13_11d,R.drawable.m13_12a,R.drawable.m13_12b,R.drawable.m13_12c,R.drawable.m13_12d,R.drawable.m13_13a,R.drawable.m13_13b,R.drawable.m13_13c,R.drawable.m13_13d,R.drawable.m13_14a,R.drawable.m13_14b,R.drawable.m13_14c,R.drawable.m13_14d,R.drawable.m13_15a,R.drawable.m13_15b,R.drawable.m13_15c,R.drawable.m13_15d,R.drawable.m13_16a,R.drawable.m13_16b,R.drawable.m13_16c,R.drawable.m13_16d,R.drawable.m13_17a,R.drawable.m13_17b,R.drawable.m13_17c,R.drawable.m13_17d,R.drawable.m13_18a,R.drawable.m13_18b,R.drawable.m13_18c,R.drawable.m13_18d,R.drawable.m13_19a,R.drawable.m13_19b,R.drawable.m13_19c,R.drawable.m13_19d,R.drawable.m13_20a,R.drawable.m13_20b,R.drawable.m13_20c,R.drawable.m13_20d,R.drawable.m13_21a,R.drawable.m13_21b,R.drawable.m13_21c,R.drawable.m13_21d,R.drawable.m13_22a,R.drawable.m13_22b,R.drawable.m13_22c,R.drawable.m13_22d,R.drawable.m13_23a,R.drawable.m13_23b,R.drawable.m13_23c,R.drawable.m13_23d,R.drawable.m13_24a,R.drawable.m13_24b,R.drawable.m13_24c,R.drawable.m13_24d,R.drawable.m13_25a,R.drawable.m13_25b,R.drawable.m13_25c,R.drawable.m13_25d,R.drawable.m13_26a,R.drawable.m13_26b,R.drawable.m13_26c,R.drawable.m13_26d,R.drawable.m13_27a,R.drawable.m13_27b,R.drawable.m13_27c,R.drawable.m13_27d,R.drawable.m13_28a,R.drawable.m13_28b,R.drawable.m13_28c,R.drawable.m13_28d,R.drawable.m13_29a,R.drawable.m13_29b,R.drawable.m13_29c,R.drawable.m13_29d,R.drawable.m13_30a,R.drawable.m13_30b,R.drawable.m13_30c,R.drawable.m13_30d));
    private ArrayList<Integer> set13MathQuestions = new ArrayList<>(Arrays.asList(R.drawable.m13_1,R.drawable.m13_2,R.drawable.m13_3,R.drawable.m13_4,R.drawable.m13_5,R.drawable.m13_6,R.drawable.m13_7,R.drawable.m13_8,R.drawable.m13_9,R.drawable.m13_10,R.drawable.m13_11,R.drawable.m13_12,R.drawable.m13_13,R.drawable.m13_14,R.drawable.m13_15,R.drawable.m13_16,R.drawable.m13_17,R.drawable.m13_18,R.drawable.m13_19,R.drawable.m13_20,R.drawable.m13_21,R.drawable.m13_22,R.drawable.m13_23,R.drawable.m13_24,R.drawable.m13_25,R.drawable.m13_26,R.drawable.m13_27,R.drawable.m13_28,R.drawable.m13_29,R.drawable.m13_30));
    private ArrayList<Integer> set14MathQuestions = new ArrayList<>(Arrays.asList(R.drawable.m14_1,R.drawable.m14_2,R.drawable.m14_3,R.drawable.m14_4,R.drawable.m14_5,R.drawable.m14_6,R.drawable.m14_7,R.drawable.m14_8,R.drawable.m14_9,R.drawable.m14_10,R.drawable.m14_11,R.drawable.m14_12,R.drawable.m14_13,R.drawable.m14_14,R.drawable.m14_15,R.drawable.m14_16,R.drawable.m14_17,R.drawable.m14_18,R.drawable.m14_19,R.drawable.m14_20,R.drawable.m14_21,R.drawable.m14_22,R.drawable.m14_23,R.drawable.m14_24,R.drawable.m14_25,R.drawable.m14_26,R.drawable.m14_27,R.drawable.m14_28,R.drawable.m14_29,R.drawable.m14_30));
    private ArrayList<Integer> set14MathOptions = new ArrayList<>(Arrays.asList(R.drawable.m14_1a,R.drawable.m14_1b,R.drawable.m14_1c,R.drawable.m14_1d,R.drawable.m14_2a,R.drawable.m14_2b,R.drawable.m14_2c,R.drawable.m14_2d,R.drawable.m14_3a,R.drawable.m14_3b,R.drawable.m14_3c,R.drawable.m14_3d,R.drawable.m14_4a,R.drawable.m14_4b,R.drawable.m14_4c,R.drawable.m14_4d,R.drawable.m14_5a,R.drawable.m14_5b,R.drawable.m14_5c,R.drawable.m14_5d,R.drawable.m14_6a,R.drawable.m14_6b,R.drawable.m14_6c,R.drawable.m14_6d,R.drawable.m14_7a,R.drawable.m14_7b,R.drawable.m14_7c,R.drawable.m14_7d,R.drawable.m14_8a,R.drawable.m14_8b,R.drawable.m14_8c,R.drawable.m14_8d,R.drawable.m14_9a,R.drawable.m14_9b,R.drawable.m14_9c,R.drawable.m14_9d,R.drawable.m14_10a,R.drawable.m14_10b,R.drawable.m14_10c,R.drawable.m14_10d,R.drawable.m14_11a,R.drawable.m14_11b,R.drawable.m14_11c,R.drawable.m14_11d,R.drawable.m14_12a,R.drawable.m14_12b,R.drawable.m14_12c,R.drawable.m14_12d,R.drawable.m14_13a,R.drawable.m14_13b,R.drawable.m14_13c,R.drawable.m14_13d,R.drawable.m14_14a,R.drawable.m14_14b,R.drawable.m14_14c,R.drawable.m14_14d,R.drawable.m14_15a,R.drawable.m14_15b,R.drawable.m14_15c,R.drawable.m14_15d,R.drawable.m14_16a,R.drawable.m14_16b,R.drawable.m14_16c,R.drawable.m14_16d,R.drawable.m14_17a,R.drawable.m14_17b,R.drawable.m14_17c,R.drawable.m14_17d,R.drawable.m14_18a,R.drawable.m14_18b,R.drawable.m14_18c,R.drawable.m14_18d,R.drawable.m14_19a,R.drawable.m14_19b,R.drawable.m14_19c,R.drawable.m14_19d,R.drawable.m14_20a,R.drawable.m14_20b,R.drawable.m14_20c,R.drawable.m14_20d,R.drawable.m14_21a,R.drawable.m14_21b,R.drawable.m14_21c,R.drawable.m14_21d,R.drawable.m14_22a,R.drawable.m14_22b,R.drawable.m14_22c,R.drawable.m14_22d,R.drawable.m14_23a,R.drawable.m14_23b,R.drawable.m14_23c,R.drawable.m14_23d,R.drawable.m14_24a,R.drawable.m14_24b,R.drawable.m14_24c,R.drawable.m14_24d,R.drawable.m14_25a,R.drawable.m14_25b,R.drawable.m14_25c,R.drawable.m14_25d,R.drawable.m14_26a,R.drawable.m14_26b,R.drawable.m14_26c,R.drawable.m14_26d,R.drawable.m14_27a,R.drawable.m14_27b,R.drawable.m14_27c,R.drawable.m14_27d,R.drawable.m14_28a,R.drawable.m14_28b,R.drawable.m14_28c,R.drawable.m14_28d,R.drawable.m14_29a,R.drawable.m14_29b,R.drawable.m14_29c,R.drawable.m14_29d,R.drawable.m14_30a,R.drawable.m14_30b,R.drawable.m14_30c,R.drawable.m14_30d));
    private ArrayList<Integer> set15MathQuestions = new ArrayList<>(Arrays.asList(R.drawable.m15_1,R.drawable.m15_2,R.drawable.m15_3,R.drawable.m15_4,R.drawable.m15_5,R.drawable.m15_6,R.drawable.m15_7,R.drawable.m15_8,R.drawable.m15_9,R.drawable.m15_10,R.drawable.m15_11,R.drawable.m15_12,R.drawable.m15_13,R.drawable.m15_14,R.drawable.m15_15,R.drawable.m15_16,R.drawable.m15_17,R.drawable.m15_18,R.drawable.m15_19,R.drawable.m15_20,R.drawable.m15_21,R.drawable.m15_22,R.drawable.m15_23,R.drawable.m15_24,R.drawable.m15_25,R.drawable.m15_26,R.drawable.m15_27,R.drawable.m15_28,R.drawable.m15_29,R.drawable.m15_30));
    private ArrayList<Integer> set15MathOptions = new ArrayList<>(Arrays.asList(R.drawable.m15_1a,R.drawable.m15_1b,R.drawable.m15_1c,R.drawable.m15_1d,R.drawable.m15_2a,R.drawable.m15_2b,R.drawable.m15_2c,R.drawable.m15_2d,R.drawable.m15_3a,R.drawable.m15_3b,R.drawable.m15_3c,R.drawable.m15_3d,R.drawable.m15_4a,R.drawable.m15_4b,R.drawable.m15_4c,R.drawable.m15_4d,R.drawable.m15_5a,R.drawable.m15_5b,R.drawable.m15_5c,R.drawable.m15_5d,R.drawable.m15_6a,R.drawable.m15_6b,R.drawable.m15_6c,R.drawable.m15_6d,R.drawable.m15_7a,R.drawable.m15_7b,R.drawable.m15_7c,R.drawable.m15_7d,R.drawable.m15_8a,R.drawable.m15_8b,R.drawable.m15_8c,R.drawable.m15_8d,R.drawable.m15_9a,R.drawable.m15_9b,R.drawable.m15_9c,R.drawable.m15_9d,R.drawable.m15_10a,R.drawable.m15_10b,R.drawable.m15_10c,R.drawable.m15_10d,R.drawable.m15_11a,R.drawable.m15_11b,R.drawable.m15_11c,R.drawable.m15_11d,R.drawable.m15_12a,R.drawable.m15_12b,R.drawable.m15_12c,R.drawable.m15_12d,R.drawable.m15_13a,R.drawable.m15_13b,R.drawable.m15_13c,R.drawable.m15_13d,R.drawable.m15_14a,R.drawable.m15_14b,R.drawable.m15_14c,R.drawable.m15_14d,R.drawable.m15_15a,R.drawable.m15_15b,R.drawable.m15_15c,R.drawable.m15_15d,R.drawable.m15_16a,R.drawable.m15_16b,R.drawable.m15_16c,R.drawable.m15_16d,R.drawable.m15_17a,R.drawable.m15_17b,R.drawable.m15_17c,R.drawable.m15_17d,R.drawable.m15_18a,R.drawable.m15_18b,R.drawable.m15_18c,R.drawable.m15_18d,R.drawable.m15_19a,R.drawable.m15_19b,R.drawable.m15_19c,R.drawable.m15_19d,R.drawable.m15_20a,R.drawable.m15_20b,R.drawable.m15_20c,R.drawable.m15_20d,R.drawable.m15_21a,R.drawable.m15_21b,R.drawable.m15_21c,R.drawable.m15_21d,R.drawable.m15_22a,R.drawable.m15_22b,R.drawable.m15_22c,R.drawable.m15_22d,R.drawable.m15_23a,R.drawable.m15_23b,R.drawable.m15_23c,R.drawable.m15_23d,R.drawable.m15_24a,R.drawable.m15_24b,R.drawable.m15_24c,R.drawable.m15_24d,R.drawable.m15_25a,R.drawable.m15_25b,R.drawable.m15_25c,R.drawable.m15_25d,R.drawable.m15_26a,R.drawable.m15_26b,R.drawable.m15_26c,R.drawable.m15_26d,R.drawable.m15_27a,R.drawable.m15_27b,R.drawable.m15_27c,R.drawable.m15_27d,R.drawable.m15_28a,R.drawable.m15_28b,R.drawable.m15_28c,R.drawable.m15_28d,R.drawable.m15_29a,R.drawable.m15_29b,R.drawable.m15_29c,R.drawable.m15_29d,R.drawable.m15_30a,R.drawable.m15_30b,R.drawable.m15_30c,R.drawable.m15_30d));

    private  ArrayList<Integer> set14PhyQuestions = new ArrayList<>(Arrays.asList(R.drawable.forteenp1,R.drawable.forteenp2,R.drawable.forteenp3,R.drawable.forteenp4,R.drawable.forteenp5,R.drawable.forteenp6,R.drawable.forteenp7,R.drawable.forteenp8,R.drawable.forteenp9,R.drawable.forteenp10,R.drawable.forteenp11,R.drawable.forteenp12,R.drawable.forteenp13,R.drawable.forteenp14,R.drawable.forteenp15,R.drawable.forteenp16,R.drawable.forteenp17,R.drawable.forteenp18,R.drawable.forteenp19,R.drawable.forteenp20,R.drawable.forteenp21,R.drawable.forteenp22,R.drawable.forteenp23,R.drawable.forteenp24,R.drawable.forteenp25,R.drawable.forteenp26,R.drawable.forteenp27,R.drawable.forteenp28,R.drawable.forteenp29,R.drawable.forteenp30));
    private ArrayList<Integer> set14PhyOptions = new ArrayList<>(Arrays.asList(R.drawable.forteenp1a,R.drawable.forteenp1b,R.drawable.forteenp1c,R.drawable.forteenp1d,R.drawable.forteenp2a,R.drawable.forteenp2b,R.drawable.forteenp2c,R.drawable.forteenp2d,R.drawable.forteenp3a,R.drawable.forteenp3b,R.drawable.forteenp3c,R.drawable.forteenp3d,R.drawable.forteenp4a,R.drawable.forteenp4b,R.drawable.forteenp4c,R.drawable.forteenp4d,R.drawable.forteenp5a,R.drawable.forteenp5b,R.drawable.forteenp5c,R.drawable.forteenp5d,R.drawable.forteenp6a,R.drawable.forteenp6b,R.drawable.forteenp6c,R.drawable.forteenp6d,R.drawable.forteenp7a,R.drawable.forteenp7b,R.drawable.forteenp7c,R.drawable.forteenp7d,R.drawable.forteenp8a,R.drawable.forteenp8b,R.drawable.forteenp8c,R.drawable.forteenp8d,R.drawable.forteenp9a,R.drawable.forteenp9b,R.drawable.forteenp9c,R.drawable.forteenp9d,R.drawable.forteenp10a,R.drawable.forteenp10b,R.drawable.forteenp10c,R.drawable.forteenp10d,R.drawable.forteenp11a,R.drawable.forteenp11b,R.drawable.forteenp11c,R.drawable.forteenp11d,R.drawable.forteenp12a,R.drawable.forteenp12b,R.drawable.forteenp12c,R.drawable.forteenp12d,R.drawable.forteenp13a,R.drawable.forteenp13b,R.drawable.forteenp13c,R.drawable.forteenp13d,R.drawable.forteenp14a,R.drawable.forteenp14b,R.drawable.forteenp14c,R.drawable.forteenp14d,R.drawable.forteenp15a,R.drawable.forteenp15b,R.drawable.forteenp15c,R.drawable.forteenp15d,R.drawable.forteenp16a,R.drawable.forteenp16b,R.drawable.forteenp16c,R.drawable.forteenp16d,R.drawable.forteenp17a,R.drawable.forteenp17b,R.drawable.forteenp17c,R.drawable.forteenp17d,R.drawable.forteenp18a,R.drawable.forteenp18b,R.drawable.forteenp18c,R.drawable.forteenp18d,R.drawable.forteenp19a,R.drawable.forteenp19b,R.drawable.forteenp19c,R.drawable.forteenp19d,R.drawable.forteenp20a,R.drawable.forteenp20b,R.drawable.forteenp20c,R.drawable.forteenp20d,R.drawable.forteenp21a,R.drawable.forteenp21b,R.drawable.forteenp21c,R.drawable.forteenp21d,R.drawable.forteenp22a,R.drawable.forteenp22b,R.drawable.forteenp22c,R.drawable.forteenp22d,R.drawable.forteenp23a,R.drawable.forteenp23b,R.drawable.forteenp23c,R.drawable.forteenp23d,R.drawable.forteenp24a,R.drawable.forteenp24b,R.drawable.forteenp24c,R.drawable.forteenp24d,R.drawable.forteenp25a,R.drawable.forteenp25b,R.drawable.forteenp25c,R.drawable.forteenp25d,R.drawable.forteenp26a,R.drawable.forteenp26b,R.drawable.forteenp26c,R.drawable.forteenp26d,R.drawable.forteenp27a,R.drawable.forteenp27b,R.drawable.forteenp27c,R.drawable.forteenp27d,R.drawable.forteenp28a,R.drawable.forteenp28b,R.drawable.forteenp28c,R.drawable.forteenp28d,R.drawable.forteenp29a,R.drawable.forteenp29b,R.drawable.forteenp29c,R.drawable.forteenp29d,R.drawable.forteenp30a,R.drawable.forteenp30b,R.drawable.forteenp30c,R.drawable.forteenp30d));
    private ArrayList<Integer> set13PhyOptions = new ArrayList<>(Arrays.asList(R.drawable.thirteenp1a,R.drawable.thirteenp1b,R.drawable.thirteenp1c,R.drawable.thirteenp1d,R.drawable.thirteenp2a,R.drawable.thirteenp2b,R.drawable.thirteenp2c,R.drawable.thirteenp2d,R.drawable.thirteenp3a,R.drawable.thirteenp3b,R.drawable.thirteenp3c,R.drawable.thirteenp3d,R.drawable.thirteenp4a,R.drawable.thirteenp4b,R.drawable.thirteenp4c,R.drawable.thirteenp4d,R.drawable.thirteenp5a,R.drawable.thirteenp5b,R.drawable.thirteenp5c,R.drawable.thirteenp5d,R.drawable.thirteenp6a,R.drawable.thirteenp6b,R.drawable.thirteenp6c,R.drawable.thirteenp6d,R.drawable.thirteenp7a,R.drawable.thirteenp7b,R.drawable.thirteenp7c,R.drawable.thirteenp7d,R.drawable.thirteenp8a,R.drawable.thirteenp8b,R.drawable.thirteenp8c,R.drawable.thirteenp8d,R.drawable.thirteenp9a,R.drawable.thirteenp9b,R.drawable.thirteenp9c,R.drawable.thirteenp9d,R.drawable.thirteenp10a,R.drawable.thirteenp10b,R.drawable.thirteenp10c,R.drawable.thirteenp10d,R.drawable.thirteenp11a,R.drawable.thirteenp11b,R.drawable.thirteenp11c,R.drawable.thirteenp11d,R.drawable.thirteenp12a,R.drawable.thirteenp12b,R.drawable.thirteenp12c,R.drawable.thirteenp12d,R.drawable.thirteenp13a,R.drawable.thirteenp13b,R.drawable.thirteenp13c,R.drawable.thirteenp13d,R.drawable.thirteenp14a,R.drawable.thirteenp14b,R.drawable.thirteenp14c,R.drawable.thirteenp14d,R.drawable.thirteenp15a,R.drawable.thirteenp15b,R.drawable.thirteenp15c,R.drawable.thirteenp15d,R.drawable.thirteenp16a,R.drawable.thirteenp16b,R.drawable.thirteenp16c,R.drawable.thirteenp16d,R.drawable.thirteenp17a,R.drawable.thirteenp17b,R.drawable.thirteenp17c,R.drawable.thirteenp17d,R.drawable.thirteenp18a,R.drawable.thirteenp18b,R.drawable.thirteenp18c,R.drawable.thirteenp18d,R.drawable.thirteenp19a,R.drawable.thirteenp19b,R.drawable.thirteenp19c,R.drawable.thirteenp19d,R.drawable.thirteenp20a,R.drawable.thirteenp20b,R.drawable.thirteenp20c,R.drawable.thirteenp20d,R.drawable.thirteenp21a,R.drawable.thirteenp21b,R.drawable.thirteenp21c,R.drawable.thirteenp21d,R.drawable.thirteenp22a,R.drawable.thirteenp22b,R.drawable.thirteenp22c,R.drawable.thirteenp22d,R.drawable.thirteenp23a,R.drawable.thirteenp23b,R.drawable.thirteenp23c,R.drawable.thirteenp23d,R.drawable.thirteenp24a,R.drawable.thirteenp24b,R.drawable.thirteenp24c,R.drawable.thirteenp24d,R.drawable.thirteenp25a,R.drawable.thirteenp25b,R.drawable.thirteenp25c,R.drawable.thirteenp25d,R.drawable.thirteenp26a,R.drawable.thirteenp26b,R.drawable.thirteenp26c,R.drawable.thirteenp26d,R.drawable.thirteenp27a,R.drawable.thirteenp27b,R.drawable.thirteenp27c,R.drawable.thirteenp27d,R.drawable.thirteenp28a,R.drawable.thirteenp28b,R.drawable.thirteenp28c,R.drawable.thirteenp28d,R.drawable.thirteenp29a,R.drawable.thirteenp29b,R.drawable.thirteenp29c,R.drawable.thirteenp29d,R.drawable.thirteenp30a,R.drawable.thirteenp30b,R.drawable.thirteenp30c,R.drawable.thirteenp30d));
    private ArrayList<Integer> set13PhyQuestions = new ArrayList<>(Arrays.asList(R.drawable.thirteenp1,R.drawable.thirteenp2,R.drawable.thirteenp3,R.drawable.thirteenp4,R.drawable.thirteenp5,R.drawable.thirteenp6,R.drawable.thirteenp7,R.drawable.thirteenp8,R.drawable.thirteenp9,R.drawable.thirteenp10,R.drawable.thirteenp11,R.drawable.thirteenp12,R.drawable.thirteenp13,R.drawable.thirteenp14,R.drawable.thirteenp15,R.drawable.thirteenp16,R.drawable.thirteenp17,R.drawable.thirteenp18,R.drawable.thirteenp19,R.drawable.thirteenp20,R.drawable.thirteenp21,R.drawable.thirteenp22,R.drawable.thirteenp23,R.drawable.thirteenp24,R.drawable.thirteenp25,R.drawable.thirteenp26,R.drawable.thirteenp27,R.drawable.thirteenp28,R.drawable.thirteenp29,R.drawable.thirteenp30));
    private ArrayList<Integer> set15PhyOptions = new ArrayList<>(Arrays.asList(R.drawable.fifteen_physics_one_a,R.drawable.fifteen_physics_one_b,R.drawable.fifteen_physics_one_c,R.drawable.fifteen_physics_one_d,R.drawable.fifteen_physics_two_a,R.drawable.fifteen_physics_two_b,R.drawable.fifteen_physics_two_c,R.drawable.fifteen_physics_two_d,R.drawable.fifteen_physics_three_a,R.drawable.fifteen_physics_three_b,R.drawable.fifteen_physics_three_c,R.drawable.fifteen_physics_three_d,R.drawable.fifteen_physics_four_a,R.drawable.fifteen_physics_four_b,R.drawable.fifteen_physics_four_c,R.drawable.fifteen_physics_four_d,R.drawable.fifteen_physics_five_a,R.drawable.fifteen_physics_five_b,R.drawable.fifteen_physics_five_c,R.drawable.fifteen_physics_five_d,R.drawable.fifteen_physics_six_a,R.drawable.fifteen_physics_six_b,R.drawable.fifteen_physics_six_c,R.drawable.fifteen_physics_six_d,R.drawable.fifteen_physics_seven_a,R.drawable.fifteen_physics_seven_b,R.drawable.fifteen_physics_seven_c,R.drawable.fifteen_physics_seven_d,R.drawable.fifteen_physics_eight_a,R.drawable.fifteen_physics_eight_b,R.drawable.fifteen_physics_eight_c,R.drawable.fifteen_physics_eight_d,R.drawable.fifteen_physics_nine_a,R.drawable.fifteen_physics_nine_b,R.drawable.fifteen_physics_nine_c,R.drawable.fifteen_physics_nine_d,R.drawable.fifteen_physics_ten_a,R.drawable.fifteen_physics_ten_b,R.drawable.fifteen_physics_ten_c,R.drawable.fifteen_physics_ten_d,R.drawable.fifteen_physics_eleven_a,R.drawable.fifteen_physics_eleven_b,R.drawable.fifteen_physics_eleven_c,R.drawable.fifteen_physics_eleven_d,R.drawable.fifteen_physics_twelve_a,R.drawable.fifteen_physics_twelve_b,R.drawable.fifteen_physics_twelve_c,R.drawable.fifteen_physics_twelve_d,R.drawable.fifteen_physics_thirteen_a,R.drawable.fifteen_physics_thirteen_b,R.drawable.fifteen_physics_thirteen_c,R.drawable.fifteen_physics_thirteen_d,R.drawable.fifteen_physics_forteen_a,R.drawable.fifteen_physics_forteen_b,R.drawable.fifteen_physics_forteen_c,R.drawable.fifteen_physics_forteen_d,R.drawable.fifteen_physics_fifteen_a,R.drawable.fifteen_physics_fifteen_b,R.drawable.fifteen_physics_fifteen_c,R.drawable.fifteen_physics_fifteen_d,R.drawable.fifteen_physics_sixteen_a,R.drawable.fifteen_physics_sixteen_b,R.drawable.fifteen_physics_sixteen_c,R.drawable.fifteen_physics_sixteen_d,R.drawable.fifteen_physics_seventeen_a,R.drawable.fifteen_physics_seventeen_b,R.drawable.fifteen_physics_seventeen_c,R.drawable.fifteen_physics_seventeen_d,R.drawable.fifteen_physics_eighteen_a,R.drawable.fifteen_physics_eighteen_b,R.drawable.fifteen_physics_eighteen_c,R.drawable.fifteen_physics_eighteen_d,R.drawable.fifteen_physics_nineteen_a,R.drawable.fifteen_physics_nineteen_b,R.drawable.fifteen_physics_nineteen_c,R.drawable.fifteen_physics_nineteen_d,R.drawable.fifteen_physics_twenty_a,R.drawable.fifteen_physics_twenty_b,R.drawable.fifteen_physics_twenty_c,R.drawable.fifteen_physics_twenty_d,R.drawable.fifteen_physics_twentyone_a,R.drawable.fifteen_physics_twentyone_b,R.drawable.fifteen_physics_twentyone_c,R.drawable.fifteen_physics_twentyone_d,R.drawable.fifteen_physics_twentytwo_a,R.drawable.fifteen_physics_twentytwo_b,R.drawable.fifteen_physics_twentytwo_c,R.drawable.fifteen_physics_twentytwo_d,R.drawable.fifteen_physics_twentythree_a,R.drawable.fifteen_physics_twentythree_b,R.drawable.fifteen_physics_twentythree_c,R.drawable.fifteen_physics_twentythree_d,R.drawable.fifteen_physics_twentyfour_a,R.drawable.fifteen_physics_twentyfour_b,R.drawable.fifteen_physics_twentyfour_c,R.drawable.fifteen_physics_twentyfour_d,R.drawable.fifteen_physics_twentyfive_a,R.drawable.fifteen_physics_twentyfive_b,R.drawable.fifteen_physics_twentyfive_c,R.drawable.fifteen_physics_twentyfive_d,R.drawable.fifteen_physics_twentysix_a,R.drawable.fifteen_physics_twentysix_b,R.drawable.fifteen_physics_twentysix_c,R.drawable.fifteen_physics_twentysix_d,R.drawable.fifteen_physics_twentyseven_a,R.drawable.fifteen_physics_twentyseven_b,R.drawable.fifteen_physics_twentyseven_c,R.drawable.fifteen_physics_twentyseven_d,R.drawable.fifteen_physics_twentyeight_a,R.drawable.fifteen_physics_twentyeight_b,R.drawable.fifteen_physics_twentyeight_c,R.drawable.fifteen_physics_twentyeight_d,R.drawable.fifteen_physics_twentynine_a,R.drawable.fifteen_physics_twentynine_b,R.drawable.fifteen_physics_twentynine_c,R.drawable.fifteen_physics_twentynine_d,R.drawable.fifteen_physics_thirty_a,R.drawable.fifteen_physics_thirty_b,R.drawable.fifteen_physics_thirty_c,R.drawable.fifteen_physics_thirty_d));
    private ArrayList<Integer> set15PhyQuestions = new ArrayList<>(Arrays.asList(R.drawable.fifteen_physics_one,R.drawable.fifteen_physics_two,R.drawable.fifteen_physics_three,R.drawable.fifteen_physics_four,R.drawable.fifteen_physics_five,R.drawable.fifteen_physics_six,R.drawable.fifteen_physics_seven,R.drawable.fifteen_physics_eight,R.drawable.fifteen_physics_nine,R.drawable.fifteen_physics_ten,R.drawable.fifteen_physics_eleven,R.drawable.fifteen_physics_twelve,R.drawable.fifteen_physics_thirteen,R.drawable.fifteen_physics_forteen,R.drawable.fifteen_physics_fifteen,R.drawable.fifteen_physics_sixteen,R.drawable.fifteen_physics_seventeen,R.drawable.fifteen_physics_eighteen,R.drawable.fifteen_physics_nineteen,R.drawable.fifteen_physics_twenty,R.drawable.fifteen_physics_twentyone,R.drawable.fifteen_physics_twentytwo,R.drawable.fifteen_physics_twentythree,R.drawable.fifteen_physics_twentyfour,R.drawable.fifteen_physics_twentyfive,R.drawable.fifteen_physics_twentysix,R.drawable.fifteen_physics_twentyseven,R.drawable.fifteen_physics_twentyeight,R.drawable.fifteen_physics_twentynine,R.drawable.fifteen_physics_thirty));


    private ArrayList<Integer> currentPhyOptions;
   private ArrayList<Integer> currentPhyQuestions;
   private ArrayList<Integer> currentChemOptions;
   private ArrayList<Integer> currentChemQuestions;
   private ArrayList<Integer> currentMathOptions;
   private ArrayList<Integer> currentMathQuestions;
    private int questionNumber=1;
    private LinearLayout linear1,linear2,linear3,linear4,hiddenLinear,optionsLinear;
    RadioButton radio1,radio2,radio3,radio4;
    ImageView questionImage,image1,image2,image3,image4;
    HashMap<Integer,Integer> chosenOptions = new HashMap<>();
    public GivingTestFragment() {
        // Required empty public constructor
    }
    public interface OndataPass{
        public void onDataPass(int pos,HashMap<Integer,Integer> options);
    }
    OndataPass dataPasser;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_giving_test, container, false);
        ArrayList<String> arrayList = getArguments().getStringArrayList("message");
        position = Integer.parseInt(arrayList.get(0));
        year = arrayList.get(1);
        switch (year){
            case "2013":
                currentPhyOptions = set13PhyOptions;
                currentPhyQuestions = set13PhyQuestions;
                currentChemOptions = set13ChemOptions;
                currentChemQuestions = set13ChemQuestions;
                currentMathOptions = set13MathOptions;
                currentMathQuestions = set13MathQuestions;
                break;
            case "2014":
                currentPhyOptions = set14PhyOptions;
                currentPhyQuestions = set14PhyQuestions;
                currentChemOptions = set14ChemOptions;
                currentChemQuestions = set14ChemQuestions;
                currentMathOptions = set14MathOptions;
                currentMathQuestions = set14MathQuestions;
                break;
            case "2015":
                  currentPhyOptions = set15PhyOptions;
                  currentPhyQuestions = set15PhyQuestions;
               currentChemOptions = set15ChemOptions;
                currentChemQuestions = set15ChemQuestions;
                currentMathOptions = set15MathOptions;
                currentMathQuestions = set15MathQuestions;
                break;
        }
        previous = view.findViewById(R.id.previous);
        traverse = view.findViewById(R.id.traverse);
        clearSelection = view.findViewById(R.id.clearSelection);
        scrollView = view.findViewById(R.id.scrollView);
        next = view.findViewById(R.id.next);
        submit = view.findViewById(R.id.submit);
        questionImage = view.findViewById(R.id.question);
        cardView = view.findViewById(R.id.gotoCard);
        hiddenLinear = view.findViewById(R.id.hiddenLinear);
        optionsLinear = view.findViewById(R.id.optionsLinear);
        one = view.findViewById(R.id.one);
        two = view.findViewById(R.id.two);
        three = view.findViewById(R.id.three);
        four = view.findViewById(R.id.four);
        five = view.findViewById(R.id.five);
        six = view.findViewById(R.id.six);
        seven = view.findViewById(R.id.seven);
        eight = view.findViewById(R.id.eight);
        nine = view.findViewById(R.id.nine);
        ten = view.findViewById(R.id.ten);
        eleven = view.findViewById(R.id.eleven);
        twelve = view.findViewById(R.id.twelve);
        thirteen = view.findViewById(R.id.thirteen);
        fourteen = view.findViewById(R.id.fourteen);
        fifteen = view.findViewById(R.id.fifteen);
        sixteen = view.findViewById(R.id.sixteen);
        seventeen = view.findViewById(R.id.seventeen);
        eighteen = view.findViewById(R.id.eighteen);
        nineteen = view.findViewById(R.id.nineteen);
        twenty = view.findViewById(R.id.twenty);
        twentyone = view.findViewById(R.id.twentyone);
        twentytwo = view.findViewById(R.id.twentytwo);
        twentythree = view.findViewById(R.id.twentythree);
        twentyfour = view.findViewById(R.id.twentyfour);
        twentyfive = view.findViewById(R.id.twentyfive);
        twentysix = view.findViewById(R.id.twentysix);
        twentyseven = view.findViewById(R.id.twentyseven);
        twentyeight = view.findViewById(R.id.twentyeight);
        twentynine = view.findViewById(R.id.twentynine);
        thirty = view.findViewById(R.id.thirty);
        linear1 = view.findViewById(R.id.firstLinear);
        linear2 = view.findViewById(R.id.secondLinear);
        linear3 = view.findViewById(R.id.thirdLinear);
        linear4 = view.findViewById(R.id.fourthLinear);
        radio1 = view.findViewById(R.id.firstRadio);
        radio2 = view.findViewById(R.id.secondRadio);
        radio3 = view.findViewById(R.id.thirdRadio);
        radio4 = view.findViewById(R.id.fourthRadio);
        image1 = view.findViewById(R.id.firstImage);
        image2 = view.findViewById(R.id.secondImage);
        image3 = view.findViewById(R.id.thirdImage);
        image4 = view.findViewById(R.id.fourthImage);
        final LinearLayout parent = view.findViewById(R.id.parent);
        enableDisable(questionNumber);
        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(radio1);
            }
        });
        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(radio2);
            }
        });
        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(radio3);
            }
        });
        linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(radio4);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionNumber++;
                enableDisable(questionNumber);
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionNumber--;
                enableDisable(questionNumber);
            }
        });
        traverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.GONE);
                scrollView.setAlpha(0);
                clearSelection.setVisibility(View.GONE);
                clearSelection.setAlpha(0);
                hiddenLinear.setVisibility(View.GONE);
                hiddenLinear.setAlpha(0);
                submit.setVisibility(View.GONE);
                submit.setAlpha(0);
                cardView.setTranslationY(1000);
                cardView.setVisibility(View.VISIBLE);
                cardView.animate().translationYBy(-1000).setDuration(500).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        one.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(1);
                            }
                        });
                        two.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(2);
                            }
                        });
                        three.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(3);
                            }
                        });
                        four.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(4);
                            }
                        });
                        five.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(5);
                            }
                        });
                        six.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(6);
                            }
                        });
                        seven.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(7);
                            }
                        });
                        eight.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(8);
                            }
                        });
                        nine.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(9);
                            }
                        });
                        ten.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(10);
                            }
                        });
                        eleven.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(11);
                            }
                        });
                        twelve.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(12);
                            }
                        });
                        thirteen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(13);
                            }
                        });
                        fourteen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(14);
                            }
                        });
                        fifteen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(15);
                            }
                        });
                        sixteen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(16);
                            }
                        });
                        seventeen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(17);
                            }
                        });
                        eighteen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(18);
                            }
                        });
                        nineteen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(19);
                            }
                        });
                        twenty.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(20);
                            }
                        });
                        twentyone.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(21);
                            }
                        });
                        twentytwo.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(22);
                            }
                        });
                        twentythree.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(23);
                            }
                        });
                        twentyfour.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(24);
                            }
                        });
                        twentyfive.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(25);
                            }
                        });
                        twentysix.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(26);
                            }
                        });
                        twentyseven.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(27);
                            }
                        });
                        twentyeight.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(28);
                            }
                        });
                        twentynine.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(29);
                            }
                        });
                        thirty.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                clickGoTo(30);
                            }
                        });
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parent.animate().alpha(0).setDuration(500).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        parent.setVisibility(View.GONE);
                        dataPasser.onDataPass(position,chosenOptions);
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
            }
        });
        clearSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio1.setChecked(false); radio2.setChecked(false); radio3.setChecked(false); radio4.setChecked(false);
                if(chosenOptions.get(questionNumber)!=null) chosenOptions.remove(questionNumber);
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dataPasser = (OndataPass) context;
    }
    public void enableDisable(int question){
        if(question == 1) {
            previous.setEnabled(false);
            next.setEnabled(true);
        }
        else if(question == 30){
            next.setEnabled(false);
            previous.setEnabled(true);
        }
        else {
            previous.setEnabled(true);
            next.setEnabled(true);
        }
        setOptions();
        if(chosenOptions.get(question)!=null){
            switch (chosenOptions.get(question)){
                case 1:
                    radio1.setChecked(true);
                    radio2.setChecked(false); radio3.setChecked(false); radio4.setChecked(false);
                    break;
                case 2:
                    radio2.setChecked(true);
                    radio1.setChecked(false); radio3.setChecked(false); radio4.setChecked(false);
                    break;
                case 3:
                    radio3.setChecked(true);
                    radio1.setChecked(false); radio2.setChecked(false); radio4.setChecked(false);
                    break;
                case 4:
                    radio4.setChecked(true);
                    radio1.setChecked(false); radio2.setChecked(false); radio3.setChecked(false);
                    break;
            }
        }else{
            radio1.setChecked(false); radio2.setChecked(false); radio3.setChecked(false); radio4.setChecked(false);
        }
    }
    public void checkAnswer(RadioButton clickedRadio){
       int selected = checkRadio(clickedRadio);
       chosenOptions.put(questionNumber,selected);
    }
    public int checkRadio(RadioButton clickedRadio){
        switch (clickedRadio.getId()){
            case R.id.firstRadio:
                radio1.setChecked(true);
                radio2.setChecked(false); radio3.setChecked(false); radio4.setChecked(false);
                return 1;
            case R.id.secondRadio:
                radio2.setChecked(true);
                radio1.setChecked(false); radio3.setChecked(false); radio4.setChecked(false);
                return 2;
            case R.id.thirdRadio:
                radio3.setChecked(true);
                radio1.setChecked(false); radio2.setChecked(false); radio4.setChecked(false);
                return 3;
            case R.id.fourthRadio:
                radio4.setChecked(true);
                radio1.setChecked(false); radio2.setChecked(false); radio3.setChecked(false);
                return 4;
            default:
                return -1;
        }
    }
    public void setOptions(){
        switch (position){
            case 0:
                setImage(currentPhyQuestions,currentPhyOptions);
                break;
            case 1:
                setImage(currentChemQuestions,currentChemOptions);
                break;
            case 2:
                setImage(currentMathQuestions,currentMathOptions);
                break;
        }
    }
    public void clickGoTo(final int question){
        enableDisable(question);
        cardView.animate().translationYBy(1000).setDuration(500).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                cardView.setVisibility(View.GONE);
                cardView.setTranslationY(-1000);
                questionNumber = question;
                enableDisable(question);
                scrollView.setVisibility(View.VISIBLE);
                hiddenLinear.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                clearSelection.setVisibility(View.VISIBLE);
                scrollView.animate().alpha(1).setDuration(500);
                hiddenLinear.animate().alpha(1).setDuration(500);
                submit.animate().alpha(1).setDuration(500);
                clearSelection.animate().alpha(1).setDuration(500);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
    public void setImage(ArrayList<Integer> x,ArrayList<Integer> y){
        image1.setImageResource(y.get((questionNumber-1)*4));
        image2.setImageResource(y.get((questionNumber-1)*4+1));
        image3.setImageResource(y.get((questionNumber-1)*4+2));
        image4.setImageResource(y.get((questionNumber-1)*4+3));
        questionImage.setImageResource(x.get(questionNumber-1));
    }
}


