package com.example.firstaid_algorithm

class Question {
    private var QuestionText: String? = null
    private var PointerOption1: Int? = null  // zwykle odpowiedź "tak"
    private var PointerOption2: Int? = null  // zwykle odpowiedź "nie"
    private var PointerOption3: Int? = null

    constructor() {}

    constructor(QuestionText: String, PointerTak: Int, PointerNie: Int) {
        this.QuestionText= QuestionText
        PointerOption1 = PointerTak
        PointerOption2 = PointerNie
    }

    constructor(QuestionText: String, PointerOption1: Int, PointerOption2: Int, PointerOption3: Int) {
        this.QuestionText= QuestionText
        this.PointerOption1 = PointerOption1
        this.PointerOption2 = PointerOption2
        this.PointerOption3 = PointerOption3
    }

    fun getQuestionText(): String? {
        return QuestionText
    }

    fun getPointerOption1(): Int? {
        return PointerOption1
    }

    fun getPointerOption2(): Int? {
        return PointerOption2
    }

    fun getPointerOption3(): Int? {
        return PointerOption3
    }
}