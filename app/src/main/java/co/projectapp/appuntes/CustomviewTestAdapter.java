package co.projectapp.appuntes;

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

public class CustomviewTestAdapter extends BaseAdapter {

    private List<String> objects = new ArrayList<String>();

    private Context context;
    private LayoutInflater layoutInflater;

    public CustomviewTestAdapter(Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public String getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.customview_test, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.linearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout);
            viewHolder.textViewDia = (TextView) convertView.findViewById(R.id.textView_dia);
            viewHolder.textViewMes = (TextView) convertView.findViewById(R.id.textView_mes);
            viewHolder.imageViewTipo = (ImageView) convertView.findViewById(R.id.imageView_tipo);
            viewHolder.textViewTitulo = (TextView) convertView.findViewById(R.id.textView_titulo);
            viewHolder.textViewDescripcion = (TextView) convertView.findViewById(R.id.textView_descripcion);

            convertView.setTag(viewHolder);
        }
        initializeViews((String)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(String object, ViewHolder holder) {

    }

    protected class ViewHolder {
        private LinearLayout linearLayout;
    private TextView textViewDia;
    private TextView textViewMes;
    private ImageView imageViewTipo;
    private TextView textViewTitulo;
    private TextView textViewDescripcion;
    }
}
