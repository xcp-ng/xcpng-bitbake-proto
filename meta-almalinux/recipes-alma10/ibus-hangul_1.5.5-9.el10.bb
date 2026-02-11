
PN = "ibus-hangul"
PE = "0"
PV = "1.5.5"
PR = "9.el10"
PACKAGES = "ibus-hangul ibus-hangul-tests"


URI_ibus-hangul = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-hangul-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-hangul = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) python3 ( ) python3-gobject ( ) libibus-1.0.so.5()(64bit) ( ) libhangul.so.1()(64bit) ( ) ibus ( >=  1.3.99) libhangul ( >=  0.1.0)"
RPROVIDES:ibus-hangul = "metainfo() ( ) application() ( ) application(ibus-setup-hangul.desktop) ( ) metainfo(org.freedesktop.ibus.engine.hangul.metainfo.xml) ( ) ibus-hangul ( =  1.5.5-9.el10) ibus-hangul(x86-64) ( =  1.5.5-9.el10)"

URI_ibus-hangul-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-hangul-tests-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-hangul-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libhangul.so.1()(64bit) ( ) libibus-1.0.so.5()(64bit) ( ) ibus-hangul(x86-64) ( =  1.5.5-9.el10)"
RPROVIDES:ibus-hangul-tests = "ibus-hangul-tests ( =  1.5.5-9.el10) ibus-hangul-tests(x86-64) ( =  1.5.5-9.el10)"
