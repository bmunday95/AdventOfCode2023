import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AdventDayOne {

  DayOneInput dayOneInput = new DayOneInput();

  // As they're making the final adjustments, they discover that their calibration document (your puzzle input)
  // has been amended by a very young Elf who was apparently just excited to show off her art skills.
  // Consequently, the Elves are having trouble reading the values on the document.
  //
  //The newly-improved calibration document consists of lines of text;
  // each line originally contained a specific calibration value that the Elves now need to recover.
  // On each line, the calibration value can be found by combining the first digit and the last digit (in that order) to form a single two-digit number.

  //Consider your entire calibration document. What is the sum of all of the calibration values?

  public List<String> calibrationValues() {
    List<String> calibrationFigure = new ArrayList<>();

    //todo - work out value for each line (create 2 digit number from first and last numbers in line), then sum all numbers together

    for (int i = 0; i < dayOneInput.dayOneInput().size(); i++) {
      String individualEntry = dayOneInput.dayOneInput().get(i);

      char[] characters = individualEntry.toCharArray();
//      String doubleDigits = new String("");

      for (int j = 0; j < characters.length; j++) {
        char firstSplitEntry = characters[j];
        if (Character.isDigit(firstSplitEntry)) {
//          doubleDigits.concat(String.valueOf(characters[j]));
          calibrationFigure.add(String.valueOf(firstSplitEntry));
          break;
        }
      }

      for (int k = characters.length - 1; k >= 0; k-- ) {
        char secondSplitEntry = characters[k];

        if (Character.isDigit(secondSplitEntry)) {
//          doubleDigits.concat(String.valueOf(characters[k]));
          calibrationFigure.add(String.valueOf(secondSplitEntry));
//          calibrationFigure.add(String.valueOf(doubleDigits));
          break;
        }
      }
    }
    return calibrationFigure;
  }

}

class DayOneInput {


  String totalDataInput = "two65eightbkgqcsn91qxkfvg\n"
      + "neightwompstbkqv1fourfthdcfgtrkqzgrbfrczxbdn\n"
      + "43qsrrlxxq\n"
      + "898dbpjmdqjgtrvdvlxxdnvlfhncdzrt\n"
      + "jninedsrvftdlcg4hhztwofourskrjhcjvthree\n"
      + "five562\n"
      + "bpnjmtmeightninesix2391\n"
      + "rftqshh47n\n"
      + "ctpkqsdqz97zqptzjlfbtwo\n"
      + "sjtwonesix6cqbv4\n"
      + "9zclhrrssvzpcfpqlshfsxs\n"
      + "ninemcctrb5glhmctwol7\n"
      + "eight5fourtwotwo\n"
      + "18frdsvjxdpxf8dxsevenm\n"
      + "five55foureight\n"
      + "dbqeightwo4sxzsix\n"
      + "ftjjqbgphtmhthreesix1six\n"
      + "8sczkklgr5ncxkhkq\n"
      + "126dzbvg6two4oneightntd\n"
      + "fiveqcplndmmcsixksmmpdqgttwosixnine7eight\n"
      + "eightseven5threesevennine\n"
      + "nmxmcvrzbcppktgbznz2\n"
      + "five83\n"
      + "57rqxmvf12\n"
      + "4nklcvfsix1jvsvxh8nine\n"
      + "tpjppv6seven4sixsevenvnhcxonefjztthdcv\n"
      + "dfkcrcfxkmxccpf7sixkzlgf\n"
      + "ninetwo6hfg\n"
      + "9sfiveffxqthreeqlvhbvrpbd\n"
      + "gtcmqsheightthree51eight\n"
      + "lhszhqvtn12three8xvfglffivekc\n"
      + "hntwone2cmgppck5oneonesevenone3three\n"
      + "8414onehlxjfqghrklv\n"
      + "cdtlrnine2onexfspkgltjrbone8\n"
      + "tsjvxqljbfivefive11fourfour1st\n"
      + "dhhrftncnttrqz21fbdkkcdbndmdrp\n"
      + "jsfcqhzstnxxlchnxlztwonine5\n"
      + "twothree2nhjzlhqdlgnplkjts7\n"
      + "7zndkjxcp4xvqmqlgrhg\n"
      + "446sixqtk5fiveoneeight\n"
      + "3hdqtn2kjdkbzxx\n"
      + "onethree8ninelggjk38xt\n"
      + "2bdnkxoneeightonetskninefive\n"
      + "xcxfqtnpnmdmtrfivefour1seven\n"
      + "1cf\n"
      + "onefive5\n"
      + "t5dnseventhreehbvkqzhbbttvd\n"
      + "49kdxj\n"
      + "s743dflzcsfninefour8\n"
      + "eighteightfive7\n"
      + "2zjsxntjfbkc15vtfkltb7\n"
      + "knkmdgggk95two2\n"
      + "dvjdztx6kfzzsscfcj6zz\n"
      + "xvcnqppc4five7threethreeckhtmfeight\n"
      + "4eightthree9onexmrhrfzjjjmfm94\n"
      + "threebr7\n"
      + "four188nine856\n"
      + "szseven9269\n"
      + "rppvmpprsgqbvbskg8fivedgpv5\n"
      + "992one\n"
      + "fxthfh9twothree\n"
      + "jldmzlktzbhlsrndvn398five\n"
      + "vdzhddpsix6sixsixvbqmf8mrgnqxsxvxvdcdzmkc\n"
      + "7tv9\n"
      + "37seventwofour\n"
      + "seven1six723\n"
      + "nxjlgr64tjlqzphzjdvgb1nd\n"
      + "zmxldpjdsixvzcmrxxzl6\n"
      + "91cgn9eightzxdzfmj\n"
      + "skhtxclf2ninemqct\n"
      + "foursixn8two7srvbbdldpbtwo\n"
      + "two5gpnnhtseven\n"
      + "onepqmzphpgfive2three\n"
      + "5vrgsfbj\n"
      + "5xmqhfbdt965\n"
      + "263nzqjrklqkgtcgjcnprgtfj\n"
      + "78qrpdzmczxj7fourone2\n"
      + "6threed\n"
      + "eight2twogr\n"
      + "96five\n"
      + "2ndkfivetwo6\n"
      + "41fourckqxpdxdctnqmljkrl\n"
      + "68fzpjjvfhjv4fourhsvqtwo\n"
      + "ffqnvbxdzxhsxg9sevenkhpmnflbgfqsvfzfmxnlfcq\n"
      + "eight1six38one8g\n"
      + "5xhdtqshnc9foureightwog\n"
      + "two9llmcgxhjdghbv\n"
      + "9twoeightsix\n"
      + "f4qmsfgvzxfvxgq33twocmfnd\n"
      + "vqq8two8nhsqpgqnzrsixsix\n"
      + "dbxfbl98nllgpsix7\n"
      + "svzgxfspxjfbcvonefour4\n"
      + "eightonefour3nine8\n"
      + "tqhgbkzmhseven656tczxkfkztwo\n"
      + "pckdctnzvxdgz4\n"
      + "5pg\n"
      + "7two7vqtqxmddlbhppmpx8kldcgcfeight\n"
      + "gdbmfmppzl96452\n"
      + "rpnmhfzclkmftsjkpone4sixmjhbjprx\n"
      + "16ljkbvbbc77sixvjlcpdqkvkcrfqslfzvtrqf\n"
      + "4threetwonedrd\n"
      + "seven5mqgztxfqdfdssbc\n"
      + "6eightsixpb\n"
      + "7jqktjqrthoneeightthreeqpssplvh669\n"
      + "fivekjfktwo21jgtjdxeightseven\n"
      + "cjfvqzvtsstsvqsdgzlcrqnmmkgtvlclhfddeight6\n"
      + "8247819snr\n"
      + "684\n"
      + "threedqsvxzfmgrbrtjmjtzjeight57\n"
      + "1three1233tvbpqrlrpz\n"
      + "bxlljzgmc4twothreenldkshgt\n"
      + "eight9dmzftbzmsgmxvhx7khsgvgmbgg\n"
      + "threehbvlqone9sevenxbccbppjxj\n"
      + "jthreesixqlxlvtwo8\n"
      + "cg5nineonejtmpthkqncdmcrjztml\n"
      + "six69sixone5fourvhnzkxqrkm2\n"
      + "mkpqfbjrninemvngbxl1nine5seven\n"
      + "qgxhthreetphvh4fh\n"
      + "four84\n"
      + "8cdhf9fivexqsxljf\n"
      + "eighthmfq788eight\n"
      + "sevenktvsvvxj8fourgdbnpnthreethreenine1\n"
      + "zlcmzfsxdvthree6\n"
      + "mscdeight3\n"
      + "lhzcxzthree8seven87\n"
      + "rnrldrcponeqfdlxgz1lpxtf23sixkdqz\n"
      + "6fiveeightsixthreefour\n"
      + "onetwo1nine5gsvbzlsfrp4\n"
      + "fivefivesix82qhdhnxbgmbttgdqq92\n"
      + "jk886lfour\n"
      + "kcqmt6qk7gcdzzzzdljdmh3nineshcfnbnnd\n"
      + "sevenfour2krdvsfour\n"
      + "kbvlbhfbjqnr9three\n"
      + "two17\n"
      + "dlvndnhdbjgtp57\n"
      + "pqvxgonesix8k72pfmsjl\n"
      + "eight7xq3\n"
      + "xgzxgtfqvsvvtfr23fzkvphdjmm\n"
      + "8hbkggrpxq8two3fivefour8six\n"
      + "tcxntnppqtbflnzfour6zzgrpvxjtf\n"
      + "2sevenninefive5\n"
      + "sdvxrpt5lhzmkknseven2one9\n"
      + "7pcpmgghrbt1zpllhshcsnine\n"
      + "cf8\n"
      + "mfxnmj2ninesix58eight58\n"
      + "8hfnnclmmsg64scdrtdkfivetwo\n"
      + "9four1sixj1three\n"
      + "7nrcxngrxxsixmccsb4rhztxmklmccpttwo\n"
      + "jgtdvpseven7two59\n"
      + "369seven\n"
      + "onegdlthd9one8sixseventhree\n"
      + "6eight9seven\n"
      + "94five\n"
      + "6one282three9one\n"
      + "7rgxznfbf\n"
      + "zrtoneight9sfnsixninesevenzvqdxqjrcdm\n"
      + "five6sixkxksxone3six\n"
      + "qjqrjkjvplkxqvthree58ktgq\n"
      + "7kkc\n"
      + "hr54pmdtnpvzrlskpqrrqhbrnzz\n"
      + "99sixfgnfour389one\n"
      + "ltteightwothreefourfivenine7\n"
      + "kzpzschjsptdpd6fiveninemxfxlkbmfl\n"
      + "eight7dqpvvplkjxgrxxtvt\n"
      + "41nine\n"
      + "61\n"
      + "5qfneight7bhhnine8eightoneightfrx\n"
      + "34cjbcqzeighttwoqfdtqtqbl1\n"
      + "twofivehbxftnsixhtffgqksdseven6\n"
      + "84mnkvppxk18\n"
      + "62four6rsph\n"
      + "8fourctcnnzfz\n"
      + "5jngcrllpnonefive\n"
      + "grmspdlkv42tdzctls\n"
      + "67sixeight1\n"
      + "ninetwo52\n"
      + "9jdvzhzflgxmsixzklv4cldfivetdmhrlm\n"
      + "eight7twoghldrbzhleightjs\n"
      + "ninenp8\n"
      + "jxqjeight48qljhkkbfctonethreejfqlr\n"
      + "z9lxzgzkbmr7jtgpczmvblfour1\n"
      + "545two\n"
      + "56tkxjhndzmtwofour\n"
      + "1ninesixpxxxlfnfn\n"
      + "6threesix9twojrmtl4\n"
      + "6rjzjlxh5tdfkbjzvm\n"
      + "g8one7ccsix\n"
      + "4jxhxrgrhxv6threegkdsgvzxpzzrjclzrn5\n"
      + "qhdjbsh5\n"
      + "8mmngf4lpngqnbtxz\n"
      + "zstqrl5sevengcndbztdcr\n"
      + "mmdsseveneightfdbthreezbqkdbb3\n"
      + "kkntgp94937\n"
      + "2zrzntn8three\n"
      + "klklfnxcnmczrjlprktwo55\n"
      + "7ninecqjtkjsdkqgqvcxtcone6\n"
      + "bgjjheight5txcsjbvv1\n"
      + "rqbk4\n"
      + "soneight2qxbfdkdn51ttfourfiveninesix\n"
      + "czxhmh73llnlspseven8hfqzdpdqmg\n"
      + "26zmphsljkkddzbkninesixnine7\n"
      + "45six\n"
      + "9f\n"
      + "6five6nine2sevenzzzmvzlh\n"
      + "hfnfour8blpsixvhdz26twotwoneft\n"
      + "87twofive\n"
      + "6one92six34vfive\n"
      + "nine82nine5dbmjmsixseven2\n"
      + "6rmgq8eightqxrj3tkljktsjxz\n"
      + "onefour49sevenfour5\n"
      + "sevenftckbsfivegfbgmpcvvvtqdhmbfive8\n"
      + "hqrdprfhxpfjnlqvx2fivethree9onevxbqtpg6\n"
      + "clz76eight\n"
      + "seven6fourjvxzrfivethree7cgtvmsfzb\n"
      + "4sixseven7jktrblrk7five\n"
      + "tqlgpnp682qnhpspbfm\n"
      + "mtfive4\n"
      + "6ninexkds1slbdnlfp66nine\n"
      + "9sevencdqf\n"
      + "jcqccfzmgffrxjcvhpzonerlzkpvk71four38\n"
      + "fourtwofourfivetjzpqmzvmmcseven3\n"
      + "zqoneight9\n"
      + "4twotwo\n"
      + "eightgfqzzcs8eightkkklhsvkmsseven\n"
      + "twosix4\n"
      + "eightfkthjb83\n"
      + "8gmqlpdbftwo15sevenjllkpnp\n"
      + "378onefourlqcq\n"
      + "rxlnmcphmzckgz9bpzonezcjcgvdteight\n"
      + "sevenfive2rmzbpmfvplxdvvldnghmfive\n"
      + "tvbctwo1twofoursevenkjbjd\n"
      + "veightbkkp9vntmeightjdrc\n"
      + "ltdmmnlsjzzxqtvnghxjnvg48bqvvvcj\n"
      + "seven4frssnmkjhf\n"
      + "nine975\n"
      + "zcpdghhlhrvcmxftoneeight4\n"
      + "rgkxgfkx6cqdxjhdqdf2eight2vzkbbpklqnine\n"
      + "one6six5\n"
      + "six5seveneight\n"
      + "23krkcf\n"
      + "sdpthreetwo3\n"
      + "eight28\n"
      + "3twomdpsvbpvhthreegfrdfqtnttk\n"
      + "9sixsixcqbdd94bzxmjn\n"
      + "6fbbbrvzkzbhhlgthree\n"
      + "hgrnflhgqhd6628three\n"
      + "58tfxks\n"
      + "rfcmcfive51nine\n"
      + "3eight9\n"
      + "6threecktkhlvcdkmcxdflsdrcfmkpxrmq\n"
      + "fourssvlkcsninesix38fourkfrgbdxlhx\n"
      + "mbhqsceightnine5bzxfnrzdgcvsg\n"
      + "gfjlsvmkfourhf9qfpxmlqkninecrbnjrfpninejdntmjglk\n"
      + "fiveonesix58onefourdnl\n"
      + "hkd33lgcjrpf6four\n"
      + "ftsbbgmv3fourrmctcsxrfv\n"
      + "rkmgfour58841\n"
      + "gmgskgrfhc54cvpgkkhdhfseventhreefour\n"
      + "three9onegjdmsfthreelrpqfj1hdmbd5\n"
      + "mkjbxcc9375\n"
      + "onejxpczj2twofive5one7\n"
      + "vhclzbp77\n"
      + "8onesevenseven1\n"
      + "3seventhfivefiveseven\n"
      + "bpnrkxlnxrq4dzjljgjg2five4three\n"
      + "fivekpxonegm76jqtjrlrns\n"
      + "pmmqkgdmljhdvsixsix6gdrrx\n"
      + "6rzjmrhlr\n"
      + "sixqnblcchkfnstwo9two4xdjns\n"
      + "twolmffnfmdfptjcdtwogqzhtbvph18six\n"
      + "5threefivefive2czfcvqrjcmlcctgninefour\n"
      + "9cvntxx\n"
      + "4sevengzlzjnntxz9ghcpcgvbm9three\n"
      + "2qcck3one\n"
      + "sixqxqnjxk6ls1rdtxkb31\n"
      + "8onefiveeightljp2\n"
      + "six7one85ptxktrlbtfdtz\n"
      + "ltgnfzcjblvrdclkonesqgbgplqm3threeeighttwo\n"
      + "1xmnr\n"
      + "pcxkjdtcmnineeight1rl8four5eightwoqvc\n"
      + "twovlhtdxctsnsixfourvsixsqfhbjzklsix2\n"
      + "6hcdhsgzv\n"
      + "1six8qjdsfbnlzj93gpj\n"
      + "twoxfktts2xmjvcxkjjf\n"
      + "gkgqmdxcfkb6fjjzfsqbhnzxjzsvzkfv\n"
      + "6oneonefourxrnpf19\n"
      + "qqgsckgrrh5svt2vsd6\n"
      + "sixtns37\n"
      + "jqgfcbrd7eightsixrgkqtkf\n"
      + "4bkfpntttsjonemhtcgsnzvjxcftzssdlntlv7\n"
      + "9jvjqzgrzxslffdfhmcfournhqfckgmfnone\n"
      + "dgeightwothree2zhzfb2\n"
      + "tldpeight77mh88two\n"
      + "49fiveeightfiveseven4\n"
      + "three3rpbrvnp2rgnppsctpcqqfd\n"
      + "1one2sixfleightwokhz\n"
      + "7cnnnp6lzcjxfsqbbfqgvnqhklcktrvrlmfszmqchfnine\n"
      + "one9sdqnzhhnine5pkqthqsskrfourgkxbqpzkrxpkrvnk\n"
      + "gbhvg145twohnqfqnj2mxg9\n"
      + "2sevenoneqfzbfqpcfour\n"
      + "pgcxrr3qhvngreight3four7\n"
      + "vvbfrnqvgmq3eight3sevenllllfn\n"
      + "twonineqtklzqnd7fourjpqthree\n"
      + "82sixtwonez\n"
      + "nfmjv8pgqtqnkpmb83\n"
      + "seventwontjbdcs8mthreeqdgfg1\n"
      + "2fiveqeight\n"
      + "3ninexqt6fourfourone\n"
      + "9ninesevenzmhskrfour2qpqzhqpbgrfiveeight\n"
      + "twofxmpt7fvxkqbht\n"
      + "xmtgrngscqninesix5twotwo7\n"
      + "onetwo8nvhckltwo\n"
      + "686one1seven\n"
      + "986l\n"
      + "4ninepxhzxmhgsixjncqfhqlnb\n"
      + "5tkvsnpp\n"
      + "njfqd5eighthgzsixnhxgt\n"
      + "seven3seven8seven\n"
      + "zceightsixninetwo9vxmfscp\n"
      + "threemgb77nineg1vzlbvhgrms\n"
      + "5onelfpdchkrqpshsixtwofiveseven\n"
      + "6zmjpkzxttksevenpkbdvksphjseven\n"
      + "smeightwo993\n"
      + "one987cckfncdctz15sevenkdtrzkkmdz\n"
      + "8rhbpeightseventhree9\n"
      + "nrnxccfzhrrxhsjhlthreethreenk1nine73\n"
      + "nineone5threekxv2\n"
      + "fivertwotwonnrlhqzfpbntdjhv5k\n"
      + "ppqtrhfkdbpkflpnlx85nddjxdctf4fx\n"
      + "lmtwone472\n"
      + "3vcpbonejmtssvkn3one\n"
      + "8twoninembzfkjdtvdnd1three\n"
      + "eightsixzrrv35hmcpmgjkchfourrg\n"
      + "h87lhbgmzg48twoonenine\n"
      + "six1289src\n"
      + "5fiveqrmscnnqn21\n"
      + "ninefourfiveninexlcpxt1\n"
      + "onesix181onesixjds7\n"
      + "4zvqzgvcd9dzhjzkcgflnhhfive\n"
      + "6threefive7dlvgpzh\n"
      + "3xtvthree\n"
      + "one3cjckmone1six\n"
      + "sixsdtgjtxhsh4qmkqgsp\n"
      + "bznsevenfive6seven6eight7\n"
      + "7ninetwo4scmttkmkmhjgz1\n"
      + "32fiveffxpvvfive\n"
      + "8twotwosglcjkxtfour\n"
      + "8ninetwo6fivetwo\n"
      + "ninevjfqnbqshgcnznb2two4\n"
      + "1btbsqfgxz7\n"
      + "37skthonehgnine\n"
      + "qprsldzcbzcskqpgpnvjt4fivegpqllvq52\n"
      + "qnqpzpkmfj5ninejsix6bpcn2\n"
      + "28jmvbtljsldltwo68fssrjvqtwonev\n"
      + "fourthreefivepxqrrjm7threezjsdhfs\n"
      + "7kmhsdlrsqlonegbr7\n"
      + "onesixfourbdcgeight53lzpgjlsz\n"
      + "qgpgg377\n"
      + "five17\n"
      + "zpmslnjkqc3\n"
      + "fourvmqhvhdgseven7jtpttjlzvsbfkdrj\n"
      + "bdgcfcsevenfive8527\n"
      + "1ninesevennine\n"
      + "4sixfour4nh7sixnlkdk\n"
      + "shjz737\n"
      + "7onecrhjhbqqnn2sixqqgseven\n"
      + "6six1kxpczbxoneone\n"
      + "512vnxncqgtsevenfivesnc\n"
      + "sevenrrdrzlht5\n"
      + "6ltsix\n"
      + "87sixfourgjh\n"
      + "ngtzsrpxsfpmjzk2\n"
      + "onefour462ql5mcfqrglrp\n"
      + "l88oneninetbh5nine2\n"
      + "scgzzmeightqrltnkbjxrglbvsrpd2\n"
      + "7krheightjlzzmthdrqsnkdqqlkone2\n"
      + "three4fivexn2nine\n"
      + "sixseven8one6\n"
      + "seven46five8\n"
      + "bmbfd8\n"
      + "one99xgk2\n"
      + "fivetxfjpmnhdl7\n"
      + "gktgcbronefiver2d\n"
      + "444six6\n"
      + "dpdbxrtnnlsfkh694xnqhszfbvcc2\n"
      + "53mznqnine4dpkkx82\n"
      + "6sixldcgszrhhvrbhdnc\n"
      + "djfpppftbx6three9ncfour5two\n"
      + "eightljcvn565fivethreegsjbfsjsc\n"
      + "grdtdczfm5krxslvfk\n"
      + "1threekpnhkjbgch2\n"
      + "four37\n"
      + "ctlxgcgzj57gmninethree75three\n"
      + "lffrgk4\n"
      + "one256jxbthjxhtj989kfqnrdhhxz\n"
      + "three3ddsxpt1lgkzlpxfiveninebsnbntpnnine\n"
      + "qxskrjjvtp1chgksksxksg79\n"
      + "8zjvmfkpnrc32twotqdc6vshzv\n"
      + "8hgdrds54zk\n"
      + "twokr6vkbflkfrcjxvmninenineeight\n"
      + "grjxdtngmrthreerqjvmxbrdvlmqninegslrzfgmcpdhmg8\n"
      + "5tkdszfcjdm\n"
      + "7jbzvrdprgdx7npn\n"
      + "ctwoneqcmffptjzpone3brdtb4bjnzqx\n"
      + "eight4tjfvrvlcfgdtk61fouroneightjvf\n"
      + "eightsix9four7\n"
      + "827\n"
      + "8pgcksninemrt\n"
      + "bggbhgh8\n"
      + "fiveqsqvlsxc9jnhfdtqvsq71zvlh2\n"
      + "3z1mrzxfdkqsixseven\n"
      + "kbrtclpktwo6btgpxnbrz8\n"
      + "5ninefour6three\n"
      + "8ninefxfivekrkklfvnr6\n"
      + "ftkndksixznvhxrdmj414seven\n"
      + "fourdjjxhb3\n"
      + "four82\n"
      + "277leightsixseven91\n"
      + "4czktzmzctsdqgpqthreekjfm4\n"
      + "78onezmcxjbrheightfourtltlrnjpg\n"
      + "zvclmdhrrbmslgfmrgtvzpnvqmth1one281\n"
      + "dnkf3seventwo\n"
      + "sdtpcdc5\n"
      + "rtn6vfmtvg\n"
      + "gkeightworqtjvmc3fqpzqsevenfivecxff\n"
      + "four49gxrkmfdl5three\n"
      + "9nine3326bcxnclqgsgbng\n"
      + "mjrvfrz7frq2sixfour\n"
      + "twosix3\n"
      + "j7\n"
      + "four73zfrdrns\n"
      + "st14pjnfgqpj\n"
      + "dlceightwo53dcjzxft9\n"
      + "333mzmtlrhkjgsixcjzdrshhpv\n"
      + "vp6stsvtntboneseventwokmdvgthnine\n"
      + "92v2thc\n"
      + "seveneightfivetwofour6\n"
      + "three76jfx3ninekndxqschpfive\n"
      + "fivefxgbhfour58n\n"
      + "nineninezgn6kbblgf\n"
      + "rjvrx4four71one51\n"
      + "4mvmdqjfxhzpddseven7nine76\n"
      + "86mbxjvs\n"
      + "3twosevenfiveh8fiveseven\n"
      + "54bczbfjq9cseven5\n"
      + "nvghzbcjxn57nineldlklgb5fdkqvbzftl\n"
      + "97mtvstpkrzkrg46four\n"
      + "tp8\n"
      + "four8sixphlcct5\n"
      + "2pkccvfmp\n"
      + "ninevmvlmvqqnone69foureight9\n"
      + "four2xlqrmlp48vdzsevenhtrcjbpc\n"
      + "ffvhhtgz78threeone\n"
      + "bfjnjxr342555\n"
      + "4czvdggxlbzcthreerjfshqhmj7\n"
      + "6three24khccsqcnddq\n"
      + "659\n"
      + "five3lxchdtfvlnjn9mcs9jlsvzbcgvk\n"
      + "mfnonefivetwon2mrbsc\n"
      + "hvxv9three5\n"
      + "75ninektwoseventhreefour\n"
      + "zvjrcxchzrz7seven\n"
      + "jhmbsknfm5498qtwo\n"
      + "scjnfvnld72gvtzd\n"
      + "8fivesixtwo\n"
      + "tdjkrtrdj7twoneg\n"
      + "8one3five\n"
      + "2nncbsevenseven\n"
      + "fourtfqfnsixfourtwo9threerblgths\n"
      + "twoninebgxnphjsixseven4\n"
      + "threesevenxjgbpl321\n"
      + "fourtwopjzfourqvnknmmdlsrhnkonefour1\n"
      + "six9ninevkxnpmnpjrmnptwo\n"
      + "eightseven4fivethree8\n"
      + "nine6nineonezdbrz621\n"
      + "4fivezhvzlvrblm3mgzhf56\n"
      + "dfkdbtreightfhrp1\n"
      + "oneeightonecpnkkhpcpqt73\n"
      + "nine9fdgbzxhvbslzlhkpone78five\n"
      + "two74\n"
      + "5three36rl7vnk6one\n"
      + "onetj152twoqtjgvsnjpd\n"
      + "6ninefive\n"
      + "fourszvmjknhhvmznine73eightklhbbnrljk4\n"
      + "89eightjcdftnine\n"
      + "gn7oneeightzcshvfttpnvxrxjdc\n"
      + "four78five44\n"
      + "tnqmjzd2fivehqpkrkdrkqr\n"
      + "eight6eightfhbqqsqqs1twolhbfsjxfxj\n"
      + "4two4xhppfx\n"
      + "gnfqgghz4xnlcxqpccktwofivextpskbcnn7six\n"
      + "seven133bpthreeone5x\n"
      + "3five55four\n"
      + "6pgmbbbnmrrpdqzjkbsrpfhstwo\n"
      + "556vfzmcbxsqg8\n"
      + "59fiveflckfmthdd3nine\n"
      + "2nine5six2twosevenqrdp\n"
      + "qsghpdqfivethreefive8\n"
      + "ninesevennine1\n"
      + "onevkqcgdc6\n"
      + "bcdspxmhzsqfhhlghmqh5794blxm\n"
      + "8eight2twomd9gvtd7\n"
      + "gfjxcczktc8\n"
      + "ccpgbl3zqtmqjztwox\n"
      + "jvkvvklb5nine2dfsmkljl4hpjbhlpdmt\n"
      + "3rxzrnkdrnltzd\n"
      + "fivetwoone6\n"
      + "zcsf5rnxgckhktworqsqngvk8xdgtfcdseven9\n"
      + "rsbfcsix3jbqnqeightsixonelrhfhlldhhfg\n"
      + "njpnzndmdfzkpdseven5rvcsxheightthree\n"
      + "ninethree6zplfz1seven\n"
      + "7dknfz\n"
      + "ninebkhfqdsrone2two5six4\n"
      + "1x\n"
      + "mhrzpkcmf5three\n"
      + "9vzrqrmtzqnkdhrhv\n"
      + "g3\n"
      + "sixthreefourtwonln9fourvqgbbht\n"
      + "vfvzttx86db\n"
      + "cpcrxvp5eightfourseven5fivetqnine\n"
      + "7fsfmgbntxrmjmpmmkcnbx\n"
      + "sevenrkmm6threeseven\n"
      + "fivefivebgdssdxqfnthreethreelvln5eight\n"
      + "vxrxtzmtmtssjsevenfourmnhtzdthree4fivesrpcrb\n"
      + "t8fxpzbnfivesix6fhrcklhvfive\n"
      + "6threetzjvzkbdp\n"
      + "gflz6nine5\n"
      + "ldnn7qjz1lcgsmvjpbtplztmvseven3\n"
      + "threefourtwoeightdfpbjbggx3m\n"
      + "4nineonenine6kkzsmfdrl\n"
      + "lmmpsdmnnsrgkbzcdfive5\n"
      + "4onethreejcrgddkxthree\n"
      + "9twonexr\n"
      + "pvjdlxv1xlgkdsixsixone1four\n"
      + "fourtwofivenine2\n"
      + "xl8\n"
      + "tfmfive7\n"
      + "9q8svkhxgvbmhseven\n"
      + "fournmtqnnphzckqsnpqddlvgff1ninetfhdknbnl\n"
      + "6fivetwo59gxbzxrkdvhfive3\n"
      + "ndbrshkmc9\n"
      + "4fourseven\n"
      + "lkdcxdkkxthq5\n"
      + "ftwo2pgpljh11fpbgl2\n"
      + "hhjrfcchcjlhninexmv6\n"
      + "9bpzdrrfqcs7eightwob\n"
      + "8eightfive\n"
      + "57nnbqt5eightzvfblxstz9scfnnv\n"
      + "92three7xkkdskhvseven\n"
      + "ghlbrzxhlkh63three\n"
      + "5nine7fourtwo78\n"
      + "3dvxdphhxgrbfrlq4qxzslfng8rrfjnpjdnxc\n"
      + "brq68eightoneightvrx\n"
      + "four7twooneeighttwo\n"
      + "onenine2nineninesixfive\n"
      + "slltwone8kngkhvgkkphrmgprnm9\n"
      + "twonhsxggcslm3zqmsixfive\n"
      + "pzgpspbfivetwosix9btjbdfbdeightj\n"
      + "fivezpdk34ninephlzvddrmzvkztwo\n"
      + "sevenfour223qvxrdrvqgkqpctbrzeightqtxjnhgz\n"
      + "7373sevenrrsfzsfour\n"
      + "rttwovggcqtzx2993\n"
      + "twonineonegpcpdqrpd284\n"
      + "2fourfrzkbkhninegseven83one\n"
      + "1pjqvdntbseventhree\n"
      + "eight19tszhr\n"
      + "hngn5fqfcfxrnfs\n"
      + "6xsxcgkdstncdl19c1two\n"
      + "cvrdkrqrmssevenfivecjblqxjbzqtvkqhmcm18\n"
      + "zqtblgtqttwo9gmkcfkdcgbq83\n"
      + "bdrmrsrdfponeeight3fvvsrfbshbzbqztmhbbzpkxxnb9eight\n"
      + "4trjldtsjdc8vkgvseven\n"
      + "37fourfive9three7nine\n"
      + "fourseveneighteight7fiveonexxmmjzlbhk\n"
      + "fivetwothree8seveneighttwo5nine\n"
      + "mqmeightwo3\n"
      + "8cjkdcdk\n"
      + "6cjnjht51knzzcsqkvtwo\n"
      + "5dshlzzxxggninesix1two\n"
      + "9seven1eightonef7\n"
      + "two75sixfivesixhthreethree\n"
      + "1fntfzqrjcxlfprglcsix7\n"
      + "4lgcgkseven\n"
      + "r15two\n"
      + "eightdsxsnqgfnbntvnqtsfpr1\n"
      + "sddbms6nine6\n"
      + "7tpdrfpbd\n"
      + "flmztqone7sixzdqlxhfiveoneone\n"
      + "jzpvdcvnzmmgzhxlcsevennine2\n"
      + "nineseven3cqktfscgtf\n"
      + "rdhrxhfn8hbhctkkxz3\n"
      + "7cjzxmlvq48kvmxgmcd\n"
      + "twoeightlqpfv5fourdfv77\n"
      + "8sixfivegnsevenlgdkfcfznine\n"
      + "fk8hcndpfflmsbjlseven\n"
      + "1onesscdrlztwoonezfm\n"
      + "n8xdcmfxvvgm1b\n"
      + "psix3\n"
      + "gmpnine5ninekfmmhbrnq\n"
      + "713six\n"
      + "gqplptccrthreethree3jdgbtx\n"
      + "1onergncpbv\n"
      + "5fivetwo7two6nine\n"
      + "4sixqrrtqjnv7\n"
      + "onetwo7364fqrjghsbzp\n"
      + "five7shstn\n"
      + "5sixkcspphnsxndzfdghh\n"
      + "jhxpxxpfz4sfkpgeight9ninedclxgv3\n"
      + "fourqfzqsgpt4ljtrrxn2\n"
      + "8seveneight6fhnf9onethree\n"
      + "bjgdq8two8m6bnnbdtqvlf\n"
      + "eightgjrvdjhz6\n"
      + "rdkvkqhfourdpn7tkjbflm7\n"
      + "1ptthreeeightonetwogbh95\n"
      + "92four96\n"
      + "2sevenpkfgj75\n"
      + "lpfnmmp2eightmbrzxdskx7ninetwo\n"
      + "gjmxfive7qqrbsr\n"
      + "qxprvlrhxlj1threethreevrvvc2eighttwo\n"
      + "vdqmnccqsplkpmspqcggvllsxvh1\n"
      + "fvdhvmgzseven2fnrrslbdtwo6\n"
      + "fivefive9smbxkkp192\n"
      + "vbsdstvbknldcgkzkgqjln7\n"
      + "mklnltnfsixphfgfzseven8fivenine\n"
      + "jbshrqn2three844\n"
      + "6nspp1one7three5\n"
      + "six3four571\n"
      + "nqjssphmsbhbfhp822one\n"
      + "9kffmtffiveeight3\n"
      + "sbfbphdgjh4sixbfcrzmnlhxcsksctb5tdtm\n"
      + "7bfzk7mvrglxjfour2tzrkz4\n"
      + "onethree36\n"
      + "zdtcr45four2tpgqsix\n"
      + "sevenmqgjhcjpnine63zllrtnm1\n"
      + "jnccdbplkfq6oneightd\n"
      + "one8flhbdbl93\n"
      + "rrmd34\n"
      + "six1lkthggkbtwo5onesixthree\n"
      + "eightl294eightlb\n"
      + "eightzngvqdmfgvfvhlrxnfourcfggfgp9\n"
      + "dkmzgc73l\n"
      + "839fourone5\n"
      + "xfklsdj6three22\n"
      + "soneight6cvgndhbtttlbpqktwo\n"
      + "5nine1four471pnnvsix\n"
      + "zqrfmnpgzkqrshrpktfbndvfmrcjhfqlhcbn9rrffzngrhnthreedbgcm\n"
      + "xcmt2fournine\n"
      + "seventfgnkd87sixthree\n"
      + "77fktkx\n"
      + "3mdzzsvdmltl7jeightfivenine\n"
      + "seven988five\n"
      + "9975\n"
      + "eight4sbc5eight9\n"
      + "mxj53bsh8fourzv4\n"
      + "817\n"
      + "99ninevnonecfcbsjgnrzrdffll\n"
      + "twofftvkshm4\n"
      + "one221jjbtlgdtt\n"
      + "68sevenfive2lhrblxpkdq8nine3\n"
      + "39cjrgljlvxdfivenhptwoccjbhtnmqreighteight\n"
      + "sixfoursix74fzdtnx92\n"
      + "rhpktnqsvqxn51\n"
      + "35nine1\n"
      + "43gqzppsnktxm2\n"
      + "5five566dtbppfp\n"
      + "nine7one23sixsix\n"
      + "93fourbqmsspdhr\n"
      + "cm5qcfxfcsg3qcvstwozhsnspg\n"
      + "227two\n"
      + "qfrtvpnh8\n"
      + "one4jzmmmjjk\n"
      + "4vxvngmtjxldcn2\n"
      + "bjgb2kvrlshdvfj1hnpfbtxkp\n"
      + "7eightpzmxcmcnsmtkxjt\n"
      + "hzhjbddqj961zkxgmhxdthreetwo3\n"
      + "7fivetwo5dvpplrmxqrzxtwofive\n"
      + "717mfszgrbt\n"
      + "chqhsqt7hcmbjqstfive\n"
      + "threesevenkknvhhtt7399k\n"
      + "7n\n"
      + "6twohzlngv\n"
      + "eightthreekkgt9mqzvkql9txh4\n"
      + "8fcsndmltseven\n"
      + "twodjscb5sxfourtwod\n"
      + "5ssbz\n"
      + "onedvpnnfvqxvfour1jggdsxfdgrqfrgvssix\n"
      + "sevenk94mthklgmsxhxdjxslvfive\n"
      + "bjqshcpk26\n"
      + "nine7sixzx7\n"
      + "9threexsfqxqhvvbsjzrbmxcfssix\n"
      + "geightwonineqp7twoeight79\n"
      + "8b8dllrmvgnmhshvkhm\n"
      + "7grpghbfourlsixthree7\n"
      + "1xzrhgxsh7threetrqqvsl1hcmmk\n"
      + "fivetwoppnseven9sltkmcsntzldvqzfour\n"
      + "6flgcsj\n"
      + "nine44onedninesix7\n"
      + "hrlfdsmjqtbpfpxljhjrrxrrdnrlzf34eight\n"
      + "sevenrzgsvq6\n"
      + "39sixjshdjrfmstwo2tzmzhgggdqgflp\n"
      + "tcrvlffrmqrcx6bqbvhlcbgtwo351\n"
      + "9281qzt35jmtpjgqq\n"
      + "qpdtvpmfbqrmthreetvlsr2fzbzkthreerhqvqbcnj\n"
      + "two3fgrnggpcl\n"
      + "7onexrnvssfjczlmkzgprnone2khmhntg\n"
      + "6lzggxthreefour26tnxfcqbl37\n"
      + "8rgnffphzgponejfive\n"
      + "bmpsevennhrkphhbfz8nine\n"
      + "5mkbbjdcqninenine9\n"
      + "zrfvhcreightone9five\n"
      + "19chrfkm6gqlfcfhmslmcmr\n"
      + "dzrt197twonine\n"
      + "vmrlbm5five\n"
      + "pthree3six417frljvddzjtgdvmmh\n"
      + "fournine7lmzdrxvjsixlmfsgtwonesn\n"
      + "ngt8fdcsgmbbvrone3\n"
      + "3hfhppzdfp\n"
      + "sevenqvrlkpgxnqfivexnzpxcnine99\n"
      + "38oneightg\n"
      + "4fivezjzsstlfxp1pdjmmnvjvtthree\n"
      + "xfngrdrfseven5rcsqtflhsqz\n"
      + "three3jtndtxpx\n"
      + "eightfour8xxtkjsjlrsmg6\n"
      + "1qnjttkhzltvj2xtlts6lqlxrf\n"
      + "eight817two52sixgmhsrnlzm\n"
      + "fourgxbk81\n"
      + "eight6eight\n"
      + "4pllfiveeightsixonekhxvhvx1\n"
      + "41twothree\n"
      + "9pcdldnine\n"
      + "vkkncnrblg2x36\n"
      + "sevenzrqsix3\n"
      + "ccpnk5threeeight1\n"
      + "rj69\n"
      + "ninedzgnsvrjbg4eight\n"
      + "nine3onesevenxvpmmt5eight\n"
      + "drcbrg9eighttvdqgrchlqnineseven\n"
      + "five6two3bgzgtvxmj8\n"
      + "sixfive9\n"
      + "7txddsmg2hzhz1fourkkthree1\n"
      + "3pvgxxxmpt5eighttwocnvnine\n"
      + "cdnbkl3\n"
      + "twosix9sixninevftwo1\n"
      + "392\n"
      + "427twozqp79sixtwo\n"
      + "2jpkrm16\n"
      + "threelbspfkeighthxmmcpprmeightthree3\n"
      + "bvtfzpr36nine\n"
      + "qdzfdzbvnk47twofive4two5\n"
      + "ninethreedfzrphlvkpbvtvmzjxgmrh6five\n"
      + "cjnq7gnpnpt\n"
      + "six8nine2\n"
      + "chsdgnlrzqnddfjthreebhfdvlgfpfshkeightseven6\n"
      + "nmlqvslhk6fourninexpzlf9pfnbrnhphxzxh\n"
      + "eight9nfgtsjxnteight8pfpfctjxxbffxsmjtwonegcd\n"
      + "nine8m1\n"
      + "9sixseven\n"
      + "218\n"
      + "6brzzmkxsm\n"
      + "ftxrrhzz1five98kninepc\n"
      + "3kkmbvvvtwoksspmqksevenoneplone\n"
      + "eight3sevenfour7two8md4\n"
      + "jvtk22472\n"
      + "threetmpkcsjsixfour6twoseven4\n"
      + "kclmjgdplc23ninekmqbrkxrkdhsnnhmthreecfive\n"
      + "xkzbzkszml641one54phdfghtbdd\n"
      + "3442four8vr7\n"
      + "6lthree\n"
      + "lfrlxpczfiveseven2\n"
      + "fhjjlb1fiveninempnvlzbkhsvqf6\n"
      + "fiveone66onesix6dtwo\n"
      + "91bgqfz1four8\n"
      + "7two8sevencvfjhqmdtfone\n"
      + "889two3db36\n"
      + "sevenhlljx5qoneeightfivemvsmbzdbznine\n"
      + "one45sixft6eight6rbf\n"
      + "gdsevenknlfourkmzlpvv3flsfvnmfseveneight\n"
      + "3qbs622fivemzqpxdfkssix\n"
      + "275fr2eightoneone\n"
      + "lktbgbhngfbrzdponerqstslfourhjxgmv1qcj\n"
      + "two9fivelsxpd2six\n"
      + "9eightnine\n"
      + "qmteightwosixseventznkgmnhjvdfxvqv8\n"
      + "ninenine9jdgndgnfour3pgb4gdpjnt\n"
      + "three3sevenzcbllclmseven1threeeight\n"
      + "xzbkxnttninexsj2\n"
      + "ngrgdonefive94fivehgnt7\n"
      + "3nineqnvhsninetfeight22eightwoqf\n"
      + "phrzskrhbd9five8nine\n"
      + "dqqnfive1\n"
      + "hsjrhjvmlqxltxxgqx6qbfsnrhgbkl\n"
      + "four5hrpnq\n"
      + "vfsqhhgb6eightgtjlvnxnqsrjn3pg\n"
      + "71fiveknrgx7\n"
      + "dpeightdbvpnfour1\n"
      + "two59blldsls85\n"
      + "three22nfvmtd77mbjnvxqbdxkxvp\n"
      + "five56five22\n"
      + "jtqeighttnkzkbbtwoninepzxphtlbzsv8\n"
      + "1zhktrqsklfivegxdhrqt\n"
      + "three422\n"
      + "8sqlrqn9\n"
      + "zh8\n"
      + "1fourone8\n"
      + "94kkqb9four9\n"
      + "6sixkbvxf\n"
      + "rbvxqgztwopcbhhgzthl6xsix1qjrvfive\n"
      + "two29one594brhbpnine\n"
      + "7fivebczzcfeightfour\n"
      + "bxqrdcx7sixthree\n"
      + "xjqchs31twoeightthreesevennine\n"
      + "83five8qvnrcllfhddhltsevenone\n"
      + "gsjjxtvtck7six\n"
      + "cxsbtkzcgjbgninehhmzzfnine3bpzg7\n"
      + "six7threedbhtvcvjtmeightz\n"
      + "pdfmjbqgvkr5t\n"
      + "cqbkrkfivexkmvgqfbfsg5zmfhbqkdcq1\n"
      + "6ptrseven65tvbjkqlhjhjq26oneighthsp\n"
      + "39eighttwoninetwomnszqrmtvj\n"
      + "hfpcgzrp8pmmvonevtnfpfltmgxqzntwo\n"
      + "seven6cd8eightr\n"
      + "1vbpfiveseven5gsqdpchrjzfour\n"
      + "7zlxvvjmlnonesix67two2sfggmgbmm\n"
      + "rmgvfvdhhgztrrn966six9oneone\n"
      + "6nkvznctwoone\n"
      + "eightthreeg9nine7six\n"
      + "shthreethree1\n"
      + "tm1eight8rone575\n"
      + "nv6\n"
      + "tpkgndlhdzlfour1fouronethreenhmgtjzn3\n"
      + "9onetwol2qmltninehtrmfxcsbfghk\n"
      + "2vbqxkgp5two89one\n"
      + "428ninefcskeight\n"
      + "g3fournine55eight\n"
      + "hmnvcgtqsixfivebone6\n"
      + "mpcp55xdfive33mdbsc\n"
      + "bfpfrrlqsixfq9cnzvffncbn\n"
      + "hmpvxz3fiveklnnjcvgxtplhhzdrn8seven\n"
      + "gqr6fiveltkqqfvkhconeseven4rlqnvmmkgcx\n"
      + "two2eightwokcr\n"
      + "eight1zmqpcjbbxkkcnk8\n"
      + "pq6qhfnm\n"
      + "sevenseventwo5three7\n"
      + "7eight1mkpmsvpmqfjnvqzgbjkmpc2\n"
      + "gtwoflpblvv6xzpblmfcbx\n"
      + "32five\n"
      + "four3two843nlxxhktmcdoneightjh\n"
      + "89gjs7eightnineonethree4\n"
      + "4rfcbkgrcfb6three7jblgcrrxp5\n"
      + "mhs47tqvkt31twofive\n"
      + "pspptsbp55\n"
      + "fourfour5twogdvjvskqx8foursix\n"
      + "eightxfvnrpcvjtfkvlng91eightcdgzhxzcm\n"
      + "nine5psngtrxms5vnrbjjrpgt\n"
      + "5xnlqscssbfiveeighteight14\n"
      + "svzlbtdkhs5eightfourgzhsix944\n"
      + "fourbphkpbkcfss5l\n"
      + "4four6\n"
      + "onetwo99\n"
      + "nzhlddbkgcbxvpfour1twofiveseventhree3\n"
      + "2one2txrzz8fivethree\n"
      + "seven86\n"
      + "two3tznttbfkzzbthreexqhxqmbj\n"
      + "dskppdthree2\n"
      + "seven4lfive\n"
      + "hnftvrk8fhhzrqzxxqzbhvjhflv2nine\n"
      + "eightsix2zbsgtdvrone\n"
      + "rmssljck3sixfivehvsvtwo9ctrbfvhpxfrr\n"
      + "3nphszlp7ktrtzflbvxnfive\n"
      + "cfrrckdlfmjkmvjbtxnsdq613hxlsix6\n"
      + "spljfjrlrsix2fsl\n"
      + "threeonezdbmxps9\n"
      + "two2lnbvmmpnqq8ssonethree\n"
      + "vvpjpvm6two7\n"
      + "424\n"
      + "threek811nine1five2\n"
      + "82mfsgmh\n"
      + "ninerrjtnkm4nine\n"
      + "sevenonenine7\n"
      + "nine16698llgxbbglggone\n"
      + "knhnxtj6ntkxnine2eight7\n"
      + "286nx\n"
      + "twocbxfonenineonerxvdjzjzcp2\n"
      + "2one5\n"
      + "ninethree25sevenfour69\n"
      + "chthreeone9eightoneshlgndnrjoneightcs\n"
      + "2onenvfszxbphone\n"
      + "9threefour\n"
      + "eightonenine28one\n"
      + "3bshksixrlncdqtk3foureighthjcmmktsvx\n"
      + "prlsj7seven\n"
      + "gqxoneightzmcsqsbvhbthreefive16\n"
      + "3kbqbzm2sixnine52onekrtoneighttq\n"
      + "hqnfive2one\n"
      + "jfive17onemzd\n"
      + "6one2eighttnjzjk\n"
      + "vtmcxnttlxltcmseven2svp2pnzkbgzzzj2one\n"
      + "54mhqbcpzgsd2ld\n"
      + "3fvbnineeight\n"
      + "fivejrxqnqp11cxeighttwojqbqnhmeight\n"
      + "twoonetwo49sixxjbkdoneseven\n"
      + "7qnqpfb9xrhtxkfz9three\n"
      + "one8four1\n"
      + "2r3lrgjltxxlrhrvfltwoonevq\n"
      + "jkptfcvdtwo347mjrqd\n"
      + "eight9cxstff\n"
      + "7nqqbkcsftknhqffjvr2sevenpkjvtc\n"
      + "seven5sevenrsthreefiveone\n"
      + "8mmvdqhone584eighteightfive\n"
      + "7sevenjjgvr4\n"
      + "465nineninesqnslzrfpl\n"
      + "ljqnr737gvfmpjztrsbns8two\n"
      + "hkmdgbbrzpjczpqkhzkdmndlftxgtwoeight26\n"
      + "nhskzhxfk26lpklkkkdnxeight\n"
      + "sixrqcjqseven7sbqlnpqvshxninebxmkxfrznine\n"
      + "xlrrfnt7jjhfqzr\n"
      + "one9six3\n"
      + "sevensevenpsbgtgqpmbsbbpldvbz2qsstxlcgkd\n"
      + "5qpmvbnpfiveoneeightsevenone78\n"
      + "four69seven\n"
      + "2nv\n"
      + "1twovfmvk33gcrsfgdbms\n"
      + "fivetwoone93\n"
      + "g4sixjbcqttbhnp6fourfplmzdtnltnjqdsthree\n"
      + "f3\n"
      + "one3ninefiveone3hlsthrp7\n"
      + "lmdgzgkrq747nine\n"
      + "fourtwo7\n"
      + "7353bdninesixxtc\n"
      + "njnsprmjxcjn42sixp1\n"
      + "92onefour\n"
      + "5eighthkdf\n"
      + "263fiveeight\n"
      + "four96one52fivendcnqcl\n"
      + "rcntpkdtjlcxkdg8\n"
      + "nt7g55ninetfzrjmhrv33\n"
      + "two19\n"
      + "ninefive5threetwo73pxjfive\n"
      + "onethree42\n"
      + "9dctnplfgkeight9\n"
      + "xpjtknfive6five\n"
      + "q1ninefour7\n"
      + "twohfdckgcddpmjbpmgbxnineeightxcxkhssjt1\n"
      + "8hgcs3onemnrcfbgsh9fdc\n"
      + "7zmgns94ninenmm\n"
      + "3four3\n"
      + "hrrt3nine292fourfour\n"
      + "ljsbmrfmnpgg799twosixfoursix\n"
      + "sixjj6\n"
      + "gqmvmmjsjrgn7fiveninetwovnjbs\n"
      + "m2\n"
      + "525onefive\n"
      + "ninesixlm7fiveeight\n"
      + "fourfour6eight5gpkpjdxqvrsp\n"
      + "two5sixkrmxnszf1eight6seven\n"
      + "1bbmmf\n"
      + "26two\n"
      + "9eighteightfivesix7\n"
      + "mcjcdnhlxv92qfbfbdpxfnxgbqsnxkonethreeseven7\n"
      + "9qlvlrfivefzdxpmttsllhntpxpfthree\n"
      + "djdjgxdpnd82five\n"
      + "fiveonenine19four4two\n"
      + "five69two7sfj\n"
      + "twoonelvmdbdq2two\n"
      + "qxeight6trprdmgqzj4\n"
      + "eightfourdvmbvnjthreetwormzfr4qgdctg\n"
      + "fournngpdffcxt1six\n"
      + "seveneight6zeight9\n"
      + "fkkmfbd7nineseven\n"
      + "twobtkvbzgplfpjfiveseven5\n"
      + "9jsjkjhgtghbqltldlcpqtvgpmhsixsix1four2\n"
      + "kxcgkvkmnblfive438\n"
      + "six6lbbqlttnvfiverxceightwobx\n"
      + "8sevenseven6three9ptfggzkhm\n"
      + "one7ninemdjznbqhfkckpjkxtwo12\n"
      + "1bvjgdjlll\n"
      + "43kjdtwofiveseventhree9\n"
      + "fourlgzcrldtwoseven9xndlqvbrtonennvlvzplrt\n"
      + "8twohzmcknlmqd\n"
      + "gshhvf5twodqgdseven8fourfoursix\n"
      + "nineone47sixeightrp\n"
      + "4stonekdgdhxrtqv9sixonevhhmhqzp\n"
      + "8lmpppc\n"
      + "4five8ffive\n"
      + "fivefivesmmkh6jhtggr4\n"
      + "tjrr9ninenine\n"
      + "six6fiverqdlm67hztn2five\n"
      + "six3278xsddmnz\n"
      + "8qlhdpxn645nhrjm\n"
      + "xlfttcfs6jgtbeight6sixdvpl22\n"
      + "87tcj6gkjfrrmdjbgh4\n"
      + "6eightsevennmdpkkmkqrffgshrfhml7two1\n"
      + "ninemglsrmvqrk5six\n"
      + "9nfgt1rntwo1826\n"
      + "three2fiveonexrllxsvfive\n"
      + "9zjfkmdfbfqqf2mxpnqsmsthjzzszdxl\n"
      + "43eightnvdrthree1eightoneggrdmnp\n"
      + "pffldcmnlpsevensixqxhdncrclbc51five\n"
      + "5bqnlphone6\n"
      + "195one";

//  public ArrayList<String> dayOneInput() {
//    ArrayList<String> results = new ArrayList<>();
//
//    Scanner dataInput = new Scanner("/Users/elizabeth.munday/Documents/CodingPractice/AdventOfCode2023/AdventCode/src/DayOneInputText.txt");
//    while (dataInput.hasNext()) {
//      results.add(dataInput.nextLine());
//    }
//
//    return results;
//  }

  public ArrayList<String> dayOneInput() {
    ArrayList<String> elfData = new ArrayList<>(Arrays.asList(totalDataInput.split("\n")));

    return elfData;
  }

}
