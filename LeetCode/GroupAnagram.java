/*
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Explanation: There is no string in strs that can be rearranged to form "bat". The strings "nat" and "tan" are anagrams 
 * as they can be rearranged to form each other. The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 * 
 * Input: strs = [""]
 * Output: [[""]]
 * 
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) 
    {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};  
        // String[] strs = {""};  
        // String[] strs = {"a"};  
        // String[] strs = {"compilations","bewailed","horology","lactated","blindsided","swoop","foretasted","ware","abuts","stepchild","arriving","magnet","vacating","relegates","scale","melodically","proprietresses","parties","ambiguities","bootblacks","shipbuilders","umping","belittling","lefty","foremost","bifocals","moorish","temblors","edited","hint","serenest","rendezvousing","schoolmate","fertilizers","daiquiri","starr","federate","rectal","case","kielbasas","monogamous","inflectional","zapata","permitted","concessions","easters","communique","angelica","shepherdess","jaundiced","breaks","raspy","harpooned","innocence","craters","cajun","pueblos","housetop","traits","bluejacket","pete","snots","wagging","tangling","cheesecakes","constructing","balanchine","paralyzed","aftereffects","dotingly","definitions","renovations","surfboards","lifework","knacking","apprises","minimalism","skyrocketed","artworks","instrumentals","eardrums","hunching","codification","vainglory","clarendon","peters","weeknight","statistics","ay","aureomycin","lorrie","compassed","speccing","galen","concerto","rocky","derision","exonerate","sultrier","mastoids","repackage","cyclical","gowns","regionalism","supplementary","bierce","darby","memorize","songster","biplane","calibrates","decriminalizes","shack","idleness","confessions","snippy","barometer","earthing","sequence","hastiness","emitted","superintends","stockades","busywork","dvina","aggravated","furbelow","hashish","overextended","foreordain","lie","insurance","recollected","interpreted","congregate","ranks","juts","dampen","gaits","eroticism","neighborhoods","perihelion","simulations","fumigating","balkiest","semite","epicure","heavier","masterpiece","bettering","lizzie","wail","batsmen","unbolt","cudgeling","bungalow","behalves","refurnishes","pram","spoonerisms","cornered","rises","encroachments","gabon","cultivation","parsed","takeovers","stampeded","persia","devotional","doorbells","psalms","cains","copulated","archetypal","cursores","inbred","paradigmatic","thesauri","rose","stopcocks","weakness","ballsier","jagiellon","torches","hover","conservationists","brightening","dotted","rodgers","mandalay","overjoying","supervision","gonads","portage","crap","capers","posy","collateral","funny","garvey","ravenously","arias","kirghiz","elton","gambolled","highboy","kneecaps","southey","etymology","overeager","numbers","ebullience","unseemly","airbrushes","excruciating","gemstones","juiciest","muftis","shadowing","organically","plume","guppy","obscurely","clinker","confederacies","unhurried","monastic","witty","breastbones","ijsselmeer","dublin","linnaeus","dervish","bluefish","selectric","syllable","pogroms","pacesetters","anastasia","pandora","foci","bipartisan","loomed","emits","gracious","warfare","uncouples","augusts","portray","refinery","resonances","expediters","deputations","indubitably","richly","motivational","gringo","hubris","mislay","scad","lambastes","reemerged","wart","zirconium","linus","moussorgsky","swopped","sufferer","sputtered","tamed","merrimack","conglomerate","blaspheme","overcompensate","rheas","pares","ranted","prisoning","rumor","gabbles","lummox","lactated","unzipping","tirelessly","backdate","puzzling","interject","rejections","bust","centered","oxymoron","tangibles","sejong","not","tameness","consumings","prostrated","rowdyism","ardent","macabre","rustics","dodoes","warheads","wraths","bournemouth","staffers","retold","stiflings","petrifaction","larkspurs","crunching","clanks","briefest","clinches","attaching","extinguished","ryder","shiny","antiqued","gags","assessments","simulated","dialed","confesses","livelongs","dimensions","lodgings","cormorants","canaries","spineless","widening","chappaquiddick","blurry","lassa","vilyui","desertions","trinket","teamed","bidets","mods","lessors","impressiveness","subjugated","rumpuses","swamies","annotations","batiks","ratliff","waxwork","grander","junta","chutney","exalted","yawl","joke","vocational","diabetic","bullying","edit","losing","banns","doleful","precision","excreting","foals","smarten","soliciting","disturbance","soggily","gabrielle","margret","faded","pane","jerusalem","bedpan","overtaxed","brigs","honors","repackage","croissants","kirov","crummier","limeades","grandson","criers","bring","jaundicing","omnibusses","gawking","tonsillectomies","deodorizer","nosedove","commence","faulkner","adultery","shakedown","wigwag","wiper","compatible","ultra","adamant","distillation","gestates","semi","inmate","onlookers","grudgingly","recipe","chaise","dialectal","aphids","flimsier","orgasm","sobs","swellheaded","utilize","karenina","irreparably","preteen","mumble","gingersnaps","alumnus","chummiest","snobbish","crawlspaces","inappropriate","ought","continence","hydrogenate","eskimo","desolated","oceanic","evasive","sake","laziest","tramps","joyridden","acclimatized","riffraff","thanklessly","harmonizing","guinevere","demanded","capabler","syphilitics","brainteaser","creamers","upholds","stiflings","walt","luau","deafen","concretely","unhand","animations","map","limbos","tranquil","windbreakers","limoges","varying","declensions","signs","green","snowbelt","homosexual","hopping","residue","ransacked","emeritus","pathologist","brazenly","forbiddingly","alfredo","glummest","deciphered","delusive","repentant","complainants","beets","syntactics","vicissitude","incompetents","concur","canaan","rowdies","streamer","martinets","shapeliness","videodiscs","restfulness","rhea","consumed","pooching","disenfranchisement","impoverishes","behalf","unsuccessfully","complicity","ulcerating","derisive","jephthah","clearing","reputation","kansan","sledgehammer","benchmarks","escutcheon","portfolios","mandolins","marketable","megalomaniacs","kinking","bombarding","wimple","perishes","rukeyser","squatter","coddle","traditionalists","sifts","agglomerations","seasonings","brightness","spices","claimant","sofas","ambulatories","bothered","businessmen","orly","kinetic","contracted","grenadiers","flooding","dissolved","corroboration","mussed","squareness","alabamans","dandelions","labyrinthine","pot","waxwing","residential","pizza","overjoying","whelps","overlaying","elanor","tented","masterminded","balsamed","powerhouses","tramps","eisenstein","voile","repellents","beaus","coordinated","wreckers","eternities","untwists","estrangements","vitreous","embodied"};  
        // System.out.println("Group Anagrams are : " + groupAnagrams(strs));

        System.out.println("Group Anagrams are : " + groupAnagramsDifferentApproach(strs));
    }

    static List<List<String>> groupAnagramsDifferentApproach(String[] strs)
    {
        // List<List<String>> l = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        System.out.println("The String is : " + Arrays.toString(strs));
        for (String str : strs) {
            // System.out.println("\nInside I Loop");
            String s = str;
            // System.out.println("String is : " + s);
            char[] chsorted = s.toCharArray();
            Arrays.sort(chsorted);
            // System.out.println("Sorted Character Array is : " + Arrays.toString(chsorted));
            String sortedStr = "";
            for (int j = 0; j < chsorted.length; j++) 
            {
                sortedStr += chsorted[j];    
            }
            // System.out.println("String Sorted from Character is : " + sortedStr);
            if(map.containsKey(sortedStr))
            {
                List<String> fetchvalues = map.get(sortedStr);
                fetchvalues.add(s);
                map.put(sortedStr, fetchvalues);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sortedStr, list);
            }
            // System.out.println("After adding into Map is : " + map);
        }
        return new ArrayList<>(map.values());
    }

    // Upto 111/126 testcases are executing but later its failing by Time Limit exceeded, Need to enhance the Logic
    static List<List<String>> groupAnagrams(String[] strs) 
    {
        System.out.println("The String length is : " + strs.length + " and Strs is : " + strs[0]);
        if(strs[0] == "")
        {
            return List.of(List.of("\"\""));
        }
        List<List<String>> l = new ArrayList<>();
        Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> m1 = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) 
        {
            List<String> templist = new ArrayList<>();
            System.out.println("\nInside I Loop");
            String s = strs[i];
            System.out.println("The String is : " + s);
            for (int k = 0; k < strs[i].length(); k++) 
            {
                if(m.containsKey(s.charAt(k)))
                {
                    int value = m.get(s.charAt(k));
                    value = value + 1;  
                    m.put(s.charAt(k), value);
                }
                else
                {
                    m.put(s.charAt(k), 1);
                }
            }
            templist.add(s);
            System.out.println("After adding into Map : " + m);
            for(int j=i+1;j<strs.length;j++)
            {
                System.out.println("Inside J Loop");   
                String s1 = strs[j];
                System.out.println("The String inside J is : " + s1);
                for (int k = 0; k < strs[j].length(); k++) 
                {
                    if(m1.containsKey(s1.charAt(k)))
                    {
                        int value = m1.get(s1.charAt(k));
                        value = value + 1;
                        m1.put(s1.charAt(k), value);
                    }
                    else
                    {
                        m1.put(s1.charAt(k), 1);
                    }
                }
                System.out.println("Jst After K END : " + m1);
                if(m.equals(m1))
                {
                    System.out.println("M and M1 are equal here");
                    templist.add(s1);
                    System.out.println("After adding into Temp : " + templist);
                }
                m1.clear();
                System.out.println("After Clearning M1 its executing again");
            }    
            System.out.println("After J Loop the temp is : " + templist);
            System.out.println("After Adding in J Map : " + m1);
            l.add(templist);
            System.out.println("Jst after Adding into List : " + l);
            for (int j = 0; j < l.size(); j++) 
            {
                System.out.println("The Element inside tthe List is : " + l.get(j) + " and the count of J is : " + j);
                if(l.get(j).isEmpty()) 
                {
                    System.out.println("Its empty");
                }  
                else
                {
                    System.out.println("Its not empty");
                    for(String str : l.get(j))
                    {
                        System.out.println("String is : " + str + " and S is : " + s);
                        if(str.equals(s) && l.size()>=2 && j != l.size()-1)
                        {
                            System.out.println("It went inside-------------");
                            l.remove(l.size()-1);
                            break;   
                        }
                    }
                }
            }
            System.out.println("After adding into L : " + l);
            m.clear();
        }
        return l;
    }
}
