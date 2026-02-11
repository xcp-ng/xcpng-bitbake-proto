
PN = "xterm"
PE = "0"
PV = "389"
PR = "4.el10"
PACKAGES = "xterm xterm-resize"


URI_xterm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xterm-389-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xterm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libtinfo.so.6()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libICE.so.6()(64bit) ( ) libXt.so.6()(64bit) ( ) libXmu.so.6()(64bit) ( ) libXaw.so.7()(64bit) ( ) libXpm.so.4()(64bit) ( ) libpcre2-posix.so.3()(64bit) ( ) libXft.so.2()(64bit) ( ) libutempter.so.0()(64bit) ( ) libutempter.so.0(UTEMPTER_1.1)(64bit) ( )"
RPROVIDES:xterm = "metainfo() ( ) application() ( ) application(xterm.desktop) ( ) metainfo(xterm.appdata.xml) ( ) xterm ( =  389-4.el10) xterm(x86-64) ( =  389-4.el10)"

URI_xterm-resize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xterm-resize-389-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xterm-resize = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libtinfo.so.6()(64bit) ( )"
RPROVIDES:xterm-resize = "xterm-resize ( =  389-4.el10) xterm-resize(x86-64) ( =  389-4.el10)"
