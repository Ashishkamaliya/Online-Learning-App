package com.example.neatlearn.neatLearn;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.neatlearn.R;
import com.example.neatlearn.studentLogin;

public class NewReleased extends Fragment {

    ImageView imageNotification;
    CardView cv1,cv2;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public NewReleased() {
        // Required empty public constructor
    }

    public static NewReleased newInstance(String param1, String param2) {
        NewReleased fragment = new NewReleased();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_released, container, false);

        imageNotification = view.findViewById(R.id.imageNotification);
        cv1 = view.findViewById(R.id.card_view1);
        cv2 = view.findViewById(R.id.card_view2);
        imageNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),NotificatioView.class);
                startActivity(i);
            }
        });

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CourseTopics.class);
                i.putExtra("course_name","Python");
                i.setFlags(i.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CourseTopics.class);
                i.putExtra("course_name","Java");
                i.setFlags(i.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });

        return view;
    }
}