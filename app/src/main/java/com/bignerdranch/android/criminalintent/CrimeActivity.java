package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentAcvtivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
