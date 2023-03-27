package com.example.neatlearn.neatLearn;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.neatlearn.EditProfile;
import com.example.neatlearn.R;
import com.example.neatlearn.forgotPassword;
import com.example.neatlearn.studentLogin;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link profileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class profileFragment extends Fragment {

    @BindView(R.id.btnLogout)
    Button logout;

    @BindView(R.id.btnEditProfile)
    Button editButton;

    @BindView(R.id.aboutImageView)
    ImageView aboutImgView;

    @BindView(R.id.newReleasedImageView)
    ImageView newReleasedImgView;

    @BindView(R.id.notifyImageView)
    ImageView notificationImgView;
    Unbinder unbinder;

    @BindView(R.id.textPassChange)
    TextView passChange;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public profileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment profileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static profileFragment newInstance(String param1, String param2) {
        profileFragment fragment = new profileFragment();
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

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        unbinder = ButterKnife.bind(this,view);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("credentials", Context.MODE_PRIVATE);
                sp.edit().remove("USERNAME").commit();
                sp.edit().remove("PASSWORD").commit();
                sp.edit().apply();

                startActivity(new Intent(getActivity(), studentLogin.class));
                getActivity().finish();
            }
        });

        passChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), forgotPassword.class));
            }
        });

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), EditProfile.class);
                startActivity(i);
            }
        });

        newReleasedImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragementRepl(new NewReleased());
            }
        });

        notificationImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),NotificatioView.class);
                startActivity(i);
            }
        });
        aboutImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),AboutUs.class);
                startActivity(i);
            }
        });
        return view;
    }
    protected void fragementRepl(Fragment fragement){
        FragmentManager fragementmanager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragementTransaction = fragementmanager.beginTransaction();

        fragementTransaction.replace(R.id.frameLayout,fragement);
        fragementTransaction.commit();
    }
}