
PN = "liblerc"
PE = "0"
PV = "4.0.0"
PR = "8.el10"
PACKAGES = "liblerc liblerc-devel mingw32-liblerc mingw64-liblerc"


URI_liblerc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblerc-4.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblerc = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:liblerc = "libLerc.so.4()(64bit) ( ) liblerc ( =  4.0.0-8.el10) liblerc(x86-64) ( =  4.0.0-8.el10)"

URI_liblerc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblerc-devel-4.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblerc-devel = "/usr/bin/pkg-config ( ) libLerc.so.4()(64bit) ( ) liblerc(x86-64) ( =  4.0.0-8.el10)"
RPROVIDES:liblerc-devel = "liblerc-devel ( =  4.0.0-8.el10) liblerc-devel(x86-64) ( =  4.0.0-8.el10) pkgconfig(Lerc) ( =  4.0.0)"

URI_mingw32-liblerc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-liblerc-4.0.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-liblerc = "mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32-crt ( ) mingw32(libgcc_s_dw2-1.dll) ( ) mingw32(libstdc++-6.dll) ( ) mingw32-pkg-config ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-liblerc = "mingw32(liblerc-4.dll) ( ) mingw32-pkgconfig(lerc) ( ) mingw32-liblerc ( =  4.0.0-8.el10)"

URI_mingw64-liblerc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-liblerc-4.0.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-liblerc = "mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64-crt ( ) mingw64(libgcc_s_seh-1.dll) ( ) mingw64(libstdc++-6.dll) ( ) mingw64-pkg-config ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-liblerc = "mingw64(liblerc-4.dll) ( ) mingw64-pkgconfig(lerc) ( ) mingw64-liblerc ( =  4.0.0-8.el10)"
