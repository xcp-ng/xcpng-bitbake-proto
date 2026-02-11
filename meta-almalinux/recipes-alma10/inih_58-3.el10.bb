
PN = "inih"
PE = "0"
PV = "58"
PR = "3.el10"
PACKAGES = "inih inih-cpp inih-devel"


URI_inih = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/inih-58-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:inih = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:inih = "libinih.so.0()(64bit) ( ) inih ( =  58-3.el10) inih(x86-64) ( =  58-3.el10)"

URI_inih-cpp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/inih-cpp-58-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:inih-cpp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libinih.so.0()(64bit) ( ) inih(x86-64) ( =  58-3.el10)"
RPROVIDES:inih-cpp = "libINIReader.so.0()(64bit) ( ) inih-cpp ( =  58-3.el10) inih-cpp(x86-64) ( =  58-3.el10)"

URI_inih-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/inih-devel-58-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:inih-devel = "/usr/bin/pkg-config ( ) pkgconfig(inih) ( ) libINIReader.so.0()(64bit) ( ) libinih.so.0()(64bit) ( ) inih(x86-64) ( =  58-3.el10) inih-cpp(x86-64) ( =  58-3.el10)"
RPROVIDES:inih-devel = "inih-devel ( =  58-3.el10) inih-devel(x86-64) ( =  58-3.el10) pkgconfig(INIReader) ( =  58) pkgconfig(inih) ( =  58)"
