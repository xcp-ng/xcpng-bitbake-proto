
PN = "libjpeg-turbo"
PE = "0"
PV = "3.0.2"
PR = "4.el10"
PACKAGES = "libjpeg-turbo libjpeg-turbo-devel libjpeg-turbo-utils turbojpeg turbojpeg-devel"


URI_libjpeg-turbo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libjpeg-turbo-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjpeg-turbo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libjpeg-turbo = "libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libjpeg.so.62(LIBJPEGTURBO_6.2)(64bit) ( ) libjpeg-turbo(x86-64) ( =  3.0.2-4.el10) libjpeg ( =  6b-47.el10) libjpeg(x86-64) ( =  6b-47.el10) libjpeg-turbo ( =  3.0.2-4.el10)"

URI_libjpeg-turbo-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libjpeg-turbo-devel-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjpeg-turbo-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libjpeg.so.62()(64bit) ( ) libjpeg-turbo(x86-64) ( =  3.0.2-4.el10)"
RPROVIDES:libjpeg-turbo-devel = "cmake(libjpeg-turbo) ( =  3.0.2) libjpeg-devel ( =  6b-47.el10) libjpeg-devel(x86-64) ( =  6b-47.el10) libjpeg-turbo-devel ( =  3.0.2-4.el10) libjpeg-turbo-devel(x86-64) ( =  3.0.2-4.el10) libjpeg-turbo-static ( =  1.3.1.el10) pkgconfig(libjpeg) ( =  3.0.2)"

URI_libjpeg-turbo-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libjpeg-turbo-utils-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjpeg-turbo-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libjpeg.so.62(LIBJPEGTURBO_6.2)(64bit) ( ) libjpeg-turbo(x86-64) ( =  3.0.2-4.el10)"
RPROVIDES:libjpeg-turbo-utils = "libjpeg-turbo-utils ( =  3.0.2-4.el10) libjpeg-turbo-utils(x86-64) ( =  3.0.2-4.el10)"

URI_turbojpeg = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/turbojpeg-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:turbojpeg = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:turbojpeg = "libturbojpeg.so.0()(64bit) ( ) libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) ( ) libturbojpeg.so.0(TURBOJPEG_1.1)(64bit) ( ) libturbojpeg.so.0(TURBOJPEG_1.2)(64bit) ( ) libturbojpeg.so.0(TURBOJPEG_1.4)(64bit) ( ) libturbojpeg.so.0(TURBOJPEG_2.0)(64bit) ( ) libturbojpeg.so.0(TURBOJPEG_3)(64bit) ( ) turbojpeg(x86-64) ( =  3.0.2-4.el10) turbojpeg ( =  3.0.2-4.el10)"

URI_turbojpeg-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/turbojpeg-devel-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:turbojpeg-devel = "/usr/bin/pkg-config ( ) libturbojpeg.so.0()(64bit) ( ) turbojpeg(x86-64) ( =  3.0.2-4.el10)"
RPROVIDES:turbojpeg-devel = "pkgconfig(libturbojpeg) ( =  3.0.2) turbojpeg-devel ( =  3.0.2-4.el10) turbojpeg-devel(x86-64) ( =  3.0.2-4.el10)"
