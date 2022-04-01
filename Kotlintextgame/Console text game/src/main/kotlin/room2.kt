fun bos(){
    println("je gaat de bos in")
    var weapon3 = Weapons("boog", 20)
    var enemy3 = Enemy("wolf", 10, 65, 85)
    var maurice = Player("maurice", 10, 100, 105)
//boss
    fun boss(){

        fun vraag1() {


            println("hoe heten meerdere bananen in die bom ding.")
            var raadsels = readLine()
            if (raadsels == "tros") {
                println("je hebt 20 dmg gedaan")
                enemy3.takeDamage(weapon3.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag1()
            }
        }


        fun vraag2() {
            println("wat is banaan in het engels ")
            var raadsels = readLine()
            if (raadsels == "banana") {
                println("je hebt 20 dmg gedaan")
                enemy3.takeDamage(weapon3.damage)
                boss()
            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag2()
            }
        }

        fun vraag3() {


            println("wat is ananas in het engels =")
            var raadsels = readLine()
            if (raadsels == "pineapple") {
                println("je hebt 20 dmg gedaan")
                enemy3.takeDamage(weapon3.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag3()
            }
        }

        fun vraag4() {

            println("wat is raam in het engels")

            var raadsels = readLine()
            if (raadsels == "window") {
                println("je hebt 20 dmg gedaan")
                enemy3.takeDamage(weapon3.damage)
                boss()

            } else {
                println("damge")
                maurice.takeDamage(25)
                vraag4()
            }
        }

        fun vraag5() {

            println("wat is aap in het engels ")

            var raadsels = readLine()
            if (raadsels == "ape") {
                println("je hebt 20 dmg gedaan")
                enemy3.takeDamage(weapon3.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag5()
            }
        }

        fun vraag6() {

            println("Kan een Pinguin vliegen")

            var raadsels = readLine()
            if (raadsels == "Nee") {
                println("je hebt 20 dmg gedaan")
                enemy3.takeDamage(weapon3.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag6()
            }
        }

        fun vraag7() {

            println("Kunnen struisvogels vliegen?")

            var raadsels = readLine()
            if (raadsels == "Nee") {
                println("je hebt 20 dmg gedaan")
                enemy3.takeDamage(4)
                boss()

            } else {
                println("je krijgt 25 dmg.")
                maurice.takeDamage(25)
                vraag7()
            }
        }


        fun bossfight() {
            if (enemy3.hitpoints > 64) {
                vraag1()
            } else if (enemy3.hitpoints > 54) {
                vraag2()

            } else if (enemy3.hitpoints > 44) {
                vraag3()

            } else if (enemy3.hitpoints > 34) {
                vraag4()

            } else if (enemy3.hitpoints > 24) {
                vraag5()

            } else if (enemy3.hitpoints > 14) {
                vraag6()

            } else if (enemy3.hitpoints > 4) {
                vraag7()

            } else {
                eindroom()
            }
        }
      bossfight()
    }
    // room
    fun keuzekant() {
        println("[noord] [oost] [zuid] [west]")
        var keuze = readLine()

        if (keuze == "noord") {
            println("je loopt noord naar het meertje")
            println("bij het meer is geen eten dus je gaat maar weer terug")
            keuzekant()
        } else if (keuze == "oost") {
            println("je loopt naar oost ")
            println("je komt bij de rand van het bos er is geen lekker eten te vinden")
            println("dus je gaat terug")
            keuzekant()
        } else if (keuze == "zuid") {
            println("ja gaat naar zuid")
            println("je ziet een tros bananen je word heel blij je rent er naartoe")
            println("oei een vos pakt het net voor je weg je gaat vechten met de vos")
            boss()
        } else if (keuze == "west") {
            println("je loopt naar west ")
            println("je komt bij een auto weg waar geen eten is" +
                    " en het is ook eng natuurlijk al die stalen monsters")
            println("dus je gaat weer terug")
            keuzekant()
        }
    }
    keuzekant()
}