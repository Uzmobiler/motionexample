package uz.mobiler.example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.doOnPreDraw
import uz.mobiler.example.databinding.FragmentBlankBinding
import android.os.Build
import androidx.transition.Fade


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    lateinit var binding: FragmentBlankBinding
    lateinit var myAdapter: MyAdapter
    lateinit var list: ArrayList<Int>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        loadData()
        myAdapter = MyAdapter(list, object : MyAdapter.OnItemClickListener {
            override fun onItemClick(a: Int, imageView: ImageView) {


//                val firstFragment = FirstFragment.newInstance(a)
//
//                firstFragment.sharedElementEnterTransition = DetailsTransition()
//                firstFragment.enterTransition = Fade()
//                exitTransition = Fade()
//                firstFragment.sharedElementReturnTransition = DetailsTransition()
//                activity?.supportFragmentManager
//                    ?.beginTransaction()
//                    ?.addSharedElement(imageView, "transtion_name_example")
//                    ?.replace(R.id.my_container, firstFragment)
//                    ?.addToBackStack(null)
//                    ?.commit()
            }
        })
        binding.rv.adapter = myAdapter
        return binding.root
    }

    private fun loadData() {
        list = ArrayList()
        for (i in 0..100) {
            list.add(R.drawable.mdpi)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}