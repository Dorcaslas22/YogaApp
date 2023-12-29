package com.dorcas.yogaapp.Component

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dorcas.yogaapp.R
import com.dorcas.yogaapp.alignYourBodyData
import com.dorcas.yogaapp.ui.theme.YogaAppTheme

@Composable
fun AlignYourBodyElement(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painterResource(id = drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
        )
        Text(text = stringResource(id =text),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .paddingFromBaseline(top = 24.dp, bottom = 8.dp)
            )
    }
}
@Preview(showBackground = true, backgroundColor = 0x999999)
@Composable
fun AlignYourBodyElementPreview() {
    YogaAppTheme {
        AlignYourBodyElement(
            text = R.string.fc4_self_massage,
            drawable = R.drawable.fc4_self_massage,
            modifier = Modifier.padding(8.dp)
        )
    }
}
@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {
  LazyRow(
      horizontalArrangement = Arrangement.spacedBy(8.dp),
      contentPadding = PaddingValues(horizontal = 16.dp),
      modifier= Modifier
  ){
      items(alignYourBodyData){item ->  
          AlignYourBodyElement(
              drawable = item.drawable,
              text = item.text
          )
      }
  }

}
@Preview(showBackground = true, backgroundColor = 0x999999)
@Composable
fun AlignYourBodyRowPreview() {
    YogaAppTheme {
        AlignYourBodyRow()
    }
}