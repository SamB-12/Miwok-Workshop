package com.example.miwok_workshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiwokAdapter extends RecyclerView.Adapter<MiwokAdapter.MiwokViewholder> {

    private Context context;
    private List<MiwokModel> miwokModelList;
    private int colorResId;

    public MiwokAdapter(Context context,List<MiwokModel> list,int colorResId){
        this.context = context;
        this.miwokModelList = list;
        this.colorResId = colorResId;
    }


    @NonNull
    @Override
    public MiwokViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        MiwokViewholder miwokViewholder = new MiwokViewholder(view);
        return miwokViewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiwokViewholder holder, int position) {
        holder.miwokWord.setText(miwokModelList.get(position).getMiwokWord());
        holder.translateWord.setText(miwokModelList.get(position).getMiwokTranslate());
        if(miwokModelList.get(position).hasImage()){
            holder.image.setImageResource(miwokModelList.get(position).getImagResId());
            holder.image.setVisibility(View.VISIBLE);
        }
        else {
            holder.image.setVisibility(View.GONE);
        }
        int  color = ContextCompat.getColor(context, colorResId);
        holder.textContainer.setBackgroundColor(color);

    }

    @Override
    public int getItemCount() {
        return miwokModelList.size();

    }

    class MiwokViewholder extends RecyclerView.ViewHolder{

        TextView miwokWord, translateWord;
        ImageView image;
        View textContainer;


        public MiwokViewholder(@NonNull View itemView) {
            super(itemView);
            miwokWord = itemView.findViewById(R.id.tv1);
            translateWord = itemView.findViewById(R.id.tv2);
            image = itemView.findViewById(R.id.image1);
            textContainer = itemView.findViewById(R.id.text_container);

        }
    }

}
