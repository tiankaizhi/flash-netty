package the.flash.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;

public class ClientBusinessHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for (int i = 0; i < 100; i++) {
            // 1.获取数据
            ByteBuf buffer = getByteBuf(ctx);
            // 2.写数据
            ctx.channel().writeAndFlush(buffer);
        }
        ctx.channel().writeAndFlush(Unpooled.copiedBuffer("jiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyipingjiaoyiping".getBytes()));
    }

    private ByteBuf getByteBuf(ChannelHandlerContext ctx) {
        byte[] bytes = "中国移动你好".getBytes(Charset.forName("utf-8"));

        ByteBuf buffer = ctx.alloc().buffer();

        buffer.writeBytes(bytes);

        return buffer;
    }
}