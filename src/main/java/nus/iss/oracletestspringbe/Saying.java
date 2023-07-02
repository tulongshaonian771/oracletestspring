package nus.iss.oracletestspringbe;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Saying {
    private List<Double> fibonacci;

    private List<Double> sorted;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(List<Double> fibonacci, List<Double> sorted) {
        this.fibonacci = fibonacci;
        this.sorted = sorted;
    }
    public List<Double> getFibonacci() {
        return fibonacci;
    }
    public void setFibonacci(List<Double> fibonacci) {
        this.fibonacci = fibonacci;
    }
    public List<Double> getSorted() {
        return sorted;
    }
    public void setSorted(List<Double> sorted) {
        this.sorted = sorted;
    }
}
