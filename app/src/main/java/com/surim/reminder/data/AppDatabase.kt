package com.surim.reminder.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.surim.reminder.data.dao.ReminderDao
import com.surim.reminder.model.ReminderEntity

@Database(entities = [ReminderEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun reminderDao() : ReminderDao
}