package com.example.neatlearn.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.neatlearn.EditProfile;
import com.example.neatlearn.R;
import com.example.neatlearn.models.GeneralModel;
import com.example.neatlearn.neatLearn.CourseTopics;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;

public class CourcesAdapter extends RecyclerView.Adapter <CourcesAdapter.ViewHolder>{

    Context context;
    ArrayList<GeneralModel> data=new ArrayList<>();
    public CourcesAdapter(Context context, ArrayList<GeneralModel> data) {
        this.context=context;
        this.data=data;
    }

    @NonNull
    @Override
    public CourcesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cources_recycleview, viewGroup, false);
        return new CourcesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        ImageLoader imageLoader = ImageLoader.getInstance();
        DisplayImageOptions option1;
        imageLoader.init(ImageLoaderConfiguration.createDefault(context.getApplicationContext()));
        option1 = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .build();

        imageLoader.displayImage(data.get(position).getImage_path(),viewHolder.img,option1);

        viewHolder.course.setText(data.get(position).getName());
        viewHolder.type.setText(data.get(position).getDepartment());
        String coursename=data.get(position).getName();
        viewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(context.getApplicationContext(), CourseTopics.class);
                    i.putExtra("course_name",coursename);
                    i.setFlags(i.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView course,type;
        ImageView img;
        CardView cv;
        public ViewHolder(View view) {
            super(view);
            course=view.findViewById(R.id.couese_name);
            type=view.findViewById(R.id.cource_type);
            img = view.findViewById(R.id.cource_img);
            cv = view.findViewById(R.id.card_view);

        }
    }
}
