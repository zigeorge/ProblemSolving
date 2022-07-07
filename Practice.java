import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import java.util.LinkedList;

public class Practice {

    public static void main(String[] args) {
        // int[] nums = new int[] {-10,-10,10,2,2};
        // int[] nums = new int[] {-1000,-1000,-1000};
        // int[] nums = new int[] {2000000000,2099999999,2099999999};
        // String[] operations = new String[] {"++X","--X","--X"};
        // int[] digits = new int[] {2,8,4,8,0,2,8,8,3,8,3,6,6,7,9};
        // List<Integer> result = findDisappearedNumbers(nums);
        // System.out.println("Result is" + result);
        // sortColors(nums);
        // System.out.println("Result is " + maximumProduct(nums));
        // System.out.println("Result of running sum is " +
        // Arrays.toString(runningSum(nums)));
        // System.out.println("Result of search is " + searchMatrix(new
        // int[][]{{-1,0,4},{5,9,10}}, -5));
        // System.out.println("Hello World");
        // int[] sample = {2,1,2,0,0,1};
        // boolean solution = solution(sample);
        // System.out.println("Result:: "+solution);
        // System.out.println(printRLE("xxxxcdfffxxxdcc"));
        // String[] words = new String[] { "cat", "baby", "ear", "bread", "dog", "bird",
        // "car", "ax"};
        // String string1 = "tcabnihjs";
        // String string2 = "tbcanihjs";
        // String string3 = "baykkjl";
        // String string4 = "bbabylkkj";
        // String string5 = "ccc";
        // String string6 = "breadmaking";
        // System.out.println("The result is "+solutionT(words, string6));
        // sortColors(sample);
        // System.out.println("Result of x is " +
        // finalValueAfterOperations(operations));
        // System.out.println("The Nums Contains duplicate " + containsDuplicate(nums));
        // System.out.println("The single number is " + singleNumber(nums));
        // int[] nums = new int[] {-10,-10,10,2};
        // System.out.println("Resulted 2D Array " +
        // Arrays.toString(construct2DArray(nums, 2, 2)));System.out.println("Result of
        // x is " + finalValueAfterOperations(operations));
        // System.out.println("Result of setA = " + minimalHeaviestSetA(new
        // ArrayList<>(List.of(3))));
        // plusMinus(new ArrayList<>(List.of(-1, -9, -2, -3, 0, -2, -3, -1)));
        // miniMaxSum(new ArrayList<>(List.of(1147555557, 2, 2147483647, 1111111143,
        // 2127483647)));
        // System.out.println(timeConversion("11:00:01AM"));
        // System.out.println("Find Median " + findMedian(List.of(0,1,6,3,5,7,4)));
        // System.out.println("Find Unique " + lonelyinteger(List.of(1)));
        // System.out.println("Find Sum " + diagonalDifference(List.of(List.of(-1,2,5),List.of(-10,10,4),List.of(-10,10,-11))));
        // System.out.println("Find List " + countingSort(List.of(1,1,1,1,5,1,2,6,2,5)));
        // System.out.println("Find max " + flippingMatrix(List.of(List.of(112, 42, 83, 119),List.of(56, 125, 56, 49),List.of(15, 78, 101, 43),List.of(62, 98, 114, 108))));
        // System.out.println("Find Sum " +
        // diagonalDifference(List.of(List.of(-1,2,5),List.of(-10,10,4),List.of(-10,10,-11))));
        // System.out.println("Find List " +
        // countingSort(List.of(1,1,1,1,5,1,2,6,2,5)));
        // System.out.println("Find max " + flippingMatrix(List.of(List.of(112, 42, 83,
        // 119),List.of(56, 125, 56, 49),List.of(15, 78, 101, 43),List.of(62, 98, 114,
        // 108))));
        // findZigZagSequence(new int[]{2,3,5,1,4,7,6}, 7);
        // System.out.println(towerBreakers(7,2));
        // System.out.println(caesarCipher("middle-Outz",22));
        // System.out.println(palindromeIndex("prcoitfiptvcxrvoalqmfpnqyhrubxspplrftomfehbbhefmotfrlppsxburhyqnpfmqlaorxcvtpiftiocrp"));

        // System.out.println(climbStairs(45));
        // System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        // System.out.println(maxSubArraySum(new int[]{-7,-1,-5,-3,-6,-4}));
        // System.out.println(largestVariance("zcvvynowcmlskevtnpxtwblgxchvfyghobygbboeaynurjvtjsfjpzcjaqjnsgcxwlxbszcreulumbetpfpbyhnacmgglgdxoqlsxoskexjxjsummnekjsldwiisoqkizhulnljwmivpoawcwxqwulkuwvlnbpiqrksgtphnygvmahzcqjxkbmruebmttjhjfpkuaskkrmwmhcxtdcbhwnrdrgipqzwskbwzkkptahzueyapkagogjycobupnexfyikqkuikfzxhapdxoaaptfryourudjaexhcvxcqblhzeikevnqaobtsjfgcuvgvqrdbvuueddngvalrmjlxozgbobyrcwttcksincbtulmwvnxcvycargrhqlzawxkpavfetfiomxiykthpsswwkygrjobvublscngahcqeltlvkfizmbsjmnyjlfaodtidpufagzqxrohctmcefksmxqujxhuerlpxwyecmqfsjxiwtgnlzhfkeqctunrllcjddxtxseimrpdrymwqsrdxqjpyzulcvssgfltyjfynmtgcrhstpjfsqgaxnjjagmghrqxtkibjzwuozwyoqnmdvtvxlqnpbybptnveugatngkkadyunbbmftvumybjviknkqnadrhyzyjlilqzkwafxthlbxoedagpzmxmnfzjoezuizceagrhhhcdvrqmfrqjqhcfqqhiozemxrkqcptogyzcrnmzpcekplbfgdtqitszrgqrlkdmwlxnwroywimfcrfdakzvedxxzakkhxmgdcchwdqnywybnohkwbjvxybvwbannuhlbrnocmedjmwjtfrmomlcbgktkrdwohhrxygebbynnrjvyyedtblyhldtzajlexyiubjurczdytegzuuakiiggosmgqdabgemnvzpgbqsyprigktjoadednwhyyezebkoyubceebbmqeshsbkpnurcsliklbhlqbbctacdikdmghavbjxwhxcnjhdiaollrwtukonmhcluulllxvcguzpqnazdojerrpikoomwscjuqasvknezepcmlhdmerqfryimztmwsfbcsngwisejojinkechatxykspkbhyqvswnegaavxbpfywdhkvbbrbutaiwoeajhkqmpfjchbzrmjfbhbdhcgctbcdhwvkozhartflxykgxhhmwazysnxhomthcypphsjbpvxopqygvalkjvxvwftnnxwoxcupdvnpqmpnbdzncgrifqaqumcsbiqstvskyqjguqmavmfjjysysdzgxlepeccxjgammxmeobyzbwjjajzxpdeaxxjadajcdyewvbvehkmtvtfdqnlllihdiybjrpvmkilxqhnonmuswrgwsxuvqcnrtsnxohkuxhshimsxznfcamqvvktvjeitbfbaojtzxwewiyekqcbnuzzamsadwdemqucfwmahqjykktyukwuzgbyiqnttagkrjieaohgrzxwjujkmlmvwfpblrvqqzwuiefhgzdqdvmfssrnkyxbylsrrmlupjqtrlayzafrentgytadrdzbqvpgfskfystwkvkpievcajkltqsjdvodqqgfqbcsawupkgnbvotsjumjodhttwzryteoorfocpdjmqnhwdqjgvdcmshytaustwprelpzkfuystzcxgexcoindyzzmesknlsyzxfaundmfxfpcdrmczyubmgkvnqgzqnlrjswovxzwznkjgieukikhmkvqdgxhrlzzjjbpcybalkzhyfecgfmjfliqfltzanswgyazdnptflgbblumcbsdbvseqnafhdilmdpfcmqexgeotwdxhcnnemueguvozaevlykkfbxrasvpqiwzrmdskbuuzuqdlmjrqeicnabttqzofsdttjvwzeyeklrwnrvcstgjhjdeiprndgkgpweokxhffdpdxjxootpkvpuxshamsxaxxzeguuslhghwezszbbrjiwwmffdrenxwvobimvcvcgquykbqegbqeaayckrdxitixavrrobsdtxovgsfczdtikeejucicfemmipkddhokggfxwabbppunysfzcfvabomhjnximmlrhxqotnxqhsptunkdnscernxbhqnpkbxnqaeyvjygkkxjzzqlybvvqaybqdzpaeerpcpansadmxvhoqfsvnfunlrdalyqlddiqslgkxqiuhaeagiluvsrtfyaljrsjpqiegegfhscnfzzpiqxgfnjnbixerdkvnlmmwtdicuzqqvjumswgpekfbtmkfemneyclqwvmvjwksczteospbnfrzolpgcvbxkppsjyvhugmufjqdyllcjktrxehpwmivlgnbsjummecqypnwskxdcbarxqqcbxxwewhalclctsaqvmywceppflzvwlkcxhlziwbshpjorqpqevanelvjpdhmfpuoixkisipksbuvxokfdyqxxpwpnvhvpirksdiefcmahsmalmmuwaexloezeaipcysxwsyfhhwvceviiilserjxlgtovblzjhqpmydtfgaqcgmhpstnkcqgxzfbffeuebctofyhorzexhqavagxqgztrekjccrhleqiprvmyhmablqrsfnjnfebyzctmbjgiuxlqgsmhubyekjqgvnecrrwwoqhgyamzqhkwbzykcyvqvhlparxzjaxjikxsuixqkzfsxgllypgamqcwlfizkzwivkjnxsapbaacugcxgnopafcohbqzubwixofrqxagltvbinkdwaauvnccwqpuhaknkvxlqmvanyncfzivxzxlxtckabhizhytvoboelcsafoltektwgdruyucxzplgnvnajvwzruxbpwkufazpjgvvhccqqpebtasfsqkxknitvokhxptejcnfsnirmkbebxsdflthmogkhxxdttoevyfmzbaxellblynxvmnryrygalvsrfylqbctdenynlnnfmnhobitebjbkrjkrkldnecfmutysdvfpvflupzwadttzuihzwuecfyntkquslqjlvnyqlbstzynozmdomzbdhyvvbdhzrfymrztqxqfpxntosmlfgocbbmagqgfboqcjzkfzxmyvyhxklorceqrrimavjaudgwychyzerprkikmtuivblbxrxiltxxtyirbjdsdxlsstnnzdonatcntyhxetmomcvdgtxofsrfwfxbrakmpwkpjrplwxvqdncoasskwxgfttpurllmkgnvqohtliegpooommufowggovxoapgvyoadeyxsbmyvlhborsvyvcjjehgxlupxherqqfpbpzouaupnztdxqxnswusgjasxavmifgsqchchrurhkhdyfzkahilfhnsjofmvicrjjbwfqdoyamndaerpjulrpobregqkoiuhqnpuxdclxmcmsfdudzdofwmrwbhqjnsrpwsxgpyuonnfjcgeljtugdtwxgjtohyjivnpswggxhszugknrgvrygdcwnbehardprlgidkavkdojrdxtclbqrcbmodbxklikomqnsrflzenktlwwgtgeeblhmmvnrqpbxflxbiuzzxqwznvdaffffxvpdnnteczfygcbfxnsvicxsmxoqmebjkdlnhekgasxhgaipejkthwzcakdyzlaovpecipbmeokvgfxrgtvqkkgpyyvykczatektgizvixvbchltobdmihcvmzyksnasftanpyohnmslgktppjvpypdeurcxgrsoanvtjzhzhskivzbjliqeuumkzqtodtpmhcrgbdglajbdtscvxoxibkydandpqzfbgsnaykzjmwfleaejkcfhmzgxjbrlhinnyacpookxatenptfwmplunnbtjhywuudocxfwaiigckqskpyfzngxwxczdeztacjzmdcrfihtyzxrjhdssrufzkrlsfotftrzschqdvmiwwogqykytoexpqexgqylpwromoevedzkcvzhlubfckmleffuvwtvkewfjzybniotjthreqrryvaekfasrqyzjylzxayfxrfrpofibrstqqfftmbvkfidhdgqwjphccsfqqdyjrxwfzjsvmucnlciucnmodrfbkaxzseeiuuazvihrbscpxtzvuielchlupituocqlrrvivoonnpcfkpeajorrxnckggodosezcpeqgrogbkaeicglceegdmbvkzwainoxqcodkrgaakhniwydcosppodsbynotesucujgqeosxitjasxbpidyezygysyweudlyuwqgvnubaxhxlwdfgxwmyjhohyppeftaxkknndltifinaevpptswlphmemkzbtlywpowkfbwomjskhwptqsmbuyutkbruwbqmfdjochwcsdpnxktgoevxkwjainujeqngtroqnomgtvzzndshlvaipqjrcxqmjuxrrqnjwccobvpeylinnhvejlodxgrfirtmpvqtuvnqopoejetedzagruxvatovaefbwwrwsectnqpoxuurykrlrllfrhbcrudvmohubkkdutsfcaehtcvhzhxwqnnnkszmzjaoizpwgqiqsvhblcdjhgpfgfejpdnszvqzlejlsbmwukxptzodshdbzvcycjchcpwxhtzunzuqsxkvzuyunwpljrxuwrbzqmahtmltmgdoveayhcguozimoiuxbnukzjawemjfvgcryyyexbnkyfuwqpkmfyjdeafwfrsytqirshrdzxooukzmkbruuokbkpwbdopzujpjqahavubsktgymfczmbtlzlyistapwgrfxygsqrhkvkrfauduqpknhfbwyffpagyzkfcofvjbnmraextiklynuivodnrahknxowdlrwrfawribmqodyzzxndgnfanpbvqjjwakhcklduahmjdjvwachezghqavcbrehftpxkqzkqtuclgsdfpkxwtacqzbxxjsahcnosrergofndlstvatlqgfgppojeqzmilawlzcqekudbilrdfqcgwnrfcxhgabralrwinwffiwfhtmdjiwwkoqlcwvyrgjqsvcjfcumopiqfuacuolsptqiqhyqwtrutpptpotqtygkkoiykjlofchclepscffgemxjnvnzqabcxsegttsrliybmtsoreijzrvljoecmgouymtrmtheihyivokvcbbcxsqtcazrzldiwnonxfgyrryqujeclpvjhlfkvsgkpmeucdlfsfvmwayinjqztzelyipdzwkavhpacrqizzjegzdrmvpsbbyjpytntocorqifmhprojlzvbveaipkxrsautzklmwfldrjejgluuuloufxhwkbfypiypovxojwiynakxoaddsclfjapqyrscpbkjamvzhvkwrjzasjhqnayjtyhkuszxswcldkojyymxaivuwawtdpitselvykoprtemlfjnsqnrqxlqqidyxlmdvbhjcnmvdbfpeerobsvnrnlbjesjmcdyswhkshoipedwrwhwxjrcalxtppffqsuwqtrnotlthutuwyasebfqrgmmxwzakzjxwpwcbdfyxeszoyulgsfirvnjqzmtgaeldgevojzkwxzynkihthgktywgjqysdpxtqegopwjxombppcrqnskzpkwbvqeziskfvpwrmrrpumsaigwdcarahbcrpkmujdxtzhcoiihnmxlrmufgqomokpifymhfavpslunkwwbwgrvrodetajhhmiplwzfswwfennumxaavqqarsiesxpvriolncrypashsopmhumkxjroyotgllkwikqgplsaknyafdkanrtfydhzctfypnvgfcorbswcfzhjrbueucazprizypkopdwcpmkzeqtiwlugfgyjumjrxnfpwzfvlexhcrcwiguadenaulilekzlrhclxkezbhqsqtwvsrmgxjvykdhqwsuyxmtapmvztcchbkxdjqrooadmnmorquzybexamtlusppraqdzxmnzcdpukabvtkdgmzlzkhfpgbypwtmagbiobrusvlfqyoafljdrqjxaqeuuysqdymhxsmlmjficiovbnhtzvesdauvcrksozgafvymllqmqmrixwbztylhesymklicfgkbzwctksohmtwcxqrlqkujhstssggvhhwvjmydjeovvgjqfoptedsbpvlfburxxmxlxgqzqwzlozglvcgxvdyfpcrieyyamznpgpyfzrzshzimcbzseznebmnevyizhrlllddexufoemlwkflsxthgynoexayicpzmasrdvyxhswfvozjjjmgttbjnayxsqxooxerkxpdhgiapzpvqrknzgrjmczqlsmrzxctrinmcpuilhakqqjhzduuvojhththiyftqnpndnvfvdgmvblnfzgnshtlgwwbbcgeiilvuieryelmnhjqfegyhzgqeygplyhhlgmupxcizbkruwoftnnjiaswckvbycbggzwmldfqtigcgxdqboefoclihtwyggwqdqimawcablijdlgvkiyzzzczitaosbyjtfqwrgpgyshyteyqtaiarbfcrhvixqsnijdvzdllxgqzteluhnfdzazotvlicxswouzbqcgxrpkhniqxgisvkmvcgclnywlcwkhwgdhyhemcbepredvpkvvvipaacxjzodleircbtfncxnriujtsyfywvadtbqedbkyduayeaomilolokecbbdfhywadpjqomctlueyqyrepnjaikwnnoubxwezkofkmaklrbqzqbhkcxyejapciqsloxjkbtfoqnzxibwjibllvwcseghuviuicsdxzsxgftvrsgodgemdzwpakwnrwblprmstrknnycavutkfwzolkilpchcvppmhsshdqewzmzscpzzjyljprvnltckkraeshztxmdvbpfqobrfojdsqrczbbcchylazslzkipkyjaukrankpqjgpjswgsunpmxtsxvfdmmyspdrxbrthgjsnweghhtgdmkjtdxkipadsgnalpikiyxwiienssdmtydzyutngajtqpxoiayqabsibvhnyqdoykigutbejabpcvdnalxewclxdpkvyqcrnxwevmxpjadyszwdsuhmxjepyhkqqtzxkwvoatjwiuuyiwqdxeglapwcdwropfiafnyvmmhqankelcdizqgrtzvpubacmeisybaxjrljnpjggicfejqszwlhqajlxoxrbykwuontqzgutsnaxwqqkbzexpbuqrhtmawxnkixgibtlaprmafukylguosuusblqtqzcrljayexovldzxxlalpavvayherqdcbmfksyenmtopqgkgjwhtcnqudzckrfgumgepcyptcfrrrpnxrqaemxfykoaygezpvpfaenlpgtdjmjbpgmfbgjqsqokvvcgjgywosymmhyemmlurtwbxxxmmkdmlfobqnvqrqikfzjyqxetbzbkobexyjsumfhelodcrqkxnojtxdwqldutilveiahtblggblutvtaojsytxjxiufkdctrkrfnfdkotexaqkxtxrozrlogpnetyanqogopbplhnzywaqrrpmsjrgiclsrmhiilpnsitftpoyeytwkyxyoylbrxzlwhminchpqizqycirphfhbxuplpvsacmklhteccxrjdeqfqjnyisxvqdqysynxzjphpdylyxupoxrxqyjneikqzyzggnpiwdydnfklxmwvuovndgdqxybydtudconsbphfgzlmmrjbmbkeuvoibbrecxnjdpacqbbypphygcewxzutomiyqqymfrjsobniuozzqutdkoaznubqljjqtzoebahpdahlmgnrkhuqwwzzrgvujeegsrahvwqwhtyvrdqqfkrdbwgipwxdrltqbc"));//smxnmxncma
        // System.out.println(pivotIndex(new int[]{0,1}));
        // System.out.println(arraySum(new ArrayList<>(List.of(7,1,5,3,6,4))));
        // System.out.println(Arrays.toString(mergeSortAlgorithm(new
        // int[]{7,1,5,3,6,4,2})));
        // System.out.println(Arrays.toString(quickSortAlgorithm(new int[] { 7, 1 })));
        // linkedListOps();
        // System.out.println(targetIndices(new int[]{1,2,5,2,3,2,1}, 2).toString());
        // System.out.println(Arrays.toString(kWeakestRows(new int[][]{{1,1,0},{1,0,0},{1,0,0},{1,1,1},{1,1,0},{0,0,0}}, 4)));
        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,2,0}));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // int max = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int index;
            if (nums[i] > nums.length) {
                index = nums[i] - nums.length - 1;
            } else {
                index = nums[i] - 1;
            }

            if (nums[index] <= nums.length) {
                nums[index] = nums[index] + nums.length;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums.length)
                result.add(i + 1);
        }
        return result;
    }

    public static void sortColors(int[] nums) {
        int[] arr = new int[] { 0, 1, nums.length - 1 };
        int i = arr[0];
        int j = arr[2];
        while (i < nums.length && j >= 0) {
            System.out.println("When i = " + i + " and j = " + j + " nums = " + Arrays.toString(nums));
            if (nums[j] > 1) {
                if (nums[arr[2]] != 2)
                    swap(nums, j, arr[2]);
                arr[2]--;
                i = arr[0];
                j = arr[2];
            } else
                j--;
            if (nums[i] < 1) {
                if (nums[arr[0]] != 0)
                    swap(nums, i, arr[0]);
                arr[0]++;
                arr[1]++;
                i = arr[0];
                j = arr[2];
            } else
                i++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int indexA, int indexB) {
        int temp = nums[indexA];
        nums[indexA] = nums[indexB];
        nums[indexB] = temp;
    }

    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = max1 - 1, max3 = max2 - 1, min1 = Integer.MAX_VALUE, min2 = min1 - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3) {
                max3 = nums[i];
            }
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
            System.out.println("max1 = " + max1 + ", max2 = " + max2 + ", max3 = " + max3 + ", min1 = " + min1
                    + ", min2 = " + min2);
        }
        int productOfMax2 = max3 * max2;
        int productOfMin2 = min2 * min1;
        if (productOfMin2 > productOfMax2 && max1 > 0) {
            return productOfMin2 * max1;
        } else
            return productOfMax2 * max1;
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X--") || operations[i].equals("--X"))
                x--;
            else
                x++;
        }
        return x;
    }

    public static int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        HashMap<Integer, Integer> digitsMap = new HashMap<>();
        int resultIndex = 0;
        int i = 0;
        while (i < digits.length) {
            if (!digitsMap.containsKey(digits[i])) {
                // System.out.println("Key "+digits[i]+" value "+1);
                digitsMap.put(digits[i], 1);
            } else {
                int val = digitsMap.get(digits[i]);
                val++;
                digitsMap.put(digits[i], val);
                // System.out.println("Key "+digits[i]+" Value "+val);
            }
            i++;
        }
        System.out.println(digitsMap);
        int minEven = 100;
        while (minEven < 1000) {
            int d1 = minEven % 10;
            int md = (minEven - d1) / 10;
            int d2 = md % 10;
            md = (md - d2) / 10;
            int d3 = md % 10;
            // System.out.println("minEven= "+minEven+" d1= "+d1+" d2= "+d2+" d3= "+d3);
            if (digitsMap.containsKey(d1) && digitsMap.containsKey(d2) && digitsMap.containsKey(d3)) {
                if (minEven == 888) {
                    System.out.println("minEven= " + minEven + " d1= " + d1 + " d2= " + d2 + " d3= " + d3);
                    System.out.println("digitsMap.get(d1)= " + digitsMap.get(d1) + " digitsMap.get(d2)= "
                            + digitsMap.get(d2) + " digitsMap.get(d3)= " + digitsMap.get(d3));
                }
                if (d1 == d2 && d2 == d3) {
                    if (digitsMap.get(d1) >= 3) {
                        resultMap.put(resultIndex, minEven);
                        // System.out.println("resultIndexed");
                        resultIndex++;
                    }
                } else if (d1 == d2 || d1 == d3) {
                    if (digitsMap.get(d1) >= 2) {
                        resultMap.put(resultIndex, minEven);
                        // System.out.println("resultIndexed");
                        resultIndex++;
                    }
                } else if (d2 == d3) {
                    if (digitsMap.get(d2) >= 2) {
                        resultMap.put(resultIndex, minEven);
                        // System.out.println("resultIndexed");
                        resultIndex++;
                    }
                } else {
                    resultMap.put(resultIndex, minEven);
                    // System.out.println("resultIndexed");
                    resultIndex++;
                }
            }
            minEven += 2;
        }
        int[] result = new int[resultMap.size()];
        for (int m = 0; m < resultMap.size(); m++) {
            result[m] = resultMap.get(m);
        }
        return result;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int[] targetArray = new int[] {};
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[0].length - 1]) {
                targetArray = matrix[i];
                break;
            }
        }
        System.out.println("Result even numbers " + Arrays.toString(targetArray));
        if (targetArray == null)
            return false;
        for (int i = 0; i < targetArray.length; i++) {
            if (target == targetArray[i])
                return true;
        }
        return false;
    }

    public static String solutionT(String[] words, String string) {
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> strMap = getMapForString(string);
            // System.out.println("Word:: "+words[i]);
            for (int j = 0; j < words[i].length(); j++) {
                // System.out.println("Character:: "+words[i].charAt(j));
                Integer value = strMap.get(words[i].charAt(j));
                if (value == null || value == 0) {
                    break;
                }
                // System.out.println("Value:: "+value);
                value--;
                if (j == words[i].length() - 1)
                    return words[i];
                strMap.put(words[i].charAt(j), value);
            }
        }
        return "null";
    }

    public static HashMap<Character, Integer> getMapForString(String string) {
        HashMap<Character, Integer> mapStr = new HashMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++) {
            if (mapStr.get(string.charAt(i)) != null) {
                Integer value = mapStr.get(string.charAt(i)) + 1;
                mapStr.put(string.charAt(i), value);
            } else {
                mapStr.put(string.charAt(i), 1);
            }
        }
        return mapStr;
    }

    // Below is the problem of longest increasing subsequence
    public static boolean solution(int[] sequence) {
        int max = 0;
        int[] list = new int[sequence.length];
        Arrays.fill(list, 1);
        for (int i = 1; i < sequence.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j] && list[i] < list[j] + 1) {
                    list[i] = list[j] + 1;
                }
            }
            if (max < list[i])
                max = list[i];
        }
        return sequence.length - max < 2;
    }

    public static String printRLE(String str) {
        String resultStr = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            resultStr = resultStr + count + str.charAt(i);
        }
        return resultStr;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> uniqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqMap.get(nums[i]) != null) {
                return true;
            } else {
                uniqMap.put(nums[i], 1);
            }
        }
        return false;
    }

    public static int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
            System.out.println("xor " + xor + " i " + i + " nums[i] " + nums[i]);
        }

        return xor ^ i;
    }

    public static int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            singleNumber ^= nums[i];
        }
        return singleNumber;
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n < original.length)
            return new int[][] {};
        int[][] resultMatrix = new int[m][n];
        int index = 0, i = 0, j = 0;
        while (index < original.length) {
            if (i < m) {
                // System.out.println("i= "+i+" Index= "+index);
                if (j < n) {
                    // System.out.println("j= "+j+" Value = "+original[index]);
                    resultMatrix[i][j] = original[index];
                    index++;
                    j++;
                } else {
                    i++;
                    j = 0;
                }
            } else
                break;
        }
        return resultMatrix;
    }

    public static List<Integer> minimalHeaviestSetA(List<Integer> nums) {
        if (nums.size() < 2)
            return null;
        int totalSum = 0;
        for (int i = 0; i < nums.size(); i++) {
            totalSum += nums.get(i);
        }
        Collections.sort(nums);
        List<Integer> setA = new ArrayList<>();
        int setASum = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (!setA.contains(nums.get(i))) {
                setASum += nums.get(i);
            } else {
                setA.remove(nums.get(i));
                setASum -= nums.get(i);
            }
            if (totalSum - setASum < setASum)
                break;
        }
        return setA;
    }

    public static void plusMinus(List<Integer> arr) {
        HashMap<Integer, Float> counterMap = new HashMap<>();
        counterMap.put(1, 0f);
        counterMap.put(-1, 0f);
        counterMap.put(0, 0f);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                counterMap.put(1, counterMap.get(1) != null ? counterMap.get(1) + 1 : 1);
            } else if (arr.get(i) < 0) {
                counterMap.put(-1, counterMap.get(-1) != null ? counterMap.get(-1) + 1 : 1);
            } else
                counterMap.put(0, counterMap.get(0) != null ? counterMap.get(0) + 1 : 1);
        }
        // float count = counterMap.get(1)/arr.size();
        // System.out.println(""+ counterMap.get(1));
        // System.out.println(""+ count);
        System.out.printf("%.6f", counterMap.get(1) / arr.size());
        System.out.println();
        System.out.printf("%.6f", counterMap.get(-1) / arr.size());
        System.out.println();
        System.out.printf("%.6f", counterMap.get(0) / arr.size());

    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = arr.get(0), max = arr.get(0);
        long totalSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) <= min)
                min = arr.get(i);
            if (arr.get(i) >= max)
                max = arr.get(i);
            totalSum += arr.get(i);
        }

        long minSum = totalSum - max;
        long maxSum = totalSum - min;
        System.out.println(minSum + " " + maxSum);
    }

    public static String timeConversion(String s) {
        String[] splittedTime = s.split(":");
        String hour = splittedTime[0];
        String meridiem = splittedTime[2].substring(2);
        if (meridiem.equalsIgnoreCase("am")) {
            if (hour.equals("12"))
                return "00:" + splittedTime[1] + ":" + splittedTime[2].substring(0, 2);
        } else {
            if (Integer.valueOf(hour) < 12)
                return (Integer.valueOf(hour) + 12) + ":" + splittedTime[1] + ":" + splittedTime[2].substring(0, 2);
        }
        return s.substring(0, s.length() - 2);
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        List<Integer> nums = new ArrayList<Integer>(arr);
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (nums.get(i) > arr.get(j)) {
                    Collections.swap(nums, i, j);
                }
            }
        }
        return arr.get(arr.size() / 2);
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int xor = 0;
        for (int i = 0; i < a.size(); i++) {
            xor ^= a.get(i);
        }
        return xor;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int i = 0, j = 0, k = arr.get(0).size() - 1, sumX = 0, sumY = 0;
        while (j < arr.get(0).size()) {
            sumX += arr.get(i).get(j);
            sumY += arr.get(i).get(k);
            i++;
            j = j + 1;
            k = k - 1;
        }
        System.out.println(sumX + " " + sumY);
        return Math.abs(sumX - sumY);
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        // ArrayList<Integer> nArr = new ArrayList<>(arr);
        Integer[] nums = new Integer[100];
        Arrays.fill(nums, 0);
        for (int i = 0; i < arr.size(); i++) {
            nums[arr.get(i)]++;
        }
        // int index = 0, i=0;
        // while(index<nArr.size()) {
        // if(nums[i]==0) i++;
        // else {
        // nArr.set(index, i);
        // index++; nums[i]--;
        // }
        // }
        return Arrays.asList(nums);
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int i = 0, j = 0;
        int n = matrix.size() / 2 - 1;
        int max = 0;
        while (i <= n && j <= n) {
            max += maxOf(i, j, matrix);
            j++;
            if (j > n) {
                i++;
                j = 0;
            }
        }
        return max;
    }

    public static int maxOf(int i, int j, List<List<Integer>> matrix) {
        int count = 1;
        int len = matrix.size() - 1;
        int max = 0;
        while (count <= 4) {
            if (max < matrix.get(i).get(j)) {
                max = matrix.get(i).get(j);
            }
            j = len - j;
            count++;
            if (count % 2 == 0)
                i = len - i;
        }
        return max;
    }

    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
        int mid = (n) / 2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        int ia = 1;
        while (st <= ed) {
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
            System.out.println(ia++);
        }
        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static int towerBreakers(int n, int m) {
        return ((m == 1) || (n % 2 == 0)) ? 2 : 1;
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        k = k % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (Character.isLetter(s.charAt(i))) {
                if (Character.isLowerCase(s.charAt(i))) {
                    if (ascii + k > 122)
                        sb.append((char) (ascii + k - 26));
                    else
                        sb.append((char) (ascii + k));
                } else {
                    if (ascii + k > 90)
                        sb.append((char) (ascii + k - 26));
                    else
                        sb.append((char) (ascii + k));
                }
            } else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static int palindromeIndex(String s) {
        // Write your code here
        boolean isPalindrome = true;
        int fi = 0, li = s.length() - 1;
        while (fi < li) {
            if (s.charAt(fi) != s.charAt(li)) {
                isPalindrome = false;
                break;
            } else {
                fi++;
                li--;
            }
        }
        if (isPalindrome)
            return -1;
        isPalindrome = true;
        for (int i = fi + 1, j = li; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            return fi;
        isPalindrome = true;
        for (int i = fi, j = li - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome ? li : -1;
    }
    
    public static int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 2; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

    public static int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else
                buyingPrice = prices[i];
        }

        return maxProfit;
    }

    public static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = a[0], max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;
            
            /* Do not compare for all
            elements. Compare only
            when max_ending_here > 0 */
            else if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            
        }
        return max_so_far;
    }

// This code is contributed by ANKITRAI1

    public static int largestVariance(String s) {
        int largestVariance = 0;
        HashMap<Character, Integer> cCount = new HashMap<>();
        // int maxCount = 0;
        // for(int i=0; i<s.length(); i++) {
        //     int currCount = cCount.getOrDefault(s.charAt(i), 0)+1;
        //     cCount.put(s.charAt(i), currCount);
        //     if(currCount > maxCount) maxCount = currCount;
        // }
        // System.out.println(s.length());
        // if(maxCount == 1) return 0;
        // String soFar = "";
        for(int i=0; i<s.length(); i++) {
            if((i+largestVariance+1) >= s.length()) break;
            cCount = new HashMap<>(); 
            cCount.put(s.charAt(i), cCount.getOrDefault(s.charAt(i), 0)+1);


            // if(soFar.contains(s.substring(i))) {
                // continue;
            // }
            // sb.append(s.charAt(i));
            int currentVariance = 0;
            Character minKey = Character.MIN_VALUE;
            int minCount = Integer.MAX_VALUE;
            for(int j=i+1; j<s.length(); j++) {
                if((j+largestVariance) >= s.length()) break;
                int count = cCount.getOrDefault(s.charAt(j), 0);
                cCount.put(s.charAt(j), ++count);
                if(minCount > count) {
                    minCount = count;
                    minKey = s.charAt(j);
                } else if(minKey == s.charAt(j)) {
                    minKey = Character.MIN_VALUE;
                    minCount = Integer.MAX_VALUE;
                }
                int diff = 0;
                if(cCount.size() > 1) {
                    if(s.charAt(i) != s.charAt(j)) {
                        diff = Math.abs(cCount.getOrDefault(s.charAt(i), 0) - cCount.getOrDefault(s.charAt(j), 0));
                        if(diff > currentVariance) {
                            currentVariance = diff;
                            minKey = s.charAt(j);
                            minCount = cCount.getOrDefault(s.charAt(j), 0);
                        }
                    } else {
                        for(Character key : cCount.keySet()) {
                            if(key == s.charAt(i)) continue;
                            if(minKey != s.charAt(i) && minKey != Character.MIN_VALUE) {
                                diff = Math.abs(cCount.getOrDefault(s.charAt(i), 0) - minCount);
                                if(diff > currentVariance) {
                                    currentVariance = diff;
                                }
                                break;
                            } else {
                                diff = Math.abs(cCount.getOrDefault(s.charAt(i), 0) - cCount.getOrDefault(key, 0));
                                if(diff > currentVariance) {
                                    currentVariance = diff;
                                    minKey = key;
                                    minCount = cCount.getOrDefault(key, 0);
                                }
                            }
                        }
                    }
                }
                // System.out.println(cCount);
                // System.out.println(++iteration);
            }
            if(currentVariance > largestVariance) largestVariance = currentVariance;
        }
        return largestVariance;
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
        }

        if(sum - nums[0] == 0) return 0;

        int lSum = 0;
        int pivot = 0;
        while(pivot < nums.length) {
            sum = sum - nums[pivot];
            if(lSum != sum) {
                lSum += nums[pivot];
                pivot++;
            } else {
                return pivot;
            }
        }
        return -1;
    }

    public static int arraySum(List<Integer> numbers) {
        // Write your code here
        return sum(numbers, numbers.get(0), 1);
    }

    public static int sum(List<Integer> numbers, int currSum, int position) {
        if (position < numbers.size()) {
            currSum += numbers.get(position);
            return sum(numbers, currSum, position + 1);
        } else
            return currSum;
    }

    public static Object[] mergeSortAlgorithm(Object[] arr) {

        return mergeSort(arr, 0, arr.length - 1);
    }

    public static Object[] mergeSort(Object[] arr, int start, int end) {
        if (start < end) {
            int partition = (start + end) / 2;
            Object[] left = mergeSort(arr, start, partition);
            Object[] right = mergeSort(arr, partition + 1, end);
            return merge(left, right);
        }
        return new Object[] { arr[start] };
    }

    public static Object[] merge(Object[] left, Object[] right) {
        int mIndex = 0, i = 0, j = 0;
        Object[] result = new Object[left.length + right.length];
        while (mIndex < left.length + right.length) {
            if (i == left.length && j < right.length) {
                result[mIndex] = right[j];
                j++;
            } else if (j == right.length && i < left.length) {
                result[mIndex] = left[i];
                i++;
            } else if ((int)left[i] <= (int)right[j]) {
                result[mIndex] = left[i];
                i++;
            } else {
                result[mIndex] = right[j];
                j++;
            }
            mIndex++;
        }
        return result;
    }

    public static int[] quickSortAlgorithm(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    public static int[] quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition);
            quickSort(arr, partition + 1, end);
        }
        return arr;
    }

    public static int partition(int[] arr, int start, int end) {
        // if(start < end)
        int pivot = arr[start], i = start, j = end;
        while (i < j) {
            while (arr[i] <= pivot && i < end) {
                i++;
            }
            while (arr[j] > pivot && j > start) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, start, j);
        return j;

    }

    public static void linkedListOps() {
        int[] arr = new int[]{0,9,1,0,1,0,2,1,0};
        ListNode firstNode = new ListNode(arr[0]);
        ListNode head = firstNode;
        ListNode tail = firstNode;
        int index = 1;
        while(index < arr.length) {
            ListNode newNode = new ListNode(arr[index]);
            tail.next = newNode;
            tail = newNode;
            index++;
        }
        // System.out.println(getDecimalValue(head));
        // System.out.println(middleNode(head).val);
        // ListNode rNode = reverseList(head);
        // disPlayListNode(rNode);
        // createHashSet();
        // runHashMap();
        // Node linkedList = new Node();
        // for(int i=0; i<arr.length; i++) {
        //     linkedList.addNode(arr[i]);
        // }
        // linkedList.disPlay();
        // linkedList.deleteNode(5);
        // linkedList.disPlay();
        // System.out.println(linkedList.findNode(4).data);
        // System.out.println(linkedList.findNodePosition(1));
        // linkedList.insertAfter(6, 5);
        // linkedList.insertBefore(7, 5);
        // linkedList.disPlay();
        // System.out.println(hasCycle(firstNode));
        // disPlayListNode(mergeNodes(head));
    }

    public static void disPlayListNode(ListNode head) {
        while(head != null) {
            System.out.print(head.val+ " ");
            head = head.next;
        }
    }

    public static int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode cNode = head;
        while(cNode != null) {
            sb.append(cNode.val);
            cNode = cNode.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public static ListNode middleNode(ListNode head) {
        if(head.next == null) {
            return head;
        }
        ListNode cNode = head;
        int counter = 0;
        do {
            counter++;
            cNode = cNode.next;
        } while(cNode.next != null);

        cNode = head;
        int middle = counter/2;
        while(counter>middle) {
            counter--;
            cNode = cNode.next;
        }
        return cNode;
    }

    public static ListNode middleNode2(ListNode head) {
        if(head.next == null) return head;
        else if(head.next.next == null) return head.next;
        else return middleNode(head.next.next, head.next);
    }

    public static ListNode middleNode(ListNode fNode, ListNode sNode) {
        if(fNode.next == null) {
            return sNode;
        } else if(fNode.next.next == null) {
            return sNode.next;
        } else {
            return middleNode(fNode.next.next, sNode.next);
        }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        if(head.next.next == null) return new ListNode(head.next.val, new ListNode(head.val));
        return reverseList(head.next.next, new ListNode(head.next.val, new ListNode(head.val)));
        // if(head.next.next != null) {
        //     return reverseList(head.next.next, new ListNode(head.next.val, new ListNode(head.val)));
        // }
        // return new ListNode(head.next.val, new ListNode(head.val));
    }

    public static ListNode reverseList(ListNode head, ListNode next) {
        if(head.next != null) {
            return reverseList(head.next, new ListNode(head.val, next));
        }
        return new ListNode(head.val, next);
    }

    public static void createHashSet() {
        MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.add(2);
        obj.contains(1);
        obj.contains(3);
        obj.add(2);
        obj.contains(2);
        obj.remove(2);
        obj.contains(2);
        obj.add(1000000);
        obj.contains(1000000);
        // boolean param_3 = obj.contains(key);
    }

    public static void runHashMap() {
        MyHashMap obj = new MyHashMap();
        obj.put(1, 1);
        obj.put(2,2);
        System.out.println(obj.get(1));
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next ==  null || head.next.next == null) return false;
        
        ListNode fastPointer = head.next.next;
        ListNode slowPointer = head.next;

        while (fastPointer != slowPointer) {
            if(slowPointer.next == null) return false;
            else slowPointer = slowPointer.next;
            if(fastPointer.next == null || fastPointer.next.next == null) return false;
            else fastPointer = fastPointer.next.next;
        }
        return true;
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode curr = head;
        ListNode prev = head;
        while(curr != null) {
            if(curr.val == val) {
                if(curr.next != null){ 
                    curr.val = curr.next.val;
                    curr.next = curr.next.next;
                } else {
                    if(prev.next == curr) {
                        curr = prev;
                        curr.next = null;
                    } else {
                        return null;
                    }
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode result = head;
        ListNode next = head.next;
        int currSum = 0;
        while(next != null) {
            if(next.val == 0) {
                result = result.next;
                result.val = currSum;
                currSum = 0;
            } 
            currSum += next.val;
            next = next.next;
        }
        result.next = null;
        return head.next;
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<nums.length; i++) {
            if(nums[i] < target) {
                first++;
            } else if(nums[i] > target) {
                last--;
            }
        }
        while(first<=last) {
            result.add(first);
            first++;
        }
        return result;
    }

    public static int countNegatives(int[][] grid) {
        int i = 0, j = grid[0].length-1;
        int count = 0;
        while(i<grid.length) {
            if(grid[i][j] < 0) {
                count += (grid.length - i);
                j--;
            } else {
                i++;
            }
        }
        return count;
    }
    // 5120
// {{1,1,0},{1,0,0},{1,0,0},{1,1,1},{1,1,0},{0,0,0}}
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] counts = new int[mat.length];
        int[] result = new int[k];
        int[] rank = new int[mat.length];
        
        for(int i=0; i<mat.length; i++) {
            counts[i] = countOne(mat[i]);
            rank[i] = i;
        }
        for(int i=0; i<counts.length-1; i++) {
            int keyIndex = i+1;
            int key = counts[keyIndex];
            for(int j=i; j>=0; j--) {
                if(key < counts[j]) {
                    swap(counts, keyIndex, j);
                    swap(rank, keyIndex, j);
                    keyIndex = j;
                }
            }
        }
        for(int i=0; i<k; i++) {
            result[i] = rank[i];
        }
        return result;
    }

    public static int countOne(int[] row) {
        int count = 0;
        for(int i=0; i<row.length; i++) {
            if(row[i] == 1) count++;
        }
        return count;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int peak = arr.length/2;
        int l = peak-1, h = peak+1;
        while(peak > 0 && peak < arr.length-1) {
            if(arr[peak] > arr[l] && arr[peak] > arr[h]) {
                return peak;
            } else if(arr[peak] < arr[l]) {
                peak = l;
                l--;
            } else {
                peak = h;
                h++;
            }
        }
        return -1;
    }

    // public static int[] intersection(int[] nums1, int[] nums2) {
    //     //TODO marakha
    // }

    public static HashSet<Integer> addArrInSet(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            result.add(nums[i]);
        }
        return result;
    }

    public static int mySqrt(int x) {
        int[] nums = getNumsFrom(x);
        int indexPassed = 0;
        StringBuilder result = new StringBuilder();
        while(indexPassed < nums.length) {
            // int divisible = getNextDivisible(indexPassed, nums);
            // int divider = getNextDivider(result, divisible);
            // result.append(divider);
            indexPassed+=2;
        }
        return 0;
    }

    public static int[] getNumsFrom(int value) {
        String valueInStr = Integer.toString(value);
        int[] nums = new int[valueInStr.length()];
        int index = 0;
        
        while(value > 0) {
            int remainder = value%10;
            nums[index] = remainder;
            value = value - remainder;
            index++;
        }
        return nums;
    }

    @Test
    public void getNumsFromShouldReturnValidArray() {
        int[] result = getNumsFrom(80);

        assertArrayEquals("message", new int[]{8,0}, result);
    }

}

class Node {
    Object data;
    Node next;

    Node head = null;
    Node tail = null;

    Node(){}

    Node(Object data) {
        this.data = data;
        this.next = null;
    }

    void addNode(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void disPlay() {
        if (head == null) {
            System.out.println("Node is empty");
            return;
        }
        Node current = head;

        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("\n");
    }

    void deleteNode(Object data) {
        if (head == null) {
            System.out.println("There is no data in node");
            return;
        }

        Node current = head;
        if(current.data == data) {
            head = current.next;
            System.out.println("deleted data!!");
            return;
        }

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                System.out.println("deleted data!!");
                break;
            }
            current = current.next;
        }

    }

    Node findNode(Object data) {
        Node current = head;
        while (current.next != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        System.out.println("not found");
        return null;
    }

    int findNodePosition(Object data) {
        Node current = head;
        int position = 0;
        while (current.next != null) {
            if (current.data == data) {
                return position;
            }
            current = current.next;
            position++;
        }
        System.out.println("Not found");
        return -1;
    }

    void insertAfter(Object data, Object previousData) {
        Node current = head;
        while(current.next != null) {
            if(current.data == previousData) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    void insertBefore(Object data, Object nextData) {
        Node current = head;
        while(current.next != null) {
            if(current.next.data == nextData) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MyHashSet {

    // private int key;
    // private MyHashSet next = null; 

    // private MyHashSet head = null;

    private final int ARRAY_SIZE = 100;
    private List<List<Integer>> parentList;

    public MyHashSet() {
        parentList = new ArrayList<>(ARRAY_SIZE);
        for(int i=0; i<ARRAY_SIZE; i++) {
            parentList.add(null);
        }
        
    }

    // private MyHashSet(int key) {
    //     this.key = key;
    // }
    
    public void add(int key) {
        // arr[key] = true;
        // head = addNode(head, new MyHashSet(key));
        int index = key%ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if(childList == null) {
            List<Integer> list = new LinkedList<>();
            list.add(key);
            parentList.set(index, list);
        } else {
            if(!childList.contains(key)) {
                childList.add(key);
            }
        }
    }

    // private MyHashSet addNode(MyHashSet head, MyHashSet newNode) {
    //     if(head == null) {
    //         head = newNode;
    //     } else {
    //         head.next = addNode(head.next, newNode);
    //     }
    //     return head;
    // }

    
    public void remove(int key) {
        // head = removeNext(head, key);
        // arr[key] = false;
        int index = key%ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if(childList != null) {
            childList.remove(Integer.valueOf(key));
        }
        
    }

    // private MyHashSet removeNext(MyHashSet current, int key) {
    //     if(current != null) {
    //         if(current.key == key) {
    //             if(current.next == null) return null;
    //             current = removeNext(current.next, key);
    //         } else {
    //             current.next = removeNext(current.next, key);
    //         }            
    //         return current;
    //     }
    //     return null;
    // }
    
    public boolean contains(int key) {
        // return arr[key];
        int index = key%ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        return childList != null && childList.contains(Integer.valueOf(key));
    }

    // private boolean checkNext(MyHashSet current, int key) {
    //     if(current == null) return false;
    //     if(current.key == key) return true;
    //     return checkNext(current.next, key);
    // }
}

class MyHashMap {
    
    private LinkedList<Entry>[] map;
    private static final int SIZE = 16;

    public MyHashMap() {
        map = new LinkedList[SIZE];
    }
    
    public void put(int key, int value) {
        int bucket = getIndex(key);
        if(map[bucket] == null) {
            map[bucket] = new LinkedList<Entry>();
            map[bucket].add(new Entry(key, value));
        } else {
            for (Entry entry : map[bucket]) {
                if(entry.key == key) {
                    entry.value = value;
                    return;
                }
            }
            map[bucket].add(new Entry(key, value));
        }
    }

    private int getIndex(int key) {
        return key % SIZE;
    }
    
    public int get(int key) {
        int bucket = getIndex(key);
        if(map[bucket] == null) return -1;
        for (Entry entry : map[bucket]) {
            if(entry.key == key) return entry.value;            
        }
        return -1;
    }
    
    public void remove(int key) {
        int bucket = getIndex(key);
        if(map[bucket] == null) return;
        Entry toRemove = null;
        for (Entry entry : map[bucket]) {
            if(entry.key == key) {
                toRemove = entry;
                break;
            }            
        }
        if(toRemove == null) return;
        map[bucket].remove(toRemove);
    }
}

class Entry {
    int key;
    int value;

    Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
