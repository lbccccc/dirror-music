package com.dirror.music.music.qq

object Picture {

    // 300
    fun getPictureUrl(albumid: String): String {
        val url = "https://y.gtimg.cn/music/photo_new/T002R300x300M000${albumid}.jpg?max_age=2592000"
        // https://y.gtimg.cn/music/photo_new/T002R300x300M0000021k5Yo0IpMDy.jpg?max_age=2592000
        return url
    }

    fun getMin(albumid: String): String {
        return "https://y.gtimg.cn/music/photo_new/T002R300x300M000${albumid}.jpg?max_age=2592000"
    }

}