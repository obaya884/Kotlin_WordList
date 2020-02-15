package app.takumi.obayashi.wordlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginRight
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple: Word = Word(R.drawable.apple_image, "りんご", "apple")
        val banana = Word(R.drawable.banana_image, "ばなな", "banana")
        val grape = Word(R.drawable.grape_image, "ぶどう", "grape")
        val peach = Word(R.drawable.peach_image, "もも", "peach")
        val strawberry = Word(R.drawable.strawberry_image, "いちご", "strawberry")

        val fruitArray = arrayListOf<Word>(apple, banana, grape, peach, strawberry)

        for (fruit in fruitArray) {
            addWord(fruit)
        }
    }

    private fun addWord(word: Word) {
        val japaneseNameTextView = TextView(this)
        japaneseNameTextView.text = word.japaneseName
        japaneseNameTextView.setTextSize(24F)

        val englishNameTextView = TextView(this)
        englishNameTextView.text = word.englishName
        englishNameTextView.setTextSize(24F)

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        layout.addView(imageView)
        layout.addView(japaneseNameTextView)
        layout.addView(englishNameTextView)

        container.addView(layout)
    }
}
