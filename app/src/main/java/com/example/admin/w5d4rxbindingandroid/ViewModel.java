package com.example.admin.w5d4rxbindingandroid;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by admin on 11/17/2016.
 */

public class ViewModel{
    public int getImageUrl(){
        return R.drawable.chivas;
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, int imageUrl) {
        view.setImageResource(imageUrl);
    }
}
