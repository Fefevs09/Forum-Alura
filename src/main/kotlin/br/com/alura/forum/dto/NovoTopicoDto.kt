package br.com.alura.forum.dto

import java.time.LocalDateTime

class NovoTopicoDto(
    val titulo: String,
    val mensagem: String,
    val idCurso: Long ,
    val idAutor: Long
)
