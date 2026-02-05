package com.midasxxi

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class MidasxxiPlugin : Plugin() {

    override fun load() {
        registerMainAPI(Midasxxi())
        registerExtractorAPI(Playcinematic())
    }
}
