
PN = "libcdio"
PE = "0"
PV = "2.1.0"
PR = "15.el10"
PACKAGES = "libcdio libcdio-devel"


URI_libcdio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcdio-2.1.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcdio = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libncurses.so.6()(64bit) ( )"
RPROVIDES:libcdio = "libcdio.so.19()(64bit) ( ) libcdio.so.19(CDIO_19)(64bit) ( ) libiso9660.so.11()(64bit) ( ) libiso9660.so.11(ISO9660_11)(64bit) ( ) libcdio++.so.1()(64bit) ( ) libiso9660++.so.0()(64bit) ( ) libudf.so.0()(64bit) ( ) libcdio ( =  2.1.0-15.el10) libcdio(x86-64) ( =  2.1.0-15.el10)"

URI_libcdio-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcdio-devel-2.1.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcdio-devel = "/usr/bin/pkg-config ( ) pkgconfig(libcdio) ( ) libcdio++.so.1()(64bit) ( ) libcdio.so.19()(64bit) ( ) libiso9660++.so.0()(64bit) ( ) libiso9660.so.11()(64bit) ( ) libudf.so.0()(64bit) ( ) libcdio ( =  2.1.0-15.el10)"
RPROVIDES:libcdio-devel = "libcdio-devel ( =  2.1.0-15.el10) libcdio-devel(x86-64) ( =  2.1.0-15.el10) pkgconfig(libcdio) ( =  2.1.0) pkgconfig(libcdio++) ( =  2.1.0) pkgconfig(libiso9660) ( =  2.1.0) pkgconfig(libiso9660++) ( =  2.1.0) pkgconfig(libudf) ( =  2.1.0)"
