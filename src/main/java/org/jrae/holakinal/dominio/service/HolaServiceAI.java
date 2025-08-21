package org.jrae.holakinal.dominio.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface HolaServiceAI {
    @UserMessage("""
            Genera un saludo de bienvenida a mi plataforma Pelicula en linea jrae
            Usa al menos 120 caracteres y hazlo como alumno de kinal.
            """)
    public String generarSaludo();
}
