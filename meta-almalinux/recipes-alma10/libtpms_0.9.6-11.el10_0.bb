
PN = "libtpms"
PE = "0"
PV = "0.9.6"
PR = "11.el10_0"
PACKAGES = "libtpms libtpms-devel"


URI_libtpms = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtpms-0.9.6-11.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtpms = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( )"
RPROVIDES:libtpms = "libtpms.so.0()(64bit) ( ) libtpms.so.0(LIBTPMS_0.5.1)(64bit) ( ) libtpms.so.0(LIBTPMS_0.6.0)(64bit) ( ) libtpms ( =  0.9.6-11.el10_0) libtpms(x86-64) ( =  0.9.6-11.el10_0)"

URI_libtpms-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libtpms-devel-0.9.6-11.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtpms-devel = "/usr/bin/pkg-config ( ) libtpms.so.0()(64bit) ( ) libtpms(x86-64) ( =  0.9.6-11.el10_0)"
RPROVIDES:libtpms-devel = "pkgconfig(libtpms) ( =  0.9.6) libtpms-devel ( =  0.9.6-11.el10_0) libtpms-devel(x86-64) ( =  0.9.6-11.el10_0)"
