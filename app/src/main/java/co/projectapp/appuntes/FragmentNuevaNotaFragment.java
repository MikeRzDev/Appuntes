package co.projectapp.appuntes;


import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.Button;

public class FragmentNuevaNotaFragment extends Fragment implements View.OnClickListener {

    private TextView textViewTitulo;
    private TextView textView2;
    private Spinner spinnerTipo;
    private TextView textView3;
    private TextView textView5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nueva_nota, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textViewTitulo = (TextView) view.findViewById(R.id.textView_titulo);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        spinnerTipo = (Spinner) view.findViewById(R.id.spinner_tipo);
        textView3 = (TextView) view.findViewById(R.id.textView3);
        textView5 = (TextView) view.findViewById(R.id.textView5);
        view.findViewById(R.id.button_foto).setOnClickListener(this);
        view.findViewById(R.id.button_aceptar).setOnClickListener(this);
    }

    private EditText getEditTextDesc(){
        return (EditText) getView().findViewById(R.id.editText_desc);
    }

    private EditText getEditTextNotaTxt(){
        return (EditText) getView().findViewById(R.id.editText_notaTxt);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_foto:
                //TODO implement
                break;
            case R.id.button_aceptar:
                //TODO implement
                break;
        }
    }
}
