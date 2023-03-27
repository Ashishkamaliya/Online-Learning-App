package com.example.neatlearn.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.neatlearn.MainActivity;
import com.example.neatlearn.R;
import com.example.neatlearn.models.GeneralModel;
import com.example.neatlearn.neatLearn.CourseTopics;
import com.example.neatlearn.neatLearn.topicTheory;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;

public class courseItemsAdapter extends RecyclerView.Adapter<courseItemsAdapter.ViewHolder> {

    Context context;
    ArrayList<GeneralModel> data=new ArrayList<>();

    public courseItemsAdapter(Context applicationContext, ArrayList<GeneralModel> course_items_list) {
        this.context = applicationContext;
        this.data = course_items_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.course_topics_recyclerview, viewGroup, false);
        return new courseItemsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.txtTopic.setText(data.get(position).getName());
        ImageLoader imageLoader = ImageLoader.getInstance();
        DisplayImageOptions option1;
        imageLoader.init(ImageLoaderConfiguration.createDefault(context.getApplicationContext()));
        option1 = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .build();

        imageLoader.displayImage(data.get(position).getImage_path(),viewHolder.image,option1);

        String topicname=data.get(position).getName();
        String topic_id=data.get(position).getId();

        viewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //Toast.makeText(context.getApplicationContext(), "hiii", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(context.getApplicationContext(), topicTheory.class);
                    i.putExtra("topic_id",topic_id);
                    i.putExtra("topic_name",topicname);
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
        TextView txtTopic;
//        LinearLayout card;
        CardView cv;
        ImageView image;

        public ViewHolder(View view) {
            super(view);

            txtTopic = view.findViewById(R.id.textTopic);
//            card = view.findViewById(R.id.topic_card);
            image = view.findViewById(R.id.imageCourse);
            cv = view.findViewById(R.id.cardView1);
        }
    }
}
