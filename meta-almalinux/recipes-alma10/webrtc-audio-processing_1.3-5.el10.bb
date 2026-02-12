
inherit dnf-bridge

PN = "webrtc-audio-processing"
PE = "0"
PV = "1.3"
PR = "5.el10"
PACKAGES = "webrtc-audio-processing webrtc-audio-processing-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/webrtc-audio-processing-1.3-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_webrtc-audio-processing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/webrtc-audio-processing-1.3-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_webrtc-audio-processing}"
RDEPENDS:webrtc-audio-processing = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_webrtc-audio-processing-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/webrtc-audio-processing-devel-1.3-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_webrtc-audio-processing-devel}"
RDEPENDS:webrtc-audio-processing-devel = " \
 pkgconf-pkg-config \
 webrtc-audio-processing \
"
