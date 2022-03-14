package com.example.myapplication.screen
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.model.QuizMode
import com.example.myapplication.model.ScienceModel
import com.example.myapplication.view.ScienceAdabterCallBack
import com.example.myapplication.view.ScienceAdapter
import kotlinx.android.synthetic.main.activity_sciences.*

class SciencesActivity : AppCompatActivity() {
    val sciences =  listOf(
                ScienceModel ("Matematika",listOf(
                    QuizMode("Parabola uchining koordinatalarini toping: y =  . ?", image = null,  "(-3; 2) ", "(-3; - 2)","(3; -2)","(3; 2) ", correntAnswer = "D"),
                    QuizMode("Kvadrat funksiyaning nollarini  toping: y = x2 - 5x + 6?", image = null,  " x1=1, x2=6", "x1= -1, x2= - 6","x1=2, x2=3","x1= -2, x2= -3 ", correntAnswer = "C"),
                    QuizMode("3 ning kwadrati nechi?", image = null,   "2", "8","9","16", correntAnswer = "C"),
                    QuizMode("Boshi bor oxiri yoq chiziq nima deyiladi?", image = null,   "Kesma", "Oq","Nur","Koordinata", correntAnswer = "C"),
                    QuizMode("Kvadrat tengsizlikni yeching: 3x2 – 5x -2 > 0. ?", image = null, " (-∞;  ) U ( 2; ∞) ","(-∞; - ) U ( 2; ∞)"," (- ; 2)"," ( ; 2)","B")
                )),
                ScienceModel ("Ona tili", listOf(
                    QuizMode("Bosh kelishigidagi so’z qaysi grammatik vazifani bajaradi?", image = null, "Ega, Kesim","Kesim, Undalma","Kirish So'z","Barcha vazifalar keladi","A"),
                    QuizMode("Qaysi qatorda son qo’llanilinmagan?",image = null, "Anvar soat ikkida da uyga keldi","Men senga yarim chelak suv keltiraman","O'quvchilar besh ta qator bolib saflandi","Beshinchingiz chiqsin","A"),
                    QuizMode("Tobe bog’lanishli birikmalarda qanday so’z bosh so’z sanaladi?",image = null,"ko’makchi bilan kelgan so’z","Ma’nosi izohlanayotgan soz","Boshqa so’zning ma’nosini ifodalaydigan so’z","O’zi bog’langan so’z ma’nosini izohlaydigan so’z","B"),
                    QuizMode("Ergash gapning vazifasi nimadan iborat?",image = null, "Mazmuni izohlanayotgan gap","Bosh gapning mazmunini izohlayotgan gap","Murakkab qo’shma gapning asosiy qismi","Korsatish olmoshi istirok etgan gap","C"),
                    QuizMode("Qanday gapga bosh gap deyiladi?", image = null, "Mazmuni izohlanayotgan gap","Boshqa gapning mazmunini izohlayotgan gap","Ergash gapga tobelangan gap","Nisbiy so’zli gap","C")
                )),

                ScienceModel ("Biologiya", listOf(
                    QuizMode("Odam tanasida nechta suyak bor?", R.drawable.suyak, "209", "100","206","300","C"),
                    QuizMode("Hayvonot dunyosi nechta katta dunyoga bo'linadi?",R.drawable.hayvonot,"2 ta va ko'p hujayrali","hamma hayvonlar ko'p hujayrali","Tuban va yuksak","To'g'ri javob yoq","A"),
                    QuizMode("Misrliklar dastlabki qaysi hayvonni xonakilashtirilgan?",R.drawable.imagemisr,"Bir o'rkachli tuya","Ot","O'rdak","Mushuk","D"),
                    QuizMode("Biologiya fanini manosi nima?",R.drawable.biologiya,"Hayot fani","Dunyo ","Yuksalish ","Yugurish","A"),
                    QuizMode("Birinchi bo'lib viruslarni kim o'rgandi?",R.drawable.virus,"Abu Rayhon Beruniy","R.Guk","Ivanoviskiy","Al Xorazimiy","C")
                )
                ),
               ScienceModel ("Ingliz tili", listOf(
                    QuizMode("Ingiliz tili vatani qayer?",R.drawable.soroq,"Angliya","Xiyot","New Zellandiya","Buyuk Britaniya","A"),
                    QuizMode("Ingliz tilida nechta zamon bor?",R.drawable.tili,"20 ta","10 ta","6 tadan ko'p","2ta","C"),
                    QuizMode("Qimmatbaxo so'zing manosi nima?", R.drawable.qimmat,"Expensive", "Say goodbye","Precious","This is the world","A"),
                    QuizMode("Ingliz tilidagi notog'ri fellarni nechta shakli bor?",R.drawable.tili2,"8ta","3ta","10ta","5ta","B"),
                    QuizMode("Uzoqlashmoq so'zini ma'nosi nima?",R.drawable.tili3,"move away","Get closer","to agree","to reconcile","A"),

                )),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sciences)
        imgBack.setOnClickListener{
            finish()
        }
        supportActionBar?.hide()
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = ScienceAdapter(sciences, object : ScienceAdabterCallBack{
            override fun onClick(items: ScienceModel) {
                val intent = Intent (this@SciencesActivity, QuizActivity::class.java)
                intent.putExtra("extra",items)
                startActivity(intent)
            }


        })
    }
}