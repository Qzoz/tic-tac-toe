package qz.tictactoe;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;

/*
 Created by zaid on 27-01-2018.
 */

public class InfoDialog extends DialogFragment {

    LayoutInflater inflater;
    View v;
    WebView WV;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.dialog_layout, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        WV = (WebView) v.findViewById(R.id.WebInfo);
        WV.loadUrl("file:///android_asset/InfoDeveloper.html");
        WV.setBackgroundResource(R.drawable.back_main);
        builder.setView(v).setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                InfoDialog.this.dismiss();
            }
        });

        return builder.create();
    }
}
