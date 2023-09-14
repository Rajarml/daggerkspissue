package com.example.myapplicationdaggerksp

import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<T>(
    @LayoutRes layoutResId: Int,
    viewBindingFactory: (View) -> @JvmSuppressWildcards T
) : Fragment(layoutResId) where T : ViewBinding {

    protected val binding by viewBinding(viewBindingFactory)
}