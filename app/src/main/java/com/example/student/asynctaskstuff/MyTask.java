package com.example.student.asynctaskstuff;

import android.icu.util.TimeUnit;
import android.os.AsyncTask;

/**
 * Created by student1 on 23.01.17.
 */

public class MyTask extends AsyncTask<Void, Void, Void> {
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return null;
    }
}
