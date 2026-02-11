
PN = "librelp"
PE = "0"
PV = "1.11.0"
PR = "7.el10"
PACKAGES = "librelp librelp-devel"


URI_librelp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librelp-1.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librelp = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( )"
RPROVIDES:librelp = "librelp.so.0()(64bit) ( ) librelp ( =  1.11.0-7.el10) librelp(x86-64) ( =  1.11.0-7.el10)"

URI_librelp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librelp-devel-1.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librelp-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) librelp.so.0()(64bit) ( ) librelp ( =  1.11.0-7.el10)"
RPROVIDES:librelp-devel = "librelp-devel ( =  1.11.0-7.el10) librelp-devel(x86-64) ( =  1.11.0-7.el10) pkgconfig(relp) ( =  1.11.0)"
