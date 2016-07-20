package com.georgekapoya.chelseafc.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.georgekapoya.chelseafc.R;

public class UserRegistration extends AppCompatActivity {

    EditText  eUserName;
    EditText  eUserEmail;
    EditText  eUserPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
        setFields();
        eUserName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                eUserName.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (eUserName.getText().length() > 4) {
                    eUserName.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_check_circle_white_18dp, 0);
                }
            }
        });

        eUserEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                eUserEmail.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (eUserEmail.getText().length() > 4){
                    eUserEmail.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_check_circle_white_18dp, 0);
                }
            }
        });

        eUserPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                eUserPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (eUserPassword.getText().length() > 4){
                    eUserPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_check_circle_white_18dp, 0);
                }
            }
        });


    }




    void  setFields(){

        eUserName =  (EditText)findViewById(R.id.edtUserName);
        eUserEmail =  (EditText)findViewById(R.id.edtEmail);
        eUserPassword =  (EditText)findViewById(R.id.edtPassword);


    }

}
