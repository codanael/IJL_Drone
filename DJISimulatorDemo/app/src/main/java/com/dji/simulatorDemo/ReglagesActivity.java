package com.dji.simulatorDemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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

        mBtnOk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        validate();
                    }
                }
        );


    }
    private void validate(){
        Intent intent = new Intent();
        intent.putExtra("PitchDistance1",mEditTextPitchDistance1.getText());
        intent.putExtra("PitchDistance2",mEditTextPitchDistance2.getText());
        intent.putExtra("PitchDistance3",mEditTextPitchDistance3.getText());

        intent.putExtra("PitchVitesse1",mEditTextPitchVitesse1.getText());
        intent.putExtra("PitchVitesse2",mEditTextPitchVitesse2.getText());
        intent.putExtra("PitchVitesse3",mEditTextPitchVitesse3.getText());

        intent.putExtra("RollDistance1", mEditTextRollDistance1.getText());
        intent.putExtra("RollDistance2", mEditTextRollDistance2.getText());
        intent.putExtra("RollDistance3", mEditTextRollDistance3.getText());

        intent.putExtra("RollVitesse", mEditTextRollVitesse.getText());

        intent.putExtra("Stop1", mEditTextStop1.getText());
        intent.putExtra("Stop2", mEditTextStop2.getText());
        intent.putExtra("Stop3", mEditTextStop3.getText());

        setResult(RESULT_OK, intent);
        finish();

    }

}
