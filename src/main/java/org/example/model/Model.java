package org.example.model;

import java.util.ArrayList;
import java.util.Collection;

public class Model {
    org.example.model.MyShape currentShape;
    Collection<org.example.model.MyShape> list;

    public Model() {
        list = new ArrayList<>();
    }

    public void setCurrentShape(org.example.model.MyShape currentShape) {
        this.currentShape = currentShape;
    }

    public void createCurrentShape(org.example.model.MyShape shape) {
        currentShape = shape;
        list.add(currentShape);
    }

    public org.example.model.MyShape getCurrentShape() {
        return currentShape;
    }

    public Collection<org.example.model.MyShape> getList() {
        return list;
    }
}