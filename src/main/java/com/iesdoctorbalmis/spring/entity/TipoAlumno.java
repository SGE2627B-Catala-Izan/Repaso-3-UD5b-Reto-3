package com.iesdoctorbalmis.spring.entity;

public enum TipoAlumno {
    A("ABSENTISTA"),
    B("BAJA"),
    F("FPB"),
    M("NO XARXA"),
    P("PAC"),
    U("UECO"),
    X("XARXA");

    private final String descripcion;

    TipoAlumno(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}