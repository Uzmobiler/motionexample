package uz.mobiler.example

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.mobiler.example.databinding.ItemCardBinding

class MyAdapter : RecyclerView.Adapter<MyAdapter.Vh>() {

    inner class Vh(itemCardBinding: ItemCardBinding) :
        RecyclerView.ViewHolder(itemCardBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {

    }

    override fun getItemCount(): Int = 10
}