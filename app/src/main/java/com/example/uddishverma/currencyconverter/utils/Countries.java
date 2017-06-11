package com.example.uddishverma.currencyconverter.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayankaggarwal on 31/05/17.
 */

public class Countries {

    public List<Country> countries = new ArrayList<Country>();

   public class Country {

       public String countryCode;
       public String phoneExtension;

        Country(String cc, String pe) {
            countryCode = cc;
            phoneExtension = pe;
        }

       public String getCountryCode() {
           return countryCode;
       }

       public String getPhoneExtension() {
           return phoneExtension;
       }

       public void setCountryCode(String countryCode) {
           this.countryCode = countryCode;
       }

       public void setPhoneExtension(String phoneExtension) {
           this.phoneExtension = phoneExtension;
       }
   }
            
    public List<Country> makeCountryArray()
    {
        countries.add(new Country("AF","93"));
        countries.add(new Country("AL", "355"));
        countries.add(new Country("DZ", "213"));
        countries.add(new Country("AS", "1"));
        countries.add(new Country("AD", "376"));
        countries.add(new Country("AO", "244"));
        countries.add(new Country("AI", "1"));
        countries.add(new Country("AQ", "672"));
        countries.add(new Country("AG", "1"));
        countries.add(new Country("AR", "54"));
        countries.add(new Country("AM", "374"));
        countries.add(new Country("AW", "297"));
        countries.add(new Country("AU", "61"));
        countries.add(new Country("AT", "43"));
        countries.add(new Country("AZ", "994"));
        
        countries.add(new Country("BS", "1"));
        countries.add(new Country("BH", "973"));
        countries.add(new Country("BD", "880"));
        countries.add(new Country("BB", "1"));
        countries.add(new Country("BY", "375"));
        countries.add(new Country("BE", "32"));
        countries.add(new Country("BZ", "501"));
        countries.add(new Country("BJ", "229"));
        countries.add(new Country("BM", "1"));
        countries.add(new Country("BT", "975"));
        countries.add(new Country("BO", "591"));
        countries.add(new Country("BA", "387"));
        countries.add(new Country("BW", "267"));
        countries.add(new Country("BR", "55"));
        countries.add(new Country("IO", "246"));
        countries.add(new Country("VG", "1"));
        countries.add(new Country("BN", "673"));
        countries.add(new Country("BG", "359"));
        countries.add(new Country("BF", "226"));
        countries.add(new Country("BI", "257"));
        countries.add(new Country("KH", "855"));
        countries.add(new Country("CM", "237"));
        countries.add(new Country("CA", "1"));
        countries.add(new Country("CV", "238"));

        countries.add(new Country("KY", "1"));
        countries.add(new Country("CF", "236"));
        countries.add(new Country("TD", "235"));
        countries.add(new Country("CL", "56"));
        countries.add(new Country("CN", "86"));
        countries.add(new Country("CX", "61"));
        countries.add(new Country("CC", "61"));
        countries.add(new Country("CO", "57"));
        countries.add(new Country("KM", "269"));
        countries.add(new Country("CK", "682"));
        countries.add(new Country("CR", "506"));
        countries.add(new Country("HR", "385"));
        countries.add(new Country("CU", "53"));
        countries.add(new Country("CW", "599"));
        countries.add(new Country("CY", "357"));
        countries.add(new Country("CZ", "420"));
        countries.add(new Country("CD", "243"));

        countries.add(new Country("DK", "45"));
        countries.add(new Country("DJ", "253"));
        countries.add(new Country("DM", "1"));
        countries.add(new Country("DO", "1"));

        countries.add(new Country("TL", "670"));
        countries.add(new Country("EC", "593"));
        countries.add(new Country("EG", "20"));
        countries.add(new Country("SV", "503"));
        countries.add(new Country("GQ", "240"));
        countries.add(new Country("ER", "291"));
        countries.add(new Country("EE", "372"));
        countries.add(new Country("ET", "251"));

        countries.add(new Country("FK", "500"));
        countries.add(new Country("FO", "298"));
        countries.add(new Country("FJ", "679"));
        countries.add(new Country("FI", "358"));
        countries.add(new Country("FR", "33"));
        countries.add(new Country("PF", "689"));

        countries.add(new Country("GA", "241"));
        countries.add(new Country("GM", "220"));
        countries.add(new Country("GE", "995"));
        countries.add(new Country("DE", "49"));
        countries.add(new Country("GH", "233"));
        countries.add(new Country("GI", "350"));
        countries.add(new Country("GR", "30"));
        countries.add(new Country("GL", "299"));
        countries.add(new Country("GD", "1"));
        countries.add(new Country("GU", "1"));
        countries.add(new Country("GT", "502"));
        countries.add(new Country("GG", "44"));
        countries.add(new Country("GN", "224"));
        countries.add(new Country("GW", "245"));
        countries.add(new Country("GY", "592"));

        countries.add(new Country("HT", "509"));
        countries.add(new Country("HN", "504"));
        countries.add(new Country("HK", "852"));
        countries.add(new Country("HU", "36"));

        countries.add(new Country("IS", "354"));
        countries.add(new Country("IN", "91"));
        countries.add(new Country("ID", "62"));
        countries.add(new Country("IR", "98"));
        countries.add(new Country("IQ", "964"));
        countries.add(new Country("IE", "353"));
        countries.add(new Country("IM", "44"));
        countries.add(new Country("IL", "972"));
        countries.add(new Country("IT", "39"));
        countries.add(new Country("CI", "225"));

        countries.add(new Country("JM", "1"));
        countries.add(new Country("JP", "81"));
        countries.add(new Country("JE", "44"));
        countries.add(new Country("JO", "962"));

        countries.add(new Country("KZ", "7"));
        countries.add(new Country("KE", "254"));
        countries.add(new Country("KI", "686"));
        countries.add(new Country("XK", "383"));
        countries.add(new Country("KW", "965"));
        countries.add(new Country("KG", "996"));

        countries.add(new Country("LA", "856"));
        countries.add(new Country("LV", "371"));
        countries.add(new Country("LB", "961"));
        countries.add(new Country("LS", "266"));
        countries.add(new Country("LR", "231"));
        countries.add(new Country("LY", "218"));
        countries.add(new Country("LI", "423"));
        countries.add(new Country("LT", "370"));
        countries.add(new Country("LU", "352"));

        countries.add(new Country("MO", "853"));
        countries.add(new Country("MK", "389"));
        countries.add(new Country("MG", "261"));
        countries.add(new Country("MW", "265"));
        countries.add(new Country("MY", "60"));
        countries.add(new Country("MV", "960"));
        countries.add(new Country("ML", "223"));
        countries.add(new Country("MT", "356"));
        countries.add(new Country("MH", "692"));
        countries.add(new Country("MR", "222"));
        countries.add(new Country("MU", "230"));
        countries.add(new Country("YT", "262"));
        countries.add(new Country("MX", "52"));
        countries.add(new Country("FM", "691"));
        countries.add(new Country("MD", "373"));
        countries.add(new Country("MC", "377"));
        countries.add(new Country("MN", "976"));
        countries.add(new Country("ME", "382"));
        countries.add(new Country("MS", "1"));
        countries.add(new Country("MA", "212"));
        countries.add(new Country("MZ", "258"));
        countries.add(new Country("MM", "95"));

        countries.add(new Country("NA", "264"));
        countries.add(new Country("NR", "674"));
        countries.add(new Country("NP", "977"));
        countries.add(new Country("NL", "31"));
        countries.add(new Country("AN", "599"));
        countries.add(new Country("NC", "687"));
        countries.add(new Country("NZ", "64"));
        countries.add(new Country("NI", "505"));
        countries.add(new Country("NE", "227"));
        countries.add(new Country("NG", "234"));
        countries.add(new Country("NU", "683"));
        countries.add(new Country("KP", "850"));
        countries.add(new Country("MP", "1"));
        countries.add(new Country("NO", "47"));

        countries.add(new Country("OM", "968"));

        countries.add(new Country("PK", "92"));
        countries.add(new Country("PW", "680"));
        countries.add(new Country("PS", "970"));
        countries.add(new Country("PA", "507"));
        countries.add(new Country("PG", "675"));
        countries.add(new Country("PY", "595"));
        countries.add(new Country("PE", "51"));
        countries.add(new Country("PH", "63"));
        countries.add(new Country("PN", "64"));
        countries.add(new Country("PL", "48"));
        countries.add(new Country("PT", "351"));
        countries.add(new Country("PR", "1"));

        countries.add(new Country("QA", "974"));

        countries.add(new Country("CG", "242"));
        countries.add(new Country("RE", "262"));
        countries.add(new Country("RO", "40"));
        countries.add(new Country("RU", "7"));
        countries.add(new Country("RW", "250"));

        countries.add(new Country("BL", "590"));
        countries.add(new Country("SH", "290"));
        countries.add(new Country("KN", "1"));
        countries.add(new Country("LC", "1"));
        countries.add(new Country("MF", "590"));
        countries.add(new Country("PM", "508"));

        countries.add(new Country("VC", "1"));
        countries.add(new Country("WS", "685"));
        countries.add(new Country("SM", "378"));
        countries.add(new Country("ST", "239"));
        countries.add(new Country("SA", "966"));
        countries.add(new Country("SN", "221"));
        countries.add(new Country("RS", "381"));
        countries.add(new Country("SC", "248"));
        countries.add(new Country("SL", "232"));
        countries.add(new Country("SG", "65"));
        countries.add(new Country("SX", "1"));
        countries.add(new Country("SK", "421"));
        countries.add(new Country("SI", "386"));
        countries.add(new Country("SB", "677"));
        countries.add(new Country("SO", "252"));
        countries.add(new Country("ZA", "27"));
        countries.add(new Country("KR", "82"));
        countries.add(new Country("SS", "211"));
        countries.add(new Country("ES", "34"));
        countries.add(new Country("LK", "94"));
        countries.add(new Country("SD", "249"));
        countries.add(new Country("SR", "597"));
        countries.add(new Country("SJ", "47"));
        countries.add(new Country("SZ", "268"));
        countries.add(new Country("SE", "46"));
        countries.add(new Country("CH", "41"));
        countries.add(new Country("SY", "963"));

        countries.add(new Country("TW", "886"));
        countries.add(new Country("TJ", "992"));
        countries.add(new Country("TZ", "255"));
        countries.add(new Country("TH", "66"));
        countries.add(new Country("TG", "228"));
        countries.add(new Country("TK", "690"));
        countries.add(new Country("TO", "676"));
        countries.add(new Country("TT", "1"));
        countries.add(new Country("TN", "216"));
        countries.add(new Country("TR", "90"));
        countries.add(new Country("TM", "993"));
        countries.add(new Country("TC", "1"));
        countries.add(new Country("TV", "688"));

        countries.add(new Country("VI", "1"));
        countries.add(new Country("UG", "256"));
        countries.add(new Country("UA", "380"));
        countries.add(new Country("AE", "971"));
        countries.add(new Country("GB", "44"));
        countries.add(new Country("US", "1"));
        countries.add(new Country("UY", "598"));
        countries.add(new Country("UZ", "998"));

        countries.add(new Country("VU", "678"));
        countries.add(new Country("VA", "379"));
        countries.add(new Country("VE", "58"));
        countries.add(new Country("VN", "84"));

        countries.add(new Country("WF", "681"));
        countries.add(new Country("EH", "212"));

        countries.add(new Country("YE", "967"));

        countries.add(new Country("ZM", "260"));
        countries.add(new Country("ZW", "263"));

        return countries;
    }
    

}
