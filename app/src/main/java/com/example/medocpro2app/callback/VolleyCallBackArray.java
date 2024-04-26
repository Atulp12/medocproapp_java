package com.example.medocpro2app.callback;

import com.android.volley.VolleyError;

import org.json.JSONArray;


public interface VolleyCallBackArray {
    void onSuccess(JSONArray response);

    void onError(VolleyError error);
}
