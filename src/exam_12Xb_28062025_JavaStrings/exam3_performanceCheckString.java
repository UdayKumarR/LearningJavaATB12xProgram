package exam_12Xb_28062025_JavaStrings;

public class exam3_performanceCheckString {
    public static void main(String[] args) {
        int iterations = 1000;

        // --- String Concatenation ---
        long startTime = System.nanoTime();
        String resultString1 = "";
        for (int i = 0; i < iterations; i++) {
            resultString1 += "abc";
        }
        long endTime = System.nanoTime();
        long durationString = (endTime - startTime) / 1_000_000;
        System.out.print("String : " + durationString + " ms, ");

        // --- StringBuilder ---
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a".repeat(iterations));
        String resultStringBuilder1 = stringBuilder.toString();
        endTime = System.nanoTime();
        long durationStringBuilder = (endTime - startTime) / 1_000_000;
        System.out.print("StringBuilder: " + durationStringBuilder + " ms, ");

        // --- StringBuffer ---
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a".repeat(iterations));
        String resultStringBuffer1 = stringBuffer.toString();
        endTime = System.nanoTime();
        long durationStringBuffer = (endTime - startTime) / 1_000_000; // convert to milliseconds
        System.out.print("StringBuffer: " + durationStringBuffer + " ms");
    }
}
