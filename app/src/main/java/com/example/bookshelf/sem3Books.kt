package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sem3Books : AppCompatActivity() {

    private lateinit var btn_em3: Button
    private lateinit var btn_ds: Button
    private lateinit var btn_cg: Button
    private lateinit var btn_dlca: Button
    private lateinit var btn_dsgt: Button
    private lateinit var btn_syllabus3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem3_books)

        btn_em3 = findViewById(R.id.btn_em3)
        btn_ds = findViewById(R.id.btn_ds)
        btn_cg = findViewById(R.id.btn_cg)
        btn_dlca = findViewById(R.id.btn_dlca)
        btn_dsgt = findViewById(R.id.btn_dsgt)
        btn_syllabus3 = findViewById(R.id.btn_syllabus3)

        btn_syllabus3.setOnClickListener {
            val intent = Intent(this, MainPdfViewer::class.java)

            val bundle = Bundle().apply {
                putString("pdf_url", "https://firebasestorage.googleapis.com/v0/b/bookshelf-5bb16.appspot.com/o/MU_Sem3_Syllabus%20(1).pdf?alt=media&token=5da85a4a-3714-427d-801a-d1eb16fbc517")
            }
            intent.putExtras(bundle);

            startActivity(intent)
        }

    }
}