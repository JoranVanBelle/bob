package io.jonasg.bob.definitions;

import java.util.Set;

import javax.lang.model.element.Modifier;
import javax.lang.model.type.TypeMirror;

public class FieldDefinition {

    private final String name;
    private final Set<Modifier> modifiers;
    private final TypeMirror type;

    public FieldDefinition(String name, Set<Modifier> modifiers, TypeMirror type) {
        this.name = name;
        this.modifiers = modifiers;
        this.type = type;
    }

    public String name() {
        return name;
    }

    public TypeMirror type() {
        return type;
    }
}