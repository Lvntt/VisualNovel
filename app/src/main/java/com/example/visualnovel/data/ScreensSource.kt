package com.example.visualnovel.data

import com.example.visualnovel.screens.models.DialogueScreen
import com.example.visualnovel.screens.models.HomeScreen
import com.example.visualnovel.screens.models.PlayerIntroductionScreen

object ScreensSource {

    private val screens = mapOf(
        1 to HomeScreen(
            "Моя визуальная новелла",
            ReplyButton("Начать", 2)
        ),
        2 to PlayerIntroductionScreen(
            "Привет! Меня зовут Кирюша. А тебя?",
            ReplyButton("Подтвердить", 3)
        ),
        3 to DialogueScreen(
            "Отлично, <username>! Чем займемся?",
            listOf(
                ReplyButton("Пойдем на пробежку", 4),
                ReplyButton("Пойдем в поход", 5),
                ReplyButton("Погуляем по полю", 6)
            )
        ),
        4 to DialogueScreen(
            "Может, пойдем домой?..",
            listOf(
                ReplyButton("Да, и посмотрим фильм", 7),
                ReplyButton("Да, и отпразднуем хэллоуин", 8)
            )
        ),
        5 to DialogueScreen(
            "Как уютно.. Но уже темнеет.",
            listOf(
                ReplyButton("Пойдем домой и посмотрим фильм", 7),
                ReplyButton("Пойдем домой и отпразднуем Хэллоуин", 8)
            )
        ),
        6 to DialogueScreen(
            "Тебе грустно... Пойдем домой?",
            listOf(
                ReplyButton("Может, посмотрим фильм?", 7),
                ReplyButton("Да, отпразднуем Хэллоуин", 8)
            )
        ),
        7 to DialogueScreen(
            "Как тебе фильм?",
            listOf(
                ReplyButton("Мне понравился!", 9),
                ReplyButton("Не очень...", 10)
            )
        ),
        8 to DialogueScreen(
            "Получается очень красиво!",
            listOf(
                ReplyButton("Да! Может, посмотрим фильм?", 7),
                ReplyButton("Да! Давай сделаем костюмы!", 11)
            )
        ),
        9 to DialogueScreen(
            "Отлично! А теперь пора спать...",
            listOf(
                ReplyButton("Да, уже поздно...", 14)
            )
        ),
        10 to DialogueScreen(
            "Жаль... Тогда пойдем спать?",
            listOf(
                ReplyButton("Да, уже поздно...", 14)
            )
        ),
        11 to DialogueScreen(
            "Мне нравится твой костюм.",
            listOf(
                ReplyButton("Твой тоже очень красивый!", 12),
                ReplyButton("А мне, если честно, не нравится твой...", 13)
            )
        ),
        12 to DialogueScreen(
            "Спасибо! Ну, пойдем спать?",
            listOf(
                ReplyButton("Да, уже поздно...", 14)
            )
        ),
        13 to DialogueScreen(
            "Ничего, я не в обиде. Пойдем спать?",
            listOf(
                ReplyButton("Да, уже поздно...", 14)
            )
        ),
        14 to HomeScreen(
            "Спасибо, что поиграли!",
            ReplyButton("Пройти еще раз", 1)
        )
    )

    fun getScreens() = screens
}