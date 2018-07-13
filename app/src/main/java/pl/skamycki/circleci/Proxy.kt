package pl.skamycki.circleci

import pl.skamycki.circleci.model.ExecutorTask
import pl.skamycki.circleci.model.ProxyTask
import java.util.*

object Proxy {

    fun doIt(task: ProxyTask) = Executor.execute(ExecutorTask(task.data, Calendar.getInstance().timeInMillis))
}
