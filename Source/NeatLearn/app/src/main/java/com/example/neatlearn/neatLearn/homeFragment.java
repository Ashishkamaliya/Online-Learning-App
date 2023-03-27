package com.example.neatlearn.neatLearn;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.neatlearn.Adapter.CourcesAdapter;
import com.example.neatlearn.R;
import com.example.neatlearn.models.GeneralModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class homeFragment extends Fragment {
    ArrayList<GeneralModel> cource_list=new ArrayList<>();
    @BindView(R.id.cources_recycleview)
    RecyclerView recyclerView;

    @BindView(R.id.userImage)
    ImageView user_image;

    @BindView(R.id.textSearch)
    TextView search;

    Unbinder unbinder;

    public homeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this,view);

        getCourse();

        user_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragementRepl(new profileFragment());
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),SearchActivity.class));
            }
        });
        // Inflate the layout for this fragm
        return view;
    }
    void getCourse(){

        GeneralModel da=new GeneralModel();
        da.setId("1");
        da.setName("C++");
        da.setDepartment("Console");
        da.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        cource_list.add(da);

        da=new GeneralModel();
        da.setId("2");
        da.setName("Java");
        da.setDepartment("Console");
        da.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        cource_list.add(da);

        da=new GeneralModel();
        da.setId("4");
        da.setName("c#");
        da.setDepartment("Desktop App");
        da.setImage_path("https://img.icons8.com/nolan/512/cs.png");
        cource_list.add(da);

        da=new GeneralModel();
        da.setId("5");
        da.setName("HTML");
        da.setDepartment("Web Development");
        da.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        cource_list.add(da);

        da=new GeneralModel();
        da.setId("6");
        da.setName("Python");
        da.setDepartment("console");
        da.setImage_path("https://img.icons8.com/nolan/512/python.png");
        cource_list.add(da);

        da=new GeneralModel();
        da.setId("7");
        da.setName("PHP");
        da.setDepartment("Web Development");
        da.setImage_path("https://img.icons8.com/nolan/512/php.png");
        cource_list.add(da);
        da=new GeneralModel();

        //DepartmentAdapter department=new DepartmentAdapter(MainActivity.this,doctor_list);
        //doctor.setAdapter(department);
        //doctor.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        CourcesAdapter department=new CourcesAdapter(getContext(),cource_list);
        recyclerView.setAdapter(department);
        recyclerView.setLayoutManager(layoutManager);

    }
    protected void fragementRepl(Fragment fragement){
        FragmentManager fragementmanager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragementTransaction = fragementmanager.beginTransaction();

        fragementTransaction.replace(R.id.frameLayout,fragement);
        fragementTransaction.commit();
    }

}
