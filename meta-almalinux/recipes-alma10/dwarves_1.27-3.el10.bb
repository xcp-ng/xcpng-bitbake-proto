
PN = "dwarves"
PE = "0"
PV = "1.27"
PR = "3.el10"
PACKAGES = "dwarves libdwarves1 libdwarves1-devel"


URI_dwarves = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dwarves-1.27-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dwarves = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libdwarves.so.1()(64bit) ( ) libdwarves_emit.so.1()(64bit) ( ) libdwarves_reorganize.so.1()(64bit) ( ) libdwarves1 ( =  1.27-3.el10)"
RPROVIDES:dwarves = "pahole ( ) dwarves ( =  1.27-3.el10) dwarves(x86-64) ( =  1.27-3.el10)"

URI_libdwarves1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdwarves1-1.27-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdwarves1 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libdw.so.1()(64bit) ( ) libdw.so.1(ELFUTILS_0.122)(64bit) ( ) libelf.so.1(ELFUTILS_1.6)(64bit) ( ) libelf.so.1(ELFUTILS_1.3)(64bit) ( ) libdw.so.1(ELFUTILS_0.130)(64bit) ( ) libdw.so.1(ELFUTILS_0.143)(64bit) ( ) libdw.so.1(ELFUTILS_0.138)(64bit) ( ) libdw.so.1(ELFUTILS_0.157)(64bit) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( ) libdw.so.1(ELFUTILS_0.148)(64bit) ( ) libelf.so.1(ELFUTILS_1.4)(64bit) ( )"
RPROVIDES:libdwarves1 = "libdwarves.so.1()(64bit) ( ) libdwarves_emit.so.1()(64bit) ( ) libdwarves_reorganize.so.1()(64bit) ( ) libdwarves1 ( =  1.27-3.el10) libdwarves1(x86-64) ( =  1.27-3.el10)"

URI_libdwarves1-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdwarves1-devel-1.27-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdwarves1-devel = "libdwarves.so.1()(64bit) ( ) libdwarves_emit.so.1()(64bit) ( ) libdwarves_reorganize.so.1()(64bit) ( ) libdwarves1 ( =  1.27-3.el10)"
RPROVIDES:libdwarves1-devel = "libdwarves1-devel ( =  1.27-3.el10) libdwarves1-devel(x86-64) ( =  1.27-3.el10)"
