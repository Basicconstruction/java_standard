package chapter5_standard.practice_pack;

public class Practice5_1_3 {
    private final static int STRING_MODE = 1;
    private final static int INTEGER_MODE = 2;
    public static void main(String[] args){
        String s = "a1132bdddf222vc3d4ert5t43f6g7h8";
        String stp = "";
        int itp = 0;
        int status;
        String[] scollector = new String[1024];
        int[] icollector = new int[1024];
        int sit = 0;
        int cit = 0;
        status = STRING_MODE;// 1 for string connection ; 2 for int connection
        for(char c:s.toCharArray()){
            if(isNumChar(c)){
                if(status==STRING_MODE){   //previous status, change
                    if(!stp.equals("")){
                        scollector[sit++] = stp;
                        stp = "";
                    }
                    itp += c-'0';
                }else{
                    //status==INTEGER_MODE;
                    itp *= 10;
                    itp += c-'0';
                }
                status = INTEGER_MODE;//updated status
            }else{
                if(status==INTEGER_MODE){ //previously status
                    if(itp!=0){
                        icollector[cit++] = itp;
                        itp=0;
                    }
                    stp += c;
                }else{
                    //status = STRING_MODE;
                    stp += c;
                }
                status = STRING_MODE;//updated status
            }
        }
        if(status==STRING_MODE){
            scollector[sit++] = stp;
        }else{
            icollector[cit++] = itp;
        }
        String[] ress = new String[sit];
        System.arraycopy(scollector,0,ress,0,sit);
        int[] resi = new int[cit];
        System.arraycopy(icollector,0,resi,0,cit);
        for(String sp:ress){
            System.out.print(sp+" ");
        }
        System.out.println();
        for(int ip:resi){
            System.out.print(ip+" ");
        }
        System.out.println();
    }
    public static boolean isNumChar(char c){
        return c >= ('0') && (int) c <= ('9');
    }
}
