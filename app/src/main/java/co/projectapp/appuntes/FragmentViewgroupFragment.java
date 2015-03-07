package co.projectapp.appuntes;


import android.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        if (notas.size() == 0) {
            notas.add(new Note("Febrero", "25", "Notas de la clase de matematica", "Juan Ferrer", R.drawable.nota));
            notas.add(new Note("Marzo", "3", "aporte del grupo de camila mendez", "Camila Mendez", R.drawable.voz));
            notas.add(new Note("Marzo", "10", "tablero del profesor", "Jose Rodriguez", R.drawable.imagen));
        }
        listView2.setAdapter(adapter);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (notas.get(position).getType() == R.drawable.nota) {
                    int idNote = notas.get(position).getId();
                    Bundle b = new Bundle();
                    b.putInt("idnota",idNote);
                    UIHelper.changeFragment(R.id.container,getFragmentManager(),new FragmentDetalleNotaFragment(),"",b);
                }
                else if (notas.get(position).getType() == R.drawable.imagen) {
                    int idNote = notas.get(position).getId();
                    Bundle b = new Bundle();
                    b.putInt("idnota",idNote);
                    //UIHelper.changeFragment(R.id.container,getFragmentManager(),new FragmentDetalleNotaFragment(),"",b);
                }

            }
        });
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // TODO Add your menu entries here
        super.onCreateOptionsMenu(menu, inflater);
        //
        inflater.inflate(R.menu.notas_menu,menu);
        //menu.findItem(R.id.newNote).setVisible(true);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.newNote) {
            Toast.makeText(getActivity(),"add me",Toast.LENGTH_LONG).show();
            UIHelper.changeFragment(R.id.container,getFragmentManager(),new FragmentNuevaNotaFragment(),"",null);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
