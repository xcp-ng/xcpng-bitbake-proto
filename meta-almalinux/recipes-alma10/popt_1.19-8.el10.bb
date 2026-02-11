
PN = "popt"
PE = "0"
PV = "1.19"
PR = "8.el10"
PACKAGES = "popt popt-devel popt-static"


URI_popt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/popt-1.19-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:popt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:popt = "libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) popt ( =  1.19-8.el10) popt(x86-64) ( =  1.19-8.el10)"

URI_popt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/popt-devel-1.19-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:popt-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libpopt.so.0()(64bit) ( ) popt(x86-64) ( =  1.19-8.el10)"
RPROVIDES:popt-devel = "pkgconfig(popt) ( =  1.19) popt-devel ( =  1.19-8.el10) popt-devel(x86-64) ( =  1.19-8.el10)"

URI_popt-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/popt-static-1.19-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:popt-static = "popt-devel(x86-64) ( =  1.19-8.el10)"
RPROVIDES:popt-static = "popt-static ( =  1.19-8.el10) popt-static(x86-64) ( =  1.19-8.el10)"
