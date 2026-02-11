
PN = "kmod"
PE = "0"
PV = "31"
PR = "11.el10"
PACKAGES = "kmod kmod-libs kmod-devel"


URI_kmod = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kmod-31-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kmod = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) /usr/bin/bash ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libzstd.so.1()(64bit) ( )"
RPROVIDES:kmod = "/sbin/modprobe ( ) kmod ( =  31-11.el10) kmod(x86-64) ( =  31-11.el10) module-init-tools ( =  4.0-1)"

URI_kmod-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kmod-libs-31-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kmod-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libzstd.so.1()(64bit) ( )"
RPROVIDES:kmod-libs = "libkmod.so.2()(64bit) ( ) libkmod.so.2(LIBKMOD_5)(64bit) ( ) libkmod.so.2(LIBKMOD_22)(64bit) ( ) libkmod.so.2(LIBKMOD_6)(64bit) ( ) kmod-libs ( =  31-11.el10) kmod-libs(x86-64) ( =  31-11.el10)"

URI_kmod-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/kmod-devel-31-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kmod-devel = "/usr/bin/pkg-config ( ) libkmod.so.2()(64bit) ( ) kmod-libs(x86-64) ( =  31-11.el10)"
RPROVIDES:kmod-devel = "kmod-devel ( =  31-11.el10) kmod-devel(x86-64) ( =  31-11.el10) pkgconfig(kmod) ( =  31) pkgconfig(libkmod) ( =  31)"
