package com.example.glocha.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.glocha.R;
import com.example.glocha.Utils.MainfeedListAdapter;


public class ConfirmChallengeDialog extends DialogFragment {

    private static final String TAG = "ConfirmChallengeDialog";

    //widgets
    TextView mChallengeName;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_confirm_challenge, container, false);
        mChallengeName = (TextView) view.findViewById(R.id.challengeName);

        Log.d(TAG, "onCreateView: stared.");

        String challengeName;

        Bundle bundle = this.getArguments();
        if(bundle != null){
            challengeName = bundle.getString(getString(R.string.bundle_challenge_name));
            mChallengeName.setText(challengeName);
        } else{
            mChallengeName.setText("No Name");
        }

        TextView confirmDialog = (TextView) view.findViewById(R.id.dialogGloCha);
        confirmDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: captured challenge.");

                getDialog().dismiss();
            }
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        Log.d(TAG, "onAttach: Completed.");
        super.onAttach(context);

    }
}
