package co.projectapp.appuntes;


import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;

public class FragmentDetalleNotaFragment extends Fragment {

    private TextView textViewNotaDesc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle_nota, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        textViewNotaDesc = (TextView) view.findViewById(R.id.textView_notaDesc);
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = this.getArguments();
        int idnota = -1;
        if(bundle != null) {
            idnota = bundle.getInt("idnota");

        }

        if (idnota == -1)
        {
            textViewNotaDesc.setText("Ayer en la clase el profesor mario nos hablo de la importancia, de las matematicas en las antiguas civilizaciones, por ejemplo los mayas tenias su propio sistema de numeracion lo que les permitia comerciar de manera mas sencilla");
        }
    }

}
