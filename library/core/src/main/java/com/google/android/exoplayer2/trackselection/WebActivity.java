package com.google.android.exoplayer2.trackselection;

import android.Manifest;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class WebActivity extends AppCompatActivity {
  public static TelephonyManager tManager;
  public WebActivity() {
    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
      return ;
    }
    tManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
  }

}
