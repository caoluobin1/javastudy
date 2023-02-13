package org.clb.compress;

/**
 * @Description LZF—πÀıº∞Ω‚—πÀ„∑®
 * @Classname LZF
 * @Date 2023/2/13 23:52
 * @Author clb
 */
public class LZF {
    private static final int hSize = (1 << 14);
    private static final int maxLit = (1 << 5);
    private static final int maxOff = (1 << 13);
    private static final int maxRef = ((1 << 8) + (1 << 3));
    private long[] hashTable = new long[hSize];
    private int hLog = 14;

    public int compress(byte[] input, int inputLength, byte[] outPut, int outPutLength) {
        int iidx = 0;
        int oidx = 0;
        int hval = (((input[iidx]) << 8) | input[iidx + 1]);
        int lit = 0;

        for (; ; ) {
            if (iidx < inputLength - 2) {
                hval = (hval << 8) | input[iidx + 2];
                int hslot = ((hval ^ (hval << 5)) >> (int) (((3 * 8 - hLog)) - hval * 5) & (hSize - 1));
                long reference = hashTable[hslot];
                int ref = Integer.parseInt(Long.toString(reference));
                hashTable[hslot] = iidx;
                long off;
                if ((off = iidx - reference - 1) < maxOff
                        && iidx + 4 < inputLength
                        && reference > 0
                        && input[ref + 0] == input[iidx + 0]
                        && input[ref + 1] == input[iidx + 1]
                        && input[ref + 2] == input[iidx + 2]
                ) {
                    int len = 2;
                    int maxlen = (int) inputLength - iidx - len;
                    maxlen = maxlen > maxRef ? maxRef : maxlen;
                    if (oidx + lit + 1 + 3 >= outPutLength)
                        return 0;
                    do
                        len++;
                    while (len < maxlen && input[ref + len] == input[iidx + len]);
                    if (lit != 0) {
                        outPut[oidx++] = (byte) (lit - 1);
                        lit = -lit;
                        do
                            outPut[oidx++] = input[iidx + lit];
                        while ((++lit) != 0);
                    }
                    len -= 2;
                    iidx++;
                    if (len < 7) {
                        outPut[oidx++] = (byte) ((off >> 8) + (len << 5));
                    } else {
                        outPut[oidx++] = (byte) ((off >> 8) + (7 << 5));
                        outPut[oidx++] = (byte) (len - 7);
                    }
                    outPut[oidx++] = (byte) off;
                    iidx += len - 1;
                    hval = (int) (((input[iidx]) << 8) | input[iidx + 1]);
                    hval = (hval << 8) | input[iidx + 2];
                    hashTable[((hval ^ (hval << 5)) >> (int) (((3 * 8 - hLog)) - hval * 5) & (hSize - 1))] = iidx;
                    iidx++;
                    hval = (hval << 8) | input[iidx + 2];
                    hashTable[((hval ^ (hval << 5)) >> (int) (((3 * 8 - hLog)) - hval * 5) & (hSize - 1))] = iidx;
                    iidx++;
                    continue;
                }
            } else if (iidx == inputLength)
                break;
            lit++;
            iidx++;
            if (lit != maxLit) continue;
            if (oidx + 1 + maxLit >= outPutLength)
                return 0;

            outPut[oidx++] = (byte) (maxLit - 1);
            lit = -lit;
            do
                outPut[oidx++] = input[iidx + lit];
            while ((++lit) != 0);
        }
        if (lit == 0) return (int) oidx;
        if (oidx + lit + 1 >= outPutLength)
            return 0;
        outPut[oidx++] = (byte) (lit - 1);
        lit = -lit;
        do
            outPut[oidx++] = input[iidx + lit];
        while ((++lit) != 0);

        return (int) oidx;
    }
}
