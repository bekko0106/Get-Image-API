package developer.behzod.getimageapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import developer.behzod.getimageapi.databinding.ItemRvBinding

class MyRvAdapter(var list: List<User>) : RecyclerView.Adapter<MyRvAdapter.Vh>() {

    inner class Vh(var rvItemBinding: ItemRvBinding): RecyclerView.ViewHolder(rvItemBinding.root){
        fun onBind(user: User, position: Int ){
            rvItemBinding.tv1.text = user.login
            rvItemBinding.tv2.text = user.id.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context) , parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size

}