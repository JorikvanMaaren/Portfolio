fun eindroom() {
// spelers wapens
        var weapon1 = Weapons("club", 20)
        var enemy1 = Enemy("gans", 10, 65, 85)
        var maurice = Player("maurice", 10, 100, 105)

    fun eind() {
//einde
        print("eind")
    }
//bossfight
    fun boss() {
    print("je loopt terug naar de boomhut en komt je koba tegen hij wilt je eten stelen\n" +
            "je gaat hem vechten")
        fun vraag1() {


            println("wat is de naam van de leider aap ")
            var raadsels = readLine()
            if (raadsels == "caesar") {
                println("je hebt 20 dmg gedaan")
                enemy1.takeDamage(weapon1.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag1()
            }
        }


        fun vraag2() {
            println("wat is jou naam")
            var raadsels = readLine()
            if (raadsels == "maurice") {
                println("je hebt 20 dmg gedaan")
                enemy1.takeDamage(weapon1.damage)
                boss()
            } else {
                println("je krijgt 25 dmg")
               maurice.takeDamage(25)
                vraag2()
            }
        }

        fun vraag3() {


            println("welke taal is dit geprogrameerd")
            var raadsels = readLine()
            if (raadsels == "kotlin") {
                println("je hebt 20 dmg gedaan")
                enemy1.takeDamage(weapon1.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag3()
            }
        }

        fun vraag4() {

            println("haar in het engels")

            var raadsels = readLine()
            if (raadsels == "hair") {
                println("je hebt 20 dmg gedaan")
                enemy1.takeDamage(weapon1.damage)
                boss()

            } else {
                println("Engelsen naam voor zuidpool")
                maurice.takeDamage(25)
                vraag4()
            }
        }

        fun vraag5() {

            println("koe in het engels")

            var raadsels = readLine()
            if (raadsels == "South pole") {
                println("je hebt 20 dmg gedaan")
                enemy1.takeDamage(weapon1.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag5()
            }
        }

        fun vraag6() {

            println("zijn er geiten in mc")

            var raadsels = readLine()
            if (raadsels == "ja") {
                println("je hebt 20 dmg gedaan")
                enemy1.takeDamage(weapon1.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag6()
            }
        }

        fun vraag7() {

            println("wat is blad in het engel?")

            var raadsels = readLine()
            if (raadsels == "leafee") {
                println("je hebt 20 dmg gedaan")
                enemy1.takeDamage(4)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag7()
            }
        }


        fun bossfight() {
            if (enemy1.hitpoints > 64) {
                vraag1()
            } else if (enemy1.hitpoints > 54) {
                vraag2()

            } else if (enemy1.hitpoints > 44) {
                vraag3()

            } else if (enemy1.hitpoints > 34) {
                vraag4()

            } else if (enemy1.hitpoints > 24) {
                vraag5()

            } else if (enemy1.hitpoints > 14) {
                vraag6()

            } else if (enemy1.hitpoints > 4) {
                vraag7()

            } else {
                eind()
            }
        }
       bossfight()
    }
    boss()
}