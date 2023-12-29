package com.dorcas.yogaapp.ui.theme

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable

data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int,
)


