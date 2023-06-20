package com.example.learngit;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    private static final String format = "dd/MM/yyyy";
    @SuppressLint("SimpleDateFormat")
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(format);

    public String dateToString(Date date){
        if (date == null){
            return "";
        } else {
            return dateFormat.format(format);
        }

    }

    public Date stringToDate(String str){
        try {
            return dateFormat.parse(str);
        } catch (ParseException e){
            return null;
        }
    }
}
