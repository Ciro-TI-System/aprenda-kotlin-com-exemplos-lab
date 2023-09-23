enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado com sucesso!")
    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Matemática", 120)
    val conteudo2 = ConteudoEducacional("Português", 90)

    val formacao1 = Formacao("Formação Básica", listOf(conteudo1, conteudo2))

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)

    println("Inscritos na formação ${formacao1.nome}: ${formacao1.inscritos.map { it.nome }}")
}
