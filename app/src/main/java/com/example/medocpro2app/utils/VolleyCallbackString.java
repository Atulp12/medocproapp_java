package com.example.medocpro2app.utils;

import com.android.volley.VolleyError;


public interface VolleyCallbackString {
    void onSuccess(String response);

    void onError(VolleyError error);
}
