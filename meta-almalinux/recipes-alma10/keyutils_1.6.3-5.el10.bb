
PN = "keyutils"
PE = "0"
PV = "1.6.3"
PR = "5.el10"
PACKAGES = "keyutils keyutils-libs keyutils-libs-devel"


URI_keyutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/keyutils-1.6.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keyutils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libkeyutils.so.1()(64bit) ( ) libresolv.so.2()(64bit) ( ) libkeyutils.so.1(KEYUTILS_0.3)(64bit) ( ) libresolv.so.2(GLIBC_2.9)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.5)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.0)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.4)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.10)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.3)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.6)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.7)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.9)(64bit) ( ) keyutils-libs(x86-64) ( =  1.6.3-5.el10)"
RPROVIDES:keyutils = "config(keyutils) ( =  1.6.3-5.el10) keyutils ( =  1.6.3-5.el10) keyutils(x86-64) ( =  1.6.3-5.el10)"

URI_keyutils-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/keyutils-libs-1.6.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keyutils-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.7)(64bit) ( )"
RPROVIDES:keyutils-libs = "libkeyutils.so.1()(64bit) ( ) libkeyutils.so.1(KEYUTILS_0.3)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.5)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.0)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.4)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.10)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.3)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.6)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.7)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.9)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.8)(64bit) ( ) keyutils-libs(x86-64) ( =  1.6.3-5.el10) keyutils-libs ( =  1.6.3-5.el10)"

URI_keyutils-libs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keyutils-libs-devel-1.6.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keyutils-libs-devel = "/usr/bin/pkg-config ( ) libkeyutils.so.1()(64bit) ( ) keyutils-libs(x86-64) ( =  1.6.3-5.el10)"
RPROVIDES:keyutils-libs-devel = "keyutils-libs-devel ( =  1.6.3-5.el10) keyutils-libs-devel(x86-64) ( =  1.6.3-5.el10) pkgconfig(libkeyutils) ( =  1.6.3)"
