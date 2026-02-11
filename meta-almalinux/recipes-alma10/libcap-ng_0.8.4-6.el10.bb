
PN = "libcap-ng"
PE = "0"
PV = "0.8.4"
PR = "6.el10"
PACKAGES = "libcap-ng libcap-ng-utils libcap-ng-devel libcap-ng-python3"


URI_libcap-ng = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcap-ng-0.8.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-ng = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libcap-ng = "libcap-ng.so.0()(64bit) ( ) libdrop_ambient.so.0()(64bit) ( ) libcap-ng(x86-64) ( =  0.8.4-6.el10) libcap-ng ( =  0.8.4-6.el10)"

URI_libcap-ng-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcap-ng-utils-0.8.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-ng-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libcap-ng(x86-64) ( =  0.8.4-6.el10)"
RPROVIDES:libcap-ng-utils = "libcap-ng-utils ( =  0.8.4-6.el10) libcap-ng-utils(x86-64) ( =  0.8.4-6.el10)"

URI_libcap-ng-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcap-ng-devel-0.8.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-ng-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libcap-ng.so.0()(64bit) ( ) libdrop_ambient.so.0()(64bit) ( ) libcap-ng(x86-64) ( =  0.8.4-6.el10) kernel-headers ( >=  2.6.11)"
RPROVIDES:libcap-ng-devel = "libcap-ng-devel ( =  0.8.4-6.el10) libcap-ng-devel(x86-64) ( =  0.8.4-6.el10) pkgconfig(libcap-ng) ( =  0.8.4)"

URI_libcap-ng-python3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcap-ng-python3-0.8.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-ng-python3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) python(abi) ( =  3.12) libcap-ng(x86-64) ( =  0.8.4-6.el10)"
RPROVIDES:libcap-ng-python3 = "libcap-ng-python3 ( =  0.8.4-6.el10) libcap-ng-python3(x86-64) ( =  0.8.4-6.el10)"
