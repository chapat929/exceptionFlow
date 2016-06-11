package com.chandni;

public class Main {

    public static void main(String[] args) {
        String test = "yes";

        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (ScaryException e) {
            System.out.println("Scary Exception");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        System.out.println("end of main");
    }

    private static void doRisky(String test) throws ScaryException {
        System.out.println("start doRisky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end doRisky");
        return;
    }
}
