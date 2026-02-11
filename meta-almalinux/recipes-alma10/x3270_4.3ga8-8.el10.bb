
PN = "x3270"
PE = "0"
PV = "4.3ga8"
PR = "8.el10"
PACKAGES = "x3270 x3270-text x3270-x11"


URI_x3270 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/x3270-4.3ga8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:x3270 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libreadline.so.8()(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( )"
RPROVIDES:x3270 = "config(x3270) ( =  4.3ga8-8.el10) x3270 ( =  4.3ga8-8.el10) x3270(x86-64) ( =  4.3ga8-8.el10)"

URI_x3270-text = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/x3270-text-4.3ga8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:x3270-text = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libncursesw.so.6()(64bit) ( ) libreadline.so.8()(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) x3270 ( =  4.3ga8)"
RPROVIDES:x3270-text = "x3270-text ( =  4.3ga8-8.el10) x3270-text(x86-64) ( =  4.3ga8-8.el10)"

URI_x3270-x11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/x3270-x11-4.3ga8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:x3270-x11 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libX11.so.6()(64bit) ( ) libXt.so.6()(64bit) ( ) libXmu.so.6()(64bit) ( ) libXaw.so.7()(64bit) ( ) xrdb ( ) x3270 ( =  4.3ga8)"
RPROVIDES:x3270-x11 = "application() ( ) application(x3270.desktop) ( ) x3270-x11 ( =  4.3ga8-8.el10) x3270-x11(x86-64) ( =  4.3ga8-8.el10)"
