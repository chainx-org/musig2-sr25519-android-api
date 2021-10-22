package com.chainx.musig2_sr25519;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface CLibrary extends Library {
    public String get_my_pubkey(String priv);

    public String get_my_privkey(String phrase);

    public String get_key_agg(String pubkeys);

    public Pointer get_round1_state();

    public String encode_round1_state(Pointer round1State);

    public Pointer decode_round1_state(String round1State);

    public String get_round1_msg(Pointer round1State);

    public String get_round2_msg(Pointer round1State, String msg, String privkey, String pubkeys, String receivedRound1Msg);

    public String get_signature(String receivedRound2Msg);

    public String generate_threshold_pubkey(String pubkeys, byte threshold);

    public String generate_control_block(String pubkeys, byte threshold, String aggPubkey);
}
