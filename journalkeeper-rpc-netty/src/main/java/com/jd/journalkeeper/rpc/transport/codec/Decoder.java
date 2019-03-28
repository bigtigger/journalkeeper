package com.jd.journalkeeper.rpc.transport.codec;

import com.jd.journalkeeper.rpc.transport.exception.TransportException;
import io.netty.buffer.ByteBuf;

/**
 * 对象解码
 * Created by hexiaofeng on 16-6-23.
 */
public interface Decoder {

    /**
     * 解码
     *
     * @param buffer   输入流
     * @return
     * @throws TransportException.CodecException
     */
    Object decode(ByteBuf buffer) throws TransportException.CodecException;
}