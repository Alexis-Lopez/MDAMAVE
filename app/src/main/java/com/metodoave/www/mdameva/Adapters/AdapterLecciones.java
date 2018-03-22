package com.metodoave.www.mdameva.Adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.metodoave.www.mdameva.Modelos.Lecciones;
import com.metodoave.www.mdameva.R;

import java.util.ArrayList;

/**
 * Created by ISA on 3/14/2018.
 */

public class AdapterLecciones extends RecyclerView.Adapter<AdapterLecciones.VielHolder> {
    private ArrayList<Lecciones> lecciones;
    private int resources;
    private Activity activity;

    public AdapterLecciones(ArrayList<Lecciones> lecciones, int resources, Activity activity) {
        this.lecciones = lecciones;
        this.resources = resources;
        this.activity = activity;
    }



    @Override
    public AdapterLecciones.VielHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resources,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(AdapterLecciones.VielHolder holder, int position) {
        Lecciones leccione = lecciones.get(position);
        holder.DesciptionLeccion.setText(leccione.getDescription());
    }

    @Override
    public int getItemCount() {
        return lecciones.size();
    }

    public class VielHolder extends RecyclerView.ViewHolder {
        private TextView DesciptionLeccion;
        private ImageView imageView;

        public VielHolder(View itemView) {
            super(itemView);

            DesciptionLeccion = (TextView) itemView.findViewById(R.id.tvLecciones);
        }
    }
}
