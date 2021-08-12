package uz.mobiler.example

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import uz.mobiler.example.databinding.ItemCardBinding

class MyAdapter(var list: List<Int>, var listener: OnItemClickListener) :
    RecyclerView.Adapter<MyAdapter.Vh>() {

    inner class Vh(var itemCardBinding: ItemCardBinding) :
        RecyclerView.ViewHolder(itemCardBinding.root) {

        fun onBind(a: Int, position: Int) {
            itemCardBinding.ll.setBackgroundResource(a)


            ViewCompat.setTransitionName(itemCardBinding.ll, position.toString() + "_image")

            itemView.setOnClickListener {
                listener.onItemClick(a, itemCardBinding.ll)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size

    interface OnItemClickListener {
        fun onItemClick(a: Int, view: ImageView)
    }
}