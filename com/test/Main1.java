package com.test;

public class Main1 {
    public static void main(String[] args) {
        UIControl[] controls = { new TextBox(), new CheckBox()};
        for (var control : controls)
            control.render();
    }
}
