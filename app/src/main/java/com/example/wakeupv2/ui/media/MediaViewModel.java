package com.example.wakeupv2.ui.media;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MediaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MediaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Time to Wake Up!");

    }

    public LiveData<String> getText() {
        return mText;
    }
}