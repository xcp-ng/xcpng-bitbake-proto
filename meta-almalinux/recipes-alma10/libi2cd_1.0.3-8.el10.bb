
PN = "libi2cd"
PE = "0"
PV = "1.0.3"
PR = "8.el10"
PACKAGES = "libi2cd libi2cd-devel"


URI_libi2cd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libi2cd-1.0.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libi2cd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:libi2cd = "libi2cd.so.0()(64bit) ( ) libi2cd(x86-64) ( =  1.0.3-8.el10) libi2cd ( =  1.0.3-8.el10)"

URI_libi2cd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libi2cd-devel-1.0.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libi2cd-devel = "/usr/bin/pkg-config ( ) libi2cd.so.0()(64bit) ( ) libi2cd(x86-64) ( =  1.0.3-8.el10)"
RPROVIDES:libi2cd-devel = "libi2cd-devel ( =  1.0.3-8.el10) libi2cd-devel(x86-64) ( =  1.0.3-8.el10) pkgconfig(libi2cd) ( =  1.0.3)"
