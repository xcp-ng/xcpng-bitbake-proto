
PN = "xorg-x11-server-Xwayland"
PE = "0"
PV = "24.1.5"
PR = "5.el10_0"
PACKAGES = "xorg-x11-server-Xwayland xorg-x11-server-Xwayland-devel"


URI_xorg-x11-server-Xwayland = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xorg-x11-server-Xwayland-24.1.5-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-Xwayland = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libdrm.so.2()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libtirpc.so.3()(64bit) ( ) libtirpc.so.3(TIRPC_0.3.0)(64bit) ( ) libpixman-1.so.0()(64bit) ( ) libepoxy.so.0()(64bit) ( ) libgbm.so.1()(64bit) ( ) libaudit.so.1()(64bit) ( ) libGL.so.1()(64bit) ( ) libxshmfence.so.1()(64bit) ( ) libXau.so.6()(64bit) ( ) xkeyboard-config ( ) libei.so.1()(64bit) ( ) libdecor-0.so.0()(64bit) ( ) xkbcomp ( ) libEGL ( ) libXdmcp.so.6()(64bit) ( ) libXfont2.so.2()(64bit) ( ) liboeffis.so.1()(64bit) ( ) libxcvt.so.0()(64bit) ( ) libepoxy ( >=  1.5.5)"
RPROVIDES:xorg-x11-server-Xwayland = "application() ( ) application(org.freedesktop.Xwayland.desktop) ( ) xorg-x11-server-Xwayland ( =  24.1.5-5.el10_0) xorg-x11-server-Xwayland(x86-64) ( =  24.1.5-5.el10_0)"

URI_xorg-x11-server-Xwayland-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xorg-x11-server-Xwayland-devel-24.1.5-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-Xwayland-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) xorg-x11-server-Xwayland(x86-64) ( =  24.1.5-5.el10_0)"
RPROVIDES:xorg-x11-server-Xwayland-devel = "pkgconfig(xwayland) ( =  24.1.5) xorg-x11-server-Xwayland-devel ( =  24.1.5-5.el10_0) xorg-x11-server-Xwayland-devel(x86-64) ( =  24.1.5-5.el10_0)"
