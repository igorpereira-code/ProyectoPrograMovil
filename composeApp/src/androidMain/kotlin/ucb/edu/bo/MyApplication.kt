package ucb.edu.bo

import android.app.Application
import io.sentry.android.core.SentryAndroid


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        SentryAndroid.init(this) { options ->
            options.dsn = "https://057568b745f17e9fe2408842cf9437d6@o4510845333929984.ingest.us.sentry.io/4510850974941184"
            options.tracesSampleRate = 1.0
        }
    }
}

