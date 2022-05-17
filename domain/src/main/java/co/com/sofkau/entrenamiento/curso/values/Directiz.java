package co.com.sofkau.entrenamiento.curso.values;

import co.com.sofka.domain.generic.ValueObject;

public class Directiz implements ValueObject<String> {
    private final  String value;

    public Directiz(String value) {
        this.value = value;
    }

    public Directiz(CursoId cursoId, MentoriaId mentoriaId, MentoriaId mentoriaId1, String value) {
        this.value = value;
    }



    @Override
    public String value() {
        return value;
    }

    public void agregarDirectrizDeMentoria(MentoriaId mentoriaId, Directiz directiz) {
    }
}