package com.example.firstaid_algorithm

class Data {
    var questions = arrayOf(
        "Czy jesteś bezpieczny?",
        "Czy poszkodowany jest przytomny?",
        "Czy widzisz poważny upływ krwi?",
        "Czy sprawa jest poważna?",
        "Czy widzisz poważny upływ krwi?",
        "Czy poszkodowany oddycha?",
        "Czy oddech powrócił?",
        "Czy wiesz co się stało?",
        "Czy podejrzewasz uszkodzenie kręgosłupa?",
        "Czy sprawa poważna, masz wątpliwości?"
    )

    var tips: Array<String?> = arrayOf(
        "Nie podchodź! Wezwij służby, które usuną niebezpieczeństwo.",
        "Zawołaj głośno poszkodowanego lub potrząśnij za ramiona, aby sprawdzić czy poszkodowany jest przytomny.",
        "Znajdź osobę do pomocy i poproś o zadzwonienie na 999 lub sam wezwij służby", //2 call
        null,
        "Zbierz wywiad, zapytaj poszkodowanego co się stało, czy jest na coś chory i jak możesz mu pomóc.",
        "Zatamuj krwotok. Następnie zbierz wywiad, zapytaj poszkodowanego co się stało, czy jest na coś chory i jak możesz mu pomóc.",
        "Upewnij się, że poszkodowany jest zdrowy i poradzi sobie sam!",
        "Zadzwoń na 999! Ustaw poszkodowanego w pozycji półsiedzącej i czekaj z nim na przyjazd karetki.", //7 call
        "Oceń funkcje życiowe. Odchyl głowę do tyłu i sprawdź oddech poszkodowanego.",
        "Zatamuj krwotok. Następnie oceń funkcje życiowe. Odchyl głowę do tyłu i sprawdź oddech poszkodowanego.",
        "Wykonaj natychmiastową resuscytację! Wykonaj sekwencje 30 uciśnięć i 2 wdechów lub użyj urządzenia AED jeśli jest w pobliżu. ",
        null,
        "Wykonaj natychmiastową resuscytację! Wykonaj sekwencje 30 uciśnięć i 2 wdechów lub użyj urządzenia AED jeśli jest w pobliżu.",
        "Zbadaj poszkodowanego, unieruchom/opatrz potencjalne urazy. Co 1 minutę sprawdzaj oddech!",
        "Ustaw poszkodowanego w pozycji czterokończynowej, po odzyskaniu przytomności zbierz wywiad i sprawdzaj oddech.",
        "Pozycja bezpieczna, boczna ustalona. Co 1 minutę sprawdzaj oddech!",
        "Zbadaj poszkodowanego, unieruchom/opatrz potencjalne urazy. Co 1 minutę sprawdzaj oddech!",
        "Pozycja bezpieczna, sprawdzaj oddech, nie zostawiaj poszkodowanego. Czekaj na przyjazd karetki",
        "Nie ruszaj poszkodowanego i poczekaj na przyjazd karetki. Co 1 minutę sprawdzaj oddech poszkodowanego!",
        "Upewnij się, że poszkodowany jest zdrowy i poradzi sobie sam",
        "Nie pozostawiaj poszkodowanego samego, poczekaj na przyjazd karetki"
    )

    var img = arrayOf(
            R.drawable.z1, R.drawable.z2, R.drawable.z3, R.drawable.z8, R.drawable.z9, R.drawable.z10, R.drawable.z11, R.drawable.z13, R.drawable.z14, R.drawable.z15, R.drawable.z16, R.drawable.z17, R.drawable.z18,R.drawable.z18
    )

    fun createQuestionsArrays(): ArrayList<Question> {
        val data_questions = this.questions
        val questions = arrayListOf<Question>()

        questions.add(Question(data_questions[0], 1, 0))
        questions.add(Question(data_questions[1], 3, 2))
        questions.add(Question(data_questions[2], 5, 4))
        questions.add(Question(data_questions[3], 7, 6))


        questions.add(Question(data_questions[4], 9, 8))
        questions.add(Question(data_questions[5], 11, 10))
        questions.add(Question(data_questions[6], 13, 12))
        questions.add(Question(data_questions[7], 16, 15, 14))
        questions.add(Question(data_questions[8], 18, 17))
        questions.add(Question(data_questions[9], 20, 19))

        return questions
    }

    fun createInfosArray(): ArrayList<Information> {
        val data_info: Array<String?> = this.tips
        val infos = arrayListOf<Information>()
        val images: Array<Int> = this.img

        infos.add(Information(data_info[0], null, images[0]))
        infos.add(Information(data_info[1], 1,images[1]))
        infos.add(Information(data_info[2], 4,images[2]))
        infos.add(Information(data_info[3], 2,null))
        infos.add(Information(data_info[4], 3, null))
        infos.add(Information(data_info[5], 3, null))
        infos.add(Information(data_info[6], null, null))
        infos.add(Information(data_info[7], null, images[3]))

        infos.add(Information(data_info[8], 5, images[4]))
        infos.add(Information(data_info[9], 5, images[5]))
        infos.add(Information(data_info[10], 6,images[6]))

        infos.add(Information(data_info[11], 7,null))

        infos.add(Information(data_info[12], 6,images[7]))
        infos.add(Information(data_info[13], 8,images[8]))
        infos.add(Information(data_info[14], 9,images[9]))
        infos.add(Information(data_info[15], null,images[10]))
        infos.add(Information(data_info[16], 8,images[11]))
        infos.add(Information(data_info[17], null,images[12]))
        infos.add(Information(data_info[18], null,null))
        infos.add(Information(data_info[19], null,null))
        infos.add(Information(data_info[20], null,images[13]))

        return infos
    }

}