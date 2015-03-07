package co.projectapp.appuntes.customView;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;

import co.projectapp.appuntes.R;
import co.projectapp.appuntes.model.Note;

public class CustomviewNoteAdapter extends BaseAdapter {

    private List<Note> objects = new ArrayList<Note>();

    private Context context;
    private LayoutInflater layoutInflater;

    public CustomviewNoteAdapter(Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Note getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.customview_note, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.linearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout);
            viewHolder.textViewDia = (TextView) convertView.findViewById(R.id.textView_dia);
            viewHolder.textViewMes = (TextView) convertView.findViewById(R.id.textView_mes);
            viewHolder.imageViewTipo = (ImageView) convertView.findViewById(R.id.imageView_tipo);
            viewHolder.textViewDescripcion = (TextView) convertView.findViewById(R.id.textView_descripcion);
            viewHolder.textViewAutor = (TextView) convertView.findViewById(R.id.textView_autor);

            convertView.setTag(viewHolder);
        }
        initializeViews((Note)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(Note object, ViewHolder holder) {
        holder.textViewAutor.setText(object.getAuthor());
        holder.textViewDescripcion.setText(object.getDesc());
        holder.textViewDia.setText(object.getDay());
        holder.textViewMes.setText(object.getMonth());
        holder.imageViewTipo.setImageResource(object.getType());
    }

    protected class ViewHolder {
        private LinearLayout linearLayout;
    private TextView textViewDia;
    private TextView textViewMes;
    private ImageView imageViewTipo;
    private TextView textViewDescripcion;
    private TextView textViewAutor;
    }
}
