public class Function {

    public static String translateHeaderChecksum(String headerChecksum) {
        /**  Deklarieren und initialisieren
         *  die erforderlichen Variablen**/
        String[] tokens = headerChecksum.split("-");
        StringBuilder binaryString = new StringBuilder();
        StringBuilder binaryValue = new StringBuilder();
        /**Durchlaufen das Token [] Array
         *  und führen Sie die Konvertierung durch**/
        for (int i = 0; i < tokens.length; i++) {
            int hcn = 0;

            /**Konvertieren Sie die im Token [] Array enthaltene Zeichenfolgennummer
             auf Ganzzahl, um die Versorgung der Methode integerToBinaryString () vorzubereiten.*/
            if (i <= 9) {
                hcn = Integer.parseInt(tokens[i]);
            }
            /**Behandelt   jeden Header-Prüfsummenwert und konvertieret  ihn in eine Binärdatei
             und stellt  die richtige Bitanzahl sicher*/
            switch (i + 1) {
                case 1:
                case 2:
                    binaryValue = new StringBuilder(integerToBinaryString(hcn, 4));
                    break;
                case 3:
                case 9:
                    binaryValue = new StringBuilder(integerToBinaryString(hcn, 8));
                    break;
                case 4:
                case 5:
                case 10:
                    binaryValue = new StringBuilder(integerToBinaryString(hcn, 16));
                    break;
                case 6:
                    binaryValue = new StringBuilder(String.format("%0" + 3 + "d", hcn));
                    break;
                case 7:
                    binaryValue = new StringBuilder(integerToBinaryString(hcn, 15));
                    break;
                case 8:
                    binaryValue.append(integerToBinaryString(hcn, 4));
                    break;
                case 11:
                case 12:
                    tokens[i] = tokens[i].replace('.', ',');
                    String[] ipTok = tokens[i].split(",");
                    for (String s : ipTok) {

                        binaryValue.append(integerToBinaryString(Integer.parseInt(s), 8));
                    }
                    break;
            }
            if ((i + 1) != 7) {
                binaryString.append(" ").append(binaryValue);
                binaryValue = new StringBuilder();
            }
        }
        binaryString = new StringBuilder(binaryString.toString().trim());
        return binaryString.toString();
    }

    public static String integerToBinaryString(int number, int bitSize) {
        String binary = (String) Integer.toString(number, 2);
        binary = String.format("%0" + bitSize + "d", Integer.valueOf(binary));
        return binary;
    }
    public static int getDecimal(int binary) {

        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;

    }
    }















