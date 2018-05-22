import br.com.wydmaster.connection.MysqlHelper
import br.com.wydmaster.core.ProcessamentoPacotes
import java.net.Socket

/**
 * Criado por bruno-meurer em 20/08/17.
 */
fun main(args: Array<String>){

    MysqlHelper.it.conectar()

    println(" __        __              _     __  __                 _                 \n" +
            " \\ \\      / /  _   _    __| |   |  \\/  |   __ _   ___  | |_    ___   _ __ \n" +
            "  \\ \\ /\\ / /  | | | |  / _` |   | |\\/| |  / _` | / __| | __|  / _ \\ | '__|\n" +
            "   \\ V  V /   | |_| | | (_| |   | |  | | | (_| | \\__ \\ | |_  |  __/ | |   \n" +
            "    \\_/\\_/     \\__, |  \\__,_|   |_|  |_|  \\__,_| |___/  \\__|  \\___| |_|   \n" +
            "               |___/                                                      ")

    println("  __  __               _         ____                                                                                _           \n" +
            " |  \\/  |   ___     __| |       |  _ \\   _ __    ___     ___    ___   ___   ___    __ _   _ __ ___     ___   _ __   | |_    ___  \n" +
            " | |\\/| |  / _ \\   / _` |       | |_) | | '__|  / _ \\   / __|  / _ \\ / __| / __|  / _` | | '_ ` _ \\   / _ \\ | '_ \\  | __|  / _ \\ \n" +
            " | |  | | | (_) | | (_| |  _    |  __/  | |    | (_) | | (__  |  __/ \\__ \\ \\__ \\ | (_| | | | | | | | |  __/ | | | | | |_  | (_) |\n" +
            " |_|  |_|  \\___/   \\__,_| (_)   |_|     |_|     \\___/   \\___|  \\___| |___/ |___/  \\__,_| |_| |_| |_|  \\___| |_| |_|  \\__|  \\___/ \n" +
            "                                                                                                                                 ")


    println("Servico iniciado com sucesso!")
    println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")

    val s = Socket("localhost", 1112)

    val thread = ProcessamentoPacotes(s)
    thread.start()

}