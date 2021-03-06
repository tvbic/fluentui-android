/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 */

package com.microsoft.fluentui.theming

import android.content.Context
import android.content.res.Resources
import android.support.v7.view.ContextThemeWrapper
import com.microsoft.fluentui.R

class FluentUIContextThemeWrapper(base: Context) : ContextThemeWrapper(base, R.style.Theme_FluentUI) {
    override fun onApplyThemeResource(theme: Resources.Theme, resid: Int, first: Boolean) {
        // We don't want to force our styles on top of the user's. We want their styles to take precedence.
        theme.applyStyle(resid, false)
    }
}