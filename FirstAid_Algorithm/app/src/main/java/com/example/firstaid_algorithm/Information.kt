package com.example.firstaid_algorithm

class Information {
    private var InformationText: String? = null
    private var NextQuestionPointer: Int? = null

    constructor(InformationText: String, NextQuestionPointer: Int){
        this.InformationText = InformationText
        this.NextQuestionPointer = NextQuestionPointer
    }

    fun getInformationText(): String? {
        return InformationText
    }

    fun getNextQuestionPointer(): Int? {
        return NextQuestionPointer
}