
PN = "libvpx"
PE = "0"
PV = "1.14.1"
PR = "3.el10_0"
PACKAGES = "libvpx libvpx-devel libvpx-utils"


URI_libvpx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvpx-1.14.1-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvpx = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( )"
RPROVIDES:libvpx = "libvpx.so.9()(64bit) ( ) libvpx ( =  1.14.1-3.el10_0) libvpx(x86-64) ( =  1.14.1-3.el10_0)"

URI_libvpx-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvpx-devel-1.14.1-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvpx-devel = "/usr/bin/pkg-config ( ) libvpx.so.9()(64bit) ( ) libvpx(x86-64) ( =  1.14.1-3.el10_0)"
RPROVIDES:libvpx-devel = "pkgconfig(vpx) ( =  1.14.1) libvpx-devel ( =  1.14.1-3.el10_0) libvpx-devel(x86-64) ( =  1.14.1-3.el10_0)"

URI_libvpx-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvpx-utils-1.14.1-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvpx-utils = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libvpx.so.9()(64bit) ( ) libvpx(x86-64) ( =  1.14.1-3.el10_0)"
RPROVIDES:libvpx-utils = "libvpx-utils ( =  1.14.1-3.el10_0) libvpx-utils(x86-64) ( =  1.14.1-3.el10_0)"
