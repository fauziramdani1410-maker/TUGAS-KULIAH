
public class MAHAMERU {
    public static void main(String[] args) {
       
        char[] [] peta = {
            {'M','X','X','X','X','X','X','X','X','H','H','H',}, 
            {'H','X','H','H','H','X','X','R','X','H','X','H',}, 
            {'H','X','X','X','H','R','H','H','H','H','X','H',}, 
            {'H','H','H','H','H','X','H','H','H','X','X','X',}, 
            {'H','H','X','H','H','X','R','X','X','X','X','H',}, 
            {'R','H','X','R','H','X','H','H','H','H','H','R',}, 
        };
    
        
        int tenaga = 12;
        String jalur = "LLLLLUrUULLDDLULLLUUU"; 
        

        int row = 5;
        int col = 11; 
        boolean berhasil=true;
    

        for (int i = 0; i < jalur.length(); i++) {
            char langkah = jalur.charAt(i);

            if (langkah == 'r') {
                if (peta[row][col] == 'R') {
                    tenaga += 9;
                } else {
                    System.out.println("Mohon maaf, istirahat hanya diperbolehkan di Pos -pos yang tersedia");
                    berhasil = false;
                    break;
                }
            } else {
                 if (langkah == 'L') col--;
                else if (langkah == 'R') col++;
                else if (langkah == 'U') row--;
                else if (langkah == 'D') row++;

                tenaga--; 

                if (row < 0 || row >= 6 || col < 0 || col >= 12 || peta[row][col] == 'X') {
                    System.out.println("jalur anda salah, anda masuk ke jurang/blank 45");
                    berhasil = false;
                    break;
                }
                if (tenaga <=0 && i < jalur.length() - 1) {
                    System.out.println("jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain atau sempatkan istirahat terlebih dahulu");
                    berhasil = false;
                    break;
                }
            }
        }

        if (berhasil) {
            if (row == 0 && col == 0) {
                System.out.println("Selamat Pendakian anda berhasil mencapai Puncak Mahameru, sisa tenaga anda " + tenaga);
            } else {
                System.out.println("Jalur aman, tetapi belum sampai ke Puncak Mahameru.");
            }
        }
    }
}
