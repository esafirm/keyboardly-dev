package app.keyboardly.addon.sample.action.flutter

import android.widget.Button
import app.keyboardly.lib.KeyboardActionDependency
import app.keyboardly.lib.KeyboardActionView
import io.flutter.embedding.android.FlutterActivity

class FlutterActionView(
    dependency: KeyboardActionDependency
) : KeyboardActionView(dependency) {

    override fun onCreate() {
        viewLayout = Button(getContext()).apply {
            text = "Launch Flutter Activity"
            setOnClickListener {
                context.startActivity(
                    FlutterActivity.createDefaultIntent(context)
                )
            }
        }
    }
}