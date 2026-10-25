class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] day={31,28,31,30,31,30,31,31,30,31,30,31};
        int aS=toDay(arriveAlice,day);
        int aE=toDay(leaveAlice,day);
        int bS=toDay(arriveBob,day);
        int bE=toDay(leaveBob,day);

        int start=Math.max(aS,bS);
        int end=Math.min(aE,bE);

        return start<=end ? end-start+1:0;
            
    }

    private int toDay(String s,int[] day){
        int m=(s.charAt(0)-'0')*10+(s.charAt(1)-'0');
        int d=(s.charAt(3)-'0')*10+(s.charAt(4)-'0');
        int res=d;
        for(int i=0;i<m-1;i++) res+=day[i];
        return res;
    }
}