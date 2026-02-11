
PN = "strace"
PE = "0"
PV = "6.12"
PR = "1.el10"
PACKAGES = "strace"


URI_strace = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/strace-6.12-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:strace = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libdw.so.1()(64bit) ( ) libdw.so.1(ELFUTILS_0.122)(64bit) ( ) libdw.so.1(ELFUTILS_0.158)(64bit) ( )"
RPROVIDES:strace = "strace ( =  6.12-1.el10) strace(x86-64) ( =  6.12-1.el10)"
