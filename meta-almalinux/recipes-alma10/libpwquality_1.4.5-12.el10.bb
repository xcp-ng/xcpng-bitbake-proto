
PN = "libpwquality"
PE = "0"
PV = "1.4.5"
PR = "12.el10"
PACKAGES = "libpwquality python3-pwquality libpwquality-devel"


URI_libpwquality = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpwquality-1.4.5-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpwquality = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) ( ) cracklib ( ) libcrack.so.2()(64bit) ( ) libpam.so.0(LIBPAM_EXTENSION_1.1.1)(64bit) ( ) cracklib-dicts ( >=  2.8)"
RPROVIDES:libpwquality = "libpwquality.so.1()(64bit) ( ) libpwquality.so.1(LIBPWQUALITY_1.0)(64bit) ( ) config(libpwquality) ( =  1.4.5-12.el10) libpwquality ( =  1.4.5-12.el10) libpwquality(x86-64) ( =  1.4.5-12.el10)"

URI_python3-pwquality = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pwquality-1.4.5-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pwquality = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpwquality.so.1()(64bit) ( ) libpwquality.so.1(LIBPWQUALITY_1.0)(64bit) ( ) python(abi) ( =  3.12) libpwquality(x86-64) ( =  1.4.5-12.el10)"
RPROVIDES:python3-pwquality = "python-pwquality ( =  1.4.5-12.el10) python3-pwquality ( =  1.4.5-12.el10) python3-pwquality(x86-64) ( =  1.4.5-12.el10) python3.12-pwquality ( =  1.4.5-12.el10) python3.12dist(pwquality) ( =  1.4.5) python3dist(pwquality) ( =  1.4.5)"

URI_libpwquality-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpwquality-devel-1.4.5-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpwquality-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libpwquality.so.1()(64bit) ( ) libpwquality(x86-64) ( =  1.4.5-12.el10)"
RPROVIDES:libpwquality-devel = "libpwquality-devel ( =  1.4.5-12.el10) libpwquality-devel(x86-64) ( =  1.4.5-12.el10) pkgconfig(pwquality) ( =  1.4.5)"
