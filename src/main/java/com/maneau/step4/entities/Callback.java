package com.maneau.step4.entities;

public interface Callback<T> {
    void execute(T value);
}
