package co.projectapp.appuntes;


import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import co.projectapp.appuntes.model.Group;

public class FragmentSelectgroupFragment extends Fragment {

    private ListView listView2;
    private List<Group> grupos = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_selectgroup, null);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView2 = (ListView) view.findViewById(R.id.listView_cursos);








    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = this.getArguments();
        if(bundle != null) {

        }
        ((ActionBarActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        if (grupos.size() == 0) {
            grupos.add(new Group(R.drawable.matematica, "Calculo 3", "Prof William"));
            grupos.add(new Group(R.drawable.quimica, "Quimica", "Prof Sandra Rizo"));
            grupos.add(new Group(R.drawable.biologia, "Biologia", "Prof Martha Barrera"));
            grupos.add(new Group(R.drawable.literatura, "Literatura", "Prof Nacho Soriano"));
            grupos.add(new Group(R.drawable.quimica, "Quimica II", "Prof Carlos Rodriguez"));
            grupos.add(new Group(R.drawable.literatura, "Literatura Hispana", "Prof Marcos Gantogui"));
        }

            CustomviewAddedgroupAdapter items = new CustomviewAddedgroupAdapter(getActivity(), grupos);

            listView2.setAdapter(items);

            listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    UIHelper.changeFragment(R.id.container, getFragmentManager(), new FragmentViewgroupFragment(), "", null);
                }
            });





    }





}
