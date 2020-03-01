package com.example.wakeupv2.ui.schedule;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScheduleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScheduleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Wake Up Now");

    }

    public LiveData<String> getText() {
        return mText;
    }
}