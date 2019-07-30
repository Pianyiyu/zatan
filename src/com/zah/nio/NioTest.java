package com.zah.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NioTest {

    public static void main(String[] args) throws IOException {

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.socket().bind(new InetSocketAddress(5000));
        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            int keys = selector.select();
            System.out.println("numbers: " + keys);

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();

                if (selectionKey.isAcceptable()) {
                    ServerSocketChannel serverSocketChannel_ = (ServerSocketChannel) selectionKey.channel();
                    SocketChannel accept = serverSocketChannel_.accept();
                    accept.configureBlocking(false);

                    accept.register(selector, SelectionKey.OP_READ);

                    iterator.remove();

                    System.out.println("客户端连接：" + accept);
                } else if (selectionKey.isReadable()) {
                    SocketChannel channel = (SocketChannel) selectionKey.channel();
                    int r = 0;
                    while (true) {
                        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
                        byteBuffer.clear();
                        int read = channel.read(byteBuffer);
                        if (read <= 0) {
                            break;
                        }
                        byteBuffer.flip();
                        channel.write(byteBuffer);
                        r += read;
                    }
                    System.out.println("读取：" + r + ",来自于" + channel);
                    iterator.remove();
                }
            }

        }
    }
}
