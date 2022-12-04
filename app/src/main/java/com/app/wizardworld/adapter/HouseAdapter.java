package com.app.wizardworld.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.wizardworld.R;
import com.app.wizardworld.model.House;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HouseAdapter extends RecyclerView.Adapter<HouseAdapter.HouseAdapterVH> {
    private List<House> houseList;
    private Context context;

    public HouseAdapter(){

    }

    public void setData(List<House> houseList){
        this.houseList = houseList;
        notifyDataSetChanged();

    }


    @NonNull
    @Override
    public HouseAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new HouseAdapter.HouseAdapterVH(LayoutInflater.from(context).inflate(R.layout.row_houses, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HouseAdapterVH holder, int position) {

        House house = houseList.get(position);

        String name = house.getName();
        String founder = house.getFounder();


        holder.houseName.setText(name);
        holder.houseFounder.setText(founder);
        holder.houseImage.setImageResource(R.drawable.houses);
    }

    @Override
    public int getItemCount() {
        return houseList.size();
    }

    public class HouseAdapterVH extends RecyclerView.ViewHolder {

        ImageView houseImage;
        TextView houseName;
        TextView houseFounder;



        public HouseAdapterVH(@NonNull View itemView) {
            super(itemView);

            houseImage = itemView.findViewById(R.id.houseImage);
            houseName = itemView.findViewById(R.id.houseName);
            houseFounder = itemView.findViewById(R.id.houseFounder);
        }
    }
}
