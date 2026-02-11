
PN = "gstreamer1-rtsp-server"
PE = "0"
PV = "1.24.11"
PR = "1.el10"
PACKAGES = "gstreamer1-rtsp-server gstreamer1-rtsp-server-devel"


URI_gstreamer1-rtsp-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-rtsp-server-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-rtsp-server = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libgstreamer-1.0.so.0()(64bit) ( ) libgstvideo-1.0.so.0()(64bit) ( ) libgstbase-1.0.so.0()(64bit) ( ) libgstapp-1.0.so.0()(64bit) ( ) libgstsdp-1.0.so.0()(64bit) ( ) libgstnet-1.0.so.0()(64bit) ( ) libgstrtp-1.0.so.0()(64bit) ( ) libgstrtsp-1.0.so.0()(64bit) ( ) gstreamer1(x86-64) ( >=  1.24.11) gstreamer1-plugins-base(x86-64) ( >=  1.24.11)"
RPROVIDES:gstreamer1-rtsp-server = "libgstrtspserver-1.0.so.0()(64bit) ( ) gstreamer1-rtsp-server ( =  1.24.11-1.el10) gstreamer1-rtsp-server(x86-64) ( =  1.24.11-1.el10)"

URI_gstreamer1-rtsp-server-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gstreamer1-rtsp-server-devel-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-rtsp-server-devel = "rtld(GNU_HASH) ( ) /usr/bin/pkg-config ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgstreamer-1.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) libgstrtsp-1.0.so.0()(64bit) ( ) libgstrtspserver-1.0.so.0()(64bit) ( ) libgstsdp-1.0.so.0()(64bit) ( ) pkgconfig(gstreamer-1.0) ( >=  1.24.0) gstreamer1-rtsp-server(x86-64) ( =  1.24.11-1.el10) pkgconfig(gstreamer-app-1.0) ( >=  1.24.0) pkgconfig(gstreamer-sdp-1.0) ( >=  1.24.0) pkgconfig(gstreamer-video-1.0) ( >=  1.24.0) gstreamer1-devel(x86-64) ( >=  1.24.11) gstreamer1-plugins-base-devel(x86-64) ( >=  1.24.11) pkgconfig(gstreamer-net-1.0) ( >=  1.24.0) pkgconfig(gstreamer-rtp-1.0) ( >=  1.24.0) pkgconfig(gstreamer-rtsp-1.0) ( >=  1.24.0)"
RPROVIDES:gstreamer1-rtsp-server-devel = "gstreamer1(element-rtspclientsink)()(64bit) ( ) gstreamer1(urisink-rtsp)()(64bit) ( ) gstreamer1(urisink-rtsp-sdp)()(64bit) ( ) gstreamer1(urisink-rtsph)()(64bit) ( ) gstreamer1(urisink-rtsps)()(64bit) ( ) gstreamer1(urisink-rtspsh)()(64bit) ( ) gstreamer1(urisink-rtspst)()(64bit) ( ) gstreamer1(urisink-rtspsu)()(64bit) ( ) gstreamer1(urisink-rtspt)()(64bit) ( ) gstreamer1(urisink-rtspu)()(64bit) ( ) libgstrtspclientsink.so()(64bit) ( ) gstreamer1-rtsp-server-devel ( =  1.24.11-1.el10) gstreamer1-rtsp-server-devel(x86-64) ( =  1.24.11-1.el10) pkgconfig(gstreamer-rtsp-server-1.0) ( =  1.24.11)"
