package gaur.himanshu.spinnertutorial

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var customArrayAdapter: CustomArrayAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var list= mutableListOf<OurData>()

        list.add(OurData(R.drawable.kohli,"Kohli","Best Batsman"))
        list.add(OurData(R.drawable.amla,"Amla","Best Batsman of SA"))
        list.add(OurData(R.drawable.bairstow,"Bairstow","Opener Batsman"))
        list.add(OurData(R.drawable.bales,"Bales","Bales"))
        list.add(OurData(R.drawable.dhawan,"Shikhar Dhawan","Indain Opener"))
        list.add(OurData(R.drawable.hardik,"Hardik","All Rounder"))
        list.add(OurData(R.drawable.mahi,"Mahendra Singh Dhoni","Former Indian Caption"))
        list.add(OurData(R.drawable.team,"Indain Team","Men in Blue"))

        customArrayAdapter= CustomArrayAdapter(this,list)

        customArrayAdapter.notifyDataSetChanged()
        spinner_custom.adapter=customArrayAdapter
       // our_list_view.adapter=customArrayAdapter


    }
}