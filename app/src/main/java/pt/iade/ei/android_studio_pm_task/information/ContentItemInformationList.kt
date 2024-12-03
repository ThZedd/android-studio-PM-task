package pt.iade.ei.android_studio_pm_task.information

import pt.iade.ei.android_studio_pm_task.R
import pt.iade.ei.android_studio_pm_task.models.ContentItem
import java.time.LocalDate

fun contentItemListInformation(): List<ContentItem> {
    return listOf(
        ContentItem(
            id = 1,
            title = "Black Clover",
            description = "In a world where magic is everything, two boys are determined to become the Wizard King despite their humble beginnings and one of them having no magical abilities at all.",
            banner = R.drawable.black_clover_banner,
            cover = R.drawable.black_clover,
            votes = 100000,
            genre = "Action & Adventure",
            releaseDate = LocalDate.parse("2017-10-03"),
            duration = 1700,
            reviews = contentReviewInformationList()
        ),
        ContentItem(
            id = 2,
            title = "Death Note",
            description = "A high school student discovers a mysterious notebook that grants him the power to kill anyone by writing their name while picturing their face, leading to a dark journey of justice and obsession.",
            banner = R.drawable.death_note_banner,
            cover = R.drawable.death_note_cover,
            votes = (-300..300).random(),
            genre = "Mystery & Thriller",
            releaseDate = LocalDate.parse("2006-10-03"),
            duration = 780 ,
            reviews = contentReviewInformationList()
        ),
        ContentItem(
            id = 3,
            title = "The Truman Show",
            description = "An ordinary man, Truman Burbank, gradually discovers that his entire life has been a meticulously constructed reality television show, broadcast 24/7 to the world.",
            banner = R.drawable.the_truman_show_banner,
            cover = R.drawable.the_truman_show,
            votes = (-10000..10000).random(),
            genre = "Comedy, Drama, Sci-Fi",
            releaseDate = LocalDate.parse("1998-06-05"),
            duration = 103,
            reviews = contentReviewInformationList()
        ),
        ContentItem(
            id = 4,
            title = "Squid Game",
            description = "Hundreds of cash-strapped players accept a strange invitation to compete in children's games for a tempting prize, but the stakes are deadly.",
            banner = R.drawable.squid_game_banner,
            cover = R.drawable.squid_game_cover,
            votes = (-500..0).random(),
            genre = "Thriller, Drama",
            releaseDate = LocalDate.parse("2021-09-17"),
            duration = 485,
            reviews = contentReviewInformationList()
        ),
        ContentItem(
            id = 5,
            title = "Serial Experiments Lain",
            description = "Following the mysterious suicide of a schoolgirl, introverted Lain Iwakura becomes deeply involved in a virtual world called 'The Wired,' blurring the lines between reality and cyberspace.",
            banner = R.drawable.lain_banner,
            cover = R.drawable.lain_cover,
            votes = (-1000..1000).random(),
            genre = "Mystery, Psychological",
            releaseDate = LocalDate.parse("1998-07-06"),
            duration = 325,
            reviews = contentReviewInformationList()
        ),
    )
}