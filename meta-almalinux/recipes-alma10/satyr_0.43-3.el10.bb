
PN = "satyr"
PE = "0"
PV = "0.43"
PR = "3.el10"
PACKAGES = "python3-satyr satyr satyr-devel"


URI_python3-satyr = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-satyr-0.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-satyr = "rtld(GNU_HASH) ( ) libstdc++.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libelf.so.1()(64bit) ( ) libjson-c.so.5()(64bit) ( ) libpopt.so.0()(64bit) ( ) libsatyr.so.4()(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) libdw.so.1()(64bit) ( ) python(abi) ( =  3.12) satyr(x86-64) ( =  0.43-3.el10)"
RPROVIDES:python3-satyr = "python-satyr ( =  0.43-3.el10) python3-satyr ( =  0.43-3.el10) python3-satyr(x86-64) ( =  0.43-3.el10) python3.12-satyr ( =  0.43-3.el10)"

URI_satyr = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/satyr-0.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:satyr = "/sbin/ldconfig ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.3)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libelf.so.1(ELFUTILS_1.6)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libpopt.so.0()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) libdw.so.1()(64bit) ( ) json-c(x86-64) ( ) libdw.so.1(ELFUTILS_0.122)(64bit) ( ) libdw.so.1(ELFUTILS_0.130)(64bit) ( ) libdw.so.1(ELFUTILS_0.138)(64bit) ( ) libdw.so.1(ELFUTILS_0.142)(64bit) ( ) libdw.so.1(ELFUTILS_0.158)(64bit) ( ) glib2(x86-64) ( >=  2.43.4)"
RPROVIDES:satyr = "libsatyr.so.4()(64bit) ( ) satyr(x86-64) ( =  0.43-3.el10) satyr ( =  0.43-3.el10)"

URI_satyr-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/satyr-devel-0.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:satyr-devel = "/usr/bin/pkg-config ( ) libsatyr.so.4()(64bit) ( ) pkgconfig(json-c) ( ) satyr(x86-64) ( =  0.43-3.el10)"
RPROVIDES:satyr-devel = "pkgconfig(satyr) ( =  0.43) satyr-devel ( =  0.43-3.el10) satyr-devel(x86-64) ( =  0.43-3.el10)"
