package app.wakayama.harusame.school8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple:Word//クラスWordからインスタンスappleを作成
        val banana:Word
        val mikan:Word
        val ichigo:Word

        apple = Word(R.drawable.apple,"りんご")
        banana = Word(R.drawable.banana,"バナナ")
        mikan = Word(R.drawable.mikan,"みかん")
        ichigo = Word(R.drawable.ichigo,"イチゴ")
        addWord(apple)
        addWord(banana)
        addWord(mikan)
        addWord(ichigo)
    }
    private fun addWord(word: Word){
        val nameTextView = TextView(applicationContext)
        nameTextView.text = word.name

        val layout = LinearLayout(this.applicationContext)
        layout.orientation = LinearLayout.HORIZONTAL

        val MP = LinearLayout.LayoutParams.MATCH_PARENT//match_parentの設定値を作る
        val WC = LinearLayout.LayoutParams.WRAP_CONTENT//wrap_contentの設定値を作る
        val LP = LinearLayout.LayoutParams(MP,WC)
        layout.layoutParams = LP

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        layout.addView(imageView)//画像を追加
        layout.addView(nameTextView)//単語を追加

        container.addView(layout)//コンテナにlayoutを追加

    }
}