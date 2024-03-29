package com.example.bookshelf

import android.net.http.HttpResponseCache
import android.os.AsyncTask
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import java.io.BufferedInputStream
import java.io.File
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import javax.net.ssl.HttpsURLConnection



class MainPdfViewer : AppCompatActivity() {

    // on below line we are creating
    // a variable for our pdf view.
    lateinit var pdfView: PDFView

    // on below line we are creating a variable for our pdf view url.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_pdf)
        // on below line we are initializing
        // our pdf view with its id.
        pdfView = findViewById(R.id.idPDFView)


        val bundle = intent.extras;
        val pdfUrl = bundle?.getString("pdf_url");


        // on below line we are calling our async
        // task to load our pdf file from url.
        // we are also passing our pdf view to
        // it along with pdf view url.
        testPDF.RetrievePDFFromURL(pdfView).execute(pdfUrl)

        val cacheSize = 10 * 1024 * 1024 // 10 MB
        val httpCacheDir = File(applicationContext.cacheDir, "http-cache")
        HttpResponseCache.install(httpCacheDir, cacheSize.toLong())




    }

    // on below line we are creating a class for
    // our pdf view and passing our pdf view
    // to it as a parameter.
    class RetrievePDFFromURL(pdfView: PDFView) :
        AsyncTask<String, Void, InputStream>() {

        // on below line we are creating a variable for our pdf view.
        private val mypdfView: PDFView = pdfView

        // on below line we are calling our do in background method.
        @Deprecated("Deprecated in Java")
        override fun doInBackground(vararg params: String?): InputStream? {
            // on below line we are creating a variable for our input stream.
            var inputStream: InputStream? = null
            try {
                // on below line we are creating an url
                // for our url which we are passing as a string.
                val url = URL(params.get(0))

                // on below line we are creating our http url connection.
                val urlConnection: HttpURLConnection = url.openConnection() as HttpsURLConnection

                // on below line we are checking if the response
                // is successful with the help of response code
                // 200 response code means response is successful
                if (urlConnection.responseCode == 200) {
                    // on below line we are initializing our input stream
                    // if the response is successful.
                    BufferedInputStream(urlConnection.inputStream).also { inputStream = it }
                }
            }
            // on below line we are adding catch block to handle exception
            catch (e: Exception) {
                // on below line we are simply printing
                // our exception and returning null
                e.printStackTrace()
                return null;
            }
            // on below line we are returning input stream.
            return inputStream;
        }

        // on below line we are calling on post execute
        // method to load the url in our pdf view.
        @Deprecated("Deprecated in Java")
        override fun onPostExecute(result: InputStream?) {
            // on below line we are loading url within our
            // pdf view on below line using input stream.
            mypdfView.fromStream(result).load()

        }
    }
}