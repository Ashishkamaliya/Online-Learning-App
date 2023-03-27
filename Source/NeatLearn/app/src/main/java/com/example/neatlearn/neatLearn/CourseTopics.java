package com.example.neatlearn.neatLearn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.neatlearn.Adapter.courseItemsAdapter;
import com.example.neatlearn.R;
import com.example.neatlearn.models.GeneralModel;

import java.util.ArrayList;
import java.util.Objects;

public class CourseTopics extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<GeneralModel> course_Items_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_topics);

        recyclerView = findViewById(R.id.course_item_recycleview);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // getSupportActionBar().setTitle("Department");
        Intent i=getIntent();
        String coursename=i.getStringExtra("course_name");
        getSupportActionBar().setTitle(coursename);

        if(Objects.equals(coursename, "Java")) {
            getJAVAItems();
        }
        else if(Objects.equals(coursename, "c#")) {
            getCSItems();
        }
        else if(Objects.equals(coursename, "HTML")) {
            getHTMLItems();
        }
        else if(Objects.equals(coursename, "Python")) {
            getPYTHONItems();
        }
        else if(Objects.equals(coursename, "PHP")) {
            getPHPItems();
        }
        else if(Objects.equals(coursename, "C++")){
            getCPPItems();
        }
        else{
            Toast.makeText(getApplicationContext(),"Invalid Selection..",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    void getCPPItems(){
        GeneralModel item = new GeneralModel();
        item.setId("CPP_1");
        item.setName("Introduction");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_2");
        item.setName("Variables");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_3");
        item.setName("Data Types");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_4");
        item.setName("Operators");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_5");
        item.setName("Conditions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_6");
        item.setName("Loops");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_7");
        item.setName("Arrays");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_8");
        item.setName("Pointers");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_9");
        item.setName("References");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_10");
        item.setName("Functions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_11");
        item.setName("Classes");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_12");
        item.setName("Access Specifier");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_13");
        item.setName("Constructors");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_14");
        item.setName("Inheritance");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_15");
        item.setName("Encapsulation");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_16");
        item.setName("Polymorphism");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_17");
        item.setName("Files");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CPP_18");
        item.setName("Exceptions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        courseItemsAdapter department=new courseItemsAdapter(getApplicationContext(),course_Items_list);
        recyclerView.setAdapter(department);
        recyclerView.setLayoutManager(new LinearLayoutManager(CourseTopics.this));
    }
    void getJAVAItems(){
        GeneralModel item = new GeneralModel();
        item.setId("JAVA_1");
        item.setName("Introduction");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_2");
        item.setName("Variables");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_3");
        item.setName("Data Types");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_4");
        item.setName("Conditions");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_5");
        item.setName("Loops");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_6");
        item.setName("Arrays");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_7");
        item.setName("Functions");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_8");
        item.setName("Classes");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_9");
        item.setName("Modifiers");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_10");
        item.setName("Package");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_11");
        item.setName("Constructors");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_12");
        item.setName("Inheritance");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_13");
        item.setName("Encapsulation");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_14");
        item.setName("Polymorphism");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_15");
        item.setName("ArrayList");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_16");
        item.setName("Abstraction");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_17");
        item.setName("Enums");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("JAVA_18");
        item.setName("Threads");
        item.setImage_path("https://img.icons8.com/nolan/512/java-coffee-cup-logo.png");
        course_Items_list.add(item);

        courseItemsAdapter department=new courseItemsAdapter(getApplicationContext(),course_Items_list);
        recyclerView.setAdapter(department);
        recyclerView.setLayoutManager(new LinearLayoutManager(CourseTopics.this));
    }
    void getCSItems(){
        GeneralModel item = new GeneralModel();
        item.setId("CS_1");
        item.setName("Introduction");
        item.setImage_path("https://img.icons8.com/nolan/512/cs.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_2");
        item.setName("Variables");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_3");
        item.setName("Data Types");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_4");
        item.setName("Conditions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_5");
        item.setName("Loops");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_6");
        item.setName("Arrays");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_7");
        item.setName("Functions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_8");
        item.setName("Properties");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_9");
        item.setName("Classes");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_10");
        item.setName("Modifiers");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_11");
        item.setName("Constructors");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_12");
        item.setName("Inheritance");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_13");
        item.setName("Encapsulation");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_14");
        item.setName("Polymorphism");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_15");
        item.setName("Files");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("CS_16");
        item.setName("Exceptions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        courseItemsAdapter department=new courseItemsAdapter(getApplicationContext(),course_Items_list);
        recyclerView.setAdapter(department);
        recyclerView.setLayoutManager(new LinearLayoutManager(CourseTopics.this));
    }
    void getHTMLItems(){
        GeneralModel item = new GeneralModel();
        item.setId("HTML_1");
        item.setName("Introduction");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_2");
        item.setName("Structure");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_3");
        item.setName("Elements");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_4");
        item.setName("Attributes");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_5");
        item.setName("Headings");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_6");
        item.setName("Paragraphs");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_7");
        item.setName("Styles");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_8");
        item.setName("Formatting");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_9");
        item.setName("Quotations");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_10");
        item.setName("Colors");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_11");
        item.setName("CSS");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_12");
        item.setName("Links");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_13");
        item.setName("Images");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_14");
        item.setName("Tables");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_1");
        item.setName("Forms");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_15");
        item.setName("Media");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("HTML_16");
        item.setName("Quotations");
        item.setImage_path("https://img.icons8.com/nolan/512/html-filetype.png");
        course_Items_list.add(item);

        courseItemsAdapter department=new courseItemsAdapter(getApplicationContext(),course_Items_list);
        recyclerView.setAdapter(department);
        recyclerView.setLayoutManager(new LinearLayoutManager(CourseTopics.this));
    }
    void getPYTHONItems(){
        GeneralModel item = new GeneralModel();
        item.setId("PYTHON_1");
        item.setName("Introduction");
        item.setImage_path("https://img.icons8.com/nolan/512/python.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_2");
        item.setName("Variables");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_3");
        item.setName("Data Types");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_4");
        item.setName("Lists");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_5");
        item.setName("Tuples");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_6");
        item.setName("Sets");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_7");
        item.setName("Dictionaries");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_8");
        item.setName("Operators");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_9");
        item.setName("Conditions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_10");
        item.setName("Loops");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_11");
        item.setName("Arrays");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);


        item = new GeneralModel();
        item.setId("PYTHON_12");
        item.setName("Functions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_13");
        item.setName("Classes");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_14");
        item.setName("Modules");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_15");
        item.setName("Inheritance");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_16");
        item.setName("Files");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PYTHON_17");
        item.setName("Exceptions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        courseItemsAdapter department=new courseItemsAdapter(getApplicationContext(),course_Items_list);
        recyclerView.setAdapter(department);
        recyclerView.setLayoutManager(new LinearLayoutManager(CourseTopics.this));
    }
    void getPHPItems(){
        GeneralModel item = new GeneralModel();
        item.setName("Introduction");
        item.setId("PHP_1");
        item.setImage_path("https://img.icons8.com/nolan/512/php.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_2");
        item.setName("Install");
        item.setImage_path("https://img.icons8.com/nolan/512/php.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_3");
        item.setName("Variables");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_4");
        item.setName("Data Types");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_5");
        item.setName("Operators");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_6");
        item.setName("Conditions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_7");
        item.setName("Loops");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_8");
        item.setName("Arrays");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_9");
        item.setName("Cookies");
        item.setImage_path("https://img.icons8.com/nolan/512/php.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_10");
        item.setName("Session");
        item.setImage_path("https://img.icons8.com/nolan/512/php.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_11");
        item.setName("Forms");
        item.setImage_path("https://img.icons8.com/nolan/512/php.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_12");
        item.setName("Classes");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_13");
        item.setName("Access Specifier");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_14");
        item.setName("Constructors");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);


        item = new GeneralModel();
        item.setId("PHP_15");
        item.setName("Destructor");
        item.setImage_path("https://img.icons8.com/nolan/512/php.png");
        course_Items_list.add(item);


        item = new GeneralModel();
        item.setId("PHP_16");
        item.setName("Abstraction");
        item.setImage_path("https://img.icons8.com/nolan/512/php.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_17");
        item.setName("Inheritance");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_18");
        item.setName("Encapsulation");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_19");
        item.setName("Polymorphism");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_20");
        item.setName("Files");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        item = new GeneralModel();
        item.setId("PHP_21");
        item.setName("Exceptions");
        item.setImage_path("https://img.icons8.com/nolan/512/c-plus-plus.png");
        course_Items_list.add(item);

        courseItemsAdapter department=new courseItemsAdapter(getApplicationContext(),course_Items_list);
        recyclerView.setAdapter(department);
        recyclerView.setLayoutManager(new LinearLayoutManager(CourseTopics.this));
    }
}