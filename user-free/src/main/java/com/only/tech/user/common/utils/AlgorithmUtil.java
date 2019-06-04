package com.only.tech.user.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 生成随机码
 * <P>
 * 获取大写字母，小写字母和数字的任意组合的随机码   
 *
 * @author kuangxiang(kuangxiang666@yeah.net)
 * @Date 15:20 2017/12/13
 */
public class AlgorithmUtil {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			System.out.println(getCode(6, null, true, false, true));
		}
	}
    /**
     *获取随机编码
     * <P>
     * 获取大写字母，小写字母和数字的任意组合的随机码    
     *
     * @param length 要生成字符串的长度
     * @param isPureDigits 生成的随机码是否是纯数字 true：表示存数字，false：表示纯字母，null：表示字母和数字均可
     * @param isUpperCase  生成的随机码是否大写  如果isPureDigits的值不为true时，此值有效 true：表示大写，false：表示小写，null：表示大小写都可以
     * @param  isTogether 字母和数字是否必须同时存在 isPureDigits的值为null时，此值有效 true：是，false：否
     * @param  isNeedZero 是否需要去除0和o ，true：是，false：否
     *
     * @return 生成的字符窜
     */
    public static String getCode(int length,Boolean isPureDigits,Boolean isUpperCase,boolean isTogether,boolean isNeedZero) {
        String val = "";
        int num;
        char c;
        Random random = new Random();
        for(int i = 0; i < length; i++){
            //是否需要纯数字或者纯字母
            String charOrNum = "";
            if(isPureDigits!=null){
                charOrNum= isPureDigits ? "num":"char";
            }else{
                charOrNum=random.nextInt(2) % 2 == 0 ? "char" : "num"; // 输出字母还是数字
            }
            //获取字符或者数字
            if("char".equalsIgnoreCase(charOrNum)) {
            	if(isNeedZero){
            		while(true){
            			num = getChoice(isUpperCase, random) + random.nextInt(26);
            			if(num != 79 && num != 111){
            				//79是大写O，111是小写o
            				c = (char) num;
            				break;
            			}
            		}
            	}else{
            		num = getChoice(isUpperCase, random) + random.nextInt(26);
            		c = (char) num;
            	}
                val += c;
            }else if("num".equalsIgnoreCase(charOrNum)) {
               // 数字
            	do {
            		num = random.nextInt(10);
            		if(num != 0){
            			break;
            		}
				} while (isNeedZero);
                val += String.valueOf(num);
            }
            //字符和数字是否需要同时存在
            if(isPureDigits==null&isTogether){
                if(val.length()==length-1){
                    if(isPureAlphabet(val)){
                        val+=String.valueOf(random.nextInt(10));
                        break;
                    }
                    if(isPureDigits(val)){
                        val += (char) (getChoice(isUpperCase, random)  + random.nextInt(26));
                        break;
                    }
                }
            }
        }
        return val;
    }

    /**
     * 获取随机编码的集合
     *
     * @param length 随机编码的长度
     * @param num 想要获取书籍编码的个数
     * @param isPureDigits 是否是纯数字 true：表示存数字，false：表示纯字母，null：表示字母和数字均可
     * @param isUpperCase 是否大写  ，如果生成的字符串中有字母，可以设置值，true：表示大写，false：表示小写，null：表示大小写都可以
     * @param  isTogether 字母和数字是否必须同时存在 true：是，false：否
     * @return
     */
    public static List<String> genCodes(int length, long num,Boolean isPureDigits,Boolean isUpperCase,boolean isTogether){
        List<String> results=new ArrayList<String>();
        for(int j=0;j<num;j++){
            String val = getCode( length,isPureDigits,isUpperCase,isTogether,true);
            //val=val.toLowerCase();
            if(results.contains(val)){
                continue;
            }else{
                results.add(val);
            }
        }
        return results;
    }

    /**
     * 生成验证码
     *
     * @param  codeLength 编码长度
     *
     * @return 验证码字符窜
     */
    public static String getVerifyCode(int codeLength) {
        int i;
        int count = 0;
        char[] str = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < codeLength) {
            i = Math.abs(r.nextInt(str.length));
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }

    /**
     * 获取字母对应的数值
     *
     * @param isUpperCase 是否大写  ，如果生成的字符串中有字母，可以设置值，true：表示大写，false：表示小写，null：表示大小写都可以
     * @param random 随机数
     *
     * @return 数值
     */
    public static int getChoice(Boolean isUpperCase, Random random) {
        int choice=0;
        // 字符串
        if(isUpperCase!=null){
            choice = isUpperCase  ? 65 : 97;
        }else {
            choice= random.nextInt(2) % 2 == 0 ? 65 : 97; //取得大写字母还是小写字母
        }
        return choice;
    }

    /**
     * 是否是纯数字
     *
     * @param str 需要检查的字符窜

     * @return true：是  false：否
     */
    private static boolean isPureDigits(String str) {
        // String regExp =
        // "^[A-Za-z]+(([0-9]+[A-Za-z0-9]+)|([A-Za-z0-9]+[0-9]+))|[0-9]+(([A-Za-z]+[A-Za-z0-9]+)|([A-Za-z0-9]+[A-Za-z]+))$";
        String regExp = "^([0-9]+)$";
        Pattern pat = Pattern.compile(regExp);
        Matcher mat = pat.matcher(str);
        return mat.matches();
    }

    /**
     * 是否是纯字母
     *
     * @param str 需要检查的字符窜
     *
     * @return true ：是   false：否
     */
    private static boolean isPureAlphabet(String str) {
        // String regExp =
        // "^[A-Za-z]+(([0-9]+[A-Za-z0-9]+)|([A-Za-z0-9]+[0-9]+))|[0-9]+(([A-Za-z]+[A-Za-z0-9]+)|([A-Za-z0-9]+[A-Za-z]+))$";
        String regExp = "^([A-Za-z]+)$";
        Pattern pat = Pattern.compile(regExp);
        Matcher mat = pat.matcher(str);
        return mat.matches();
    }

    /**
     * 测试类
     *
     * @param  args 参数
     *
     */
//    public static void main(String[] args) {
//        boolean pureDigits1 = isPureDigits("6003l8");
//        System.out.println("pureDigits的值"+pureDigits1);
//        // TODO Auto-generated method stub
//        List<String> results=genCodes(6,100,null,false,true);
//        System.out.println("results的值"+results);
//    }
}