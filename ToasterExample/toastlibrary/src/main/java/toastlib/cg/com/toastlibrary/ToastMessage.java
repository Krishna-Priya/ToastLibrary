package toastlib.cg.com.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by devicelab2 on 30/07/19.
 */

public class ToastMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
