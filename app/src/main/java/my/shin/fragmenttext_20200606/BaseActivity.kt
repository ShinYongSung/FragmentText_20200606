package my.shin.fragmenttext_20200606

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mConText = this

    abstract fun setupEvents()
    abstract fun setValues()
}