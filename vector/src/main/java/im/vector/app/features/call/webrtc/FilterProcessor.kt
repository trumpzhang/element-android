/*
 * Copyright (c) 2024 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.app.features.call.webrtc

import org.webrtc.VideoFrame
import org.webrtc.VideoProcessor
import org.webrtc.VideoSink

class FilterProcessor : VideoProcessor {
    private var videoSink:VideoSink? = null

    override fun onCapturerStarted(p0: Boolean) {
    }

    override fun onCapturerStopped() {
    }

    override fun onFrameCaptured(p0: VideoFrame?) {
        // TODO: 在这对VideoFrame进行视频滤镜美颜处理
        var newFrame = p0
        Yuv

        videoSink?.onFrame(newFrame)
    }

    override fun setSink(p0: VideoSink?) {
        //设置视频接收器 用来渲染并将frame传入Native
        videoSink = p0
    }
}
