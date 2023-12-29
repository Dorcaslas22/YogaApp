package com.dorcas.yogaapp.ui.theme.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dorcas.yogaapp.Component.AlignYourBodyRow
import com.dorcas.yogaapp.Component.FavoriteCollectionGrid
import com.dorcas.yogaapp.Component.HomeSection
import com.dorcas.yogaapp.Component.SearchBar
import com.dorcas.yogaapp.R
import com.dorcas.yogaapp.ui.theme.YogaAppTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyRow()
        }
        HomeSection(title = R.string.favorite_collections) {
            FavoriteCollectionGrid()
        }
        Spacer(Modifier.height(16.dp))
    }
}


@Preview(showBackground = true, backgroundColor = 0x999999)
@Composable
fun HomeScreenPreview() {
    YogaAppTheme {
        HomeScreen()
    }
}


