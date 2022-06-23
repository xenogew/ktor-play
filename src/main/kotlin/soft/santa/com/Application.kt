package soft.santa.com

import io.ktor.server.application.Application
import soft.santa.com.plugins.configureHTTP
import soft.santa.com.plugins.configureRouting
import soft.santa.com.plugins.configureSecurity
import soft.santa.com.plugins.configureSerialization

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureSerialization()
    configureHTTP()
    configureSecurity()
}
