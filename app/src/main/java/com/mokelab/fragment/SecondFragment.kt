package com.mokelab.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Second page
 */
class SecondFragment : Fragment() {
    companion object {
        @JvmStatic fun newInstance() : SecondFragment {
            val fragment = SecondFragment()

            val args = Bundle()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater!!.inflate(R.layout.second_fragment, container, false)
        return root
    }
}