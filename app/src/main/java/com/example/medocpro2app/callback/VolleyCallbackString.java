package com.example.medocpro2app.callback;

import com.android.volley.VolleyError;


public interface VolleyCallbackString {
    void onSuccess(String response);

    void onError(VolleyError error);
}
