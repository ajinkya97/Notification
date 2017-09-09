package com.example.aj.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i=new Intent(this,demo.class);
        startActivity(i);
        PendingIntent launchIntent = PendingIntent.getActivity(this, 0, i, 0);

        NotificationCompat.Builder builder=new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.loc);
        builder.setContentTitle("My Notification");
        builder.setContentText("Welcome To My App");
        //builder.setContentIntent(launchIntent);

        NotificationManager nm=(NotificationManager)getSystemService(getApplicationContext().NOTIFICATION_SERVICE);
        nm.notify(0,builder.build());
    }
}
