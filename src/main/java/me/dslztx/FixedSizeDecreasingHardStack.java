package me.dslztx;

/**
 * 固定大小的尽力递减栈（是一般单调栈的变种）
 */
public class FixedSizeDecreasingHardStack {

    int size;

    int[] data;

    int pos;

    public FixedSizeDecreasingHardStack(int size) {
        this.size = size;

        this.pos = 0;

        this.data = new int[size];
    }

    public void push(int value, int leftLen) {
        if (pos == 0) {
            //栈初始情况
            data[pos++] = value;
        } else {
            // 最多还可以弹出几个元素：结合栈中已有元素 + 余下leftLen元素两方面考虑，尽量能填满栈的size
            int allowPop = pos + leftLen - size;
            while (pos > 0 && data[pos - 1] < value && allowPop > 0) {
                pos--;
                allowPop--;
            }

            // 走到这里该弹出的已经弹完了，实在放不下直接废弃，分为几种情况：1）发生过弹出行为，那么必然可以放下；2）否则看还有没有空余空间
            if (pos < size) {
                data[pos++] = value;
            }
        }
    }

    /**
     * 语义要求pos=data.length-1时，调用这个方法才合法，否则返回数组中须注意只有[0,pos]的数据才是合法
     */
    public int[] obtainData() {
        return data;
    }

}
