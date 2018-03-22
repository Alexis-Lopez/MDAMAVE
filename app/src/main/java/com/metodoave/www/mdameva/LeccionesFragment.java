package com.metodoave.www.mdameva;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.metodoave.www.mdameva.Adapters.AdapterLecciones;
import com.metodoave.www.mdameva.Modelos.Lecciones;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeccionesFragment extends Fragment {


    public LeccionesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lecciones, container, false);

       /* android.support.v7.widget.RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tvLecciones);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        AdapterLecciones v = new AdapterLecciones(buidClientes(),R.layout.item_leccion,getActivity());
        recyclerView.setAdapter(v);*/

        return view;
    }

    public ArrayList<Lecciones> buidClientes(){
        ArrayList<Lecciones> lecion = new ArrayList<>();
        lecion.add(new Lecciones("Leccion 1","Pregunta 1"));
        lecion.add(new Lecciones("Leccion 2","Pregunta 1"));
        lecion.add(new Lecciones("Leccion 3","Pregunta 1"));
        lecion.add(new Lecciones("Leccion 4","Pregunta 1"));
        lecion.add(new Lecciones("Leccion 5","Pregunta 1"));
        return lecion;
    }

}
