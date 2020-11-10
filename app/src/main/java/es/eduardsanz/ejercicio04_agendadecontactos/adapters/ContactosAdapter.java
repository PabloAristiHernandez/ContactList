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
import es.eduardsanz.ejercicio04_agendadecontactos.modelos.Contacto;

public class ContactosAdapter extends ArrayAdapter<Contacto> {

    private Context context;
    private List<Contacto> objects;
    private int resource;

    public ContactosAdapter(@NonNull Context context, int resource, @NonNull List<Contacto> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View fila = LayoutInflater.from(context).inflate(resource, null);

        TextView txtNombre = fila.findViewById(R.id.txtNombreContactoFilaContacto);
        TextView txtApellidos = fila.findViewById(R.id.txtApellidosContactoFilaContacto);

        txtNombre.setText(objects.get(position).getNombre());
        txtApellidos.setText(objects.get(position).getApellidos());

        return fila;
    }
}
