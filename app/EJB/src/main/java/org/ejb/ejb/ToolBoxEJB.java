package org.ejb.ejb;

import jakarta.ejb.Stateless;

@Stateless
public class ToolBoxEJB {

    double add(double a, double b) {
        return a + b;
    }

}
