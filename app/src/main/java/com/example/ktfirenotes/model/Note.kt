package com.example.ktfirenotes.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Note(
    var title: String,
    var content: String
) : Parcelable {
    constructor() : this("", "")
}