package com.technofly.logutlidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.technofly.technicalbabalogutil.PDFUtils;
import com.technofly.technicalbabalogutil.PdfUrlToBookPagerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowPDFClick(View view) {
        PDFUtils.downloadDirectory = "My Downloads";
        String url = "https://www.tutorialspoint.com/cprogramming/cprogramming_tutorial.pdf";
        startActivity(new Intent(this, PdfUrlToBookPagerActivity.class).putExtra(PDFUtils.PDFUrl,url));
    }
}
