package com.makys.clipboardcleaner;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.service.quicksettings.TileService;
import android.widget.Toast;

public class TestTile extends TileService {
    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
    }

    @Override
    public void onClick() {
        super.onClick();
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("","");
        clipboard.setPrimaryClip(clip);
        Toast donets = Toast.makeText(getBaseContext(),R.string.done,Toast.LENGTH_SHORT);
        donets.show();
    }
}
