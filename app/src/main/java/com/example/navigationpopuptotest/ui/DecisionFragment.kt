package com.example.navigationpopuptotest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.navigationpopuptotest.R

class DecisionFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val navController = findNavController()

        val navOptions = NavOptions.Builder()
            .setLaunchSingleTop(true)
            .setPopUpTo(
                navController.graph.findStartDestination().id,
                inclusive = false
            )
            .build()

        navController.navigate(R.id.action_navigation_decision_to_navigation_dashboard, null, navOptions)

        return null
    }
}