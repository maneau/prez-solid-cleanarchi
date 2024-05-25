package com.maneau.step5.entities;

public interface Callback<T> {
    void execute(T value);
}
