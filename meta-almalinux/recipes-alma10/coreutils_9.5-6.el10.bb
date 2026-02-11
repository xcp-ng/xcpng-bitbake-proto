
PN = "coreutils"
PE = "0"
PV = "9.5"
PR = "6.el10"
PACKAGES = "coreutils coreutils-common coreutils-single"


URI_coreutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/coreutils-9.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreutils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libcap.so.2()(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( ) libattr.so.1()(64bit) ( ) libattr.so.1(ATTR_1.1)(64bit) ( ) libgmp.so.10()(64bit) ( ) libattr.so.1(ATTR_1.3)(64bit) ( ) coreutils-common ( =  9.5-6.el10)"
RPROVIDES:coreutils = "bundled(gnulib) ( ) libstdbuf.so()(64bit) ( ) coreutils ( =  9.5-6.el10) coreutils(x86-64) ( =  9.5-6.el10) coreutils-full ( =  9.5-6.el10)"

URI_coreutils-common = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/coreutils-common-9.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreutils-common = ""
RPROVIDES:coreutils-common = "coreutils-common ( =  9.5-6.el10) config(coreutils-common) ( =  9.5-6.el10) coreutils-common(x86-64) ( =  9.5-6.el10)"

URI_coreutils-single = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/coreutils-single-9.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreutils-single = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libcap.so.2()(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( ) libattr.so.1()(64bit) ( ) libattr.so.1(ATTR_1.1)(64bit) ( ) libattr.so.1(ATTR_1.3)(64bit) ( )"
RPROVIDES:coreutils-single = "bundled(gnulib) ( ) libstdbuf.so.single()(64bit) ( ) coreutils ( =  9.5-6.el10) coreutils(x86-64) ( =  9.5-6.el10) coreutils-single ( =  9.5-6.el10) coreutils-single(x86-64) ( =  9.5-6.el10)"
