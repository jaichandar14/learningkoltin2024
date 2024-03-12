package com.zuper.learningdemokoltin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.zuper.learningdemokoltin.MyApplication
import com.zuper.learningdemokoltin.R
import com.zuper.learningdemokoltin.databinding.ActivityMainBinding
import com.zuper.learningdemokoltin.viewmodelfactory.ViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as MyApplication).appComponent.inject(this)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
       var viewModel = ViewModelProvider(this,viewModelFactory)[MainVIewModel::class.java]
        binding.mainViewModel=viewModel
        binding.lifecycleOwner=this

        viewModel.getapicall()
    }
}