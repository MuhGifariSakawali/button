package com.example.button;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.button.R;

public class NotificationsFragment extends Fragment {

    public static com.example.button.ui.notifications.NotificationsFragment newInstance() {
        com.example.button.ui.notifications.NotificationsFragment fragment = new com.example.button.ui.notifications.NotificationsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notifications, container, false);
    }
}