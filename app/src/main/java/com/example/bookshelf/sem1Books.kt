package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sem1Books : AppCompatActivity() {

    private lateinit var btn_em1: Button
    private lateinit var btn_phy1: Button
    private lateinit var btn_chem1: Button
    private lateinit var btn_bee: Button
    private lateinit var btn_eg: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem1_books)

        btn_em1 = findViewById(R.id.btn_em1)
        btn_phy1 = findViewById(R.id.btn_phy1)
        btn_chem1 = findViewById(R.id.btn_chem1)
        btn_bee = findViewById(R.id.btn_bee)
        btn_eg = findViewById(R.id.btn_eg)


        btn_phy1.setOnClickListener {
            val intent = Intent(this, MainPdfViewer::class.java)

            val bundle = Bundle().apply {
                putString("pdf_url", "https://drive.google.com/uc?export=download&id=1eisu36cdDeiTm4rzjTtDAwWzvHk5bor_")
            }
            intent.putExtras(bundle);

            startActivity(intent)
        }

        btn_em1.setOnClickListener {
            val intent = Intent(this, MainPdfViewer::class.java)

            val bundle = Bundle().apply {
                putString("pdf_url", "https://drive.google.com/uc?export=download&id=1Od0gjQnCtz3u5zXUQ8Jx5FhWchM6YyAk")
            }
            intent.putExtras(bundle);

            startActivity(intent)
        }

        btn_chem1.setOnClickListener {
            val intent = Intent(this, MainPdfViewer::class.java)

            val bundle = Bundle().apply {
                putString("pdf_url", "https://drive.google.com/uc?export=download&id=16Gc0dh9DpxQFtX6RGr1OvIft5FFE9nc8")
            }
            intent.putExtras(bundle);

            startActivity(intent)
        }

        btn_bee.setOnClickListener {
            val intent = Intent(this, MainPdfViewer::class.java)

            val bundle = Bundle().apply {
                putString("pdf_url", "https://drive.google.com/uc?export=download&id=1Ggpa10x165Kbs1Ey_CQciU5obS_I_6Cl")
            }
            intent.putExtras(bundle);

            startActivity(intent)
        }

        btn_eg.setOnClickListener {
            val intent = Intent(this, MainPdfViewer::class.java)

            val bundle = Bundle().apply {
                putString("pdf_url", "https://drive.google.com/uc?export=download&id=1ALNBDp2lB6ZRBKw5ef7nQfb_QGy3ABLB")
            }
            intent.putExtras(bundle);

            startActivity(intent)
        }

    }
}