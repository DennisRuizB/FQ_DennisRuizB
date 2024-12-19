package com.example.restclientservweb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MensajeAdapter extends ArrayAdapter<Mensaje> {




    public MensajeAdapter(Context context, List<Mensaje> products) {
        super(context, 0, products);


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_mensajes, parent, false);
        }

        Mensaje mensaje = getItem(position);

        TextView textViewMensaje = convertView.findViewById(R.id.textViewMensaje);
        textViewMensaje.setText("message: "+ mensaje.getMensaje());

        return convertView;
    }

}
