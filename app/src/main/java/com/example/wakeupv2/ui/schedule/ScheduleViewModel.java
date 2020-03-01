package com.example.wakeupv2.ui.schedule;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScheduleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScheduleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Here's where to schedule your wake up alarm, and when you can open the app");

    }

    public LiveData<String> getText() {
        return mText;
    }
}