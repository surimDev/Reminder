package com.surim.reminder.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.TimeZone

@Entity(tableName = "Reminder")
data class ReminderEntity (

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo
    var reminder: String,

    @ColumnInfo
    var isDone: Boolean = false,

    @ColumnInfo
    var lastEdit: TimeZone,

    @ColumnInfo
    var isStar: Boolean = false,


)