package ir.client.kotlintaskk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {

    val names = List<String>()
    names.add("pouya heydari")
    names.add("elahe lotfi")
    names.add("nasrin mohammadi")
    names.add("mohammad talaee")
    names.add("akbar alipour")
    names.add("yaghoob arbabi")

    val recycler = findViewById<View>(R.id.recycler)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        val recycler = findViewById<View>(R.id.recycler)
        val adapter = TestAdapter(names)
        recycler.setAdapter(adapter)

        recycler.setLayoutManager(LinearLayoutManager(this@MainActivity, RecyclerView.HORIZONTAL, false))

    }
}

private fun View.setAdapter(adapter: TestAdapter) {

}

private fun View.setLayoutManager(linearLayoutManager: Any) {

}
