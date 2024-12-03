package pt.iade.ei.android_studio_pm_task.information


import pt.iade.ei.android_studio_pm_task.models.Review
import pt.iade.ei.android_studio_pm_task.models.User

import java.time.LocalDateTime

fun contentReviewInformationList(): List<Review> {
    val user1 = User(1, "André Sabino")

    return listOf(
        Review(
            id = 1,
            user = user1,
            comment = "Eu sou o Sabino, eu sou o melhor de todos SIUUUUU",
            rating = 5,
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 1,
            user = user1,
            comment = "Eu sou o Sabino, eu sou o melhor de todos SIUUUUU",
            rating = 5,
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 1,
            user = user1,
            comment = "Eu sou o Sabino, eu sou o melhor de todos SIUUUUU",
            rating = 5,
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 1,
            user = user1,
            comment = "Eu sou o Sabino, eu sou o melhor de todos SIUUUUU",
            rating = 5,
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 1,
            user = user1,
            comment = "Eu sou o Sabino, eu sou o melhor de todos SIUUUUU",
            rating = 5,
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 1,
            user = user1,
            comment = "Eu sou o Sabino, eu sou o melhor de todos SIUUUUU",
            rating = 5,
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 1,
            user = user1,
            comment = "Eu sou o Sabino, eu sou o melhor de todos SIUUUUU",
            rating = 5,
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 1,
            user = user1,
            comment = "Eu sou o Sabino, eu sou o melhor de todos SIUUUUU",
            rating = 5,
            publishedDate = LocalDateTime.now()
        )
    )
}


