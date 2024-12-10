/*
 * Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.
 * Input:
 * S = aabb
 * Output:  ab Explanation: 'a' at 2nd position is appearing 2nd time consecutively. Similiar explanation for b at 4th position.
 * 
 * Input:
 * S = aabaa
 * Output:  aba
 * Explanation: 'a' at 2nd position is appearing 2nd time consecutively. 'a' at fifth position is appearing 2nd time consecutively.
 */

public class GFG_RemoveConsecutiveCharactes {
    public static void main(String[] args) {
        // String S = "aabb";
        // String S = "aabaa";
        // String S = "aabac";
        // String S = "aabaac";
        // String S = "bcdebeaec";
        // String S = "a";
        // String S = "aaabaaaccabbb";
        String S = "dgledgfelhhdceibelbeejeehleflkecjldhaeijbckjjkhikkhlbjkjjlhedfgcelihbejhdaabceeghjdejbkfklfeadffiedbefillcafbdaelccabfcfjalglebefahedcgcckkflbcddggjckabciljfijbhbbcbkdhkefejgjcckkiikeacgbcibkljaffhgileajdjgjcbblkgfkbejdhaliifhghlbkeeeehfdafeegehccbfhehjfbgcegafadkbheijaebeecggkdghikblhkbdbcchebflkkaleicffeiblikkggiegadleafcfjghkkhhkekhadfkbcbdbhlljdeiffjcakglgdcfalchbegdelaiehchhfgekiebdigjcieecicaldfehlhcebhchddggfdbdlffefdealadlhfkdeicjlgdflchbgecdcljhbbclgaibiegkkecjlfeecieegjleedfjhhejebkjgjbhiieiiefcljekleebidbejhfccljejfgecggcfdielejgdlkagbiegefgghkhehldddabehfjadlhebdajiddieeeeedgbeeakhbildkclilddjfaieejbfdedfaadeakeddijjgeeceeckgaggechlleecacgaeekdcfceceldjedalefclbekbgbgicaejlfaeabdhdklfilbejfibhciikglikiidjhccfdgedaljldchdhgeecefdecekeklieegkbdfladdebieaefeeifelajdleebefdiajhfhkljcgdcfelebehfiajiecbkjlikfkkahelecdbdlliedigfjfljaacjaejfhjfjkkchjileeeclfgjkblklakcdeceaelkegadelidghdbklkkbckeigaklbdacjagakfgaediaeeleegihlejjiecafaegeihdeglejjeedfkebfdcledddjcifbebbfdfillekaeeehldkbijjbhelljligabaddaachahicddicaebdgbihejelegedaikgejicfjfiefedlhlbcgeilhdcbejieajjgcccllikadkcaikagelkkeddkeebilhikhjchgfhfkgkhhlgikdlccggcdkibeifeegflbiielegchfcbheiggekaakkeekjkkikcceegefcjgjighbliikejdceeligegfakkjcgliefdhcalifaahkcfhblakflbdeegfkhbkgglghakigaebaiecfeclcjddjlbjcfkfkjegehhejkkleiifgcfdbleadeedlhahdbgecikhacdkkifkeehelhdjllcecgfgdieecelbgkdkchjceaagagibdijdkaihghcgjhjadgafldeeabaelejeifklhhdljdbldidefeficcbckagcebfflabibekgchkkeedbedgealglcegailajfdbigiahegifkablgcjbglceidigfgglckklcbkbfjhaeeeadcdaejlkkjhcieecehggjiaaefggghhjhdigkjhkcleagelgedflkkkkddcgeefbcdglgebeidjbeefeicekligaigckeelldljfbdicdggjaffllcfgdejiicgaadfgjeghabledkcdbellceejefeaeeekedeigiaiehkcjadhgghdelbiceeejeiklicjcgeddeiccclegijaijalbecdjaelfkalcijlbjdccebkeehhifbdbeejceefgbeeijaabjiakjhfecglfgghgeagdaceehifhlhdjkjfieejbhfbhabbijldijdebfefgaifdclejfcledclcdkgieejkeeghhdfdfldhbedhakljaidelfhleiladfgeadaieiefchcdekhfgikaklfleajleehfajkacjakhlhbidgfjjflbcjeiaeijedcbkaaaiebcaghbfaihbjlecdlkdaebcejejfeelbjbhjkegkdhcbhlhkaebedghhebjckebjbceebbffeekaaejallefgekaggdgeljfeeiiegjadfgfkigdgekgibkbceighlaibljaieghbeheiijchhfelbkegjljcclkbbjhehgcjbiehjjelckfbehhdbfaaljllidhfilegkejefijchlhlijcchbjgejilhkkckejbfjklklhhecgfkhhgekagbideekeehkdejcihdifiahfgahlegdeelkjleeiaeihdeaeaebjlccieedidcggbdlkicbcihgeeeggdejaeellladehdhibiaaigciablljedjjbaackelifefbejffagacfiihlfeaiiihhhbhjikkcdjigjagcggdadaajbeiagblkcfddggfbghkgaekajjehgefefdddlgbccikegchacifjfflegcgachajdgaiajfiagffclhgigjeiegjfheelglfllckledhhjkbaffbilhgehhdhkgcgeeehljacf";
        System.out.println(removeConsecutiveCharacter(S));
    }

    static public String removeConsecutiveCharacter(String S){
        String ans = "";
        char[] c = S.toCharArray();
        if(c.length == 1)
        {
            return ans+c[0];
        }
        for(int i=0;i<=c.length-1;i++)
        {
            // System.out.println("\n" + i + " " + c[i]);
            if(i == c.length-1)
            {
                if(c[i] == c[i-1])
                {
                    // System.out.println("IF");
                    ans += c[i-1];
                }
                else
                {
                    ans += c[i];
                }
            }
            else
            {
                if(c[i] == c[i+1])
                {
                    // System.out.println("Else If");
                    continue;
                }
                else
                {
                    // System.out.println("Else Else");
                    ans += c[i];
                }
            }
        }
        return ans;
    }
}
