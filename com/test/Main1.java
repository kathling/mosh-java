package com.test;

public class Main1 {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(textBox);
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
