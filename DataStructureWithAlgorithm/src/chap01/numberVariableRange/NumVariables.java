package chap01.numberVariableRange;

public final class NumVariables {
    public NumVariables() {   }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Number Type's Range\n")
        .append("Byte's range : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE + "\n")
        .append("Short's range : " + Short.MIN_VALUE + "~" + Short.MAX_VALUE + "\n")
        .append("Integer's range : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE + "\n")
        .append("Long's range : " + Long.MIN_VALUE + "~" + Long.MAX_VALUE)
        .append("\nDecimals\n")
        .append("Float's range : " + Float.MIN_VALUE + "~" + Float.MAX_VALUE + "\n")
        .append("Double's range : " + Double.MIN_VALUE + "~" + Double.MAX_VALUE + "\n");
        return sb.toString();
    }
}
