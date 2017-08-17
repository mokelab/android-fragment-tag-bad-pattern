package com.mokelab.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * First page
 */
class FirstFragment : Fragment() {
    companion object {
        @JvmStatic fun newInstance() : FirstFragment {
            val fragment = FirstFragment()

            val args = Bundle()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater!!.inflate(R.layout.first_fragment, container, false)
        root!!.findViewById<View>(android.R.id.button1).setOnClickListener {
            showNextPage()
        }
        return root
    }

    private fun showNextPage() {
        val transaction = fragmentManager.beginTransaction()
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        transaction.replace(R.id.container, SecondFragment.newInstance(), "second")

        transaction.commit()
    }
}