
PN = "libselinux"
PE = "0"
PV = "3.8"
PR = "2.el10_0"
PACKAGES = "libselinux libselinux-utils libselinux-devel libselinux-ruby python3-libselinux libselinux-static"


URI_libselinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libselinux-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) pcre2 ( ) libsepol(x86-64) ( >=  3.8-1)"
RPROVIDES:libselinux = "libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libselinux.so.1(LIBSELINUX_3.5)(64bit) ( ) libselinux.so.1(LIBSELINUX_3.4)(64bit) ( ) libselinux.so.1(LIBSELINUX_3.8)(64bit) ( ) libselinux(x86-64) ( =  3.8-2.el10_0) libselinux ( =  3.8-2.el10_0)"

URI_libselinux-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libselinux-utils-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libsepol.so.2()(64bit) ( ) libsepol.so.2(LIBSEPOL_1.0)(64bit) ( ) libselinux.so.1(LIBSELINUX_3.5)(64bit) ( ) libselinux(x86-64) ( =  3.8-2.el10_0)"
RPROVIDES:libselinux-utils = "libselinux-utils ( =  3.8-2.el10_0) libselinux-utils(x86-64) ( =  3.8-2.el10_0)"

URI_libselinux-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libselinux-devel-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux-devel = "/usr/bin/pkg-config ( ) libselinux.so.1()(64bit) ( ) pkgconfig(libpcre2-8) ( ) pkgconfig(libsepol) ( ) libselinux(x86-64) ( =  3.8-2.el10_0) libsepol-devel(x86-64) ( >=  3.8-1)"
RPROVIDES:libselinux-devel = "pkgconfig(libselinux) ( =  3.8) libselinux-devel ( =  3.8-2.el10_0) libselinux-devel(x86-64) ( =  3.8-2.el10_0)"

URI_libselinux-ruby = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libselinux-ruby-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux-ruby = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libruby.so.3.3()(64bit) ( ) libselinux.so.1(LIBSELINUX_3.4)(64bit) ( ) libselinux.so.1(LIBSELINUX_3.5)(64bit) ( ) libselinux(x86-64) ( =  3.8-2.el10_0)"
RPROVIDES:libselinux-ruby = "ruby(selinux) ( ) libselinux-ruby ( =  3.8-2.el10_0) libselinux-ruby(x86-64) ( =  3.8-2.el10_0)"

URI_python3-libselinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libselinux-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libselinux = "rtld(GNU_HASH) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libselinux.so.1(LIBSELINUX_3.4)(64bit) ( ) libselinux.so.1(LIBSELINUX_3.5)(64bit) ( ) libc.so.6(GLIBC_2.26)(64bit) ( ) python(abi) ( =  3.12) libselinux(x86-64) ( =  3.8-2.el10_0)"
RPROVIDES:python3-libselinux = "python3.12dist(selinux) ( =  3.8) python3dist(selinux) ( =  3.8) libselinux-python3 ( =  3.8-2.el10_0) libselinux-python3(x86-64) ( =  3.8-2.el10_0) python-libselinux ( =  3.8-2.el10_0) python3-libselinux ( =  3.8-2.el10_0) python3-libselinux(x86-64) ( =  3.8-2.el10_0) python3.12-libselinux ( =  3.8-2.el10_0)"

URI_libselinux-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libselinux-static-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux-static = "libselinux-devel(x86-64) ( =  3.8-2.el10_0)"
RPROVIDES:libselinux-static = "libselinux-static ( =  3.8-2.el10_0) libselinux-static(x86-64) ( =  3.8-2.el10_0)"
