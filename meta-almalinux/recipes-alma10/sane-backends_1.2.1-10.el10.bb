
PN = "sane-backends"
PE = "0"
PV = "1.2.1"
PR = "10.el10"
PACKAGES = "sane-backends sane-backends-daemon sane-backends-devel sane-backends-doc sane-backends-drivers-cameras sane-backends-drivers-scanners sane-backends-libs"


URI_sane-backends = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.7.3)(64bit) ( ) libieee1284.so.3()(64bit) ( ) libsane.so.1()(64bit) ( ) sane-airscan ( ) libpng ( ) sane-backends-libs(x86-64) ( =  1.2.1-10.el10) systemd ( >=  196) systemd-udev ( >=  196)"
RPROVIDES:sane-backends = "sane-backends ( =  1.2.1-10.el10) config(sane-backends) ( =  1.2.1-10.el10) sane-backends(x86-64) ( =  1.2.1-10.el10)"

URI_sane-backends-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-daemon-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-daemon = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libsane.so.1()(64bit) ( ) sane-backends-libs(x86-64) ( =  1.2.1-10.el10) sane-backends ( =  1.2.1-10.el10)"
RPROVIDES:sane-backends-daemon = "group(saned) ( ) config(sane-backends-daemon) ( =  1.2.1-10.el10) sane-backends-daemon ( =  1.2.1-10.el10) sane-backends-daemon(x86-64) ( =  1.2.1-10.el10) user(saned) ( =  dSBzYW5lZCAtICJTQU5FIHNjYW5uZXIgZGFlbW9uIHVzZXIiIC91c3Ivc2hhcmUvc2FuZSAvc2Jpbi9ub2xvZ2lu)"

URI_sane-backends-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-devel-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libsane.so.1()(64bit) ( ) libtiff-devel ( ) libieee1284-devel ( ) libjpeg-devel ( ) libusbx-devel ( ) sane-backends-libs(x86-64) ( =  1.2.1-10.el10) sane-backends ( =  1.2.1-10.el10) sane-backends-drivers-cameras(x86-64) ( =  1.2.1-10.el10) sane-backends-drivers-scanners(x86-64) ( =  1.2.1-10.el10)"
RPROVIDES:sane-backends-devel = "pkgconfig(sane-backends) ( =  1.2.1) sane-backends-devel ( =  1.2.1-10.el10) sane-backends-devel(x86-64) ( =  1.2.1-10.el10)"

URI_sane-backends-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-doc-1.2.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:sane-backends-doc = ""
RPROVIDES:sane-backends-doc = "sane-backends-doc ( =  1.2.1-10.el10)"

URI_sane-backends-drivers-cameras = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-drivers-cameras-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-drivers-cameras = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.7.3)(64bit) ( ) libieee1284.so.3()(64bit) ( ) libgphoto2.so.6()(64bit) ( ) libgphoto2_port.so.12()(64bit) ( ) libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) ( ) libv4l1.so.0()(64bit) ( ) sane-backends-libs(x86-64) ( =  1.2.1-10.el10) sane-backends ( =  1.2.1-10.el10)"
RPROVIDES:sane-backends-drivers-cameras = "sane-backends-drivers-cameras(x86-64) ( =  1.2.1-10.el10) sane-backends-drivers-cameras ( =  1.2.1-10.el10)"

URI_sane-backends-drivers-scanners = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-drivers-scanners-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-drivers-scanners = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.7.3)(64bit) ( ) libieee1284.so.3()(64bit) ( ) sane-backends-libs(x86-64) ( =  1.2.1-10.el10) sane-backends ( =  1.2.1-10.el10)"
RPROVIDES:sane-backends-drivers-scanners = "sane-backends-drivers-scanners(x86-64) ( =  1.2.1-10.el10) sane-backends-drivers-scanners ( =  1.2.1-10.el10)"

URI_sane-backends-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-libs-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.7.3)(64bit) ( )"
RPROVIDES:sane-backends-libs = "libsane.so.1()(64bit) ( ) sane-backends-libs(x86-64) ( =  1.2.1-10.el10) sane-backends-libs ( =  1.2.1-10.el10)"
