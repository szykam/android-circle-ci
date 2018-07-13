package pl.skamycki.circleci

import pl.skamycki.circleci.model.ExecutorTask

object Executor {

    fun execute(task: ExecutorTask) {
        throw RuntimeException("Forced crash: ${task.data}")
    }
}
