
PN = "bpftool"
PE = "0"
PV = "7.5.0"
PR = "800.el10"
PACKAGES = "bpftool"


URI_bpftool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bpftool-7.5.0-800.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bpftool = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.6)(64bit) ( ) libelf.so.1(ELFUTILS_1.3)(64bit) ( ) libcap.so.2()(64bit) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( )"
RPROVIDES:bpftool = "bpftool ( =  7.5.0-800.el10) bpftool(x86-64) ( =  7.5.0-800.el10)"
