package co.projectapp.appuntes;


import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;

public class FragmentRegistroFragment extends Fragment implements View.OnClickListener {

    private TextView textViewTitulo;
    private Spinner spinnerInstituciones;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_registro, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textViewTitulo = (TextView) view.findViewById(R.id.textView_titulo);
        spinnerInstituciones = (Spinner) view.findViewById(R.id.spinner_instituciones);
        view.findViewById(R.id.button_aceptar).setOnClickListener(this);
    }

    private EditText getEditTextNombre(){
        return (EditText) getView().findViewById(R.id.editText_nombre);
    }

    private EditText getEditTextPassword(){
        return (EditText) getView().findViewById(R.id.editText_password);
    }

    private EditText getEditTextTelefono(){
        return (EditText) getView().findViewById(R.id.editText_telefono);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_aceptar:
                Toast.makeText(getActivity(), "Usuario Agregado!", Toast.LENGTH_LONG).show();
                getFragmentManager().popBackStack();
                break;
        }
    }
}
