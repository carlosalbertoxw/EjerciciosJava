package com.carlos.ejercicios.patrones.factory2;

import java.awt.Graphics;

/**
 * Producto del patrón Factory en su versión gráfica: cada forma se dibuja sobre
 * un contexto {@link java.awt.Graphics}.
 *
 * @author Carlos
 */
public interface Shape {
    public void draw(Graphics g);
}
