package com.kzuferdy.ingameapps.kuisioner

import com.kzuferdy.ingameapps.R
import com.kzuferdy.ingameapps.kuisioner.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Apakah bermain game dapat menghilangkan stress?",
            R.drawable.ic_ilust_1,
            "Bisa", "Tidak",
            "Tergantung", "Semua Benar", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Apakah bermain game secara berlebihan baik untuk kesehatan?",
            R.drawable.ic_ilust_2,
            "Baik", "Sangat Baik",
            "Tidak Baik", "Semua Salah", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Apakah bermain game secara berlebihan dapat membuat stress?",
            R.drawable.ic_ilust_3,
            "Tidak", "Tergantung",
            "Semua Benar", "Bisa", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Apakah bermain game secara berlebihan bisa untuk menghilangkan stress?",
            R.drawable.ic_ilust_4,
            "Bisa", "Tergantung gamenya",
            "Tidak", "Semua Salah", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Apakah bermain game secara berlebihan dapat membuat seseorang jatuh sakit?",
            R.drawable.ic_ilust_5,
            "Tidak", "Tergantung",
            "Bisa", "Semua Benar", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Game apa yang sedang hits di kalangan anak remaja?",
            R.drawable.ic_ilust_4,
            "Semua Benar", "Mobile Legends",
            "PUBG", "FREE FIRE", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Game apakah yang sering membuat lupa akan waktu?",
            R.drawable.ic_ilust_5,
            "Subways Surf", "Chess",
            "Mobile Legends", "Talking Tom", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Apakah bermain game nonstop bisa menjadi gila?",
            R.drawable.ic_ilust_3,
            "Tidak", "Tergantung",
            "Semua benar", "Bisa", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Menurut kesehatan baiknya bermain game berapa jam sehari?",
            R.drawable.ic_ilust_2,
            "10 Jam", "2 Jam",
            "5 Jam", "12 Jam", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Bisa kah anda mengurangi jam bermain game anda?",
            R.drawable.ic_ilust_1,
            "BISA!", "Tidak",
            "Tergantung", "Semua salah", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}