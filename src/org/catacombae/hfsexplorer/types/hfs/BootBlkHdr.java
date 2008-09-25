package org.catacombae.hfsexplorer.types.hfs;

import java.io.PrintStream;
import org.catacombae.hfsexplorer.Util;

/** This class was generated by CStructToJavaClass. */
public class BootBlkHdr {
    /*
     * struct BootBlkHdr
     * size: 148 bytes
     * description: 
     * 
     * BP   Size  Type      Identifier      Description                               
     * -------------------------------------------------------------------------------
     * 0    2     SInt16    bbID            boot blocks signature (Integer)           
     * 2    4     SInt32    bbEntry         entry point to boot code (LongInt)        
     * 6    2     SInt16    bbVersion       boot blocks version number (Integer)      
     * 8    2     SInt16    bbPageFlags     used internally (Integer)                 
     * 10   1*16  Char[16]  bbSysName       System filename (Str15)                   
     * 26   1*16  Char[16]  bbShellName     Finder filename (Str15)                   
     * 42   1*16  Char[16]  bbDbg1Name      debugger filename (Str15)                 
     * 58   1*16  Char[16]  bbDbg2Name      debugger filename (Str15)                 
     * 74   1*16  Char[16]  bbScreenName    name of startup screen (Str15)            
     * 90   1*16  Char[16]  bbHelloName     name of startup program (Str15)           
     * 106  1*16  Char[16]  bbScrapName     name of system scrap file (Str15)         
     * 122  2     SInt16    bbCntFCBs       number of FCBs to allocate (Integer)      
     * 124  2     SInt16    bbCntEvts       number of event queue elements (Integer)  
     * 126  4     SInt32    bb128KSHeap     system heap size on 128K Mac (LongInt)    
     * 130  4     SInt32    bb256KSHeap     used internally (LongInt)                 
     * 134  4     SInt32    bbSysHeapSize   system heap size on all machines (LongInt)
     * 138  2     SInt16    filler          reserved (Integer)                        
     * 140  4     SInt32    bbSysHeapExtra  additional system heap space (LongInt)    
     * 144  4     SInt32    bbSysHeapFract  fraction of RAM for system heap (LongInt) 
     */
    
    public static final int STRUCTSIZE = 148;
    
    private final byte[] bbID = new byte[2];
    private final byte[] bbEntry = new byte[4];
    private final byte[] bbVersion = new byte[2];
    private final byte[] bbPageFlags = new byte[2];
    private final byte[] bbSysName = new byte[1*16];
    private final byte[] bbShellName = new byte[1*16];
    private final byte[] bbDbg1Name = new byte[1*16];
    private final byte[] bbDbg2Name = new byte[1*16];
    private final byte[] bbScreenName = new byte[1*16];
    private final byte[] bbHelloName = new byte[1*16];
    private final byte[] bbScrapName = new byte[1*16];
    private final byte[] bbCntFCBs = new byte[2];
    private final byte[] bbCntEvts = new byte[2];
    private final byte[] bb128KSHeap = new byte[4];
    private final byte[] bb256KSHeap = new byte[4];
    private final byte[] bbSysHeapSize = new byte[4];
    private final byte[] filler = new byte[2];
    private final byte[] bbSysHeapExtra = new byte[4];
    private final byte[] bbSysHeapFract = new byte[4];
    
    public BootBlkHdr(byte[] data, int offset) {
	System.arraycopy(data, offset+0, bbID, 0, 2);
	System.arraycopy(data, offset+2, bbEntry, 0, 4);
	System.arraycopy(data, offset+6, bbVersion, 0, 2);
	System.arraycopy(data, offset+8, bbPageFlags, 0, 2);
	System.arraycopy(data, offset+10, bbSysName, 0, 1*16);
	System.arraycopy(data, offset+26, bbShellName, 0, 1*16);
	System.arraycopy(data, offset+42, bbDbg1Name, 0, 1*16);
	System.arraycopy(data, offset+58, bbDbg2Name, 0, 1*16);
	System.arraycopy(data, offset+74, bbScreenName, 0, 1*16);
	System.arraycopy(data, offset+90, bbHelloName, 0, 1*16);
	System.arraycopy(data, offset+106, bbScrapName, 0, 1*16);
	System.arraycopy(data, offset+122, bbCntFCBs, 0, 2);
	System.arraycopy(data, offset+124, bbCntEvts, 0, 2);
	System.arraycopy(data, offset+126, bb128KSHeap, 0, 4);
	System.arraycopy(data, offset+130, bb256KSHeap, 0, 4);
	System.arraycopy(data, offset+134, bbSysHeapSize, 0, 4);
	System.arraycopy(data, offset+138, filler, 0, 2);
	System.arraycopy(data, offset+140, bbSysHeapExtra, 0, 4);
	System.arraycopy(data, offset+144, bbSysHeapFract, 0, 4);
    }
    
    public static int length() { return STRUCTSIZE; }
    
    /** boot blocks signature (Integer) */
    public short getBbID() { return Util.readShortBE(bbID); }
    /** entry point to boot code (LongInt) */
    public int getBbEntry() { return Util.readIntBE(bbEntry); }
    /** boot blocks version number (Integer) */
    public short getBbVersion() { return Util.readShortBE(bbVersion); }
    /** used internally (Integer) */
    public short getBbPageFlags() { return Util.readShortBE(bbPageFlags); }
    /** System filename (Str15) */
    public byte[] getBbSysName() { return Util.readByteArrayBE(bbSysName); }
    /** Finder filename (Str15) */
    public byte[] getBbShellName() { return Util.readByteArrayBE(bbShellName); }
    /** debugger filename (Str15) */
    public byte[] getBbDbg1Name() { return Util.readByteArrayBE(bbDbg1Name); }
    /** debugger filename (Str15) */
    public byte[] getBbDbg2Name() { return Util.readByteArrayBE(bbDbg2Name); }
    /** name of startup screen (Str15) */
    public byte[] getBbScreenName() { return Util.readByteArrayBE(bbScreenName); }
    /** name of startup program (Str15) */
    public byte[] getBbHelloName() { return Util.readByteArrayBE(bbHelloName); }
    /** name of system scrap file (Str15) */
    public byte[] getBbScrapName() { return Util.readByteArrayBE(bbScrapName); }
    /** number of FCBs to allocate (Integer) */
    public short getBbCntFCBs() { return Util.readShortBE(bbCntFCBs); }
    /** number of event queue elements (Integer) */
    public short getBbCntEvts() { return Util.readShortBE(bbCntEvts); }
    /** system heap size on 128K Mac (LongInt) */
    public int getBb128KSHeap() { return Util.readIntBE(bb128KSHeap); }
    /** used internally (LongInt) */
    public int getBb256KSHeap() { return Util.readIntBE(bb256KSHeap); }
    /** system heap size on all machines (LongInt) */
    public int getBbSysHeapSize() { return Util.readIntBE(bbSysHeapSize); }
    /** reserved (Integer) */
    public short getFiller() { return Util.readShortBE(filler); }
    /** additional system heap space (LongInt) */
    public int getBbSysHeapExtra() { return Util.readIntBE(bbSysHeapExtra); }
    /** fraction of RAM for system heap (LongInt) */
    public int getBbSysHeapFract() { return Util.readIntBE(bbSysHeapFract); }
    
    public void printFields(PrintStream ps, String prefix) {
	ps.println(prefix + " bbID: " + getBbID());
	ps.println(prefix + " bbEntry: " + getBbEntry());
	ps.println(prefix + " bbVersion: " + getBbVersion());
	ps.println(prefix + " bbPageFlags: " + getBbPageFlags());
	ps.println(prefix + " bbSysName: " + getBbSysName());
	ps.println(prefix + " bbShellName: " + getBbShellName());
	ps.println(prefix + " bbDbg1Name: " + getBbDbg1Name());
	ps.println(prefix + " bbDbg2Name: " + getBbDbg2Name());
	ps.println(prefix + " bbScreenName: " + getBbScreenName());
	ps.println(prefix + " bbHelloName: " + getBbHelloName());
	ps.println(prefix + " bbScrapName: " + getBbScrapName());
	ps.println(prefix + " bbCntFCBs: " + getBbCntFCBs());
	ps.println(prefix + " bbCntEvts: " + getBbCntEvts());
	ps.println(prefix + " bb128KSHeap: " + getBb128KSHeap());
	ps.println(prefix + " bb256KSHeap: " + getBb256KSHeap());
	ps.println(prefix + " bbSysHeapSize: " + getBbSysHeapSize());
	ps.println(prefix + " filler: " + getFiller());
	ps.println(prefix + " bbSysHeapExtra: " + getBbSysHeapExtra());
	ps.println(prefix + " bbSysHeapFract: " + getBbSysHeapFract());
    }
    
    public void print(PrintStream ps, String prefix) {
	ps.println(prefix + "BootBlkHdr:");
	printFields(ps, prefix);
    }
    
    public byte[] getBytes() {
	byte[] result = new byte[STRUCTSIZE];
	int offset = 0;
	System.arraycopy(bbID, 0, result, offset, bbID.length); offset += bbID.length;
	System.arraycopy(bbEntry, 0, result, offset, bbEntry.length); offset += bbEntry.length;
	System.arraycopy(bbVersion, 0, result, offset, bbVersion.length); offset += bbVersion.length;
	System.arraycopy(bbPageFlags, 0, result, offset, bbPageFlags.length); offset += bbPageFlags.length;
	System.arraycopy(bbSysName, 0, result, offset, bbSysName.length); offset += bbSysName.length;
	System.arraycopy(bbShellName, 0, result, offset, bbShellName.length); offset += bbShellName.length;
	System.arraycopy(bbDbg1Name, 0, result, offset, bbDbg1Name.length); offset += bbDbg1Name.length;
	System.arraycopy(bbDbg2Name, 0, result, offset, bbDbg2Name.length); offset += bbDbg2Name.length;
	System.arraycopy(bbScreenName, 0, result, offset, bbScreenName.length); offset += bbScreenName.length;
	System.arraycopy(bbHelloName, 0, result, offset, bbHelloName.length); offset += bbHelloName.length;
	System.arraycopy(bbScrapName, 0, result, offset, bbScrapName.length); offset += bbScrapName.length;
	System.arraycopy(bbCntFCBs, 0, result, offset, bbCntFCBs.length); offset += bbCntFCBs.length;
	System.arraycopy(bbCntEvts, 0, result, offset, bbCntEvts.length); offset += bbCntEvts.length;
	System.arraycopy(bb128KSHeap, 0, result, offset, bb128KSHeap.length); offset += bb128KSHeap.length;
	System.arraycopy(bb256KSHeap, 0, result, offset, bb256KSHeap.length); offset += bb256KSHeap.length;
	System.arraycopy(bbSysHeapSize, 0, result, offset, bbSysHeapSize.length); offset += bbSysHeapSize.length;
	System.arraycopy(filler, 0, result, offset, filler.length); offset += filler.length;
	System.arraycopy(bbSysHeapExtra, 0, result, offset, bbSysHeapExtra.length); offset += bbSysHeapExtra.length;
	System.arraycopy(bbSysHeapFract, 0, result, offset, bbSysHeapFract.length); offset += bbSysHeapFract.length;
	return result;
    }
}