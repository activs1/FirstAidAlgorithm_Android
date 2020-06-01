package com.example.firstaid_algorithm

class Information {
    private var InformationText: String? = null
    private var NextQuestionPointer: Int? = null
    private var PictureName: Int? = null

    constructor(InformationText: String?, NextQuestionPointer: Int?, PictureName: Int?){
        this.InformationText = InformationText
        this.NextQuestionPointer = NextQuestionPointer
        this.PictureName = PictureName
    }
    fun getInformationText(): String? {
        return InformationText
    }

    fun getNextQuestionPointer(): Int? {
        return NextQuestionPointer
    }

    fun getPictureName(): Int? {
        return PictureName
    }
}