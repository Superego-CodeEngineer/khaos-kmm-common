package com.brian.khaos_kmm_common

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}