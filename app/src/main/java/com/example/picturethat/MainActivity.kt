package com.example.picturethat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    private lateinit var myWebView: WebView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWebView = findViewById(R.id.webView)
        myWebView.settings.javaScriptEnabled = true // 자바스크립트 허용
        myWebView.settings.domStorageEnabled = true // 로컬스토리지
        /* 웹뷰에서 새 창이 뜨지 않도록 방지*/
        myWebView.webViewClient = WebViewClient()
        myWebView.webChromeClient = WebChromeClient()
        /* 웹뷰에서 새 창이 뜨지 않도록 방지*/

        //주소 Load
        myWebView.loadUrl("http://picturethat.kr/")


    }

    override fun onBackPressed() {
        if (myWebView.canGoBack()){
            myWebView.goBack()
        }else{
            super.onBackPressed()
        }

    }
}