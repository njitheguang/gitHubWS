package com.lottery.comm;

import java.util.ArrayList;
import com.lottery.bean.LotteryViewDto;
import com.lottery.constant.Constant;

/**
 * 双色球算法
 * 
 * @author Administrator
 *
 */
public class LotteryAlgorithm {

	/**
	 * 构造函数
	 * 
	 * @param lotteryViewDto
	 */
	public LotteryAlgorithm() {
		super();
	}

	/**
	 * 1.对称码杀号技巧 →（1)出奖号对称码第三位+7杀下期红球。
	 * 
	 * @param lotteryVD
	 *            LotteryViewDto
	 */
	public ArrayList<Integer> symmetric3CodeAdd7(LotteryViewDto lotteryVD) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		// 返回值初期化(1-33)
		for (int i = Constant.NUM_1; i < Constant.NUM_34; i++) {
			ret.add(i);
		}
		// 除去出奖号对称码第三位+7杀下期红球
		for (int i = Constant.NUM_0; i < ret.size(); i++) {
			if (ret.get(i) == symmetricCode(lotteryVD).getRedBall03() + Constant.NUM_7) {
				ret.remove(i);
			}
		}
		return ret;
	}

	/**
	 * 1.对称码杀号技巧 →（2）出奖号的对称码第一位乘0.88取整数。
	 * 
	 * @param lotteryVD
	 *            LotteryViewDto
	 */
	public ArrayList<Integer> symmetric1CodeMult0Point88(LotteryViewDto lotteryVD) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		// 返回值初期化(1-33)
		for (int i = Constant.NUM_1; i < Constant.NUM_34; i++) {
			ret.add(i);
		}
		// 除去出奖号的对称码第一位乘0.88取整数。
		for (int i = Constant.NUM_0; i < ret.size(); i++) {
			if (ret.get(i) == Math.floor(symmetricCode(lotteryVD).getRedBall01() * Constant.NUM_0POINT88)) {
				ret.remove(i);
			}
		}
		return ret;
	}

	/**
	 * 1.对称码杀号技巧 →（3）出球顺序的第6位减第一位杀下期红球。
	 * 
	 * @param lotteryVD
	 *            LotteryViewDto
	 */
	public ArrayList<Integer> symmetric6CodeMinus1Code(LotteryViewDto lotteryVD) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		// 返回值初期化(1-33)
		for (int i = Constant.NUM_1; i < Constant.NUM_34; i++) {
			ret.add(i);
		}
		// 除去出球顺序的第6位减第一位杀下期红球
		for (int i = Constant.NUM_0; i < ret.size(); i++) {
			if (ret.get(i) == (lotteryVD.getRedBall06() - lotteryVD.getRedBall01())) {
				ret.remove(i);
			}
		}
		return ret;
	}

	/**
	 * 1.对称码杀号技巧 →（4）34减第一红球，杀下期红球。
	 * 
	 * @param lotteryVD
	 *            LotteryViewDto
	 */
	public ArrayList<Integer> symmetric34Minus1Code(LotteryViewDto lotteryVD) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		// 返回值初期化(1-33)
		for (int i = Constant.NUM_1; i < Constant.NUM_34; i++) {
			ret.add(i);
		}
		// 除去34减第一红球，杀下期红球。
		for (int i = Constant.NUM_0; i < ret.size(); i++) {
			if (ret.get(i) == (Constant.NUM_34 - lotteryVD.getRedBall01())) {
				ret.remove(i);
			}
		}
		return ret;
	}

	/**
	 * 1.对称码杀号技巧 →（5）出球顺序的第一位加第二位加第五位杀下期红球。
	 * 
	 * @param lotteryVD
	 *            LotteryViewDto
	 */
	public ArrayList<Integer> symmetric1CodeAdd2CodeAdd5Code(LotteryViewDto lotteryVD) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		// 返回值初期化(1-33)
		for (int i = Constant.NUM_1; i < Constant.NUM_34; i++) {
			ret.add(i);
		}
		// 除去34减第一红球，杀下期红球。
		for (int i = Constant.NUM_0; i < ret.size(); i++) {
			if (ret.get(i) == Math.floorMod(
					(lotteryVD.getRedBall01() + lotteryVD.getRedBall02() + lotteryVD.getRedBall05()),
					Constant.NUM_33)) {
				ret.remove(i);
			}
		}
		return ret;
	}

	/**
	 * 3.巧用减法杀红球 →方法一：号码相减绝对值。
	 * 
	 * @param lotteryVD
	 *            LotteryViewDto
	 */
	public ArrayList<Integer> codeMinusAbsoluteValue(LotteryViewDto lotteryVD) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		// 返回值初期化(1-33)
		for (int i = Constant.NUM_1; i < Constant.NUM_34; i++) {
			ret.add(i);
		}
		ArrayList<Integer> redballList = new ArrayList<Integer>();
		redballList.add(lotteryVD.getRedBall01());
		redballList.add(lotteryVD.getRedBall02());
		redballList.add(lotteryVD.getRedBall03());
		redballList.add(lotteryVD.getRedBall04());
		redballList.add(lotteryVD.getRedBall05());
		redballList.add(lotteryVD.getRedBall06());
		ArrayList<Integer> exceptList = new ArrayList<Integer>();
		// 除去号码相减绝对值，杀下期红球。
		for (int i = Constant.NUM_0; i < redballList.size(); i++) {
			for (int j = i + 1; j < redballList.size(); j++) {
				exceptList.add(Math.abs(redballList.get(j) - redballList.get(i)));
			}
		}
		for (int i = Constant.NUM_0; i < ret.size(); i++) {
			if (exceptList.contains(ret.get(i))) {
				ret.remove(i);
			}
		}
		return ret;
	}

	/**
	 * 3.巧用减法杀红球 →方法二：对应相减绝对值。
	 * 
	 * @param lotteryVD
	 *            proOneLotteryVD
	 * @param lotteryVD
	 *            proTwoLotteryVD
	 */
	public ArrayList<Integer> correspondingCodeMinusAbsoluteValue(LotteryViewDto proOneLotteryVD,
			LotteryViewDto proTwoLotteryVD) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		// 返回值初期化(1-33)
		for (int i = Constant.NUM_1; i < Constant.NUM_34; i++) {
			ret.add(i);
		}
		ArrayList<Integer> exceptList = new ArrayList<Integer>();
		// 除去对应号码相减绝对值，杀下期红球。
		exceptList.add(Math.abs(proOneLotteryVD.getRedBall01() - proTwoLotteryVD.getRedBall01()));
		exceptList.add(Math.abs(proOneLotteryVD.getRedBall02() - proTwoLotteryVD.getRedBall02()));
		exceptList.add(Math.abs(proOneLotteryVD.getRedBall03() - proTwoLotteryVD.getRedBall03()));
		exceptList.add(Math.abs(proOneLotteryVD.getRedBall04() - proTwoLotteryVD.getRedBall04()));
		exceptList.add(Math.abs(proOneLotteryVD.getRedBall05() - proTwoLotteryVD.getRedBall05()));
		exceptList.add(Math.abs(proOneLotteryVD.getRedBall06() - proTwoLotteryVD.getRedBall06()));
		for (int i = Constant.NUM_0; i < ret.size(); i++) {
			if (exceptList.contains(ret.get(i))) {
				ret.remove(i);
			}
		}
		return ret;
	}

	/**
	 * 3.巧用减法杀红球 →方法三：上期减蓝绝对值。
	 * 
	 * @param lotteryVD
	 *            LotteryViewDto
	 */
	public ArrayList<Integer> codeMinusBlueAbsoluteValue(LotteryViewDto lotteryVD) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		// 返回值初期化(1-33)
		for (int i = Constant.NUM_1; i < Constant.NUM_34; i++) {
			ret.add(i);
		}
		ArrayList<Integer> exceptList = new ArrayList<Integer>();
		// 除去号码减去蓝球绝对值，杀下期红球。
		exceptList.add(Math.abs(lotteryVD.getRedBall01() - lotteryVD.getBlueBall()));
		exceptList.add(Math.abs(lotteryVD.getRedBall02() - lotteryVD.getBlueBall()));
		exceptList.add(Math.abs(lotteryVD.getRedBall03() - lotteryVD.getBlueBall()));
		exceptList.add(Math.abs(lotteryVD.getRedBall04() - lotteryVD.getBlueBall()));
		exceptList.add(Math.abs(lotteryVD.getRedBall05() - lotteryVD.getBlueBall()));
		exceptList.add(Math.abs(lotteryVD.getRedBall06() - lotteryVD.getBlueBall()));
		for (int i = Constant.NUM_0; i < ret.size(); i++) {
			if (exceptList.contains(ret.get(i))) {
				ret.remove(i);
			}
		}
		return ret;
	}
	
	/**
	 * 获取对称码
	 * 
	 * @param lotteryViewDto
	 * @return
	 */
	public LotteryViewDto symmetricCode(LotteryViewDto lotteryViewDto) {
		LotteryViewDto ret = new LotteryViewDto();
		// 番号
		ret.setId(lotteryViewDto.getId());
		// 期号
		ret.setIssueID(lotteryViewDto.getIssueID());
		// 红球①
		ret.setRedBall01(Constant.NUM_34 - lotteryViewDto.getRedBall01());
		// 红球①
		ret.setRedBall02(Constant.NUM_34 - lotteryViewDto.getRedBall02());
		// 红球①
		ret.setRedBall03(Constant.NUM_34 - lotteryViewDto.getRedBall03());
		// 红球①
		ret.setRedBall04(Constant.NUM_34 - lotteryViewDto.getRedBall04());
		// 红球①
		ret.setRedBall05(Constant.NUM_34 - lotteryViewDto.getRedBall05());
		// 红球①
		ret.setRedBall06(Constant.NUM_34 - lotteryViewDto.getRedBall06());
		// 篮球
		ret.setBlueBall(lotteryViewDto.getBlueBall());
		// 开奖日期
		ret.setLotteryDate(lotteryViewDto.getLotteryDate());
		return ret;
	}

}
