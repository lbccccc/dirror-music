package com.dirror.music.music.standard.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * 标准歌单数据类
 */
@Parcelize
data class StandardPlaylistData(
    val name: String, // 歌单名字
    val description: String, // 描述
    val songs: ArrayList<StandardSongData> // 内含歌曲
): Parcelable