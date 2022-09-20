package org.younmonkeys.example.hello_android_java;

import android.content.Context;
import android.widget.Toast;

import org.junit.Test;

import java.lang.reflect.Method;

public class ToastReflectTest {
//    @Test
    public void test() throws Exception {
        Class toast = Class.forName("android.widget.Toast");

        // Object mToast = toast.newInstance(); không thể tạo được đối tượng vì Toast không có hàm tạo không đối
        Method make = toast.getDeclaredMethod("makeText", Context.class, CharSequence.class, int.class);
        Method show = toast.getDeclaredMethod("show", null);

        Object toastInstance = make.invoke(null, getBaseContext(), "Hello", Toast.LENGTH_LONG);

        show.invoke(toastInstance);

       assert make != null;
       assert show != null;
    }

    private Context getBaseContext() {
        return null;
    }
}
