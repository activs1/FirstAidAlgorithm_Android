package com.example.firstaid_algorithm

import android.media.Image

class Information {
    private var InformationText: String? = null
    private var NextQuestionPointer: Int? = null
    private var PictureName: Int? = null

<<<<<<< Updated upstream
    constructor(InformationText: String, NextQuestionPointer: Int){
=======
    constructor(InformationText: String?, NextQuestionPointer: Int?, PictureName: Int?){
>>>>>>> Stashed changes
        this.InformationText = InformationText
        this.NextQuestionPointer = NextQuestionPointer
        this.PictureName = PictureName
    }

    fun getInformationText(): String? {
        return InformationText
    }

    fun getNextQuestionPointer(): Int? {
        return NextQuestionPointer
<<<<<<< Updated upstream
=======
    }

    fun getPictureName(): Int? {
        return PictureName
    }

>>>>>>> Stashed changes
}