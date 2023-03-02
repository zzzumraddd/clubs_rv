package uz.itschool.myapplication

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Club_Adapter(var clubs: MutableList<ClubData>) : RecyclerView.Adapter<Club_Adapter.Sport_Holder>(){
     class Sport_Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
          var name: TextView = itemView.findViewById(R.id.name)
          var image: ImageView = itemView.findViewById(R.id.image)
          var info: TextView = itemView.findViewById(R.id.info)

     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Sport_Holder {
         var holder = Sport_Holder(LayoutInflater.from(parent.context).inflate(R.layout.club_item, parent, false))
          return holder
     }

     override fun onBindViewHolder(holder: Sport_Holder, position: Int) {
          holder.name.text = clubs[position].name
          holder.image.setImageResource(clubs[position].image)
          holder.info.text = clubs[position].info
     }

     override fun getItemCount(): Int {
          return clubs.size
     }
}