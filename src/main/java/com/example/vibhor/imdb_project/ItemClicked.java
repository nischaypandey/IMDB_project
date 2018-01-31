package com.example.vibhor.imdb_project;

import android.view.View;

/**
 * Created by Nischay on 12-01-2018.
 */

//Interface to handle the on click of recyclerview item
public interface ItemClicked {
    void  onCLick(View view,int position);
}
