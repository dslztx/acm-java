package me.dslztx;

/**
 * 固定大小的尽力递减栈（是一般单调栈的变种）
 */
public class FixedSizeDecreasingHardStack {

    int stackSize;

    int[] data;

    int pos = -1;

    public FixedSizeDecreasingHardStack(int size) {
        this.stackSize = size;

        data = new int[size];
    }

    public void push(int value, int leftElementLen) {
        if (pos == -1) {
            data[++pos] = value;
        } else {
            if (value <= data[pos]) {
                if (pos < stackSize - 1) {
                    data[++pos] = value;
                }
                // 否则直接丢弃这个值
            } else {
                // 最多还可以弹出几个元素：结合栈中已有元素 + 余下leftElementLen元素两方面考虑，尽量能填满栈的stackSize
                int cnt = leftElementLen + pos + 1 - stackSize;

                while (pos != -1 && value > data[pos] && cnt > 0) {
                    pos--;
                    cnt--;
                }

                data[++pos] = value;
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
