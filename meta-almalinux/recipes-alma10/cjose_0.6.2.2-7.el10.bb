
PN = "cjose"
PE = "0"
PV = "0.6.2.2"
PR = "7.el10"
PACKAGES = "cjose cjose-devel"


URI_cjose = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cjose-0.6.2.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cjose = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libjansson.so.4()(64bit) ( ) libjansson.so.4(libjansson.so.4)(64bit) ( )"
RPROVIDES:cjose = "libcjose.so.0()(64bit) ( ) cjose ( =  0.6.2.2-7.el10) cjose(x86-64) ( =  0.6.2.2-7.el10)"

URI_cjose-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cjose-devel-0.6.2.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cjose-devel = "/usr/bin/pkg-config ( ) libcjose.so.0()(64bit) ( ) pkgconfig(libcrypto) ( >=  1.0.1) cjose(x86-64) ( =  0.6.2.2-7.el10) pkgconfig(jansson) ( >=  2.3)"
RPROVIDES:cjose-devel = "cjose-devel ( =  0.6.2.2-7.el10) cjose-devel(x86-64) ( =  0.6.2.2-7.el10) pkgconfig(cjose) ( =  0.6.2.2)"
