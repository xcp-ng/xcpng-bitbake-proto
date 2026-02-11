
PN = "libpipeline"
PE = "0"
PV = "1.5.7"
PR = "7.el10"
PACKAGES = "libpipeline libpipeline-devel"


URI_libpipeline = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpipeline-1.5.7-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpipeline = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.26)(64bit) ( )"
RPROVIDES:libpipeline = "libpipeline.so.1()(64bit) ( ) bundled(gnulib) ( =  20140202) libpipeline ( =  1.5.7-7.el10) libpipeline(x86-64) ( =  1.5.7-7.el10)"

URI_libpipeline-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpipeline-devel-1.5.7-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpipeline-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libpipeline.so.1()(64bit) ( ) libpipeline(x86-64) ( =  1.5.7-7.el10)"
RPROVIDES:libpipeline-devel = "libpipeline-devel ( =  1.5.7-7.el10) libpipeline-devel(x86-64) ( =  1.5.7-7.el10) pkgconfig(libpipeline) ( =  1.5.7)"
