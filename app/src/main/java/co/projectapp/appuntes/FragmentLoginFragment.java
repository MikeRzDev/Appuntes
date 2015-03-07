package co.projectapp.appuntes;


import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

public class FragmentLoginFragment extends Fragment implements View.OnClickListener {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = (TextView) view.findViewById(R.id.textView_tituloCurso);
        view.findViewById(R.id.button).setOnClickListener(this);
        view.findViewById(R.id.button2).setOnClickListener(this);
    }

    private EditText getEditText2(){
        return (EditText) getView().findViewById(R.id.editText2);
    }

    private EditText getEditText(){
        return (EditText) getView().findViewById(R.id.editText);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                UIHelper.changeFragment(R.id.container,getFragmentManager(),
                        new FragmentRegistroFragment(),"registroFrag",null);
                break;
            case R.id.button2:
                UIHelper.changeFragment(R.id.container,getFragmentManager(),
                        new FragmentSelectgroupFragment(),"selGrpFrag",null );
                break;
        }
    }
}
