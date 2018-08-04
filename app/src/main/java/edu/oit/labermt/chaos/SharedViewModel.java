package edu.oit.labermt.chaos;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    public static class UIData {
        private int value_ = 42;
        public int getValue()
        {
            return value_;
        }
        public void setValue(final int value)
        {
            value_ = value;
        }
    }

    public MutableLiveData<UIData> uiDataLiveData_ = new MutableLiveData<>();

}
