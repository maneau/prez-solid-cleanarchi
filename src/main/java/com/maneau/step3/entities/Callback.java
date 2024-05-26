package com.maneau.step3.entities;

public interface Callback<T> {
    void execute(T value);
}
