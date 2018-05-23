package com.example.dovah.newsapp_10;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    Context mContext;
    List<Article> mData;


    public RecyclerViewAdapter(Context mContext, List<Article> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        final MyViewHolder viewHolder=new MyViewHolder(itemView);

        viewHolder.containerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = viewHolder.getAdapterPosition();
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                String site=mData.get(position).getUrl();
                Uri website=Uri.parse(site);
                webIntent.setData(website);
                if (webIntent.resolveActivity(mContext.getPackageManager()) != null) {
                    mContext.startActivity(webIntent);}
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titleTextView.setText(mData.get(position).getTitle());
        holder.sectionTextView.setText(mData.get(position).getSection());
        holder.authorTextView.setText(mData.get(position).getAuthor());
        holder.dateTextView.setText(mData.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView titleTextView;
        private TextView sectionTextView;
        private TextView authorTextView;
        private TextView dateTextView;
        private RelativeLayout containerView;


        public MyViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.title);
            sectionTextView = itemView.findViewById(R.id.section);
            authorTextView = itemView.findViewById(R.id.author);
            dateTextView = itemView.findViewById(R.id.date);
            containerView=itemView.findViewById(R.id.container);

        }
    }
}
