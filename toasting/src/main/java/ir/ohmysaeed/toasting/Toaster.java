package ir.ohmysaeed.toasting;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void s(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    public static void l(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

}
