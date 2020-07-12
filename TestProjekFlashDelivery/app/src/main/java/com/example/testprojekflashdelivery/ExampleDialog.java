package com.example.testprojekflashdelivery;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        String kode = getArguments().getString("kode");
        String status = getArguments().getString("status");

        builder.setTitle("Kode Pengiriman : " + kode)
            .setMessage("Status : " + status)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        return builder.create();
    }

    public static ExampleDialog newInstance(String kode, String status) {

        ExampleDialog dialog = new ExampleDialog();

        Bundle bundle = new Bundle();
        bundle.putString("kode", kode);
        bundle.putString("status", status);

        dialog.setArguments(bundle);

        return dialog;
    }
}
