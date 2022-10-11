package com.curso.modulo8equals;

import java.util.Objects;
import java.util.UUID;

public class Cliente {
    private String id;
    private String name;

    public Cliente(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Cliente(Cliente source) {
        this.id = UUID.randomUUID().toString();
        this.name = source.getName();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name);
    }

}
