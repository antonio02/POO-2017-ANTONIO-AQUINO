package utils;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;

import com.antonio.appleitura.R;

import java.util.Calendar;

/**
 * Created by antonio on 15/02/18.
 */

public class NumberPickerDialog extends DialogFragment {

    private NumberPicker num;
    private Button bMais;
    private Button bMenos;

    public static NumberPickerDialog newInstance(int maxValue, int minValue, int atual, String tag) {
        Bundle args = new Bundle();
        args.putInt("maxvalue", maxValue);
        args.putInt("minvalue", minValue);
        args.putInt("atualvalue", atual);
        args.putString("tag", tag);
        NumberPickerDialog fragment = new NumberPickerDialog();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_number_picker, container,false);
        num = v.findViewById(R.id.dialog_numPicker);
        num.setMinValue(getArguments().getInt("minvalue"));
        num.setMaxValue(getArguments().getInt("maxvalue"));
        num.setValue(getArguments().getInt("atualvalue"));
        num.setTag(getArguments().getString("tag"));
        num.setOnValueChangedListener((NumberPicker.OnValueChangeListener) getActivity());
        bMais = v.findViewById(R.id.dialog_btnMais);
        bMenos = v.findViewById(R.id.dialog_btnMenos);
        setupClicks();
        return v;
    }

    private void setupClicks() {
        bMais.setOnClickListener(view -> {
            num.setValue(num.getValue()+100);
            ((NumberPicker.OnValueChangeListener) getActivity()).onValueChange(
                    num,num.getValue(),num.getValue());
        });

        bMenos.setOnClickListener(view -> {
            num.setValue(num.getValue()-100);
            ((NumberPicker.OnValueChangeListener) getActivity()).onValueChange(
                    num,num.getValue(),num.getValue());
        });
    }
}
