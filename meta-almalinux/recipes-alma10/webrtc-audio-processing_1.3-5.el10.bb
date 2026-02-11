
PN = "webrtc-audio-processing"
PE = "0"
PV = "1.3"
PR = "5.el10"
PACKAGES = "webrtc-audio-processing webrtc-audio-processing-devel"


URI_webrtc-audio-processing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/webrtc-audio-processing-1.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:webrtc-audio-processing = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( )"
RPROVIDES:webrtc-audio-processing = "libwebrtc-audio-processing-1.so.3()(64bit) ( ) libwebrtc-audio-coding-1.so.3()(64bit) ( ) webrtc-audio-processing ( =  1.3-5.el10) webrtc-audio-processing(x86-64) ( =  1.3-5.el10)"

URI_webrtc-audio-processing-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/webrtc-audio-processing-devel-1.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:webrtc-audio-processing-devel = "/usr/bin/pkg-config ( ) libwebrtc-audio-coding-1.so.3()(64bit) ( ) libwebrtc-audio-processing-1.so.3()(64bit) ( ) webrtc-audio-processing(x86-64) ( =  1.3-5.el10)"
RPROVIDES:webrtc-audio-processing-devel = "pkgconfig(webrtc-audio-coding-1) ( =  1.3) pkgconfig(webrtc-audio-processing-1) ( =  1.3) webrtc-audio-processing-devel ( =  1.3-5.el10) webrtc-audio-processing-devel(x86-64) ( =  1.3-5.el10)"
