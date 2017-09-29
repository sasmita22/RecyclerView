package com.hiroshi.myapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


/**
 * Created by hiros on 9/28/2017.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder>{
    Context context;
    List<Profile> profiles;

    public ViewAdapter(Context context, List<Profile> profiles) {
        this.context = context;
        this.profiles = profiles;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /*View view = (LayoutInflater.from(context)).inflate(R.layout.profile_card,parent,false);
        return new ViewHolder(view);*/
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.profile_card, null, false);
        ViewHolder adapter = new ViewHolder(view);

        return adapter;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Profile profile = profiles.get(position);
        holder.imageView.setImageResource(profile.getImage());
        holder.namaView.setText(profile.getNama());
        holder.statusView.setText(profile.getStatus());
        
        holder.namaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Test", Toast.LENGTH_SHORT).show();
            }
        });

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Nama : Haii" , Toast.LENGTH_SHORT).show();
                //Log.d("Halo", String.valueOf(context));
            }
        });
    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        View mView;
        ImageView imageView;
        TextView namaView;
        TextView statusView;

        public ViewHolder(View itemView) {
            super(itemView);

            mView = itemView;
            imageView = (ImageView) itemView.findViewById(R.id.gambar);
            namaView =  (TextView) itemView.findViewById(R.id.text_nama);
            statusView = (TextView) itemView.findViewById(R.id.text_status);
        }
    }
}
