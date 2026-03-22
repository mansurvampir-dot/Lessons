package OOP_PRINCIP.homeWork.task9;

class Duck {
    private Wing leftWing = new Wing();
    private Wing rightWing = new Wing();

    void flapWings() {
        leftWing.flap();
        rightWing.flap();
    }
}