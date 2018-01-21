package com.bigoloo.finance.home.domain.entity

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/18/18.
 */
data class Home(var id: Int? = null, var name: String,
                var agency: String?,
                var timestamp: Long = -1,
                var isVisit: Boolean = false,
                var timeToVisit: Long = -1,
                var isAvailable: Boolean = true,
                var price: Long = 0,
                var address: String?)