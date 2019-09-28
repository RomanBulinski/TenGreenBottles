public class MainKataClass {

    public static String tenGreenBottles(int n) {

        String gap = "\n";
        String[] numbOfBottles = {"zero","One","Two","Three", "Four","Five","Six","Seven","Eight","Nine","Ten"};
        StringBuilder result= new StringBuilder();

        String endPart = "One green bottle hanging on the wall,\n"+
                "One green bottle hanging on the wall,\n"+
        "If that one green bottle should accidentally fall,\n"+
        "There'll be no green bottles hanging on the wall.";

        String lyricsPart1 = " green bottles hanging on the wall,\n";
        String lyricsPart2 = " green bottles hanging on the wall,\n" +
                "And if one green bottle should accidentally fall,\n" +
                "There'll be ";
        String lyricsPart3 = " green bottles hanging on the wall.\n";
        String lyricsPart3one = " green bottle hanging on the wall.\n";


        int counter =0;
        for(int i =0; i<n; i++){
            if(i<n-2){
                result.append( numbOfBottles[n-counter] ).append(lyricsPart1);;
                result.append( numbOfBottles[n-counter] ).append(lyricsPart2);
                counter+=1;
                result.append(numbOfBottles[n-counter].toLowerCase()).append(lyricsPart3);
                result.append(gap);
            }
            if(i==n-2){
                result.append( numbOfBottles[n-counter] ).append(lyricsPart1);;
                result.append( numbOfBottles[n-counter] ).append(lyricsPart2);
                counter+=1;
                result.append(numbOfBottles[n-counter].toLowerCase()).append(lyricsPart3one);
                result.append(gap);
            }
        }
        result.append(endPart);
        return result.toString();
    }

    public static void main( String[] args){
        System.out.println(  tenGreenBottles(3) );

    }

}
