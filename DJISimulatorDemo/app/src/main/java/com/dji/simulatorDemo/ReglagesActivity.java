package com.dji.simulatorDemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class ReglagesActivity extends AppCompatActivity {

    private EditText mEditTextRollVitesse;

    private EditText mEditTextRollDistance1;
    private EditText mEditTextRollDistance2;
    private EditText mEditTextRollDistance3;

    private EditText mEditTextStop1;
    private EditText mEditTextStop2;
    private EditText mEditTextStop3;

    private EditText mEditTextPitchDistance1;
    private EditText mEditTextPitchDistance2;
    private EditText mEditTextPitchDistance3;

    private EditText mEditTextPitchVitesse1;
    private EditText mEditTextPitchVitesse2;
    private EditText mEditTextPitchVitesse3;

    private Button mBtnOk;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglages);

        mBtnOk = findViewById(R.id.btn_ok);

        mEditTextPitchDistance2 = findViewById(R.id.edittext_dist_pitch_2);
        mEditTextPitchDistance3 = findViewById(R.id.edittext_dist_pitch_3);
        mEditTextPitchDistance1 = findViewById(R.id.edittext_dist_pitch_1);

        mEditTextPitchVitesse1 = findViewById(R.id.edittext_v_pitch_1);
        mEditTextPitchVitesse2 = findViewById(R.id.edittext_v_pitch_2);
        mEditTextPitchVitesse3 = findViewById(R.id.edittext_v_pitch_3);

        mEditTextRollDistance1 = findViewById(R.id.edittext_dist_roll_1);
        mEditTextRollDistance2 = findViewById(R.id.edittext_dist_roll_2);
        mEditTextRollDistance3 = findViewById(R.id.edittext_dist_roll_3);

        mEditTextRollVitesse = findViewById(R.id.edittext_vitesse_roll);

        mEditTextStop1 = findViewById(R.id.edittext_stop_1);
        mEditTextStop2 = findViewById(R.id.edittext_stop_2);
        mEditTextStop3 = findViewById(R.id.edittext_stop_3);

        mEditTextStop1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



    }
}
