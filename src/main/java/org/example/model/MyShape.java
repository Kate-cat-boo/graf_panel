package org.example.Model;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

public class MyShape {
    Color color;
    RectangularShape shape;
    org.example.Model.FillBehavior fillBehavior;

    public MyShape(Color color, RectangularShape shape) {
        this.color = color;
        this.shape = shape;
        this.fillBehavior = org.example.Model.FillBehavior.NOFILL;
    }

    public MyShape() {
        color = Color.BLACK;
        shape = new Rectangle2D.Double();
        this.fillBehavior = org.example.Model.FillBehavior.NOFILL;
    }

    public MyShape(Color gray, Rectangle2D.Double aDouble, org.example.Model.FillBehavior fillBehavior) {
        color = Color.gray;
        shape = new Rectangle2D.Double();
        this.fillBehavior = fillBehavior;
    }

    public void setFrame(Point2D [] p){
        shape.setFrameFromDiagonal(p[0],p[1]);
    }
    public void draw(Graphics2D g){
        Paint paint = g.getPaint();
        g.setColor(color);
        fillBehavior.draw(g,shape);
        g.setPaint(paint);
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public RectangularShape getShape() {
        return shape;
    }

    public void setShape(RectangularShape shape) {
        this.shape = shape;
    }

    public org.example.Model.FillBehavior getFillBehavior() {
        return fillBehavior;
    }

    public void setFillBehavior(org.example.Model.FillBehavior fillBehavior) {
        this.fillBehavior = fillBehavior;
    }
    public MyShape clone() {
        MyShape s = new MyShape();
        s.setColor(this.color);
        s.fillBehavior = this.fillBehavior;
        s.setShape((RectangularShape) this.shape.clone());
        return s;
    }
}