package com.example.medocpro2app.utils;

import com.android.volley.VolleyError;

import org.json.JSONException;
import org.json.JSONObject;

public interface VolleyCallback {
    void onSuccess(JSONObject response) throws JSONException;

    void onError(VolleyError error);
}