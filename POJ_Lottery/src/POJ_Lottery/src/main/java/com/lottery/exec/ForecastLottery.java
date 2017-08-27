package com.lottery.exec;

import java.util.ArrayList;

import com.lottery.bean.LotteryViewDto;
import com.lottery.comm.LotteryAlgorithm;
import com.lottery.constant.Constant;
import com.lottery.dao.ForecastDao;

/**
 * 双色球预测
 * 
 * @author Administrator
 * @since 1.0
 */
public class ForecastLottery {

	public static void main(String[] args) {
		LotteryAlgorithm lotteryAlgorithm = new LotteryAlgorithm();
		int rightCount = 0;
		int wrongCount = 0;
		ArrayList<LotteryViewDto> list = ForecastDao.select();
		// 1.对称码杀号技巧 →（1)出奖号对称码第三位+7杀下期红球。
		for (int i = 0; i < list.size() - 1; i++) {
			ArrayList<Integer> retInts = lotteryAlgorithm.symmetric3CodeAdd7(list.get(i));
			ArrayList<Integer> collInt = new ArrayList<Integer>();
			collInt.add(list.get(i + 1).getRedBall01());
			collInt.add(list.get(i + 1).getRedBall02());
			collInt.add(list.get(i + 1).getRedBall03());
			collInt.add(list.get(i + 1).getRedBall04());
			collInt.add(list.get(i + 1).getRedBall05());
			collInt.add(list.get(i + 1).getRedBall06());
			if (retInts.containsAll(collInt)) {
				rightCount++;
			} else {
				wrongCount++;
			}
		}
		System.out.println("1.对称码杀号技巧 →（1)出奖号对称码第三位+7杀下期红球。");
		System.out.println("☞正確率：" + (double) rightCount / (double) (rightCount + wrongCount));

		// 初期化
		rightCount = 0;
		wrongCount = 0;
		// 1.对称码杀号技巧 →（2）出奖号的对称码第一位乘0.88取整数。
		for (int i = 0; i < list.size() - 1; i++) {
			ArrayList<Integer> retInts = lotteryAlgorithm.symmetric1CodeMult0Point88(list.get(i));
			ArrayList<Integer> collInt = new ArrayList<Integer>();
			collInt.add(list.get(i + 1).getRedBall01());
			collInt.add(list.get(i + 1).getRedBall02());
			collInt.add(list.get(i + 1).getRedBall03());
			collInt.add(list.get(i + 1).getRedBall04());
			collInt.add(list.get(i + 1).getRedBall05());
			collInt.add(list.get(i + 1).getRedBall06());
			if (retInts.containsAll(collInt)) {
				rightCount++;
			} else {
				wrongCount++;
			}
		}
		System.out.println("1.对称码杀号技巧 →（2）出奖号的对称码第一位乘0.88取整数。");
		System.out.println("☞正確率：" + (double) rightCount / (double) (rightCount + wrongCount));

		// 初期化
		rightCount = 0;
		wrongCount = 0;
		// 1.对称码杀号技巧 →（3）出球顺序的第6位减第一位杀下期红球。
		for (int i = 0; i < list.size() - 1; i++) {
			ArrayList<Integer> retInts = lotteryAlgorithm.symmetric6CodeMinus1Code(list.get(i));
			ArrayList<Integer> collInt = new ArrayList<Integer>();
			collInt.add(list.get(i + 1).getRedBall01());
			collInt.add(list.get(i + 1).getRedBall02());
			collInt.add(list.get(i + 1).getRedBall03());
			collInt.add(list.get(i + 1).getRedBall04());
			collInt.add(list.get(i + 1).getRedBall05());
			collInt.add(list.get(i + 1).getRedBall06());
			if (retInts.containsAll(collInt)) {
				rightCount++;
			} else {
				wrongCount++;
			}
		}
		System.out.println("1.对称码杀号技巧 →（3）出球顺序的第6位减第一位杀下期红球。");
		System.out.println("☞正確率：" + (double) rightCount / (double) (rightCount + wrongCount));

		// 初期化
		rightCount = 0;
		wrongCount = 0;
		// 1.对称码杀号技巧 →（4）34减第一红球，杀下期红球。
		for (int i = 0; i < list.size() - 1; i++) {
			ArrayList<Integer> retInts = lotteryAlgorithm.symmetric34Minus1Code(list.get(i));
			ArrayList<Integer> collInt = new ArrayList<Integer>();
			collInt.add(list.get(i + 1).getRedBall01());
			collInt.add(list.get(i + 1).getRedBall02());
			collInt.add(list.get(i + 1).getRedBall03());
			collInt.add(list.get(i + 1).getRedBall04());
			collInt.add(list.get(i + 1).getRedBall05());
			collInt.add(list.get(i + 1).getRedBall06());
			if (retInts.containsAll(collInt)) {
				rightCount++;
			} else {
				wrongCount++;
			}
		}
		System.out.println("1.对称码杀号技巧 →（4）34减第一红球，杀下期红球。");
		System.out.println("☞正確率：" + (double) rightCount / (double) (rightCount + wrongCount));

		// 初期化
		rightCount = 0;
		wrongCount = 0;
		// 1.对称码杀号技巧 →（5）出球顺序的第一位加第二位加第五位杀下期红球。
		for (int i = 0; i < list.size() - 1; i++) {
			ArrayList<Integer> retInts = lotteryAlgorithm.symmetric1CodeAdd2CodeAdd5Code(list.get(i));
			ArrayList<Integer> collInt = new ArrayList<Integer>();
			collInt.add(list.get(i + 1).getRedBall01());
			collInt.add(list.get(i + 1).getRedBall02());
			collInt.add(list.get(i + 1).getRedBall03());
			collInt.add(list.get(i + 1).getRedBall04());
			collInt.add(list.get(i + 1).getRedBall05());
			collInt.add(list.get(i + 1).getRedBall06());
			if (retInts.containsAll(collInt)) {
				rightCount++;
			} else {
				wrongCount++;
			}
		}
		System.out.println("1.对称码杀号技巧 →（5）出球顺序的第一位加第二位加第五位杀下期红球。");
		System.out.println("☞正確率：" + (double) rightCount / (double) (rightCount + wrongCount));

		// 初期化
		rightCount = 0;
		wrongCount = 0;
		// 3.巧用减法杀红球 →方法一：号码相减绝对值。
		for (int i = 0; i < list.size() - 1; i++) {
			ArrayList<Integer> retInts = lotteryAlgorithm.codeMinusAbsoluteValue(list.get(i));
			ArrayList<Integer> collInt = new ArrayList<Integer>();
			collInt.add(list.get(i + 1).getRedBall01());
			collInt.add(list.get(i + 1).getRedBall02());
			collInt.add(list.get(i + 1).getRedBall03());
			collInt.add(list.get(i + 1).getRedBall04());
			collInt.add(list.get(i + 1).getRedBall05());
			collInt.add(list.get(i + 1).getRedBall06());
			if (retInts.containsAll(collInt)) {
				rightCount++;
			} else {
				wrongCount++;
			}
		}
		System.out.println("2.巧用减法杀红球 →方法一：号码相减绝对值。");
		System.out.println("☞正確率：" + (double) rightCount / (double) (rightCount + wrongCount));

		// 初期化
		rightCount = 0;
		wrongCount = 0;
		// 3.巧用减法杀红球 →方法二：对应相减绝对值。
		for (int i = Constant.NUM_0; i < list.size() - 1; i++) {
			ArrayList<Integer> retInts = lotteryAlgorithm.correspondingCodeMinusAbsoluteValue(list.get(i + 1),
					list.get(i));
			ArrayList<Integer> collInt = new ArrayList<Integer>();
			collInt.add(list.get(i + 1).getRedBall01());
			collInt.add(list.get(i + 1).getRedBall02());
			collInt.add(list.get(i + 1).getRedBall03());
			collInt.add(list.get(i + 1).getRedBall04());
			collInt.add(list.get(i + 1).getRedBall05());
			collInt.add(list.get(i + 1).getRedBall06());
			if (retInts.containsAll(collInt)) {
				rightCount++;
			} else {
				wrongCount++;
			}
		}
		System.out.println("2.巧用减法杀红球 →方法二：对应相减绝对值。");
		System.out.println("☞正確率：" + (double) rightCount / (double) (rightCount + wrongCount));

		// 初期化
		rightCount = 0;
		wrongCount = 0;
		// 3.巧用减法杀红球 →方法三：上期减蓝绝对值。
		for (int i = Constant.NUM_0; i < list.size() - 1; i++) {
			ArrayList<Integer> retInts = lotteryAlgorithm.codeMinusBlueAbsoluteValue(list.get(i));
			ArrayList<Integer> collInt = new ArrayList<Integer>();
			collInt.add(list.get(i + 1).getRedBall01());
			collInt.add(list.get(i + 1).getRedBall02());
			collInt.add(list.get(i + 1).getRedBall03());
			collInt.add(list.get(i + 1).getRedBall04());
			collInt.add(list.get(i + 1).getRedBall05());
			collInt.add(list.get(i + 1).getRedBall06());
			if (retInts.containsAll(collInt)) {
				rightCount++;
			} else {
				wrongCount++;
			}
		}
		System.out.println("2.巧用减法杀红球 →方法三：上期减蓝绝对值。");
		System.out.println("☞正確率：" + (double) rightCount / (double) (rightCount + wrongCount));

		// 下期预测结果
		ArrayList<Integer> forecastList = new ArrayList<>();
		// 1.对称码杀号技巧 →（1)出奖号对称码第三位+7杀下期红球。
		ArrayList<Integer> forecastList011 = new ArrayList<>();
		// 1.对称码杀号技巧 →（2）出奖号的对称码第一位乘0.88取整数。
		ArrayList<Integer> forecastList012 = new ArrayList<>();
		// 1.对称码杀号技巧 →（3）出球顺序的第6位减第一位杀下期红球。
		ArrayList<Integer> forecastList013 = new ArrayList<>();
		// 1.对称码杀号技巧 →（4）34减第一红球，杀下期红球。
		ArrayList<Integer> forecastList014 = new ArrayList<>();
		// 1.对称码杀号技巧 →（5）出球顺序的第一位加第二位加第五位杀下期红球。
		ArrayList<Integer> forecastList015 = new ArrayList<>();
		// 3.巧用减法杀红球 →方法一：号码相减绝对值。
		ArrayList<Integer> forecastList031 = new ArrayList<>();
		// 3.巧用减法杀红球 →方法二：对应相减绝对值。
		ArrayList<Integer> forecastList032 = new ArrayList<>();
		// 3.巧用减法杀红球 →方法三：上期减蓝绝对值。
		ArrayList<Integer> forecastList033 = new ArrayList<>();
		forecastList011 = lotteryAlgorithm.symmetric3CodeAdd7(list.get(list.size()-1));
		forecastList012 = lotteryAlgorithm.symmetric1CodeMult0Point88(list.get(list.size() - 1));
		forecastList013 = lotteryAlgorithm.symmetric6CodeMinus1Code(list.get(list.size() - 1));
		forecastList014 = lotteryAlgorithm.symmetric34Minus1Code(list.get(list.size() - 1));
		forecastList015 = lotteryAlgorithm.symmetric1CodeAdd2CodeAdd5Code(list.get(list.size() - 1));
		forecastList031 = lotteryAlgorithm.codeMinusAbsoluteValue(list.get(list.size() - 1));
		forecastList032 = lotteryAlgorithm.correspondingCodeMinusAbsoluteValue(list.get(list.size() - 1),
				list.get(list.size() - 2));
		forecastList033 = lotteryAlgorithm.codeMinusBlueAbsoluteValue(list.get(list.size() - 1));
		for (int i = Constant.NUM_1; i < Constant.NUM_34; i++) {
			if (forecastList011.contains(i) && forecastList012.contains(i) && forecastList013.contains(i)
					&& forecastList014.contains(i) && forecastList015.contains(i) && forecastList031.contains(i)
					&& forecastList032.contains(i) && forecastList033.contains(i)) {
				forecastList.add(i);
			}
		}
		System.out.println(list.get(list.size()-1).getRedBall01() + "," + list.get(list.size()-1).getRedBall02());
		System.out.println("下期预测结果：");
		for (Integer integer : forecastList) {
			System.out.print(integer + ",");
		}

	}
}
