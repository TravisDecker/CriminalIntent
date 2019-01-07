package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListAcvtivity extends SingleFragmentAcvtivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
