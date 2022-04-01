fun cave(){
// spelers wapens
    var weapon2 = Weapons("speer", 20)
    var enemy2 = Enemy("beer", 10, 65, 85)
    var maurice = Player("maurice", 10, 100, 105)
    println(" je gaat langs een meertje staat nu in de cave " +
            "er zijn wat tunnels " )


    //bossfight
    fun boss(){

        fun vraag1() {


            println("Waar leven ijsberen op de ......")
            var raadsels = readLine()
            if (raadsels == "Noordpool") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon2.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag1()
            }
        }


        fun vraag2() {
            println("wat is ezel in het engels")
            var raadsels = readLine()
            if (raadsels == "donkey") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon2.damage)
                boss()
            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag2()
            }
        }

        fun vraag3() {


            println("wat is boom in het engels ")
            var raadsels = readLine()
            if (raadsels == "tree") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon2.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag3()
            }
        }

        fun vraag4() {

            println("wat is blad in het engels")

            var raadsels = readLine()
            if (raadsels == "leafe") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon2.damage)
                boss()

            } else {
                println("Engelsen naam voor zuidpool")
                maurice.takeDamage(25)
                vraag4()
            }
        }

        fun vraag5() {

            println("wat is kat in het engels")

            var raadsels = readLine()
            if (raadsels == "cat") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon2.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag5()
            }
        }

        fun vraag6() {

            println("wat is hond in het engels")

            var raadsels = readLine()
            if (raadsels == "dog") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon2.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag6()
            }
        }

        fun vraag7() {

            println("wat is 10 + 10")

            var raadsels = readLine()
            if (raadsels == "twintig") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(4)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag7()
            }
        }


        fun bossfight() {
            if (enemy2.hitpoints > 64) {
                vraag1()
            } else if (enemy2.hitpoints > 54) {
                vraag2()

            } else if (enemy2.hitpoints > 44) {
                vraag3()

            } else if (enemy2.hitpoints > 34) {
                vraag4()

            } else if (enemy2.hitpoints > 24) {
                vraag5()

            } else if (enemy2.hitpoints > 14) {
                vraag6()

            } else if (enemy2.hitpoints > 4) {
                vraag7()

            } else {
                eindroom()
            }
        }
        bossfight()
    }
// room
    fun keuzekant(){
        println("[noord] [oost] [zuid] [west]")
        var keuze = readLine()

        if (keuze == "noord") {
            println("je loopt noord naar het meertje")
            println("er is  geen eten te vinden dus je gaat terug")
            keuzekant()
        } else if (keuze == "oost") {
            println("je loopt naar oost je ziet een mensen stad da vind je eng dus je gaat terug")
            keuzekant()
        }
        else if (keuze == "zuid"){
            println("ja gaat naar zuid")
            println("je komt uit bij een sneeuw bos ")
            println("sneeuw is geen eten dus je gaat weer terug")
            keuzekant()
        }
        else if (keuze == "west"){
            println("Je gaat naar west je ziet een tros bananen maar " +
                    "er staat een beer voor")
            boss()
        }
    }



    keuzekant()
}