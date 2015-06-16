package com.madnum.muneer.logintest;

import android.widget.TextView;

/**
 * Created by muneer on 6/16/2015.
 */
public class CheckPasswords {





    public void PasswordCheck(String Password_1, String Password_2, TextView result_tv) {




        if (Password_1 != null && Password_1.isEmpty() || Password_2 != null && Password_2.isEmpty()){
            result_tv.setText("Password or User Name is Empty");

        }else {


            //Check if Both Are Matching

            if (Password_1.equals(Password_2)) {

                result_tv.setText("Congrats , Both Are Matching !!");

            } else {
                result_tv.setText("Password or User Name is Wrong");
            }

        }

    }
}
