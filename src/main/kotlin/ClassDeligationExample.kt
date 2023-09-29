fun main() {
    val deligationCom = ComDeveloper()
    deligationCom.designed()
}

interface KProgramer {
    var isWorking: Boolean
    fun work()
    fun getPaid()
}

interface Designer {
    var isDesigner: Boolean
    fun designed()
    fun getPaidToDesigner()
}

class GraphicsDesigner : Designer {
    override var isDesigner = true

    override fun designed() {
        println("Is Designer Designed the Application!")
    }

    override fun getPaidToDesigner() {
        if (isDesigner)
            println("Designer is Paid!")
        else
            println("Designer not Paid")
        isDesigner = false
    }
}

class KotlinProgramer : KProgramer {
    override var isWorking = true

    override fun work() {
        println("Kotlin Programer is working!")
    }

    override fun getPaid() {
        if (isWorking)
            println("Programer getting Paid")
        else
            println("Programer is not getting paid")
        isWorking = false
    }

}

class JavaProgramer : KProgramer {
    override var isWorking = true

    override fun work() {
        println("Kotlin Programer is working!")
    }

    override fun getPaid() {
        if (isWorking)
            println("Programer getting Paid")
        else
            println("Programer is not getting paid")
        isWorking = false
    }

}

//class KDeveloper:
//    KProgramer by KotlinProgramer()

class ComDeveloper :
    KProgramer by KotlinProgramer(),
    Designer by GraphicsDesigner()