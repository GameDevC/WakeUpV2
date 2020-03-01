package com.example.wakeupv2.ui.workout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkoutViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WorkoutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(null);
    }

    public LiveData<String> getText() {
        return mText;
    }
}