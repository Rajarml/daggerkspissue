package com.example.myapplicationdaggerksp

import android.os.Bundle
import android.view.View
import com.example.myapplicationdaggerksp.databinding.MyFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MyFragment : BaseFragment<MyFragmentBinding>(R.layout.my_fragment, MyFragmentBinding::bind) {

    @Inject
    @Named("id")
    lateinit var myId: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.myText.text = "Hello world! My id is: $myId"
    }
}