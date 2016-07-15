package miguel.museos.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;
import miguel.museos.R;
import miguel.museos.data.Data;

public class QrActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler{

    ZXingScannerView mScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        data = Data.getInstance();

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        getSupportActionBar().hide();
        int width = dm.widthPixels;
        int heigth = dm.heightPixels;
        getWindow().setLayout((int)(width*0.9),(int)(heigth*0.8) );

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        this.setFinishOnTouchOutside(true);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_qr, null);
        QrScanner(view);

    }

    public void QrScanner(View view){

        mScannerView = new ZXingScannerView(this);   // Programmatically initialize the scanner view
        setContentView(mScannerView);
        mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
        mScannerView.startCamera();         // Start camera

    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();   // Stop camera on pause
    }


    @Override
    public void handleResult(Result rawResult) {
        vibrator.vibrate(600);
        int i = data.checkMuseum(rawResult.getText());
        if(i==0){


            finish();

        }
        else if (i==-1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Invalid QR");
            builder.setMessage(rawResult.getText()+" is not a registered museum");
            AlertDialog alert1 = builder.create();
            alert1.show();
            alert1.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);                }
            });
        }
        else if(i==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Invalid QR");
            builder.setMessage(rawResult.getText()+" is already registered ");
            AlertDialog alert1 = builder.create();
            alert1.show();
            alert1.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);                }
            });
        }


   }


    @Override
    public void finish() {

        super.finish();
    }

    Vibrator vibrator ;
    Data data;
}
