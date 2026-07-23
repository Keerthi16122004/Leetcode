class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1) {
                String pair = s.substring(i, i + 2);

                if (pair.equals("IV")) {
                    total += 4;
                    i++;
                    continue;
                } else if (pair.equals("IX")) {
                    total += 9;
                    i++;
                    continue;
                } else if (pair.equals("XL")) {
                    total += 40;
                    i++;
                    continue;
                } else if (pair.equals("XC")) {
                    total += 90;
                    i++;
                    continue;
                } else if (pair.equals("CD")) {
                    total += 400;
                    i++;
                    continue;
                } else if (pair.equals("CM")) {
                    total += 900;
                    i++;
                    continue;
                }
            }

            switch (s.charAt(i)) {
                case 'I': total += 1; break;
                case 'V': total += 5; break;
                case 'X': total += 10; break;
                case 'L': total += 50; break;
                case 'C': total += 100; break;
                case 'D': total += 500; break;
                case 'M': total += 1000; break;
            }
        }

        return total;
    }
}