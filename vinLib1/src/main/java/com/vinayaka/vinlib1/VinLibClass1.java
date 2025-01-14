package com.vinayaka.vinlib1;

import android.content.Context;
import android.widget.Toast;

public class VinLibClass1 {
    public static void vinLibToast(Context context, String messageForToast){
        Toast.makeText(context, messageForToast, Toast.LENGTH_SHORT).show();
    }
}
