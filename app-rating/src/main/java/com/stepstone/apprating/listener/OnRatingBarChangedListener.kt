package com.stepstone.apprating.listener

/**
 * @author Piotr Głębocki (Piotr.Glebocki@stepstone.com) on 08/05/2017.
 */

interface OnRatingBarChangedListener {

    fun onRatingChanged(rating: Int)

    companion object {

        val NULL: OnRatingBarChangedListener = object : OnRatingBarChangedListener {

            override fun onRatingChanged(rating: Int) {

            }
        }
    }
}
