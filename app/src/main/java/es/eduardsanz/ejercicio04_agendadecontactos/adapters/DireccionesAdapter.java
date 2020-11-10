package es.eduardsanz.ejercicio04_agendadecontactos.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import es.eduardsanz.ejercicio04_agendadecontactos.R;
import es.eduardsanz.ejercicio04_agendadecontactos.modelos.Direccion;

public class DireccionesAdapter extends ArrayAdapter<Direccion> {

    private Context context;
    private List<Direccion> objects;
    private int resource;

    public DireccionesAdapter(@NonNull Context context, int resource, @NonNull List<Direccion> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View fila = LayoutInflater.from(context).inflate(resource, null);

        TextView txtTipo = fila.findViewById(R.id.txtTipoDireccionFilaDir);
        TextView txtCalle = fila.findViewById(R.id.txtCalleFilaDir);
        TextView txtNumero = fila.findViewById(R.id.txtNumeroFilaDir);
        TextView txtCiudad = fila.findViewById(R.id.txtCiudadFilaDir);

        txtTipo.setText(objects.get(position).getNombre());
        txtCalle.setText(objects.get(position).getCalle());
        txtNumero.setText(String.valueOf(objects.get(position).getNumero()));
        txtCiudad.setText(objects.get(position).getCiudad());

        return fila;
    }
}
