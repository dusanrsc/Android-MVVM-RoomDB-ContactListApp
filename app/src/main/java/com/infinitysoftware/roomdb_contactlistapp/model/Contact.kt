package com.infinitysoftware.roomdb_contactlistapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

// Creating Contact Data Class.
@Entity
data class Contact(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)