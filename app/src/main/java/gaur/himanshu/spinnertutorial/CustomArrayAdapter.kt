package gaur.himanshu.spinnertutorial

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import com.makeramen.roundedimageview.RoundedImageView

class CustomArrayAdapter(val activity: Activity,val list:List<OurData>) : BaseAdapter(){//ArrayAdapter<OurData>(activity,R.layout.list_item,list){

    override fun getCount(): Int {
        return list.size
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getItem(position: Int): OurData? {
        return null
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
     val contexts=activity.layoutInflater
        val rowView=contexts.inflate(R.layout.list_item,null)

        var image=rowView.findViewById<RoundedImageView>(R.id.images)
        var title=rowView.findViewById<TextView>(R.id.title)
        var desc=rowView.findViewById<TextView>(R.id.desc)


        image.setImageResource(list[position].images)
        title.text=list[position].title.toString()
        desc.text=list[position].desc.toString()

        return rowView
    }

}