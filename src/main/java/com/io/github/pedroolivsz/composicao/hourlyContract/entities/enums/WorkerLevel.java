package com.io.github.pedroolivsz.composicao.hourlyContract.entities.enums;

public enum WorkerLevel {
    JUNIOR(0),
    MID_LEVEL(1),
    SENIOR(2);

    private final Integer id;

    WorkerLevel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
