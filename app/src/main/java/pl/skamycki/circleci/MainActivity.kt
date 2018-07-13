package pl.skamycki.circleci

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.answers.Answers
import com.crashlytics.android.answers.LoginEvent
import kotlinx.android.synthetic.main.activity_main.*
import pl.skamycki.circleci.model.ProxyTask

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        crash_btn.setOnClickListener { Proxy.doIt(ProxyTask("hello task")) }
        login_btn.setOnClickListener { Answers.getInstance().logLogin(LoginEvent()) }
    }
}
