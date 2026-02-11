
PN = "v4l-utils"
PE = "0"
PV = "1.26.1"
PR = "4.el10"
PACKAGES = "libv4l libv4l-devel libdvbv5 libdvbv5-devel libdvbv5-gconv v4l-utils v4l-utils-devel-tools"


URI_libv4l = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libv4l-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libv4l = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libjpeg.so.62(LIBJPEGTURBO_6.2)(64bit) ( )"
RPROVIDES:libv4l = "libv4l1.so.0()(64bit) ( ) libv4l2.so.0()(64bit) ( ) libv4l-mplane.so()(64bit) ( ) libv4l2rds.so.0()(64bit) ( ) libv4lconvert.so.0()(64bit) ( ) libv4l ( =  1.26.1-4.el10) libv4l(x86-64) ( =  1.26.1-4.el10)"

URI_libv4l-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libv4l-devel-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libv4l-devel = "/usr/bin/pkg-config ( ) pkgconfig(libjpeg) ( ) pkgconfig(libv4l2) ( ) pkgconfig(libv4lconvert) ( ) libv4l1.so.0()(64bit) ( ) libv4l2.so.0()(64bit) ( ) libv4l2rds.so.0()(64bit) ( ) libv4lconvert.so.0()(64bit) ( ) libv4l(x86-64) ( =  1.26.1-4.el10)"
RPROVIDES:libv4l-devel = "libv4l-devel ( =  1.26.1-4.el10) libv4l-devel(x86-64) ( =  1.26.1-4.el10) pkgconfig(libv4l1) ( =  1.26.1) pkgconfig(libv4l2) ( =  1.26.1) pkgconfig(libv4l2rds) ( =  1.26.1) pkgconfig(libv4lconvert) ( =  1.26.1)"

URI_libdvbv5 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdvbv5-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdvbv5 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( )"
RPROVIDES:libdvbv5 = "libdvbv5.so.0()(64bit) ( ) libdvbv5(x86-64) ( =  1.26.1-4.el10) libdvbv5 ( =  1.26.1-4.el10)"

URI_libdvbv5-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdvbv5-devel-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdvbv5-devel = "/usr/bin/pkg-config ( ) libdvbv5.so.0()(64bit) ( ) pkgconfig(libudev) ( ) libdvbv5(x86-64) ( =  1.26.1-4.el10)"
RPROVIDES:libdvbv5-devel = "libdvbv5-devel ( =  1.26.1-4.el10) libdvbv5-devel(x86-64) ( =  1.26.1-4.el10) pkgconfig(libdvbv5) ( =  1.26.1)"

URI_libdvbv5-gconv = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdvbv5-gconv-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdvbv5-gconv = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libJIS.so()(64bit) ( ) libJISX0213.so()(64bit) ( )"
RPROVIDES:libdvbv5-gconv = "libdvbv5-gconv ( =  1.26.1-4.el10) libdvbv5-gconv(x86-64) ( =  1.26.1-4.el10)"

URI_v4l-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/v4l-utils-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:v4l-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libdvbv5.so.0()(64bit) ( ) systemd-udev ( ) libv4l2.so.0()(64bit) ( ) libv4l2rds.so.0()(64bit) ( ) libv4l(x86-64) ( =  1.26.1-4.el10)"
RPROVIDES:v4l-utils = "config(v4l-utils) ( =  1.26.1-4.el10) v4l-utils ( =  1.26.1-4.el10) v4l-utils(x86-64) ( =  1.26.1-4.el10)"

URI_v4l-utils-devel-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/v4l-utils-devel-tools-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:v4l-utils-devel-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libv4l2.so.0()(64bit) ( ) libv4l(x86-64) ( =  1.26.1-4.el10)"
RPROVIDES:v4l-utils-devel-tools = "v4l-utils-devel-tools ( =  1.26.1-4.el10) v4l-utils-devel-tools(x86-64) ( =  1.26.1-4.el10)"
