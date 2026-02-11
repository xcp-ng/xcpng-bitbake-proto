
PN = "xorg-x11-drv-libinput"
PE = "0"
PV = "1.4.0"
PR = "3.el10"
PACKAGES = "xorg-x11-drv-libinput xorg-x11-drv-libinput-devel"


URI_xorg-x11-drv-libinput = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-drv-libinput-1.4.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-drv-libinput = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) libinput.so.10()(64bit) ( ) libinput.so.10(LIBINPUT_0.12.0)(64bit) ( ) libinput.so.10(LIBINPUT_0.14.0)(64bit) ( ) libinput.so.10(LIBINPUT_0.19.0)(64bit) ( ) libinput.so.10(LIBINPUT_0.21.0)(64bit) ( ) libinput.so.10(LIBINPUT_1.1)(64bit) ( ) libinput.so.10(LIBINPUT_1.11)(64bit) ( ) libinput.so.10(LIBINPUT_1.15)(64bit) ( ) libinput.so.10(LIBINPUT_1.19)(64bit) ( ) libinput.so.10(LIBINPUT_1.2)(64bit) ( ) libinput.so.10(LIBINPUT_1.23)(64bit) ( ) libinput.so.10(LIBINPUT_1.3)(64bit) ( ) libinput.so.10(LIBINPUT_1.4)(64bit) ( ) libinput.so.10(LIBINPUT_1.5)(64bit) ( ) Xorg ( ) xkeyboard-config ( ) libinput ( >=  0.21.0) xserver-abi(ansic-0) ( >=  4) xserver-abi(xinput-24) ( >=  1)"
RPROVIDES:xorg-x11-drv-libinput = "libinput_drv.so()(64bit) ( ) xorg-x11-drv-libinput ( =  1.4.0-3.el10) xorg-x11-drv-libinput(x86-64) ( =  1.4.0-3.el10) xorg-x11-drv-synaptics ( =  1.9.0-3)"

URI_xorg-x11-drv-libinput-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-drv-libinput-devel-1.4.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-drv-libinput-devel = "/usr/bin/pkg-config ( ) pkgconfig ( )"
RPROVIDES:xorg-x11-drv-libinput-devel = "pkgconfig(xorg-libinput) ( =  1.4.0) xorg-x11-drv-libinput-devel ( =  1.4.0-3.el10) xorg-x11-drv-libinput-devel(x86-64) ( =  1.4.0-3.el10)"
