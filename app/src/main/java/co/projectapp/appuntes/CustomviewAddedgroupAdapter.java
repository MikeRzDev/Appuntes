package co.projectapp.appuntes;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import co.projectapp.appuntes.model.Group;

public class CustomviewAddedgroupAdapter extends BaseAdapter {

    private List<Group> objects = new ArrayList<Group>();

    private Context context;
    private LayoutInflater layoutInflater;

    public CustomviewAddedgroupAdapter(Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    public CustomviewAddedgroupAdapter(Context context,  List<Group> objects) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.objects = objects;
    }

    public void addItems(Group newItem){
        this.objects.add(newItem);
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Group getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.customview_addedgroup, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.imageViewTipoCurso = (ImageView) convertView.findViewById(R.id.imageView_tipoCurso);
            viewHolder.textViewTituloCurso = (TextView) convertView.findViewById(R.id.textView_tituloCurso);
            viewHolder.textViewDescCurso = (TextView) convertView.findViewById(R.id.textView_descCurso);

            convertView.setTag(viewHolder);
        }
        initializeViews((Group)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(Group object, ViewHolder holder) {
       holder.imageViewTipoCurso.setImageResource(object.getCursoImagenRes());
       holder.textViewDescCurso.setText(object.getCursoDesc());
        holder.textViewTituloCurso.setText(object.getCursoTitulo());
    }

    protected class ViewHolder {
        private ImageView imageViewTipoCurso;
    private TextView textViewTituloCurso;
    private TextView textViewDescCurso;
    }
}
