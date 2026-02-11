
PN = "libei"
PE = "0"
PV = "1.3.0"
PR = "1.el10"
PACKAGES = "libei libeis liboeffis libei-devel libeis-devel liboeffis-devel libei-utils"


URI_libei = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libei-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libei = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( )"
RPROVIDES:libei = "libei.so.1()(64bit) ( ) libei ( =  1.3.0-1.el10) libei(x86-64) ( =  1.3.0-1.el10)"

URI_libeis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libeis-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeis = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:libeis = "libeis.so.1()(64bit) ( ) libeis ( =  1.3.0-1.el10) libeis(x86-64) ( =  1.3.0-1.el10)"

URI_liboeffis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liboeffis-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liboeffis = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libc.so.6(GLIBC_2.28)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_221)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_237)(64bit) ( )"
RPROVIDES:liboeffis = "liboeffis.so.1()(64bit) ( ) liboeffis ( =  1.3.0-1.el10) liboeffis(x86-64) ( =  1.3.0-1.el10)"

URI_libei-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libei-devel-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libei-devel = "/usr/bin/pkg-config ( ) libei.so.1()(64bit) ( ) libei(x86-64) ( =  1.3.0-1.el10)"
RPROVIDES:libei-devel = "libei-devel ( =  1.3.0-1.el10) libei-devel(x86-64) ( =  1.3.0-1.el10) pkgconfig(libei-1.0) ( =  1.3.0)"

URI_libeis-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libeis-devel-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeis-devel = "/usr/bin/pkg-config ( ) libeis.so.1()(64bit) ( ) libeis(x86-64) ( =  1.3.0-1.el10)"
RPROVIDES:libeis-devel = "libeis-devel ( =  1.3.0-1.el10) libeis-devel(x86-64) ( =  1.3.0-1.el10) pkgconfig(libeis-1.0) ( =  1.3.0)"

URI_liboeffis-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liboeffis-devel-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liboeffis-devel = "/usr/bin/pkg-config ( ) pkgconfig(libsystemd) ( ) liboeffis.so.1()(64bit) ( ) liboeffis(x86-64) ( =  1.3.0-1.el10)"
RPROVIDES:liboeffis-devel = "liboeffis-devel ( =  1.3.0-1.el10) liboeffis-devel(x86-64) ( =  1.3.0-1.el10) pkgconfig(liboeffis-1.0) ( =  1.3.0)"

URI_libei-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libei-utils-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libei-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libei.so.1()(64bit) ( ) libei(x86-64) ( =  1.3.0-1.el10)"
RPROVIDES:libei-utils = "libei-utils ( =  1.3.0-1.el10) libei-utils(x86-64) ( =  1.3.0-1.el10)"
