package co.projectapp.appuntes;


import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;

public class FragmentRegistroFragment extends Fragment implements View.OnClickListener {

    private TextView textView2;
    private Spinner spinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_registro, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.imageButton).setOnClickListener(this);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        spinner = (Spinner) view.findViewById(R.id.spinner);
        view.findViewById(R.id.button3).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton:
               getFragmentManager().popBackStack();
                break;
            case R.id.button3:
                Toast.makeText(getActivity(),"Usuario Agregado!",Toast.LENGTH_LONG).show();
                getFragmentManager().popBackStack();

                break;
        }
    }

    private EditText getEditText3(){
        return (EditText) getView().findViewById(R.id.editText3);
    }

    private EditText getEditText4(){
        return (EditText) getView().findViewById(R.id.editText4);
    }

    private EditText getEditText5(){
        return (EditText) getView().findViewById(R.id.editText5);
    }
}
