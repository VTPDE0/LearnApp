package com.example.myapplication.Shared.ui

import android.icu.text.AlphabeticIndex.Bucket.LabelType
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.input.pointer.HistoricalChange
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.ui.graphics.Color
import com.example.myapplication.ui.theme.White


@Composable
fun CustomInputField(
    value: String,
    label: String,
    onChange: (String) -> Unit,
    keyboardType: KeyboardType
) {

    val focusManager = LocalFocusManager.current
    var showPassword by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = value,
        label = { Text(label) },
        onValueChange = { onChange(it) },
        keyboardOptions = KeyboardOptions.Default.copy(
            autoCorrectEnabled = false,
            keyboardType = keyboardType
        ),
        visualTransformation = if (keyboardType == KeyboardType.Password && showPassword)
            VisualTransformation.None
        else
            PasswordVisualTransformation(),
        keyboardActions = KeyboardActions(
            onDone = {
                focusManager.clearFocus()
            }
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = White,
            unfocusedBorderColor = White,
            cursorColor = White,
            focusedLabelColor = White,
            unfocusedLabelColor = White,
        )
    )



}
