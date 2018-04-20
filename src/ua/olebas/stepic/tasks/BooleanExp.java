package ua.olebas.stepic.tasks;

public class BooleanExp {
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d)) | ((a ^ d) & (c ^ d));
    }
}
