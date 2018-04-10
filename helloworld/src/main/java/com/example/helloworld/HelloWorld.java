package com.example.helloworld;

        import android.content.Context;
        import android.util.Log;
        import android.widget.Toast;

/**
 * Created by Leddin on 5/4/2018.
 */

public class HelloWorld {

    private static final String TAG = "Hello World";

    public static void Hello(String message){
        Log.d(TAG, message);
    }

    public static void ShortToast(Context ctx, String string){
        Toast.makeText(ctx, string, Toast.LENGTH_SHORT).show();

    }
}
