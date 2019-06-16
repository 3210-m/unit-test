package tw;

/**
 * 本测试用例为黑盒测试，用来测试整个应用是否能正常的运行，边界测试，范围测试。
 */
public class MainTestCase {
    //测试用例设计
    //实现猜数字的游戏。
    // 游戏有四个格子，每个格子有一个0到9的数字，任意两个格子的数字都不一样。
    // 你有6次猜测的机会，如果猜对则获胜，否则失败。
    // 每次猜测时需依序输入4个数字，程序会根据猜测的情况给出xAxB的反馈，
    // A前面的数字代表位置和数字都对的个数，B前面的数字代表数字对但是位置不对的个数。

    /**
     * Case1: 输入的数字都一样
     *  输入:1 1 1 1
     *
     * Case2: 输入的数字相邻一样
     *  输入:1 1 2 2
     *
     * Case3: 输入的数字对角一样
     *  输入:1 2 1 2
     *
     * Case4: 输入的数字都不一样
     *  输入:1 2 3 4
     *
     * Case5: 输入的数字不等于4个
     *  输入:1 2
     *
     * Case6: 输入的数字大于4个
     *  输入:1 2 3 4 5
     *
     * Case7: 输入的数字存在范围不在0-9
     *  输入:0 10 2 33
     *
     * Case8: 玩游戏次数少于6次
     *  输入:3，4或者5次标准的输入
     *
     * Case9: 玩游戏次数大于6次
     *  输入:标准输入大于6次
     *
     * Case10: 输入空字符串
     *  输入:
     *
     *
     */
}
