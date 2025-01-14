package com.chuckerteam.chucker.api

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import com.chuckerteam.chucker.R

/**
 * No-op implementation.
 */
@Suppress("UnusedPrivateMember")
public object Chucker {

    @Suppress("MayBeConst ") // https://github.com/ChuckerTeam/chucker/pull/169#discussion_r362341353
    public val isOp: Boolean = false

    @JvmStatic
    public fun getLaunchIntent(context: Context): Intent = Intent()

    @JvmStatic
    public fun dismissNotifications(context: Context) {
        // Empty method for the library-no-op artifact
    }

    @JvmStatic
    public fun writeTransactions(
        context: Context,
        maxTransactions: Long?,
        startTimestamp: Long?,
    ): Uri? = null
}
