package commands

import com.fasterxml.jackson.annotation.JsonTypeName
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JsonTypeName("help")
@JacksonXmlRootElement(localName = "help")
class Help : Command() {
    override val commandName: String = "help"
    override fun writeString() {
        /**
         * Список команд
         */
        println("Все команды: add, help, show, addIfMax, clear, save, updateId, removeLower, removeGreater, print, metro, exit, NOR, removeById")
    }
}