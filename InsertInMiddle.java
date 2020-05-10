public class InsertInMiddle {
    static void Insert(String tex,String TargetText){
        String[] _text = tex.split(" ");
        String[] _newText = new String[_text.length+1];
        _newText[0]=" "+ _text[0];
        _newText[_newText.length%2]= " "+TargetText;
        _newText[_newText.length-1]= " "+ _text[_text.length-1];

        for(int _n =0;_n<_newText.length;_n++){
            System.out.print(_newText[_n] );
                /*for(int _m=0;_m<_text.length;_m++){
                    //_newText[_n] = _text[_m];
                }*/

        }


            /*text[tex.length()/2] = TargetText;
            for(int t =_text.length -1; t<_text.length/2; t--){
                _text[t] = _text[t-1];
            }*/

        //String[] st = tex.split(" ");
            /*ArrayList<String> wordList = new ArrayList<String>();
            wordList.add(tex);
            wordList.add(0,"bn");
            wordList.add(wordList.size()/2, TargetText);*/
        //char[] _c = tex.toCharArray(); // if in middle of letter
        // Scanner input = new Scanner(System.in);
        //int  index =  st.length/2;
            /*for(int v=0;v<wordList.size();v++){
                System.out.println(wordList.get(v));
            }*/
    }
}
