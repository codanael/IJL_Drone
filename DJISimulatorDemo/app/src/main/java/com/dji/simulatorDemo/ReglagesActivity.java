package com.dji.simulatorDemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                        //Toast.makeText(ReglagesActivity.this,"Hello "+mEditTextPitchDistance1.getText(),Toast.LENGTH_LONG).show();
                        validate();
                    }
                }
        );


    }
    private void validate(){
        Intent intent = new Intent();
        intent.putExtra("PitchDistance1",getFloat(mEditTextPitchDistance1));
        intent.putExtra("PitchDistance2",getFloat(mEditTextPitchDistance2));
        intent.putExtra("PitchDistance3",getFloat(mEditTextPitchDistance3));

        intent.putExtra("PitchVitesse1",getFloat(mEditTextPitchVitesse1));
        intent.putExtra("PitchVitesse2",getFloat(mEditTextPitchVitesse2));
        intent.putExtra("PitchVitesse3",getFloat(mEditTextPitchVitesse3));

        intent.putExtra("RollDistance1", getFloat(mEditTextRollDistance1));
        intent.putExtra("RollDistance2", getFloat(mEditTextRollDistance2));
        intent.putExtra("RollDistance3", getFloat(mEditTextRollDistance3));

        intent.putExtra("RollVitesse", getFloat(mEditTextRollVitesse));

        intent.putExtra("Stop1", getFloat(mEditTextStop1));
        intent.putExtra("Stop2", getFloat(mEditTextStop2));
        intent.putExtra("Stop3", getFloat(mEditTextStop3));

        setResult(RESULT_OK, intent);
        finish();

    }

    private float getFloat(EditText et){
        float value = -1;
        String text = et.getText().toString();
        if(!text.isEmpty())
        try
        {
            value = Float.parseFloat(text);
        } catch (Exception e1){
            e1.printStackTrace();
        }
        return value;
    }

}
