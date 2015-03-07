package co.projectapp.appuntes;


import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import co.projectapp.appuntes.model.Group;
import co.projectapp.appuntes.model.Note;

public class FragmentViewgroupFragment extends Fragment {

    private ListView listView2;
    private List<Note> notas = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_viewgroup, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView2 = (ListView) view.findViewById(R.id.listView2);
        CustomviewNoteAdapter adapter = new CustomviewNoteAdapter(getActivity(),notas);

        notas.add(new Note("Febrero","25","Notas de la clase de matematica","Juan Ferrer",R.drawable.nota));
        notas.add(new Note("Marzo","3","aporte del grupo de camila mendez","Camila Mendez",R.drawable.voz));
        notas.add(new Note("Marzo","10","tablero del profesor","Jose Rodriguez",R.drawable.imagen));
        listView2.setAdapter(adapter);
    }

}
