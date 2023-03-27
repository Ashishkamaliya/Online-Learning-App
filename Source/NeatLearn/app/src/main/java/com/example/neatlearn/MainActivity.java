package com.example.neatlearn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.neatlearn.neatLearn.NewReleased;
import com.example.neatlearn.neatLearn.homeFragment;
import com.example.neatlearn.neatLearn.profileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        nav=findViewById(R.id.bottomNavBar);
        fragementRepl(new homeFragment());
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.menuHome:
                        fragementRepl(new homeFragment());
                        break;

                    case R.id.menuNewReleased:
                        fragementRepl(new NewReleased());
                        break;

                    case R.id.menuProfile:
                        fragementRepl(new profileFragment());
                        break;
                }
                return true;
            }
        });
    }
    protected void fragementRepl(Fragment fragement){
        FragmentManager fragementmanager = getSupportFragmentManager();
        FragmentTransaction fragementTransaction = fragementmanager.beginTransaction();


        fragementTransaction.replace(R.id.frameLayout,fragement);
        fragementTransaction.commit();
    }
}