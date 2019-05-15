package com.dji.simulatorDemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ReglagesActivity extends AppCompatActivity {

    private static final String TAG = ReglagesActivity.class.getName();

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

    private EditText mEditTextAltitude;

    private Button mBtnOk;

    private SharedPreferences mPreferences;




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

        mEditTextAltitude = findViewById(R.id.edittext_altitude);

        mPreferences = getPreferences(MODE_PRIVATE);

        mEditTextAltitude.setText(String.valueOf(mPreferences.getFloat("Altitude",0)));

        mEditTextPitchDistance1.setText(String.valueOf(mPreferences.getFloat("PitchDistance1",0)));
        mEditTextPitchDistance2.setText(String.valueOf(mPreferences.getFloat("PitchDistance2",0)));
        mEditTextPitchDistance3.setText(String.valueOf(mPreferences.getFloat("PitchDistance3",0)));

        mEditTextPitchVitesse1.setText(String.valueOf(mPreferences.getFloat("PitchVitesse1",0)));
        mEditTextPitchVitesse2.setText(String.valueOf(mPreferences.getFloat("PitchVitesse2",0)));
        mEditTextPitchVitesse3.setText(String.valueOf(mPreferences.getFloat("PitchVitesse3",0)));

        mEditTextRollDistance1.setText(String.valueOf(mPreferences.getFloat("RollDistance1",0)));
        mEditTextRollDistance2.setText(String.valueOf(mPreferences.getFloat("RollDistance2",0)));
        mEditTextRollDistance3.setText(String.valueOf(mPreferences.getFloat("RollDistance3",0)));

        mEditTextRollVitesse.setText(String.valueOf(mPreferences.getFloat("RollVitesse",0)));

        mEditTextStop1.setText(String.valueOf(mPreferences.getFloat("Stop1",0)));
        mEditTextStop2.setText(String.valueOf(mPreferences.getFloat("Stop2",0)));
        mEditTextStop3.setText(String.valueOf(mPreferences.getFloat("Stop3",0)));

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

    protected void onResume(){
        mPreferences = getPreferences(MODE_PRIVATE);
        //mEditTextAltitude.setText(String.valueOf(mPreferences.getFloat("Altitude",0)));
        Log.e(TAG, "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(TAG, "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(TAG, "onStop");
        Log.e(TAG,String.valueOf(mPreferences.getFloat("Altitude",0)) );
        super.onStop();
    }

    public void onReturn(View view) {
        Log.e(TAG, "onReturn");
        this.finish();
    }
    private void validate(){
        Intent intent = new Intent();
        mPreferences.edit().putFloat("PitchDistance1",getFloat(mEditTextPitchDistance1)).apply();
        mPreferences.edit().putFloat("PitchDistance1",getFloat(mEditTextPitchDistance1)).apply();
        mPreferences.edit().putFloat("PitchDistance2",getFloat(mEditTextPitchDistance2)).apply();
        mPreferences.edit().putFloat("PitchDistance3",getFloat(mEditTextPitchDistance3)).apply();

        mPreferences.edit().putFloat("PitchVitesse1",getFloat(mEditTextPitchVitesse1)).apply();
        mPreferences.edit().putFloat("PitchVitesse2",getFloat(mEditTextPitchVitesse2)).apply();
        mPreferences.edit().putFloat("PitchVitesse3",getFloat(mEditTextPitchVitesse3)).apply();

        mPreferences.edit().putFloat("RollDistance1", getFloat(mEditTextRollDistance1)).apply();
        mPreferences.edit().putFloat("RollDistance2", getFloat(mEditTextRollDistance2)).apply();
        mPreferences.edit().putFloat("RollDistance3", getFloat(mEditTextRollDistance3)).apply();

        mPreferences.edit().putFloat("RollVitesse", getFloat(mEditTextRollVitesse)).apply();

        mPreferences.edit().putFloat("Stop1", getFloat(mEditTextStop1)).apply();
        mPreferences.edit().putFloat("Stop2", getFloat(mEditTextStop2)).apply();
        mPreferences.edit().putFloat("Stop3", getFloat(mEditTextStop3)).apply();

        mPreferences.edit().putFloat("Altitude", getFloat(mEditTextAltitude)).apply();

        //Log.e(TAG,"Validate "+(mPreferences.getFloat("Altitude",0))+"  "+getFloat(mEditTextAltitude) );

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
