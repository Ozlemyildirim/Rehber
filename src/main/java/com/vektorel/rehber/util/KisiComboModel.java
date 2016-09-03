/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.rehber.util;

/**
 *
 * @author eğitmen
 */
public class KisiComboModel {
    private Long value;
    private String label;

    public KisiComboModel(Long value, String label) {
        this.value = value;
        this.label = label;
    }

    public Long getValue() {
        return this.value;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return label;
    }
}
