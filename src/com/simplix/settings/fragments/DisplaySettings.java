package com.simplix.settings.fragments;

import android.os.Bundle;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceScreen;

import com.android.settings.R;
import com.android.settings.simplix.CustomSettingsPreferenceFragment;

import com.android.settings.SettingsPreferenceFragment;

public class DisplaySettings extends CustomSettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        addPreferencesFromResource(R.xml.display_settings);

    }
}
